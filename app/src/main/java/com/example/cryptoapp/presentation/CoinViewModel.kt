package com.example.cryptoapp.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.cryptoapp.data.database.AppDatabase
import com.example.cryptoapp.data.network.model.CoinInfoDto
import io.reactivex.disposables.CompositeDisposable

class CoinViewModel(application: Application) : AndroidViewModel(application) {

    private val db = AppDatabase.getInstance(application)
    private val compositeDisposable = CompositeDisposable()

    val priceList = db.coinPriceInfoDao().getPriceList()

    fun getDetailInfo(fSym: String): LiveData<CoinInfoDto> {
//        return db.coinPriceInfoDao().getPriceInfoAboutCoin(fSym)
        return TODO()
    }

    init {
        loadData()
    }

    private fun loadData() {
//        val disposable = ApiFactory.apiService.getTopCoinsInfo(limit = 50)
//            .map { it.names?.map { it.coinName?.name }?.joinToString(",") }
//            .flatMap { ApiFactory.apiService.getFullPriceList(fSyms = it) }
//            .map { mapNamesListToString(it)) }
//            .delaySubscription(10, TimeUnit.SECONDS)
//            .repeat()
//            .retry()
//            .subscribeOn(Schedulers.io())
//            .subscribe({
//                db.coinPriceInfoDao().insertPriceList(it)
//                Log.d("TEST_OF_LOADING_DATA", "Success: $it")
//            }, {
//                Log.d("TEST_OF_LOADING_DATA", "Failure: ${it.message}")
//            })
//        compositeDisposable.add(disposable)
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}