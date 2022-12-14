package com.example.mut20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listNama = arrayOf(
        "LUK LUUL LATIFAH",
        "MAULANA ZAHRONY",
        "MAYA INDAH LESTARI",
        "MUHAMAD KHUSNU MAROM",
        "MUHAMMAD HUDA GUNAWAN",
        "MUTMAINAH SEPTIARINI",
        "NASYWA SUKRIA HANIFAH",
        "NOR HIDAYAH FITRIYANI",
        "NOVITA SARI",
        "NUR IZZA",
    )

    val listNis = arrayOf(
        "3006",
        "3007",
        "3009",
        "3012",
        "3014",
        "3016",
        "3016",
        "3018",
        "3020",
        "3022",
        "3024"
    )

    lateinit var kelasView: RecyclerView
    lateinit var kelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelasView = findViewById(R.id.kelasView)
        kelasView.layoutManager = LinearLayoutManager(this)

        for (i in listNama.indices) {
            list.add(Kelas(listNama[i], listNis[i]))
        }

        kelasAdapter = KelasAdapter(list)
        kelasAdapter.notifyDataSetChanged()
        kelasView.adapter = kelasAdapter
    }
}