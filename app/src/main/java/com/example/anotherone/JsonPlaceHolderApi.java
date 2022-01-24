package com.example.anotherone;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
    @GET("popsts")
    Call<List<Post>> getPosts();
}
