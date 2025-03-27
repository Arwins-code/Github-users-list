package com.arwin.githubuser.view.components

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.arwin.githubuser.MainActivity
import com.arwin.githubuser.R

class CustomToolbar @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : Toolbar(context, attrs, defStyleAttr) {

    private lateinit var backButton: ImageButton
    private lateinit var closeButton: ImageButton
    private lateinit var tvTitle: TextView

    init {
        // Inflate the custom toolbar layout
        LayoutInflater.from(context).inflate(R.layout.custom_toolbar, this, true)

        // Initialize the buttons
        backButton = findViewById(R.id.backButton)
        closeButton = findViewById(R.id.closeButton)
        tvTitle = findViewById(R.id.tv_desc)

        // Set default click listeners
        backButton.setOnClickListener {
            // Default action for back button
            (context as? MainActivity)?.onBackPressed()
        }

        closeButton.setOnClickListener {
            // Default action for close button
            (context as? MainActivity)?.finish()
        }
    }

    // Method to set custom click listener for back button
    fun setOnBackButtonClickListener(listener: () -> Unit) {
        backButton.setOnClickListener {
            listener()
        }
    }

    // Method to set custom click listener for close button
    fun setOnCloseButtonClickListener(listener: () -> Unit) {
        closeButton.setOnClickListener {
            listener()
        }
    }

    // Method to show or hide the back button
    fun showBackButton(show: Boolean) {
        backButton.visibility = if (show) VISIBLE else GONE
    }

    // Method to show or hide the close button
    fun showCloseButton(show: Boolean) {
        closeButton.visibility = if (show) VISIBLE else GONE
    }

    // Method to set title screen
    fun setTitle(text: String) {
        tvTitle.text = text
    }
}