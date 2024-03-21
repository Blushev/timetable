package com.example.timetable.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.timetable.R
import com.example.timetable.adapters.TodayAdapter

class TodayFragment : Fragment(R.layout.fragment_today) {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: TodayAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.recycler_view_today) // Или R.id.recycler_view_week для WeekFragment
        recyclerView.layoutManager = LinearLayoutManager(context)
        adapter = TodayAdapter()
        recyclerView.adapter = adapter
        // Заполнение RecyclerView данными для "Сегодня"
        val dummyData = generateDummyData()
        adapter.submitList(dummyData)
    }

    private fun generateDummyData(): List<String> {
        // Генерация тестовых данных для RecyclerView
        val dummyData = listOf("Пара 1", "Пара 2", "Пара 3")
        Log.d("TodayFragment", "Generated dummy data: $dummyData")
        return dummyData
    }
}