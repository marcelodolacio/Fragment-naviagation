package com.example.testeeeeeeee

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


import androidx.navigation.fragment.findNavController
import com.example.testeeeeeeee.databinding.FragmentSampleBinding


class SampleFragment : Fragment() {

    private lateinit var binding: FragmentSampleBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        binding = FragmentSampleBinding.inflate(inflater, container, false)
        binding.fragment = this
       // binding.viewModel = viewModel
        binding.lifecycleOwner = this
        return binding.root
    }

     fun register() {
        Log.d("nha","BORAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        findNavController().navigate(R.id.action_sampleFragment_to_secundaryFragment)
    }


}