package com.example.restoapp.user

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.restoapp.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    lateinit var binding: FragmentLoginBinding
    var interact: UserActivityFragmentInteraction? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        interact = context as? UserActivityFragmentInteraction
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonRegister.setOnClickListener {
            interact?.showregister()
        }
        binding.buttonConnect.setOnClickListener {
            interact?.makerequest(
                binding.signinEmail.text.toString(),
                binding.signinPwd.text.toString(),
                null,null, true)
        }
    }
}