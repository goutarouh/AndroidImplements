package com.github.goutarouh.androidimplements.main.recyclerview1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.goutarouh.androidimplements.R
import com.github.goutarouh.androidimplements.databinding.FragmentRecyclerview1Binding

val data = mutableListOf<String>().also { list ->
    repeat(30) {num ->
        list.add("$num 番目")
    }
}


class RecyclerView1Fragment : Fragment() {

    private lateinit var binding : FragmentRecyclerview1Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRecyclerview1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = this.viewLifecycleOwner

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = RecyclerView1Adapter(data)
        }
    }
}