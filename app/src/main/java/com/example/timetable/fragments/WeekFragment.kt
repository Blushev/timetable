package com.example.timetable.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.timetable.R
import com.example.timetable.adapters.WeekAdapter

class WeekFragment : Fragment(R.layout.fragment_week) {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: WeekAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.recycler_view_week)
        recyclerView.layoutManager = LinearLayoutManager(context)
        adapter = WeekAdapter()
        recyclerView.adapter = adapter
        // Заполнение RecyclerView данными для "Недели"
        val dummyData = generateDummyData()
        adapter.submitList(dummyData)
    }

    private fun generateDummyData(): List<String> {
        // Генерация тестовых данных для RecyclerView
        val dummyData = listOf("Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье")
        Log.d("WeekFragment", "Generated dummy data: $dummyData")
        return dummyData
    }
}