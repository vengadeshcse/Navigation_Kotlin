package com.example.navigation_kotlin.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.navigation_kotlin.R
import com.example.navigation_kotlin.databinding.FirstFragmentBinding

class FirstFragment : Fragment() {

    companion object {
        fun newInstance() = FirstFragment()
    }

    private lateinit var viewModel: FirstViewModel
    lateinit var binding: FirstFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FirstFragmentBinding.inflate(layoutInflater,container,false);

        binding.txtFirst.setOnClickListener({findNavController().navigate(R.id.act_first_to_second)})

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FirstViewModel::class.java)
        // TODO: Use the ViewModel

    }

}