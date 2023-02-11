package com.example.navdemo1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.navdemo1.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_first, container, false )
        binding.button2.setOnClickListener {
            it.findNavController().navigate(R.id.action_firstFragment_to_homeFragment)
        }
        binding.button3.setOnClickListener {
            it.findNavController().navigate(R.id.action_firstFragment_to_termsFragment)
        }
        return binding.root
    }

}