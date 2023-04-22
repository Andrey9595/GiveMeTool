package ru.anb.givemetool.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.anb.givemetool.R
import ru.anb.givemetool.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_start)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

    }
}