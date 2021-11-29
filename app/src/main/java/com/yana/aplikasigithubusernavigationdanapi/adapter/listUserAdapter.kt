package com.yana.aplikasigithubusernavigationdanapi.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yana.aplikasigithubusernavigationdanapi.R
import com.yana.aplikasigithubusernavigationdanapi.model.ItemsItem
import com.yana.aplikasigithubusernavigationdanapi.network.searchUserInterface
import kotlinx.android.synthetic.main.list_user.view.*

class listUserAdapter(var userList: List<ItemsItem>) : RecyclerView.Adapter<listUserAdapter.ListHolder>() {
    class ListHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val user = itemView.searchUser
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_user,parent,false)

        val holder = ListHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: ListHolder, position: Int) {

        val itemUser = userList.get(position)
        holder.user.text = itemUser.gistsUrl
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}