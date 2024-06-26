package com.example.qwiktweet.api


import com.example.qwiktweet.models.TweetListItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface TweetsyAPI {

    @GET("/v3/b/6676ee9facd3cb34a85b7df4?meta=false")
    suspend fun getTweets(@Header("X-JSON-Path") category: String) : Response<List<TweetListItem>>

    @GET("/v3/b/6676ee9facd3cb34a85b7df4?meta=false")
    @Headers("X-JSON-Path: tweets..category")   
    suspend fun getCategories(): Response<List<String>>
}