package com.example.workweekapptest009.data

import com.example.workweekapptest009.model.Tasks
import com.example.workweekapptest009.model.Workers

class DataSource {
    
    fun loadTasks(): List<Tasks> {
        return listOf<Tasks>(
            Tasks("asd", "asd", "asd", "asd", "asd"),
            Tasks("asd", "asd", "asd", "asd", "asd"),
            Tasks("asd", "asd", "asd", "asd", "asd"),
            Tasks("asd", "asd", "asd", "asd", "asd"),
            Tasks("asd", "asd", "asd", "asd", "asd"),
            Tasks("asd", "asd", "asd", "asd", "asd"),
        )
    }

    fun loadWorkers(): List<Workers> {
        return listOf<Workers>(
            Workers("asd", "asd", "asd", "asd", "asd"),
            Workers("asd", "asd", "asd", "asd", "asd"),
            Workers("asd", "asd", "asd", "asd", "asd"),
            Workers("asd", "asd", "asd", "asd", "asd"),
            Workers("asd", "asd", "asd", "asd", "asd"),
            Workers("asd", "asd", "asd", "asd", "asd"),
        )
    }

}