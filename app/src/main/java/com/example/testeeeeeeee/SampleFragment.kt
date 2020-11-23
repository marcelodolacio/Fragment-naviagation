package com.example.testeeeeeeee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import androidx.navigation.fragment.findNavController


class SampleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_sample, container, false)

        val view: View = inflater.inflate(R.layout.fragment_sample, container, false)
        (activity as MainActivity?)!!.fragmentMethod()




//        val btn = view.findViewById<View>(R.id.btnNha) as Button
//
//        btn.setOnClickListener{
//            findNavController().navigate(R.id.action_sampleFragment_to_secundaryFragment)
//        }

        return view

    }

    fun register() {
        println("other message")
        println("other message")
        println("other message")
        println("other message")
        println("other message")
        println("other message")
        println("other message")


        findNavController().navigate(R.id.action_sampleFragment_to_secundaryFragment)
    }


}