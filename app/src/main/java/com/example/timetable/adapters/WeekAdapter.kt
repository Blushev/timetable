package com.example.timetable.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.timetable.R
import com.example.timetable.model.Parity
import com.example.timetable.model.WeekSchedule

class WeekAdapter : ListAdapter<WeekSchedule, WeekAdapter.WeekViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeekViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_day_schedule, parent, false)
        return WeekViewHolder(view)
    }

    override fun onBindViewHolder(holder: WeekViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class WeekViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val dayTextView: TextView = itemView.findViewById(R.id.text_day_of_week)
        private val lessonsTextView: TextView = itemView.findViewById(R.id.text_lessons)

        fun bind(weekSchedule: WeekSchedule) {
            dayTextView.text = weekSchedule.day
            val lessonsText = StringBuilder()
            for (lesson in weekSchedule.days) {
                lessonsText.append("${lesson.startTime} - ${lesson.endTime}: ${lesson.subject}, ${lesson.teacher}, ${lesson.classroom}\n")
            }
            lessonsTextView.text = lessonsText.toString()
        }
    }

    class DiffCallback : DiffUtil.ItemCallback<WeekSchedule>() {
        override fun areItemsTheSame(oldItem: WeekSchedule, newItem: WeekSchedule): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: WeekSchedule, newItem: WeekSchedule): Boolean {
            return oldItem == newItem
        }
    }
}