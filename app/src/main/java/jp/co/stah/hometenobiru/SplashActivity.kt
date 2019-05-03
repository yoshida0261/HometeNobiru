package jp.co.stah.hometenobiru

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        println("test")
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}