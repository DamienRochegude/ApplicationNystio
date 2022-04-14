package fr.mazelou.triv1.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import fr.mazelou.triv1.MainActivity
import fr.mazelou.triv1.R

class WelcomeFragment(private val context: MainActivity) : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater?.inflate(R.layout.fragment_welcome, container, false)

        // Récupérer le bouton de bienvenue
        val buttonWelcome = view.findViewById<Button>(R.id.button_welcome)

        return view
    }
}