package com.example.gasolineorethanol.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gasolineorethanol.dao.DAOFuels
import com.example.gasolineorethanol.databinding.ActivityGasolineOrEthanolFormBinding

class GasolineOrEthanolFormActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGasolineOrEthanolFormBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGasolineOrEthanolFormBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val gasolineField = binding.formGasolinePriceField
        val ethanolField = binding.formEthanolPriceField
        val fuelsData = DAOFuels()
        val resultButton = binding.formResultButton
        resultButton.setOnClickListener {
            if (gasolineField.text.isNotEmpty() && ethanolField.text.isNotEmpty()) {
                fuelsData.setGasolinePrice(gasolineField.text.toString().toDouble())
                fuelsData.setEthanolPrice(ethanolField.text.toString().toDouble())
                goToResultPage()
            }
        }
    }

    private fun goToResultPage() {
        val intent = Intent(this, ResultActivity::class.java)
        startActivity(intent)
    }
}