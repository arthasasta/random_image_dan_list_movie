package com.example.free.sharefun

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.free.R

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            val tombolAksi: Button = findViewById(R.id.buttonGanti)
            val buttonpindah: Button = findViewById(R.id.buttonPindah)
            buttonpindah.setOnClickListener { pindahPage(buttonpindah) }
            tombolAksi.setOnClickListener {
                ubahAngka()
            }

    }

    //fungsi ketika tombol di klik akan di panggil fungsi ini
        private fun ubahAngka(){

            //mengubah isi textbox
            val txtHello: TextView = findViewById(R.id.txtdadu1)
            val image1: ImageView = findViewById(R.id.zoro1)
            isiGambar(txtHello,image1)

            val txtDadu2: TextView = findViewById(R.id.txtdadu2)
            val image2: ImageView = findViewById(R.id.zoro2)
            isiGambar(txtDadu2,image2)


            val txtDadu3: TextView = findViewById(R.id.txtDadu3)
            val image3: ImageView = findViewById(R.id.zoro3)
            isiGambar(txtDadu3,image3)

        }

        private fun isiGambar( txtHello: TextView, image1: ImageView){
            val tes = (1 until 6).random()
            txtHello.text = tes.toString()

            when (tes) {
                1 -> image1.setImageDrawable(getDrawable(R.drawable.zoro1))
                2 -> image1.setImageDrawable(getDrawable(R.drawable.zoro2))
                3 -> image1.setImageDrawable(getDrawable(R.drawable.zoro3))
                4 -> image1.setImageDrawable(getDrawable(R.drawable.zoro4))
                5 -> image1.setImageDrawable(getDrawable(R.drawable.zoro5))
                else -> { // Note the block
                    image1.setImageDrawable(getDrawable(R.drawable.zoro6))
                }
            }




        }
    fun pindahPage(view: View) {
        val intent = Intent(this, ListMovie::class.java).apply {
            // putExtra(, message)
        }
        startActivity(intent)
    }

    }


















