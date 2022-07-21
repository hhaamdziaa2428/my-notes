package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var layoutManager: LayoutManager?= null
    private var adapter:RecyclerView.Adapter<AdapterNotes.ViewHolder>?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        layoutManager=LinearLayoutManager(this)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView?.layoutManager=layoutManager
       adapter=AdapterNotes()
        recyclerView?.adapter=adapter
    }
}
// Classifier 'LayoutManager' does not have a companion object, and thus must be initialized here
// Smart cast to 'RecyclerView!' is impossible, because 'recyclerView' is a mutable property that could have been changed by this time