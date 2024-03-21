package com.example.timetable.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.timetable.R
import com.example.timetable.databinding.FragmentRootBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class RootFragment : Fragment(R.layout.fragment_root) {

    private var _binding: FragmentRootBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRootBinding.inflate(inflater, container, false)
        Log.d("RootFragment", "onCreateView: binding created successfully")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = NavHostFragment.findNavController(this)

        val bottomNavigationView = binding.bottomNavigation

        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            Log.d("RootFragment", "Menu item selected: ${menuItem.title}")
            when (menuItem.itemId) {
                R.id.nav_today -> {
                    Log.d("RootFragment", "Today menu item selected")

                    navController.popBackStack()

                    // Переходим на фрагмент "Сегодня"
                    navController.navigate(R.id.todayFragment)
                    true
                }
                R.id.nav_week -> {
                    Log.d("RootFragment", "Week menu item selected")
                    navController.popBackStack()

                    // Переходим на фрагмент "Неделя"
                    navController.navigate(R.id.weekFragment)
                    true
                }
                else -> {
                    Log.d("RootFragment", "Unknown menu item selected")
                    false
                }

            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}