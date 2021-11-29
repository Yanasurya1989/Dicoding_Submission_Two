package com.yana.aplikasigithubusernavigationdanapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.yana.aplikasigithubusernavigationdanapi.model.ItemsItem
import com.yana.aplikasigithubusernavigationdanapi.model.ResponseSearchUser
import com.yana.aplikasigithubusernavigationdanapi.network.ConfigNetwork
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ConfigNetwork.getRetrofit().getListUser("sidiqpermana")
                .enqueue(object : Callback<ResponseSearchUser>{
                    override fun onResponse(call: Call<ResponseSearchUser>, response: Response<ResponseSearchUser>) {
                        Log.d("response server",response.message())

                        val total_count = response.body()?.totalCount

                        if (total_count == 2){
                            val dataSearchUser = response.body()?.items

                            showList(dataSearchUser)
                        }
                    }

                    override fun onFailure(call: Call<ResponseSearchUser>, t: Throwable) {
                        t.message?.let { Log.d("error Server", it) }
                    }

                })
    }

    private fun showList(dataSearchUser: List<ItemsItem?>?) {

    }
}