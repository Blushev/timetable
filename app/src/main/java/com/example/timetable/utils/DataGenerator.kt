package com.example.timetable.utils

import com.example.timetable.model.Parity
import com.example.timetable.model.ScheduleItem
import com.example.timetable.model.WeekSchedule
import java.util.Calendar

class DataGenerator {
    fun generateDummyData(): List<WeekSchedule> {
        val dummyData = mutableListOf<WeekSchedule>()

        dummyData.addAll(listOf(
            WeekSchedule(
                parity = Parity.EVEN,
                day = WeekDays.MONDAY,
                days = listOf(
                    ScheduleItem("18:20", "19:50", "КОРПОРАТИВНЫЕ ИНФОРМАЦИОННЫЕ СИСТЕМЫ (ПР.)", "132", "Ботов С.Г"),
                    ScheduleItem("19:55", "21:25", "КОРПОРАТИВНЫЕ ИНФОРМАЦИОННЫЕ СИСТЕМЫ (ПР.)", "132", "Ботов С.Г"),
                )
            ),
            WeekSchedule(
                parity = Parity.EVEN,
                day = WeekDays.TUESDAY,
                days = listOf(
                    ScheduleItem("16:40", "18:10", "РАЗРАБОТКА ИНТЕРНЕТ-ПРИЛОЖЕНИЙ (ЛЕК.)", "413", "Андриевский Л.А"),
                    ScheduleItem("18:20", "19:50", "ПРОЕКТИРОВАНИЕ И РАЗРАБОТКА РАСПРЕДЕЛЕННЫХ ПРОГРАММНЫХ СИСТЕМ (ПР.)", "132А", "Андриевский Л.А"),
                    ScheduleItem("19:55", "21:25", "РАЗРАБОТКА ИНТЕРНЕТ-ПРИЛОЖЕНИЙ (ПР.)", "132А", "Андриевский Л.А"),
                )
            ),
            WeekSchedule(
                parity = Parity.EVEN,
                day = WeekDays.WEDNESDAY,
                days = listOf(
                    ScheduleItem("18:20", "19:50", "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ И ЖИЗНЕНЫМ ЦИКЛОМ ПО (ЛЕК.)", "А-13", "Воробьев В.И., Пущев А.А"),
                    ScheduleItem("19:55", "21:25", "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ И ЖИЗНЕНЫМ ЦИКЛОМ ПО (ПР.)", "А-13", "Воробьев В.И., Пущев А.А"),
                )
            ),
            WeekSchedule(
                parity = Parity.EVEN,
                day = WeekDays.THURSDAY,
                days = listOf(
                    ScheduleItem("13:00", "14:30", "(1-11Н.) СИСТЕМНЫЙ АНАЛИЗ И МОДЕЛИРОВАНИЕ (ЛЕК.)", "https://eu.iit.csu.ru/course/view.php?id=3972", "Шилова О.Ю."),
                    ScheduleItem("17:30", "19:00", "(1-11Н.) СИСТЕМНЫЙ АНАЛИЗ И МОДЕЛИРОВАНИЕ (ПР.)", "https://eu.iit.csu.ru/course/view.php?id=3972", "Шилова О.Ю."),
                )
            ),
            WeekSchedule(
                parity = Parity.EVEN,
                day = WeekDays.FRIDAY,
                days = listOf(
                    ScheduleItem("16:40", "18:10", "КОРПОРАТИВНЫЕ ИНФОРМАЦИОННЫЕ СИСТЕМЫ (ЛЕК.)", "201", "Ботов С.Г"),
                    ScheduleItem("18:20", "19:50", "МАШИННОЕ ОБУЧЕНИЕ И ИНТЕЛЛЕКТУАЛЬНЫЙ АНАЛИЗ ДАННЫХ (ПР.)", "132", "Иванова О.С."),
                )
            ),
            WeekSchedule(
                parity = Parity.EVEN,
                day = WeekDays.SATURDAY,
                days = listOf(
                    ScheduleItem("11:20", "12:50", "АНАЛИЗ ДАННЫХ (ЛЕК.)", "413", "Мирасов В.Ф"),
                )
            ))
        )

        dummyData.addAll(listOf(
            WeekSchedule(
                parity = Parity.ODD,
                day = WeekDays.TUESDAY,
                days = listOf(
                    ScheduleItem("16:40", "18:10", "ПРОЕКТИРОВАНИЕ И РАЗРАБОТКА РАСПРЕДЕЛЕННЫХ ПРОГРАММНЫХ СИСТЕМ (ЛЕК.)", "413", "Андриевский Л.А"),
                    ScheduleItem("18:20", "19:50", "ПРОЕКТИРОВАНИЕ И РАЗРАБОТКА РАСПРЕДЕЛЕННЫХ ПРОГРАММНЫХ СИСТЕМ (ПР.)", "132А", "Андриевский Л.А"),
                    ScheduleItem("19:55", "21:25", "РАЗРАБОТКА ИНТЕРНЕТ-ПРИЛОЖЕНИЙ (ПР.)", "132А", "Андриевский Л.А"),
                )
            ),

            WeekSchedule(
                parity = Parity.ODD,
                day = WeekDays.WEDNESDAY,
                days = listOf(
                    ScheduleItem("18:20", "19:50", "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ И ЖИЗНЕНЫМ ЦИКЛОМ ПО (ЛЕК.)", "А-13", "Воробьев В.И., Пущев А.А"),
                    ScheduleItem("19:55", "21:25", "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ И ЖИЗНЕНЫМ ЦИКЛОМ ПО (ПР.)", "А-13", "Воробьев В.И., Пущев А.А"),
                )
            ),
            WeekSchedule(
                parity = Parity.ODD,
                day = WeekDays.THURSDAY,
                days = listOf(
                    ScheduleItem("13:00", "14:30", "(1-11Н.) СИСТЕМНЫЙ АНАЛИЗ И МОДЕЛИРОВАНИЕ (ЛЕК.)", "https://eu.iit.csu.ru/course/view.php?id=3972", "Шилова О.Ю."),
                    ScheduleItem("17:30", "19:00", "(1-11Н.) СИСТЕМНЫЙ АНАЛИЗ И МОДЕЛИРОВАНИЕ (ПР.)", "https://eu.iit.csu.ru/course/view.php?id=3972", "Шилова О.Ю."),
                )
            ),
            WeekSchedule(
                parity = Parity.ODD,
                day = WeekDays.FRIDAY,
                days = listOf(
                    ScheduleItem("18:20", "19:50", "МАШИННОЕ ОБУЧЕНИЕ И ИНТЕЛЛЕКТУАЛЬНЫЙ АНАЛИЗ ДАННЫХ (ЛЕК.)", "201", "Иванова О.С."),
                    ScheduleItem("19:55", "21:25", "МАШИННОЕ ОБУЧЕНИЕ И ИНТЕЛЛЕКТУАЛЬНЫЙ АНАЛИЗ ДАННЫХ (ПР.)", "132", "Иванова О.С."),
                )
            ),

            WeekSchedule(
                parity = Parity.ODD,
                day = WeekDays.SATURDAY,
                days = listOf(
                    ScheduleItem("11:20", "12:50", "АНАЛИЗ ДАННЫХ (ПР.)", "132А", "Мирасов В.Ф"),
                    ScheduleItem("13:15", "14:45", "АНАЛИЗ ДАННЫХ (ПР.)", "132А", "Мирасов В.Ф"),
                )
            ),
        ))
        return dummyData
    }


    fun generateDummyWeekSchedule(): List<WeekSchedule> {
        val parity = if (Calendar.getInstance().get(Calendar.WEEK_OF_YEAR) % 2 == 0) Parity.EVEN else Parity.ODD

        val evenWeekSchedule = mutableListOf<WeekSchedule>()
        val oddWeekSchedule = mutableListOf<WeekSchedule>()

        evenWeekSchedule.addAll(listOf(
            WeekSchedule(
                parity = Parity.EVEN,
                day = WeekDays.MONDAY,
                days = listOf(
                    ScheduleItem("18:20", "19:50", "КОРПОРАТИВНЫЕ ИНФОРМАЦИОННЫЕ СИСТЕМЫ (ПР.)", "132", "Ботов С.Г"),
                    ScheduleItem("19:55", "21:25", "КОРПОРАТИВНЫЕ ИНФОРМАЦИОННЫЕ СИСТЕМЫ (ПР.)", "132", "Ботов С.Г"),
                )
            ),
            WeekSchedule(
                parity = Parity.EVEN,
                day = WeekDays.TUESDAY,
                days = listOf(
                    ScheduleItem("16:40", "18:10", "РАЗРАБОТКА ИНТЕРНЕТ-ПРИЛОЖЕНИЙ (ЛЕК.)", "413", "Андриевский Л.А"),
                    ScheduleItem("18:20", "19:50", "ПРОЕКТИРОВАНИЕ И РАЗРАБОТКА РАСПРЕДЕЛЕННЫХ ПРОГРАММНЫХ СИСТЕМ (ПР.)", "132А", "Андриевский Л.А"),
                    ScheduleItem("19:55", "21:25", "РАЗРАБОТКА ИНТЕРНЕТ-ПРИЛОЖЕНИЙ (ПР.)", "132А", "Андриевский Л.А"),
                )
            ),
            WeekSchedule(
                parity = Parity.EVEN,
                day = WeekDays.WEDNESDAY,
                days = listOf(
                    ScheduleItem("18:20", "19:50", "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ И ЖИЗНЕНЫМ ЦИКЛОМ ПО (ЛЕК.)", "А-13", "Воробьев В.И., Пущев А.А"),
                    ScheduleItem("19:55", "21:25", "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ И ЖИЗНЕНЫМ ЦИКЛОМ ПО (ПР.)", "А-13", "Воробьев В.И., Пущев А.А"),
                )
            ),
            WeekSchedule(
                parity = Parity.EVEN,
                day = WeekDays.THURSDAY,
                days = listOf(
                    ScheduleItem("13:00", "14:30", "(1-11Н.) СИСТЕМНЫЙ АНАЛИЗ И МОДЕЛИРОВАНИЕ (ЛЕК.)", "https://eu.iit.csu.ru/course/view.php?id=3972", "Шилова О.Ю."),
                    ScheduleItem("17:30", "19:00", "(1-11Н.) СИСТЕМНЫЙ АНАЛИЗ И МОДЕЛИРОВАНИЕ (ПР.)", "https://eu.iit.csu.ru/course/view.php?id=3972", "Шилова О.Ю."),
                )
            ),
            WeekSchedule(
                parity = Parity.EVEN,
                day = WeekDays.FRIDAY,
                days = listOf(
                    ScheduleItem("16:40", "18:10", "КОРПОРАТИВНЫЕ ИНФОРМАЦИОННЫЕ СИСТЕМЫ (ЛЕК.)", "201", "Ботов С.Г"),
                    ScheduleItem("18:20", "19:50", "МАШИННОЕ ОБУЧЕНИЕ И ИНТЕЛЛЕКТУАЛЬНЫЙ АНАЛИЗ ДАННЫХ (ПР.)", "132", "Иванова О.С."),
                )
            ),
            WeekSchedule(
                parity = Parity.EVEN,
                day = WeekDays.SATURDAY,
                days = listOf(
                    ScheduleItem("11:20", "12:50", "АНАЛИЗ ДАННЫХ (ЛЕК.)", "413", "Мирасов В.Ф"),
                )
            )
        )
        )

        oddWeekSchedule.addAll(listOf(
            WeekSchedule(
                parity = Parity.ODD,
                day = WeekDays.TUESDAY,
                days = listOf(
                    ScheduleItem("16:40", "18:10", "ПРОЕКТИРОВАНИЕ И РАЗРАБОТКА РАСПРЕДЕЛЕННЫХ ПРОГРАММНЫХ СИСТЕМ (ЛЕК.)", "413", "Андриевский Л.А"),
                    ScheduleItem("18:20", "19:50", "ПРОЕКТИРОВАНИЕ И РАЗРАБОТКА РАСПРЕДЕЛЕННЫХ ПРОГРАММНЫХ СИСТЕМ (ПР.)", "132А", "Андриевский Л.А"),
                    ScheduleItem("19:55", "21:25", "РАЗРАБОТКА ИНТЕРНЕТ-ПРИЛОЖЕНИЙ (ПР.)", "132А", "Андриевский Л.А"),)
            ),

            WeekSchedule(
                parity = Parity.ODD,
                day = WeekDays.WEDNESDAY,
                days = listOf(
                    ScheduleItem("18:20", "19:50", "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ И ЖИЗНЕНЫМ ЦИКЛОМ ПО (ЛЕК.)", "А-13", "Воробьев В.И., Пущев А.А"),
                    ScheduleItem("19:55", "21:25", "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ И ЖИЗНЕНЫМ ЦИКЛОМ ПО (ПР.)", "А-13", "Воробьев В.И., Пущев А.А"),
                )
            ),
            WeekSchedule(
                parity = Parity.ODD,
                day = WeekDays.THURSDAY,
                days = listOf(
                    ScheduleItem("13:00", "14:30", "(1-11Н.) СИСТЕМНЫЙ АНАЛИЗ И МОДЕЛИРОВАНИЕ (ЛЕК.)", "https://eu.iit.csu.ru/course/view.php?id=3972", "Шилова О.Ю."),
                    ScheduleItem("17:30", "19:00", "(1-11Н.) СИСТЕМНЫЙ АНАЛИЗ И МОДЕЛИРОВАНИЕ (ПР.)", "https://eu.iit.csu.ru/course/view.php?id=3972", "Шилова О.Ю."),
                )
            ),
            WeekSchedule(
                parity = Parity.ODD,
                day = WeekDays.FRIDAY,
                days = listOf(
                    ScheduleItem("18:20", "19:50", "МАШИННОЕ ОБУЧЕНИЕ И ИНТЕЛЛЕКТУАЛЬНЫЙ АНАЛИЗ ДАННЫХ (ЛЕК.)", "201", "Иванова О.С."),
                    ScheduleItem("19:55", "21:25", "МАШИННОЕ ОБУЧЕНИЕ И ИНТЕЛЛЕКТУАЛЬНЫЙ АНАЛИЗ ДАННЫХ (ПР.)", "132", "Иванова О.С."),
                )
            ),

            WeekSchedule(
                parity = Parity.ODD,
                day = WeekDays.SATURDAY,
                days = listOf(
                    ScheduleItem("11:20", "12:50", "АНАЛИЗ ДАННЫХ (ПР.)", "132А", "Мирасов В.Ф"),
                    ScheduleItem("13:15", "14:45", "АНАЛИЗ ДАННЫХ (ПР.)", "132А", "Мирасов В.Ф"),
                )
            ))
        )

        return if (parity == Parity.EVEN) evenWeekSchedule else oddWeekSchedule
    }
}