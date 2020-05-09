package com.oguzozgul.hesapmakinesikotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var sayibir : Int? = null
    var sayiiki : Int? = null
    var result : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnToplaClicked(view : View) {

        sayibir = sayiBir.text.toString().toIntOrNull()
        sayiiki = sayiIki.text.toString().toIntOrNull()
        if (sayibir == null || sayiiki == null) {
            lblSonuc.text = "Hata"

        } else {
            result =   sayibir!! + sayiiki!!
            lblSonuc.text = result.toString()
        }

    }

    fun btnCikarClicked(view : View) {
        sayibir = sayiBir.text.toString().toIntOrNull()
        sayiiki = sayiIki.text.toString().toIntOrNull()
        if (sayibir == null || sayiiki == null) {
            lblSonuc.text = "Hata"

        } else {
            result =   sayibir!! - sayiiki!!
            lblSonuc.text = result.toString()
        }
    }
    fun btnCarpClicked(view : View) {
        sayibir = sayiBir.text.toString().toIntOrNull()
        sayiiki = sayiIki.text.toString().toIntOrNull()
        if (sayibir == null || sayiiki == null) {
            lblSonuc.text = "Hata"

        } else {
            result =   sayibir!! * sayiiki!!
            lblSonuc.text = result.toString()
        }
    }
    fun btnBolClicked(view : View) {
        sayibir = sayiBir.text.toString().toIntOrNull()
        sayiiki = sayiIki.text.toString().toIntOrNull()
        if (sayibir == null || sayiiki == null) {
            lblSonuc.text = "Hata"

        } else {
            result =   sayibir!! / sayiiki!!
            lblSonuc.text = result.toString()
        }
    }

}
