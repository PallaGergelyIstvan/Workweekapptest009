package com.example.workweekapptest009

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.workweekapptest009.adapter.TasksItemAdapter
import com.example.workweekapptest009.data.DataSource

class ActivityTasks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tasks)

        val myDataset = DataSource().loadTasks()

        val rv : RecyclerView = findViewById(R.id.recycler_view_tasks)
        rv.adapter = TasksItemAdapter(this, myDataset)

        rv.setHasFixedSize(false)

        val button1: Button = findViewById(R.id.button_menu_main_welcome)
        button1.setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }

        val button3: Button = findViewById(R.id.button_menu_main_workers)
        button3.setOnClickListener {
            Intent(this, ActivityWorkers::class.java).also {
                startActivity(it)
            }
        }
    }
}