package com.example.workweekapptest009

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.workweekapptest009.adapter.WorkersItemAdapter
import com.example.workweekapptest009.data.DataSource

class ActivityWorkers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_worker)

        val myDataset = DataSource().loadWorkers()

        val rv : RecyclerView = findViewById(R.id.recycler_view_workers)
        rv.adapter = WorkersItemAdapter(this, myDataset)

        rv.setHasFixedSize(false)

        val button1: Button = findViewById(R.id.button_menu_main_welcome)
        button1.setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }

        val button2: Button = findViewById(R.id.button_menu_main_tasks)
        button2.setOnClickListener {
            Intent(this, ActivityTasks ::class.java).also {
                startActivity(it)
            }
        }

    }
}