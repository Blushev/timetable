package com.example.timetable.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.timetable.R
import com.example.timetable.adapters.TodayAdapter
import com.example.timetable.model.ScheduleItem

class TodayFragment : Fragment(R.layout.fragment_today) {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: TodayAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.recycler_view_today)
        recyclerView.layoutManager = LinearLayoutManager(context)
        adapter = TodayAdapter()
        recyclerView.adapter = adapter

        // Пример данных для RecyclerView
        val dummyData = generateDummyData()
        adapter.submitList(dummyData)
    }

    private fun generateDummyData(): List<ScheduleItem> {
        // Генерация тестовых данных для RecyclerView
        val dummyData = listOf(
            ScheduleItem("09:00", "10:30", "Math", "101", "Mr. Smith"),
            ScheduleItem("11:00", "12:30", "Physics", "202", "Ms. Johnson"),
            ScheduleItem("13:00", "14:30", "History", "303", "Mr. Brown")
        )
        Log.d("TodayFragment", "Generated dummy data: $dummyData")
        return dummyData
    }
}