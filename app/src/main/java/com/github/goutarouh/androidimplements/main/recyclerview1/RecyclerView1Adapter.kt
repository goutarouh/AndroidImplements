package com.github.goutarouh.androidimplements.main.recyclerview1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.github.goutarouh.androidimplements.R
import com.github.goutarouh.androidimplements.databinding.FragmentRecyclerview1ItemBinding

class RecyclerView1Adapter(private val data: List<String>): RecyclerView.Adapter<RecyclerView1Adapter.ViewHolder>() {

    class ViewHolder(val binding: FragmentRecyclerview1ItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<FragmentRecyclerview1ItemBinding>(inflater, R.layout.fragment_recyclerview1_item, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.item = "item$position"
    }
}