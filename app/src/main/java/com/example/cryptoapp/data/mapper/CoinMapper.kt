package com.example.cryptoapp.data.mapper

import com.example.cryptoapp.data.database.CoinInfoDbModel
import com.example.cryptoapp.data.network.model.CoinInfoDto
import com.example.cryptoapp.data.network.model.CoinInfoJsonContainerDto
import com.example.cryptoapp.data.network.model.CoinNamesListDto
import com.example.cryptoapp.domain.CoinInfo
import com.google.gson.Gson

    fun mapDtoToDbModel(coinInfoDto: CoinInfoDto) = CoinInfoDbModel(
        fromSymbol = coinInfoDto.fromSymbol,
        toSymbol = coinInfoDto.toSymbol,
        price = coinInfoDto.price,
        lastUpdate = coinInfoDto.lastUpdate,
        highDay = coinInfoDto.highDay,
        lowDay = coinInfoDto.lowDay,
        lastMarket = coinInfoDto.lastMarket,
        imageUrl = coinInfoDto.imageUrl
    )

    fun mapJsonContainerToListCoinInfo(jsonContainer: CoinInfoJsonContainerDto): List<CoinInfoDto> {
        val result = mutableListOf<CoinInfoDto>()
        val jsonObject = jsonContainer.json ?: return result
        val coinKeySet = jsonObject.keySet()
        for (coinKey in coinKeySet) {
            val currencyJson = jsonObject.getAsJsonObject(coinKey)
            val currencyKeySet = currencyJson.keySet()
            for (currencyKey in currencyKeySet) {
                val priceInfo = Gson().fromJson(
                    currencyJson.getAsJsonObject(currencyKey),
                    CoinInfoDto::class.java
                )
                result.add(priceInfo)
            }
        }
        return result
    }

    fun mapNamesListToString(namesListDto: CoinNamesListDto):String {
        return namesListDto.names?.map { it.coinName?.name }?.joinToString(",") ?: ""
    }

    fun mapDbModelToEntity(dbModel: CoinInfoDbModel): CoinInfo = CoinInfo(
        fromSymbol = dbModel.fromSymbol,
        toSymbol = dbModel.toSymbol,
        price = dbModel.price,
        lastUpdate = dbModel.lastUpdate,
        highDay = dbModel.highDay,
        lowDay = dbModel.lowDay,
        lastMarket = dbModel.lastMarket,
        imageUrl = dbModel.imageUrl
    )