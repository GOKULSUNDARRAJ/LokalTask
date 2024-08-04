package com.basic.lokaltask;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JobAdapter extends RecyclerView.Adapter<JobAdapter.JobViewHolder> {

    private List<Job> jobList;
    private Context context;
    private Set<String> selectedJobIds;

    public JobAdapter(Context context, List<Job> jobList) {
        this.context = context;
        this.jobList = jobList;
        this.selectedJobIds = getSelectedJobIds(); // Retrieve previously selected IDs
    }

    @NotNull
    @Override
    public JobViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_job, parent, false);
        return new JobViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NotNull JobViewHolder holder, int position) {
        Job job = jobList.get(position);
        holder.titleTextView.setText("" + job.getTitle());
        holder.locationTextView.setText("" + job.getCity_location());
        holder.sayarymin.setText("RS" + " " + job.getSalary_min() + "  " + "-");
        holder.salarymax.setText("" + job.getSalary_max());
        holder.phoneTextView.setText("" + job.getWhatsapp_no());
        String formattedExpireOn = DateUtils.formatExpireOn(job.getExpire_on());
        holder.experience.setText("" + formattedExpireOn);
        holder.onofopening.setText("No of Openings :" + " " + job.getOpenings_count());


        holder.itemView.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailSActivity.class);
                intent.putExtra("title", ""+job.getTitle());
                intent.putExtra("city_location", ""+job.getCity_location());
                intent.putExtra("salary_min", ""+job.getSalary_min());
                intent.putExtra("salary_max", ""+job.getSalary_max());
                intent.putExtra("whatsapp_no", ""+job.getWhatsapp_no());
                intent.putExtra("expire_on", ""+formattedExpireOn);
                intent.putExtra("openings_count", ""+job.getOpenings_count());
                intent.putExtra("details",job.getOther_details());

                context.startActivity(intent);

            }
        });

        // Toggle ImageView state based on selection
        String jobIdString = String.valueOf(job.getId());
        if (selectedJobIds.contains(jobIdString)) {
            holder.toggleImageView.setImageResource(R.drawable.bookmarked); // Replace with your selected drawable
        } else {
            holder.toggleImageView.setImageResource(R.drawable.booknotmaked); // Replace with your unselected drawable
        }

        holder.toggleImageView.setOnClickListener(v -> {
            if (selectedJobIds.contains(jobIdString)) {
                selectedJobIds.remove(jobIdString);
                holder.toggleImageView.setImageResource(R.drawable.booknotmaked);
            } else {
                selectedJobIds.add(jobIdString);
                holder.toggleImageView.setImageResource(R.drawable.bookmarked);
            }
            saveSelectedJobIds(); // Save the updated list of selected IDs
            Toast.makeText(context, "Book Marked", Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return jobList.size();
    }
    private Set<String> getSelectedJobIds() {
        SharedPreferences prefs = context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        Set<String> selectedJobIds = prefs.getStringSet("selectedJobIds", new HashSet<>());
        Log.d("JobAdapter", "Retrieved selected IDs: " + selectedJobIds);
        return selectedJobIds;
    }

    public static Set<String> getSavedSelectedJobIds(Context context) {
        SharedPreferences prefs = context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        return prefs.getStringSet("selectedJobIds", new HashSet<>());
    }


    private void saveSelectedJobIds() {
        SharedPreferences prefs = context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putStringSet("selectedJobIds", selectedJobIds);
        editor.apply(); // Apply changes asynchronously
        Log.d("JobAdapter", "Saved selected IDs: " + selectedJobIds);
    }


    public String getSelectedJobIdsAsString() {
        StringBuilder sb = new StringBuilder("Selected Job IDs:\n");
        for (String id : selectedJobIds) {
            sb.append(id).append("\n");
        }
        return sb.toString();
    }

    public static class JobViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        TextView locationTextView;
        TextView sayarymin, salarymax;
        TextView phoneTextView, experience, onofopening;
        ImageView toggleImageView;

        public JobViewHolder(@NotNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.text_view_title);
            locationTextView = itemView.findViewById(R.id.text_view_location);
            sayarymin = itemView.findViewById(R.id.sayarymin);
            salarymax = itemView.findViewById(R.id.salarymax);
            phoneTextView = itemView.findViewById(R.id.text_view_phone);
            experience = itemView.findViewById(R.id.experience);
            onofopening = itemView.findViewById(R.id.onofopening);
            toggleImageView = itemView.findViewById(R.id.image_view_toggle);
        }
    }
}
