package com.cherrio.signin.ui.done

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cherrio.signin.databinding.FragmentHomeBinding

/*
* Created by Ayodele on 17/06/2021
* Email: jazzedayo@gmail.com
* Abuja, NIGERIA
*/

class HomeFragment: Fragment() {

    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container,false)
        return binding.root
    }

}