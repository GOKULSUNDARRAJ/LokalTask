package com.basic.lokaltask;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("common/jobs")
    Call<ResponseData> getJobs(@Query("page") int page);
}
