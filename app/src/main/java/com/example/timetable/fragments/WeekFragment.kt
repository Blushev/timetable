package com.example.timetable.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.timetable.R
import com.example.timetable.adapters.WeekAdapter
import com.example.timetable.model.Parity
import com.example.timetable.model.ScheduleItem
import com.example.timetable.model.WeekSchedule

class WeekFragment : Fragment(R.layout.item_day_schedule) {

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

    private fun generateDummyData(): List<WeekSchedule> {
        // Генерация тестовых данных для RecyclerView
        val dummyData = listOf(
            WeekSchedule(
                Parity.EVEN, // Чётная неделя
                "Понедельник",
                listOf(
                    ScheduleItem("08:00", "09:30", "Математика", "101", "Иванов"),
                    ScheduleItem("10:00", "11:30", "Физика", "102", "Петров"),
                    ScheduleItem("12:00", "13:30", "История", "103", "Сидоров")
                )
            ),
            WeekSchedule(
                Parity.ODD, // Нечётная неделя
                "Вторник",
                listOf(
                    ScheduleItem("08:00", "09:30", "Биология", "201", "Козлов"),
                    ScheduleItem("10:00", "11:30", "Химия", "202", "Лебедев"),
                    ScheduleItem("12:00", "13:30", "Литература", "203", "Петрова")
                )
            )
            // Добавьте здесь больше объектов WeekSchedule для других дней недели
        )
        Log.d("WeekFragment", "Generated dummy data: $dummyData")
        return dummyData
    }
}