package com.loveio.app

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class SplashSecondFragment(var activity: Activity) : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_splash_second, container, false)
        val next = view.findViewById<ImageView>(R.id.Next)
        next.setOnClickListener { v: View? ->
            val fragment = SplashThirdFragment()
            if (activity is AppCompatActivity) {
                val appCompatActivity = activity as AppCompatActivity
                val ft = appCompatActivity.supportFragmentManager.beginTransaction()
                ft.replace(R.id.root, fragment)
                ft.addToBackStack(null)
                ft.commit()
            }
        }
        return view
    }
}