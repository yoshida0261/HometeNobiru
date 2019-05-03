package jp.co.stah.hometenobiru

import android.app.Application

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        println("app")

        Thread.sleep(300L)

    }
}