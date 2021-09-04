package com.nayelidj.wk01hw02_solo.api;

import com.nayelidj.wk01hw02_solo.Post;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface JsonPlaceHolderApi {
    @GET("posts")
    Call<List<Post>> getPosts();
}
