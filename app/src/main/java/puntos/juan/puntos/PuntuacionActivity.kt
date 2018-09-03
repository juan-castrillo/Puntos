package puntos.juan.puntos

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.ActionMenuView
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.button.MaterialButton
import puntos.juan.puntos.R.id.bar



class PuntuacionActivity : AppCompatActivity() {

    lateinit var mas:MaterialButton
    lateinit var menos:MaterialButton
    lateinit var contador:TextView
    lateinit var bar:BottomAppBar
    var cuenta = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puntuacion)
        contador = findViewById(R.id.contador)
        contador.text = cuenta.toString()
        mas = findViewById(R.id.mas)
        mas.setOnClickListener {
            cuenta++
            contador.text = cuenta.toString()
        }

        menos = findViewById(R.id.menos)
        menos.setOnClickListener{
            if(cuenta >0){
                cuenta--
                contador.text = cuenta.toString()
            }
        }

        val bar = findViewById<View>(R.id.bar) as BottomAppBar
        setSupportActionBar(bar)
        bar.setNavigationOnClickListener {
            // Handle the navigation click by showing a BottomDrawer etc.
        }
    }
}
