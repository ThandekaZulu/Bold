package com.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mazulu.la.R
import com.mazulu.la.databinding.FragmentPaperOneLanguageBinding
import com.mazulu.la.databinding.FragmentPaperThreeWritingBinding

class FragmentPaperThreeWriting : Fragment() {

    lateinit var fragmentPaperThreeWritingBinding: FragmentPaperThreeWritingBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        fragmentPaperThreeWritingBinding = FragmentPaperThreeWritingBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return fragmentPaperThreeWritingBinding.root
    }


}