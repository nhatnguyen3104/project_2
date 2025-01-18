package com.example.project_2.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.project_2.R
import com.example.project_2.databinding.Fragment1Binding

class Fragment1 : Fragment() {

private var _binding: Fragment1Binding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = Fragment1Binding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
//        val btnF1 = view.findViewById<Button>(R.id.btnF1)
        binding.btnF1.setOnClickListener {

//            findNavController().navigate(R.id.action_fragment1_to_fragment2)
            it.findNavController().navigate(R.id.action_fragment1_to_fragment2)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}