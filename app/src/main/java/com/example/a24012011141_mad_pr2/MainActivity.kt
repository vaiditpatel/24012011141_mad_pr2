package com.example.a24012011141_mad_pr2

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivityLifecycle"
    private lateinit var mainLayout: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        
        mainLayout = findViewById(R.id.main)
        
        ViewCompat.setOnApplyWindowInsetsListener(mainLayout) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        
        showMessage("onCreate function called.")
    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart function called.")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume function called.")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause function called.")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop function called.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy function called.")
        Toast.makeText(this, "onDestroy function called.", Toast.LENGTH_SHORT).show()
        // Snackbar might not be visible as the activity is destroyed
    }

    override fun onRestart() {
        super.onRestart()
        showMessage("onRestart function called.")
    }

    private fun showMessage(msg: String) {
        Log.i(TAG, msg)
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        if (::mainLayout.isInitialized) {
            Snackbar.make(mainLayout, msg, Snackbar.LENGTH_SHORT).show()
        }
    }
}