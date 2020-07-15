package com.example.picassouse

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Sadece imageView'e belirtilen url'deki görsel çekilir
        Picasso.get().load("https://i.imgur.com/tGbaZCY.jpg").into(imageView)


        //imageView'e çekilen görsel aynı zamanda düzenlenir ve boyutlandırılır
        Picasso.get()
                .load("https://i.imgur.com/tGbaZCY.jpg")
                .resize(50, 50)
                .centerCrop()
                .into(imageView)


        //  Picasso.get().load(R.drawable.image_screen).into(imageView1);
        // Picasso.get().load("file:///android_asset/image.png").into(imageView2);
        //Picasso.get().load(new File(...)).into(imageView2);
    }
}
