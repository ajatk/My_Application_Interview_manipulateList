package com.example.myapplicationinterview.fragement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplicationinterview.MainActivity.Companion.arrayList
import com.example.myapplicationinterview.MainActivity.Companion.arrayListA
import com.example.myapplicationinterview.MainActivity.Companion.arrayListB

import com.example.myapplicationinterview.R
import com.example.myapplicationinterview.ServiceRequestView
import com.example.myapplicationinterview.adapter.FragAAdapterA
import com.example.myapplicationinterview.adapter.FragBAdapterB

class FragmentA : Fragment(), ServiceRequestView {

    var fragAAdapter : FragAAdapterA?=null

    var recyclerA: RecyclerView? =null
    var butnRight: Button? =null
    var butnLeft: Button? =null
   // var arrayList= ArrayList<Int>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_fragement_a, container, false)
        recyclerA = view.findViewById(R.id.fragA_recycler)


        recyclerA!!.setLayoutManager(LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false))
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
        println("array list here..."+ arrayList!!.size)
        if(!arrayList.isNullOrEmpty()){
            fragAAdapter =FragAAdapterA(activity!!,arrayList!!, this)
        }/*else{
            fragAAdapter =FragAAdapterA(activity!!,arrayList, this)
        }*/

        recyclerA!!.adapter = fragAAdapter
        //frag_AData()
    }
   // butnRight.set
    override fun serviceA() {

    }

    override fun serviceB() {

    }

}
