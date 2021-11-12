package com.example.navigation_kotlin.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigation_kotlin.R
import com.example.navigation_kotlin.databinding.FourthFragmentBinding

class FourthFragment : Fragment() {

    companion object {
        fun newInstance() = FourthFragment()
    }

    private lateinit var viewModel: FourthViewModel
    lateinit var binding: FourthFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FourthFragmentBinding.inflate(layoutInflater,container,false)
        binding.txtFourth.setOnClickListener({findNavController().navigate(R.id.act_fourth_to_first)})
        return binding.root
        //return inflater.inflate(R.layout.fourth_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FourthViewModel::class.java)
        // TODO: Use the ViewModel
    }

}