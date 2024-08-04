package com.basic.lokaltask;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class JobsFragment extends Fragment {

    private static final String TAG = "JobsFragment";
    private RecyclerView recyclerView;
    private JobAdapter jobsAdapter; // Assuming you have an adapter

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
                        // Update RecyclerView with jobs list
                        setupRecyclerView(jobs);
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = view.findViewById(R.id.recycler_view_jobs);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }

    private void setupRecyclerView(List<Job> jobs) {
        jobsAdapter = new JobAdapter(getContext(),jobs); // Assuming you have an adapter
        recyclerView.setAdapter(jobsAdapter);
    }
}
