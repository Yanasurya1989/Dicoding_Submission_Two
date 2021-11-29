package com.yana.aplikasigithubusernavigationdanapi.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ConfigNetwork {

    companion object {
        fun getRetrofit() : searchUserInterface{

//            val loggingInterceptor =
//                HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
//
//            val client = OkHttpClient.Builder()
//                .addInterceptor(loggingInterceptor)
//                .build()

            val retrofit = Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
//                .client(client)
                .build()

            val service = retrofit.create(searchUserInterface::class.java)

            return service
        }
    }
}