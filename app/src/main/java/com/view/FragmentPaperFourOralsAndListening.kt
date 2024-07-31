package com.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mazulu.la.R
import com.mazulu.la.databinding.FragmentPaperFourOralsAndListeningBinding
import com.mazulu.la.databinding.FragmentPaperOneLanguageBinding

class FragmentPaperFourOralsAndListening : Fragment() {

    lateinit var fragmentPaperFourOralsAndListeningBinding: FragmentPaperFourOralsAndListeningBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        fragmentPaperFourOralsAndListeningBinding = FragmentPaperFourOralsAndListeningBinding.inflate(inflater,container,false)


        // Inflate the layout for this fragment
        return fragmentPaperFourOralsAndListeningBinding.root
    }


}