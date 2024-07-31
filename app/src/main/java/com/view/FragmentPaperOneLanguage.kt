package com.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mazulu.la.R
import com.mazulu.la.databinding.FragmentDashboardBinding
import com.mazulu.la.databinding.FragmentPaperOneLanguageBinding

class FragmentPaperOneLanguage : Fragment() {

    lateinit var fragmentPaperOneLanguageBinding: FragmentPaperOneLanguageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        fragmentPaperOneLanguageBinding = FragmentPaperOneLanguageBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return fragmentPaperOneLanguageBinding.root
    }


}