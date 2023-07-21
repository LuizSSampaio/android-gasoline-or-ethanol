package com.example.gasolineorethanol.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.gasolineorethanol.R
import com.example.gasolineorethanol.dao.DAOFuels
import java.math.BigDecimal

class GasolineOrEthanolFormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gasoline_or_ethanol_form)
        val gasolineField = findViewById<EditText>(R.id.form_gasoline_price_field)
        val ethanolField = findViewById<EditText>(R.id.form_ethanol_price_field)
        val fuelsData = DAOFuels()
        val resultButton = findViewById<Button>(R.id.form_result_button)
        resultButton.setOnClickListener {
            if (gasolineField.text.isNotEmpty() && ethanolField.text.isNotEmpty()) {
                fuelsData.setGasolinePrice(BigDecimal(gasolineField.text.toString()))
                fuelsData.setEthanolPrice(BigDecimal(ethanolField.text.toString()))
                val intent = Intent(this, ResultActivity::class.java)
                startActivity(intent)
            }
        }
    }
}