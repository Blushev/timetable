package com.example.timetable.model

data class ScheduleItem(
    val startTime: String,
    val endTime: String,
    val subject: String,
    val classroom: String,
    val teacher: String
)

data class WeekSchedule(
    val parity: Parity, // Чётность недели
    val day: String,
    val days: List<ScheduleItem> // Расписание на каждый день недели
)

enum class Parity {
    EVEN, // Чётная неделя
    ODD // Нечётная неделя
}