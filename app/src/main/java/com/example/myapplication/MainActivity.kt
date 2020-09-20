package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this, button)
            popupMenu.menuInflater.inflate(R.menu.popupmenu_file, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.call -> Toast.makeText(this, "CALL", Toast.LENGTH_SHORT).show()
                    R.id.sms -> Toast.makeText(this, "SMS", Toast.LENGTH_SHORT).show()
                    R.id.email -> Toast.makeText(this, "Email", Toast.LENGTH_SHORT).show()
                }
                true
            })
            popupMenu.show()
        }
    }
}