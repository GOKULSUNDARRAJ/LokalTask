package com.basic.lokaltask;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.internal.EverythingIsNonNull;


public class DashboardFragment extends Fragment {

    private static final String TAG = "JobsFragment";
    private RecyclerView recyclerView;
    private JobAdapter2 jobsAdapter; // Assuming you have an adapter

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // Initialize Retrofit
        Retrofit retrofit = ApiClient.getClient("https://testapi.getlokalapp.com/");
        ApiService apiService = retrofit.create(ApiService.class);

        // Make network request
        Call<ResponseData> call = apiService.getJobs(1); // Fetch jobs from page 1
        call.enqueue(new Callback<ResponseData>() {
            @Override
            public void onResponse(Call<ResponseData> call, Response<ResponseData> response) {
                if (response.isSuccessful() && response.body() != null) {
                    ResponseData responseData = response.body();
                    List<Job> jobs = responseData.getResults();

                    if (jobs != null) {
                        // Get the selected job IDs
                        Set<String> selectedJobIds = JobAdapter.getSavedSelectedJobIds(getContext());

                        // Filter the jobs based on selected job IDs
                        List<Job> filteredJobs = filterJobsBySelectedIds(jobs, selectedJobIds);

                        // Update RecyclerView with filtered jobs list
                        setupRecyclerView(filteredJobs);

                        // Optionally, show Toast for each job ID that matches a selected ID
                        for (Job job : filteredJobs) {
                            String jobId = "" + job.getId();
                           // Toast.makeText(getContext(), "Matching Job ID: " + jobId, Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Log.e(TAG, "Jobs list is null");
                    }
                } else {
                    Log.e(TAG, "Response not successful or body is null");
                }
            }


            @Override
            public void onFailure(Call<ResponseData> call, Throwable t) {
                Log.e(TAG, "Network request failed", t);
            }
        });


    }

    @Nullable
    @Override
    public View onCreateView(@EverythingIsNonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_dashboard, container, false);


        recyclerView = view.findViewById(R.id.recycler_view_jobs);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }

    @Override
    public void onViewCreated(@EverythingIsNonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Get the context from the fragment
        Context context = getContext();
        if (context != null) {
            // Retrieve selected job IDs
            Set<String> selectedJobIds = JobAdapter.getSavedSelectedJobIds(context);

            // Convert the set to a readable string
            StringBuilder sb = new StringBuilder("Selected Job IDs:\n");
            for (String id : selectedJobIds) {
                sb.append(id).append("\n");
            }

            // Show in a Toast
           // Toast.makeText(context, sb.toString(), Toast.LENGTH_LONG).show();
        }
    }
    private List<Job> filterJobsBySelectedIds(List<Job> jobs, Set<String> selectedJobIds) {
        List<Job> filteredJobs = new ArrayList<>();
        for (Job job : jobs) {
            String jobId = "" + job.getId();
            if (selectedJobIds.contains(jobId)) {
                filteredJobs.add(job);
            }
        }
        return filteredJobs;
    }



    private void setupRecyclerView(List<Job> jobs) {
        jobsAdapter = new JobAdapter2(getContext(),jobs); // Assuming you have an adapter
        recyclerView.setAdapter(jobsAdapter);
    }

}