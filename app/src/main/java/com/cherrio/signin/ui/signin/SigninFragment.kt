package com.cherrio.signin.ui.signin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.cherrio.signin.R
import com.cherrio.signin.databinding.FragmentSigninBinding
import com.cherrio.signin.utils.disable
import com.cherrio.signin.utils.enable

/*
* Created by Ayodele on 05/06/2021
* Email: jazzedayo@gmail.com
* Abuja, NIGERIA
*/

class SigninFragment: Fragment() {

    lateinit var binding: FragmentSigninBinding
    private val viewModel by viewModels<SignInViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSigninBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            btnCancel.setOnClickListener {
                requireActivity().finish()
            }
            btnSignIn.setOnClickListener {
                btnSignIn.text = "Signing in..."
                btnSignIn.disable()
               //todo
            }
        }
        viewModel.authState.observe(viewLifecycleOwner){
            if (it){
                findNavController().navigate(R.id.action_signinFragment_to_weightFragment)
            }else{
                binding.btnSignIn.text = "Signin"
                binding.btnSignIn.enable()
            }
        }

    }
}