package com.example.timetable.adapters.viewholders

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.timetable.R
import com.example.timetable.databinding.ItemScheduleBinding
import com.example.timetable.model.ScheduleItem

class ScheduleViewHolder(private val binding: ItemScheduleBinding) : RecyclerView.ViewHolder(binding.root) {
    private val startTimeTextView: TextView = itemView.findViewById(R.id.text_start_time)
    private val endTimeTextView: TextView = itemView.findViewById(R.id.text_end_time)
    private val subjectTextView: TextView = itemView.findViewById(R.id.text_subject)
    private val teacherTextView: TextView = itemView.findViewById(R.id.text_teacher)
    private val roomTextView: TextView = itemView.findViewById(R.id.text_room)

    fun bind(scheduleItem: ScheduleItem) {
        binding.apply {
            textStartTime.text = scheduleItem.startTime
            textEndTime.text = scheduleItem.endTime
            textSubject.text = scheduleItem.subject
            textTeacher.text = scheduleItem.teacher
            textRoom.text = scheduleItem.classroom
        }
    }
    companion object {
        fun create(parent: ViewGroup): ScheduleViewHolder {
            val binding = ItemScheduleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return ScheduleViewHolder(binding)
        }
    }
}