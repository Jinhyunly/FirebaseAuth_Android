package com.firebaseauth.firebaseauth;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    public static final String API_URL="http://localhost:3000/api/";

    //1번
    @GET("dogs")
        Call<ResponseBody> getCommnet(@Query("name") int name);
}
