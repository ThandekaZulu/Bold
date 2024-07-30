package com.view

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.core.text.isDigitsOnly
import androidx.navigation.fragment.findNavController
import com.mazulu.la.R
import com.mazulu.la.databinding.FragmentUserDetailsBinding

class FragmentUserDetails : Fragment() {

    lateinit var fragmentUserDetailsBinding: FragmentUserDetailsBinding

    lateinit var fullName : EditText
    lateinit var age : EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentUserDetailsBinding = FragmentUserDetailsBinding.inflate(inflater,container,false)

        fullName = fragmentUserDetailsBinding.editTextFullName
        age = fragmentUserDetailsBinding.editTextAge


        fragmentUserDetailsBinding.buttonNextUserDetails.setOnClickListener {

            var fullNameString = fullName.text.toString()
            var ageString = age.text.toString()

            if (validateInput(fullNameString,ageString)){
                showError()
            }else{
                val direction = FragmentUserDetailsDirections.actionFragmentUserDetailsToFragmentAvatar()
                this.findNavController().navigate(direction)
            }
//            fragmentUserDetailsBinding.buttonNextUserDetails.setBackgroundColor(Color.GREEN)
        }

        // Inflate the layout for this fragment
        return fragmentUserDetailsBinding.root
    }

    private fun validateInput(fullNameString: String, ageString: String) : Boolean{
        return fullNameString.isEmpty() || ageString.isEmpty()
    }

    private fun showError(){
        Toast.makeText(requireActivity(),"Please enter valid data",Toast.LENGTH_SHORT).show()
    }

//    private fun showAccurateInput(){
//        Toast.makeText(requireActivity(),"Valid input",Toast.LENGTH_SHORT).show()
//    }
}