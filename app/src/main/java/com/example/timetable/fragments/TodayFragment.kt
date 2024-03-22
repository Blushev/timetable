package com.example.timetable.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.timetable.R
import com.example.timetable.adapters.TodayAdapter
import com.example.timetable.model.Parity
import com.example.timetable.model.ScheduleItem
import com.example.timetable.model.WeekSchedule
import java.util.Calendar

class TodayFragment : Fragment(R.layout.fragment_today) {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: TodayAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.recycler_view_today)
        recyclerView.layoutManager = LinearLayoutManager(context)
        adapter = TodayAdapter()
        recyclerView.adapter = adapter

        val todaySchedule = findTodaySchedule()
        if (todaySchedule != null) {
            adapter.submitList(todaySchedule.days)
        } else {
            Log.d("TodayFragment", "Расписание на сегодня отсутствует")
        }
    }

    private fun findTodaySchedule(): WeekSchedule? {
        val calendar = Calendar.getInstance()
        val dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK)
        val dayOfWeekText = when (dayOfWeek) {
            Calendar.MONDAY -> "Понедельник"
            Calendar.TUESDAY -> "Вторник"
            Calendar.WEDNESDAY -> "Среда"
            Calendar.THURSDAY -> "Четверг"
            Calendar.FRIDAY -> "Пятница"
            Calendar.SATURDAY -> "Суббота"
            Calendar.SUNDAY -> "Воскресенье"
            else -> ""
        }

        val parity = if (isEvenWeek()) Parity.EVEN else Parity.ODD

        val dummyData = generateDummyData()

        return dummyData.find { it.day == dayOfWeekText && it.parity == parity }
    }

    private fun isEvenWeek(): Boolean {
        val calendar = Calendar.getInstance()
        val weekNumber = calendar.get(Calendar.WEEK_OF_YEAR)
        return weekNumber % 2 == 0
    }


    private fun generateDummyData(): List<WeekSchedule> {
        // Генерация тестовых данных для RecyclerView
        val dummyData = listOf(
            WeekSchedule(
                parity = Parity.EVEN,
                day = "Понедельник",
                days = listOf(
                    ScheduleItem("18:20", "19:50", "КОРПОРАТИВНЫЕ ИНФОРМАЦИОННЫЕ СИСТЕМЫ (ПР.)", "132", "Ботов С.Г"),
                    ScheduleItem("19:55", "21:25", "КОРПОРАТИВНЫЕ ИНФОРМАЦИОННЫЕ СИСТЕМЫ (ПР.)", "132", "Ботов С.Г"),
                )
            ),
            WeekSchedule(
                parity = Parity.EVEN,
                day = "Вторник",
                days = listOf(
                    ScheduleItem("16:40", "18:10", "РАЗРАБОТКА ИНТЕРНЕТ-ПРИЛОЖЕНИЙ (ЛЕК.)", "413", "Андриевский Л.А"),
                    ScheduleItem("18:20", "19:50", "ПРОЕКТИРОВАНИЕ И РАЗРАБОТКА РАСПРЕДЕЛЕННЫХ ПРОГРАММНЫХ СИСТЕМ (ПР.)", "132А", "Андриевский Л.А"),
                    ScheduleItem("19:55", "21:25", "РАЗРАБОТКА ИНТЕРНЕТ-ПРИЛОЖЕНИЙ (ПР.)", "132А", "Андриевский Л.А"),
                    )
            ),
            WeekSchedule(
                parity = Parity.EVEN,
                day = "Среда",
                days = listOf(
                    ScheduleItem("18:20", "19:50", "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ И ЖИЗНЕНЫМ ЦИКЛОМ ПО (ЛЕК.)", "А-13", "Воробьев В.И., Пущев А.А"),
                    ScheduleItem("19:55", "21:25", "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ И ЖИЗНЕНЫМ ЦИКЛОМ ПО (ПР.)", "А-13", "Воробьев В.И., Пущев А.А"),
                )
            ),
            WeekSchedule(
                parity = Parity.EVEN,
                day = "Четверг",
                days = listOf(
                    ScheduleItem("13:00", "14:30", "(1-11Н.) СИСТЕМНЫЙ АНАЛИЗ И МОДЕЛИРОВАНИЕ (ЛЕК.)", "https://eu.iit.csu.ru/course/view.php?id=3972", "Шилова О.Ю."),
                    ScheduleItem("17:30", "19:00", "(1-11Н.) СИСТЕМНЫЙ АНАЛИЗ И МОДЕЛИРОВАНИЕ (ПР.)", "https://eu.iit.csu.ru/course/view.php?id=3972", "Шилова О.Ю."),
                )
            ),
            WeekSchedule(
                parity = Parity.EVEN,
                day = "Пятница",
                days = listOf(
                    ScheduleItem("16:40", "18:10", "КОРПОРАТИВНЫЕ ИНФОРМАЦИОННЫЕ СИСТЕМЫ (ЛЕК.)", "201", "Ботов С.Г"),
                    ScheduleItem("18:20", "19:50", "МАШИННОЕ ОБУЧЕНИЕ И ИНТЕЛЛЕКТУАЛЬНЫЙ АНАЛИЗ ДАННЫХ (ПР.)", "132", "Иванова О.С."),
                )
            ),
            WeekSchedule(
                parity = Parity.EVEN,
                day = "Суббота",
                days = listOf(
                    ScheduleItem("11:20", "12:50", "АНАЛИЗ ДАННЫХ (ЛЕК.)", "413", "Мирасов В.Ф"),
                )
            ),


            WeekSchedule(
                parity = Parity.ODD,
                day = "Вторник",
                days = listOf(
                    ScheduleItem("16:40", "18:10", "ПРОЕКТИРОВАНИЕ И РАЗРАБОТКА РАСПРЕДЕЛЕННЫХ ПРОГРАММНЫХ СИСТЕМ (ЛЕК.)", "413", "Андриевский Л.А"),
                    ScheduleItem("18:20", "19:50", "ПРОЕКТИРОВАНИЕ И РАЗРАБОТКА РАСПРЕДЕЛЕННЫХ ПРОГРАММНЫХ СИСТЕМ (ПР.)", "132А", "Андриевский Л.А"),
                    ScheduleItem("19:55", "21:25", "РАЗРАБОТКА ИНТЕРНЕТ-ПРИЛОЖЕНИЙ (ПР.)", "132А", "Андриевский Л.А"),
                )
            ),

            WeekSchedule(
                parity = Parity.ODD,
                day = "Среда",
                days = listOf(
                    ScheduleItem("18:20", "19:50", "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ И ЖИЗНЕНЫМ ЦИКЛОМ ПО (ЛЕК.)", "А-13", "Воробьев В.И., Пущев А.А"),
                    ScheduleItem("19:55", "21:25", "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ И ЖИЗНЕНЫМ ЦИКЛОМ ПО (ПР.)", "А-13", "Воробьев В.И., Пущев А.А"),
                )
            ),
            WeekSchedule(
                parity = Parity.ODD,
                day = "Четверг",
                days = listOf(
                    ScheduleItem("13:00", "14:30", "(1-11Н.) СИСТЕМНЫЙ АНАЛИЗ И МОДЕЛИРОВАНИЕ (ЛЕК.)", "https://eu.iit.csu.ru/course/view.php?id=3972", "Шилова О.Ю."),
                    ScheduleItem("17:30", "19:00", "(1-11Н.) СИСТЕМНЫЙ АНАЛИЗ И МОДЕЛИРОВАНИЕ (ПР.)", "https://eu.iit.csu.ru/course/view.php?id=3972", "Шилова О.Ю."),
                )
            ),
            WeekSchedule(
                parity = Parity.ODD,
                day = "Пятница",
                days = listOf(
                    ScheduleItem("18:20", "19:50", "МАШИННОЕ ОБУЧЕНИЕ И ИНТЕЛЛЕКТУАЛЬНЫЙ АНАЛИЗ ДАННЫХ (ЛЕК.)", "201", "Иванова О.С."),
                    ScheduleItem("19:55", "21:25", "МАШИННОЕ ОБУЧЕНИЕ И ИНТЕЛЛЕКТУАЛЬНЫЙ АНАЛИЗ ДАННЫХ (ПР.)", "132", "Иванова О.С."),
                )
            ),

            WeekSchedule(
                parity = Parity.ODD,
                day = "Суббота",
                days = listOf(
                    ScheduleItem("11:20", "12:50", "АНАЛИЗ ДАННЫХ (ПР.)", "132А", "Мирасов В.Ф"),
                    ScheduleItem("13:15", "14:45", "АНАЛИЗ ДАННЫХ (ПР.)", "132А", "Мирасов В.Ф"),
                )
            ),
        )


        return dummyData
    }
}