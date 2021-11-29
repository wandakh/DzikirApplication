package com.wanda.idn.dzikirapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wanda.idn.dzikirapp.adapter.DzikirDoaAdapter
import com.wanda.idn.dzikirapp.model.DataDzikirDoa
import com.wanda.idn.dzikirapp.model.DzikirDoa

class QauliyahActivity : AppCompatActivity() {
    private lateinit var rvQauliyah: RecyclerView
    private var lisQauliyah: ArrayList<DzikirDoa> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qauliyah)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        rvQauliyah = findViewById(R.id.rvQauliyah)
        lisQauliyah.clear()
        lisQauliyah.addAll(DataDzikirDoa.listQauliyah)

        rvQauliyah.layoutManager = LinearLayoutManager(this)
        rvQauliyah.adapter = DzikirDoaAdapter(lisQauliyah)
        rvQauliyah.setHasFixedSize(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
}