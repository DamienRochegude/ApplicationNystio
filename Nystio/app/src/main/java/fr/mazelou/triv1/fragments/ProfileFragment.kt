package fr.mazelou.triv1.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import fr.mazelou.triv1.MainActivity
import fr.mazelou.triv1.R

class ProfileFragment(private val context: MainActivity) : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater?.inflate(R.layout.fragment_login, container, false)

        return view
    }

}