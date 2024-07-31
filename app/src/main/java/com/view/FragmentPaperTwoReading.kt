package com.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mazulu.la.R
import com.mazulu.la.databinding.FragmentPaperOneLanguageBinding
import com.mazulu.la.databinding.FragmentPaperTwoReadingBinding

class FragmentPaperTwoReading : Fragment() {

    lateinit var fragmentPaperTwoReadingBinding: FragmentPaperTwoReadingBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        fragmentPaperTwoReadingBinding = FragmentPaperTwoReadingBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return fragmentPaperTwoReadingBinding.root
    }


}