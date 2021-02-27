package com.example.fragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnEsquerda: Button = view.findViewById(R.id.btn_esquerda)
        val btnDireita: Button = view.findViewById(R.id.btn_direita)

        btnEsquerda.setOnClickListener {
//            findNavController().navigate(R.id.ir_esquerda)
            findNavController().navigate(MainFragmentDirections.irEsquerda())
        }
        btnDireita.setOnClickListener {
//            findNavController().navigate(R.id.ir_direita)
            findNavController().navigate(MainFragmentDirections.irDireita())
        }
    }
}