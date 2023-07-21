package com.example.gasolineorethanol.dao

import java.math.BigDecimal

class DAOFuels {

    fun setGasolinePrice(price: BigDecimal) {
        gasolinePrice = price
    }

    fun getGasolinePrice(): BigDecimal {
        return gasolinePrice
    }

    fun setEthanolPrice(price: BigDecimal) {
        ethanolPrice = price
    }

    fun getEthanolPrice(): BigDecimal {
        return ethanolPrice
    }

    companion object {
        private var ethanolPrice: BigDecimal = BigDecimal.ZERO
        private var gasolinePrice: BigDecimal = BigDecimal.ZERO
    }
}