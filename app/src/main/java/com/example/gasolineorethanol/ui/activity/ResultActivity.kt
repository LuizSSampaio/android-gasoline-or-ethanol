package com.example.gasolineorethanol.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.gasolineorethanol.R
import com.example.gasolineorethanol.dao.DAOFuels

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val fuelsData = DAOFuels()
        val responseText = findViewById<TextView>(R.id.result_response_text)
        if (fuelsData.getEthanolPrice() / fuelsData.getGasolinePrice() > 0.7) {
            responseText.text = getString(R.string.fuel_gasoline)
        } else {
            responseText.text = getString(R.string.fuel_ethanol)
        }
        val backButton = findViewById<Button>(R.id.result_back_button)
        backButton.setOnClickListener {
            finish()
        }
    }
}