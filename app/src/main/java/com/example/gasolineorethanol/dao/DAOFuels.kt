package com.example.gasolineorethanol.dao

class DAOFuels {

    fun setGasolinePrice(price: Double) {
        gasolinePrice = price
    }

    fun getGasolinePrice(): Double {
        return gasolinePrice
    }

    fun setEthanolPrice(price: Double) {
        ethanolPrice = price
    }

    fun getEthanolPrice(): Double {
        return ethanolPrice
    }

    companion object {
        private var ethanolPrice: Double = 0.0
        private var gasolinePrice: Double = 0.0
    }
}