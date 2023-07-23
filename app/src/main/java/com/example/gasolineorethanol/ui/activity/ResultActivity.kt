package com.example.gasolineorethanol.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gasolineorethanol.R
import com.example.gasolineorethanol.dao.DAOFuels
import com.example.gasolineorethanol.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        gasolineOrEthanolCalculator()
        backButton()
    }

    private fun gasolineOrEthanolCalculator() {
        val fuelsData = DAOFuels()
        val responseText = binding.resultResponseText
        if (fuelsData.getEthanolPrice() / fuelsData.getGasolinePrice() > 0.7) {
            responseText.text = getString(R.string.fuel_gasoline)
        } else {
            responseText.text = getString(R.string.fuel_ethanol)
        }
    }

    private fun backButton() {
        val backButton = binding.resultBackButton
        backButton.setOnClickListener {
            finish()
        }
    }
}