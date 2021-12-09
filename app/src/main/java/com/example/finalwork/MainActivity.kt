package com.example.finalwork

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

  private lateinit var bottomNavigationViewOne: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationViewOne=findViewById(R.id.bottom_navigation_1)
        bottomNavigationViewOne.setOnItemSelectedListener { item-> when(item.itemId){
            R.id.movies->{val googleLink = Uri.parse("https://yandex.ru/video/preview/2212622759592528846")
                val openBrowserIntent = Intent(Intent.ACTION_VIEW, googleLink)
                startActivity(openBrowserIntent)}
            R.id.photo->{val cartoonActivityIntent=Intent(this,CartoonActivity::class.java)
                startActivity(cartoonActivityIntent)
            }
            R.id.contacts->{val secondActivityIntent=Intent(this,SecondActivity::class.java)
                startActivity(secondActivityIntent)}
        }
            true
        }


        }

    }
