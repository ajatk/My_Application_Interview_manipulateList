package com.example.myapplicationinterview.adapter

import android.content.Context
import android.util.SparseBooleanArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplicationinterview.MainActivity.Companion.arrayListB
import com.example.myapplicationinterview.R
import com.example.myapplicationinterview.ServiceRequestView

class FragAAdapterA(
    var context: Context,
    var arrayList: ArrayList<Int>,
    serviceRequestView: ServiceRequestView
) : RecyclerView.Adapter<FragAAdapterA.MyViewHolder>() {
    internal var itemStateArray = SparseBooleanArray()
    private var listSelected = java.util.ArrayList<String>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemLayoutView =
            LayoutInflater.from(parent.context).inflate(R.layout.sub_frag_a_layout, parent, false)
        return MyViewHolder(itemLayoutView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        if (!itemStateArray.get(position, false)) {
            holder.radioBtn!!.setChecked(false)
        } else {
            holder.radioBtn!!.setChecked(true)
        }
        holder._tital!!.setText(arrayList.get(position).toString())
        holder.radioBtn!!.setOnClickListener(View.OnClickListener {
            var adapterPosition = position
            if (!itemStateArray.get(adapterPosition, false)) {
                holder.radioBtn!!.setChecked(true)
                itemStateArray.put(adapterPosition, true)
                if (arrayList!= null) {
                    arrayListB.add(arrayList.get(position))
                }
                if (arrayList.size > 1) {

                    arrayList.removeAt(position)
                } else {
                    arrayList.clear()
                }
                println("settt..02 selected.." + adapterPosition + ".." + listSelected)
            } else {
                holder.radioBtn!!.setChecked(false)
                itemStateArray.put(adapterPosition, false)
                println("settt..01 selected.." + adapterPosition + ".." + listSelected)
            }
            // serviceview.service_Id_position(listSelected.toString(), adapterPosition.toString())
        })

    }

    override fun getItemCount(): Int {
        if (arrayList != null) {
            return arrayList.size
        } else {
            return 0
        }

    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        private val RECOVERY_REQUEST = 1

        var _tital: TextView? = null
        var radioBtn: RadioButton? = null
        // var youTubePlayerView : YouTubePlayerView?=null
        var context: Context? = null

        init {
            _tital = itemView.findViewById(R.id.frag_Atext)
            radioBtn = itemView.findViewById(R.id.radio_btn)
            context = itemView.context


        }


    }
}

