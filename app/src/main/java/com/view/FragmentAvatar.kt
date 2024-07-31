package com.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import android.widget.TwoLineListItem
import androidx.navigation.fragment.findNavController
import com.mazulu.la.databinding.FragmentAvatarBinding

class FragmentAvatar : Fragment() {
    lateinit var fragmentAvatarBinding: FragmentAvatarBinding

    lateinit var imageOne : ImageView
    lateinit var imageTwo : ImageView
    lateinit var imageThree : ImageView
    lateinit var imageFour : ImageView
    lateinit var imageFive: ImageView
    lateinit var imageSix: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        fragmentAvatarBinding = FragmentAvatarBinding.inflate(inflater,container,false)

        imageOne = fragmentAvatarBinding.imageViewOne
        imageTwo = fragmentAvatarBinding.imageViewTwo
        imageThree = fragmentAvatarBinding.imageViewThree
        imageFour = fragmentAvatarBinding.imageViewFour
        imageFive = fragmentAvatarBinding.imageViewOne
        imageSix = fragmentAvatarBinding.imageViewOne

        fragmentAvatarBinding.imageViewOne.setOnClickListener {
            fragmentAvatarBinding.buttonNextAvatar.setOnClickListener {
                val direction =
                    FragmentAvatarDirections.actionFragmentAvatarToFragmentCompleteOnboarding()
                this.findNavController().navigate(direction)
            }

        }

        fragmentAvatarBinding.imageViewTwo.setOnClickListener {
            fragmentAvatarBinding.buttonNextAvatar.setOnClickListener {
                val direction =
                    FragmentAvatarDirections.actionFragmentAvatarToFragmentCompleteOnboarding()
                this.findNavController().navigate(direction)
            }

        }

        fragmentAvatarBinding.imageViewThree.setOnClickListener {
            fragmentAvatarBinding.buttonNextAvatar.setOnClickListener {
                val direction =
                    FragmentAvatarDirections.actionFragmentAvatarToFragmentCompleteOnboarding()
                this.findNavController().navigate(direction)
            }

        }

        fragmentAvatarBinding.imageViewFour.setOnClickListener {
            fragmentAvatarBinding.buttonNextAvatar.setOnClickListener {
                val direction =
                    FragmentAvatarDirections.actionFragmentAvatarToFragmentCompleteOnboarding()
                this.findNavController().navigate(direction)
            }

        }

        fragmentAvatarBinding.imageViewFive.setOnClickListener {
            fragmentAvatarBinding.buttonNextAvatar.setOnClickListener {
                val direction =
                    FragmentAvatarDirections.actionFragmentAvatarToFragmentCompleteOnboarding()
                this.findNavController().navigate(direction)
            }

        }

        fragmentAvatarBinding.imageViewSix.setOnClickListener {
            fragmentAvatarBinding.buttonNextAvatar.setOnClickListener {
                val direction =
                    FragmentAvatarDirections.actionFragmentAvatarToFragmentCompleteOnboarding()
                this.findNavController().navigate(direction)
            }

        }

//        fragmentAvatarBinding.buttonNextAvatar.setOnClickListener {
//            if (fragmentAvatarBinding.imageViewOne.isClickable && fragmentAvatarBinding.imageViewTwo.isClickable && fragmentAvatarBinding.imageViewThree.isClickable
//                && fragmentAvatarBinding.imageViewFour.isClickable && fragmentAvatarBinding.imageViewFive.isClickable && fragmentAvatarBinding.imageViewSix.isClickable ){
//                val direction = FragmentAvatarDirections.actionFragmentAvatarToFragmentCompleteOnboarding()
//                this.findNavController().navigate(direction)
//            }else{
                Toast.makeText(requireActivity(), "Please select image", Toast.LENGTH_SHORT).show()
//            }

//        }

        // Inflate the layout for this fragment
        return fragmentAvatarBinding.root
    }
}