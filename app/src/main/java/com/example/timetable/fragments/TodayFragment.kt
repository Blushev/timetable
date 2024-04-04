package com.example.timetable.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.timetable.R
import com.example.timetable.adapters.TodayAdapter
import com.example.timetable.databinding.FragmentTodayBinding
import com.example.timetable.model.Parity
import com.example.timetable.model.ScheduleItem
import com.example.timetable.model.WeekSchedule
import com.example.timetable.utils.DataGenerator
import com.example.timetable.utils.WeekDays
import java.util.Calendar

class TodayFragment : Fragment(R.layout.fragment_today) {

    private var _binding: FragmentTodayBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentTodayBinding.bind(view)

        val recyclerView = binding.recyclerViewToday
        recyclerView.layoutManager = LinearLayoutManager(context)
        val adapter = TodayAdapter()
        recyclerView.adapter = adapter

        val todaySchedule = findTodaySchedule()
        todaySchedule?.let {
            adapter.submitList(it.days)
        }
    }

    private fun findTodaySchedule(): WeekSchedule? {
        val calendar = Calendar.getInstance()
        val dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK)
        val dayOfWeekText = when (dayOfWeek) {
            Calendar.MONDAY -> WeekDays.MONDAY
            Calendar.TUESDAY -> WeekDays.TUESDAY
            Calendar.WEDNESDAY -> WeekDays.WEDNESDAY
            Calendar.THURSDAY -> WeekDays.THURSDAY
            Calendar.FRIDAY -> WeekDays.FRIDAY
            Calendar.SATURDAY -> WeekDays.SATURDAY
            Calendar.SUNDAY -> WeekDays.SUNDAY
            else -> ""
        }

        val parity = if (isEvenWeek()) Parity.EVEN else Parity.ODD

        val dataGenerator = DataGenerator()
        val dummyData = dataGenerator.generateDummyData()

        return dummyData.find { it.day == dayOfWeekText && it.parity == parity }
    }

    private fun isEvenWeek(): Boolean {
        val calendar = Calendar.getInstance()
        val weekNumber = calendar.get(Calendar.WEEK_OF_YEAR)
        return when (weekNumber % 2) {
            0 -> true
            else -> false
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}