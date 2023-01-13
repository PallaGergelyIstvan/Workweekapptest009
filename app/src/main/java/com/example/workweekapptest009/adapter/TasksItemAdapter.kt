package com.example.workweekapptest009.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.workweekapptest009.R
import com.example.workweekapptest009.model.Tasks

class TasksItemAdapter(
    private val context: Context,
    private val dataset: List<Tasks> ) :
    RecyclerView.Adapter<TasksItemAdapter.ItemViewHolder>()
{

    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view)
    {
        val textViewName: TextView = view.findViewById(R.id.item_tasks_nema)
        val textViewCom: TextView = view.findViewById(R.id.item_tasks_comment)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_tasks, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textViewName.setText(item.name)
        holder.textViewCom.setText(item.time)

    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}