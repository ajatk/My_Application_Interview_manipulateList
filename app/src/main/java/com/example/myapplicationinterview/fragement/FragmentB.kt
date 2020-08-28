package com.example.myapplicationinterview.fragement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplicationinterview.MainActivity

import com.example.myapplicationinterview.R
import com.example.myapplicationinterview.adapter.FragBAdapterB


class FragmentB : Fragment() {
    var fragBAdapter : FragBAdapterB?=null
    var recyclerA: RecyclerView? =null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_b, container, false)
        recyclerA = view.findViewById(R.id.fragB_recycler)
        recyclerA!!.setLayoutManager(LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, true))
        recyclerA!!.setHasFixedSize(true);
        frag_AData()
        return view
    }
    private fun frag_AData() {
//        arrayList.add(0)
//        arrayList.add(0)
//        arrayList.add(0)
//        arrayList.add(0)
//        arrayList.add(0)
//        arrayList.add(0)
//        arrayList.add(0)
//        arrayList.add(0)


        if(!MainActivity.arrayListB.isNullOrEmpty()){
            fragBAdapter = FragBAdapterB(activity!!, MainActivity.arrayListB, this)
        }else{

        }


        recyclerA!!.adapter = fragBAdapter
        //frag_AData()
    }

}
