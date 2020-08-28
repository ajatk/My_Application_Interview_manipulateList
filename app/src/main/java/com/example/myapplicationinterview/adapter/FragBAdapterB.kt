package com.example.myapplicationinterview.adapter

import android.content.Context
import android.util.SparseBooleanArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplicationinterview.MainActivity
import com.example.myapplicationinterview.R
import com.example.myapplicationinterview.fragement.FragmentB

class FragBAdapterB(
    var context: Context,
    var arrayList: ArrayList<Int>,
    fragmentA: FragmentB
) : RecyclerView.Adapter<FragBAdapterB.MyViewHolder>() {
    internal var itemStateArray = SparseBooleanArray()
    private var listSelected = java.util.ArrayList<String>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemLayoutView = LayoutInflater.from(parent.context).inflate(R.layout.sub_frag_a_layout, parent, false)
        return MyViewHolder(itemLayoutView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        if (!itemStateArray.get(position, false)) {
            holder.radioBtn!!.setChecked(false)
        }else{
            holder.radioBtn!!.setChecked(true)
        }
         holder._tital!!.setText(arrayList.get(position).toString())
        holder.radioBtn!!.setOnClickListener(View.OnClickListener {
            var  adapterPosition = position
            if (!itemStateArray.get(adapterPosition, false))
            {
                holder.radioBtn!!.setChecked(true)
                itemStateArray.put(adapterPosition, true)
                MainActivity.arrayList!!.add(arrayList.get(position))
                if(MainActivity.arrayListB.size>1){
                    MainActivity.arrayListB.removeAt(position)
                }else{
                    MainActivity.arrayListB.clear()
                }
                // listSelected.add((serviceData.get(adapterPosition).id).toString())
                println("settt..02 selected.." + adapterPosition + ".." + listSelected)
            } else {
                holder.radioBtn!!.setChecked(false)
                itemStateArray.put(adapterPosition, false)
               // MainActivity.arrayListB.add(arrayList.get(position))


                println("settt..01 selected.." + adapterPosition + ".." + listSelected)
            }
            // serviceview.service_Id_position(listSelected.toString(), adapterPosition.toString())
        })

    }

    override fun getItemCount(): Int {
        if (MainActivity.arrayListB!=null){
            return MainActivity.arrayListB.size
        }
        else{
            return 0

        }
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){


        private val RECOVERY_REQUEST = 1
        var radioBtn: RadioButton? = null
        var _tital : TextView?=null

       // var youTubePlayerView : YouTubePlayerView?=null
        var context : Context?=null
        init {
            _tital=itemView.findViewById(R.id.frag_Atext)
            radioBtn = itemView.findViewById(R.id.radio_btn)
            context = itemView.context


        }




    }
}

