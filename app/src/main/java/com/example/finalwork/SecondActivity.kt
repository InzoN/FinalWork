package com.example.finalwork

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView

class SecondActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        bottomNavigationView=findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnItemSelectedListener { item-> when(item.itemId){
            R.id.call->{val phoneNumberUri = Uri.parse("tel:+74997057493")
                val callIntent = Intent(Intent.ACTION_CALL, phoneNumberUri)
                startActivity(callIntent)}
            R.id.video->{val googleLink = Uri.parse("https://www.kinder.com/ru/ru/xp/new-year/greeting/")
                val openBrowserIntent = Intent(Intent.ACTION_VIEW, googleLink)
                startActivity(openBrowserIntent)}
            R.id.mail->{val googleLink = Uri.parse("https://dm-pochta.ru/napisat-pismo-dedu-morozu/")
                val openBrowserIntent = Intent(Intent.ACTION_VIEW, googleLink)
                startActivity(openBrowserIntent)}
        }
            true
        }
        


    }
}