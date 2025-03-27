package com.arwin.githubuser.network

import com.arwin.githubuser.model.SearchUserResult
import com.arwin.githubuser.model.UserDetails
import com.arwin.githubuser.model.UserListResponse
import com.arwin.githubuser.model.UserRepoList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query


interface GitHubApiService {
    // List GitHub users
    @GET("users")
    fun listUsers(
        @Header("Accept") acceptHeader: String?,
        @Header("Authorization") authHeader: String?,
        @Header("X-GitHub-Api-Version") apiVersion: String?,
    ): Call<List<UserListResponse?>?>?

    // Search for GitHub users
    @GET("search/users")
    fun searchUsers(
        @Header("Accept") acceptHeader: String?,
        @Header("Authorization") authHeader: String?,
        @Header("X-GitHub-Api-Version") apiVersion: String?,
        @Query("q") query: String?
    ): Call<SearchUserResult?>?

    // Get user details
    @GET("users/{username}")
    fun getUserDetails(
        @Header("Accept") acceptHeader: String?,
        @Header("Authorization") authHeader: String?,
        @Header("X-GitHub-Api-Version") apiVersion: String?,
        @Path("username") username: String?
    ): Call<UserDetails?>?

    // Get user's repositories
    @GET("users/{username}/repos")
    fun getUserRepositories(
        @Header("Accept") acceptHeader: String?,
        @Header("Authorization") authHeader: String?,
        @Header("X-GitHub-Api-Version") apiVersion: String?,
        @Path("username") username: String?
    ): Call<List<UserRepoList?>?>?
}
