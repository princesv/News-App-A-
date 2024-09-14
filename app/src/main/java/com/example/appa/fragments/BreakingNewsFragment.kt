package com.example.appa.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.appa.MainActivity
import com.example.appa.R
import com.example.appa.userinterface.NewsViewModel

class BreakingNewsFragment: Fragment(R.layout.fragment_breaking_news) {
    lateinit var viewModel: NewsViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel=(activity as MainActivity).viewModel
    }
}