package com.example.navigation_kotlin.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigation_kotlin.R
import com.example.navigation_kotlin.databinding.SecondFragmentBinding

class SecondFragment : Fragment() {

    companion object {
        fun newInstance() = SecondFragment()
    }

    private lateinit var viewModel: SecondViewModel
    lateinit var binding: SecondFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = SecondFragmentBinding.inflate(layoutInflater,container,false)

        binding.txtSecond.setOnClickListener({findNavController().navigate(R.id.act_second_to_third)})

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SecondViewModel::class.java)
        // TODO: Use the ViewModel
    }

}