package com.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.mazulu.la.R
import com.mazulu.la.databinding.FragmentDashboardBinding

class FragmentDashboard : Fragment() {

    lateinit var fragmentDashboardBinding: FragmentDashboardBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentDashboardBinding = FragmentDashboardBinding.inflate(inflater,container,false)


        fragmentDashboardBinding.imageViewPaperOne.setOnClickListener {
            val direction =FragmentDashboardDirections.actionFragmentDashboardToFragmentPaperOneLanguage()
            this.findNavController().navigate(direction)
        }

        fragmentDashboardBinding.imageViewPaperTwo.setOnClickListener {
            val direction =FragmentDashboardDirections.actionFragmentDashboardToFragmentPaperTwoReading()
            this.findNavController().navigate(direction)
        }

        fragmentDashboardBinding.imageViewPaperThree.setOnClickListener {
            val direction =FragmentDashboardDirections.actionFragmentDashboardToFragmentPaperThreeWriting()
            this.findNavController().navigate(direction)
        }

        fragmentDashboardBinding.imageViewPaperFour.setOnClickListener {
            val direction =FragmentDashboardDirections.actionFragmentDashboardToFragmentPaperFourOralsAndListening()
            this.findNavController().navigate(direction)
        }

        // Inflate the layout for this fragment
        return fragmentDashboardBinding.root
    }
}