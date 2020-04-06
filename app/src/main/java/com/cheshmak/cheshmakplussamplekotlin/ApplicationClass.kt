package com.cheshmak.cheshmakplussamplekotlin

import android.app.Application
import android.util.Log
import me.cheshmak.android.sdk.advertise.CheshmakAds
import me.cheshmak.android.sdk.core.Cheshmak
import me.cheshmak.android.sdk.core.network.CheshmakCallback
import me.cheshmak.cheshmakplussdk.core.CheshmakPlus

class ApplicationClass : Application() {


    override fun onCreate() {

        super.onCreate()
        Log.e("----------", "MainActivity")

        Cheshmak.with(this@ApplicationClass)
        CheshmakPlus.with(this@ApplicationClass)
        Cheshmak.initTracker("eekYIAux0vfx//d6+dRUhw==", object : CheshmakCallback {
            override fun onCheshmakIdReceived(cheshmakID: String) {
                Log.e("----------", "CheshmakID = $cheshmakID")
            }
        })
        CheshmakAds.initiate(applicationContext)
        CheshmakPlus.setTestMode(true)
    }


}
