package com.example.firstapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_list_.view.*


class List_Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view =inflater.inflate(R.layout.fragment_list_,container,false)

        view.floatingActionButton3.setOnClickListener{
            Navigation.findNavController(view!!).navigate(R.id.action_add_fragment_to_list_Fragment)
        }
        // Inflate the layout for this fragment
        return view
    }

}