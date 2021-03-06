package com.daryandrean0803.uaspcs.api

import com.daryandrean0803.uaspcs.data.model.DetailUserResponse
import com.daryandrean0803.uaspcs.data.model.User
import com.daryandrean0803.uaspcs.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token de2476f01624d4d674edc6075738bbef8c6145f1  ")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token de2476f01624d4d674edc6075738bbef8c6145f1  ")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token de2476f01624d4d674edc6075738bbef8c6145f1  ")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token de2476f01624d4d674edc6075738bbef8c6145f1  ")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}
