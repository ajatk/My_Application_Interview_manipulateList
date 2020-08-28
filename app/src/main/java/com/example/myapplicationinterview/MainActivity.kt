package com.example.myapplicationinterview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplicationinterview.adapter.FragAAdapterA
import com.example.myapplicationinterview.fragement.FragmentA
import com.example.myapplicationinterview.fragement.FragmentB

class MainActivity : AppCompatActivity() {
companion object{
    var arrayListA= ArrayList<Int>()
    var arrayListB= ArrayList<Int>()
    var arrayList: ArrayList<Int>?=null
}
    var butnRight: Button? =null
    var butnLeft: Button? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getSupportFragmentManager().beginTransaction()
            .replace(R.id.a_fragment, FragmentA())
            .replace(R.id.b_fragment, FragmentB()).commit()

        butnRight = findViewById(R.id.btnRight)
        butnLeft = findViewById(R.id.btnLeft)
        frag_AData()
        setonClicked()
    }

    private fun setonClicked() {
        butnRight!!.setOnClickListener {

            getSupportFragmentManager().beginTransaction()
                .replace(R.id.a_fragment, FragmentA())
                .replace(R.id.b_fragment, FragmentB()).commit()


        }
        butnLeft!!.setOnClickListener {
            butnRight!!.performClick()
//            getSupportFragmentManager().beginTransaction()
//                .replace(R.id.a_fragment, FragmentA())
//               // .replace(R.id.b_fragment, FragmentB())
//                .commit()

        }
    }

    private fun frag_AData() {
        arrayList =ArrayList<Int>()
        arrayList!!.add(0)
        arrayList!!.add(1)
        arrayList!!.add(2)
        arrayList!!.add(3)
        arrayList!!.add(4)
        arrayList!!.add(5)
        arrayList!!.add(6)
        arrayList!!.add(7)
        arrayList!!.add(8)
        arrayList!!.add(9)




        //recyclerA!!.adapter = fragAAdapter
        //frag_AData()
    }


}
