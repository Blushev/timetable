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
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = NavHostFragment.findNavController(this)

        binding.bottomNavigation.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.navigation_today -> {
                    val activity = requireActivity()
                    if (!activity.isFinishing && !activity.isDestroyed) {
                        navController.popBackStack()
                        navController.navigate(R.id.todayFragment)
                        true
                    } else {
                        false
                    }
                }
                R.id.navigation_week -> {
                    val activity = requireActivity()
                    if (!activity.isFinishing && !activity.isDestroyed) {
                        navController.popBackStack()
                        navController.navigate(R.id.weekFragment)
                        true
                    } else {
                        false
                    }
                }
                else -> false
            }
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}