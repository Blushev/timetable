package com.example.timetable.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.timetable.R
import com.example.timetable.model.ScheduleItem

class TodayAdapter : ListAdapter<ScheduleItem, TodayAdapter.ViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_schedule, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
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
    }

    class DiffCallback : DiffUtil.ItemCallback<ScheduleItem>() {
        override fun areItemsTheSame(oldItem: ScheduleItem, newItem: ScheduleItem): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: ScheduleItem, newItem: ScheduleItem): Boolean {
            return oldItem == newItem
        }
    }
}