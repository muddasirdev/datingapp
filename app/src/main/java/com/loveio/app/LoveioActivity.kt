package com.loveio.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.loveio.app.databinding.ActivityLoveioBinding

class LoveioActivity : AppCompatActivity() {
    private var binding: ActivityLoveioBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoveioBinding.inflate(layoutInflater)
        setContentView(binding!!.getRoot())
        val fragment = SplashFirstFragment(this)
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.root, fragment)
        ft.addToBackStack(null) // Optional: Add the transaction to the back stack
        ft.commit()
    }

    override fun onBackPressed() {
        val fragmentManager = supportFragmentManager
        if (fragmentManager.backStackEntryCount > 0) {
            fragmentManager.popBackStack()
        } else {
            finish()
            super.onBackPressed()
        }
    }
}