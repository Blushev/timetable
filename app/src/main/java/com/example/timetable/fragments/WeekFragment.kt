package com.example.timetable.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.timetable.R
import com.example.timetable.adapters.WeekAdapter
import com.example.timetable.databinding.FragmentWeekBinding
import com.example.timetable.model.Parity
import com.example.timetable.model.ScheduleItem
import com.example.timetable.model.WeekSchedule
import com.example.timetable.utils.DataGenerator
import java.util.Calendar

class WeekFragment : Fragment(R.layout.fragment_week) {

    private var _binding: FragmentWeekBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentWeekBinding.bind(view)

        val recyclerView = binding.recyclerViewWeek
        recyclerView.layoutManager = LinearLayoutManager(context)
        val adapter = WeekAdapter()
        recyclerView.adapter = adapter

        val dataGenerator = DataGenerator()
        val dummyData = dataGenerator.generateDummyWeekSchedule()
        adapter.submitList(dummyData)

        val currentDayOfWeek = getCurrentDayOfWeek()
        val isWeekendDay = isWeekend(currentDayOfWeek)
        Log.d("WeekFragment", "Current day of week: $currentDayOfWeek, Is weekend: $isWeekendDay")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun getCurrentDayOfWeek(): Int {
        return Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    }

    private fun isWeekend(dayOfWeek: Int): Boolean {
        return dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY
    }
}
