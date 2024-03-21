package com.example.timetable

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.timetable.fragments.RootFragment
import com.example.timetable.fragments.TodayFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Заменить содержимое контейнера фрагментов на RootFragment
        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment, RootFragment())
            .commit()
    }
}