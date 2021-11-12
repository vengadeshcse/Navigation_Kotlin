package com.example.navigation_kotlin.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigation_kotlin.R
import com.example.navigation_kotlin.databinding.ThirdFragmentBinding

class ThirdFragment : Fragment() {

    companion object {
        fun newInstance() = ThirdFragment()
    }

    private lateinit var viewModel: ThirdViewModel
    lateinit var binding: ThirdFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //return inflater.inflate(R.layout.third_fragment, container, false)
        binding = ThirdFragmentBinding.inflate(layoutInflater,container,false)
        binding.txtThird.setOnClickListener({findNavController().navigate(R.id.act_third_to_fourth)})
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ThirdViewModel::class.java)
        // TODO: Use the ViewModel
    }

}