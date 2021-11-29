package com.yana.aplikasigithubusernavigationdanapi.network

import com.yana.aplikasigithubusernavigationdanapi.model.ResponseSearchUser
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

public interface searchUserInterface {

    @GET("search/users?")
    fun getListUser(@Query("q") q: String):Call<ResponseSearchUser>
}

