package com.example.timetable.adapters.viewholders

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.timetable.R
import com.example.timetable.model.ScheduleItem

class ScheduleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val startTimeTextView: TextView = itemView.findViewById(R.id.text_start_time)
    private val endTimeTextView: TextView = itemView.findViewById(R.id.text_end_time)
    private val subjectTextView: TextView = itemView.findViewById(R.id.text_subject)
    private val teacherTextView: TextView = itemView.findViewById(R.id.text_teacher)
    private val roomTextView: TextView = itemView.findViewById(R.id.text_room)

    fun bind(scheduleItem: ScheduleItem) {
        startTimeTextView.text = scheduleItem.startTime
        endTimeTextView.text = scheduleItem.endTime
        subjectTextView.text = scheduleItem.subject
        teacherTextView.text = scheduleItem.teacher
        roomTextView.text = scheduleItem.classroom
    }

    companion object {
        fun create(parent: ViewGroup): ScheduleViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_schedule, parent, false)
            return ScheduleViewHolder(view)
        }
    }
}