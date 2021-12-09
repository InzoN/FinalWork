package com.example.finalwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CartoonActivity : AppCompatActivity() {
    lateinit var cartoonRecyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cartoon)

        cartoonRecyclerView= findViewById(R.id.cartoon_recycler_view)

        val cartoonList: List<Cartoon> = listOf(
            Cartoon("Когда зажигаются ёлки", R.drawable.kogda),
            Cartoon("Ну, погоди!", R.drawable.nu),
            Cartoon("Дед Мороз и серый волк", R.drawable.dmj),
            Cartoon("Простоквашино", R.drawable.prostokv),
            Cartoon("Умка ищет друга", R.drawable.umka),
            Cartoon("Снеговик-почтовик", R.drawable.snegovik),
            Cartoon("Щелкунчик", R.drawable.chelk)
        )

        cartoonRecyclerView.layoutManager=
            LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        cartoonRecyclerView.adapter=CartoonAdapter(cartoonList)




    }


}

