package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import com.example.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val listview=binding.listview
        val taskList= arrayListOf<String>()
        taskList.add("Wake Up early")
        taskList.add("brush")
        taskList.add("attend class")
        taskList.add("lunch")
        taskList.add("nap")
        val adapterForMyListView=ArrayAdapter(this,android.R.layout.simple_list_item_1,taskList)
        listview.adapter=adapterForMyListView
        listview.setOnItemClickListener { parent, view, position, id ->
            val text="CLicked on item :"+(view as TextView).text.toString()
            Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
        }

    }
}