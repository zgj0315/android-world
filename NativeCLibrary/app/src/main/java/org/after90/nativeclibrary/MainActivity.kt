package org.after90.nativeclibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.after90.nativeclibrary.databinding.ActivityMainBinding
import org.after90.hellolibrary.HelloLibrary

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sampleText.text = HelloLibrary().stringFromJNI()
    }
}