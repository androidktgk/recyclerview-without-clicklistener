package com.govind8061.vidone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    lateinit var rvPlayers: RecyclerView
    lateinit var playersList: ArrayList<Players>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPlayers=findViewById(R.id.rvPlayers)
        rvPlayers.setHasFixedSize(true)

        playersList= arrayListOf()
        playersList.add(Players("Rohit Sharma",R.drawable.rohit))
        playersList.add(Players("Virat Kohli",R.drawable.rohit))
        playersList.add(Players("KL Rahul",R.drawable.rohit))

        rvPlayers.adapter =PlayerAdapter(playersList)


    }

}