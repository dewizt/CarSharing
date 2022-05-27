package com.example.carsharing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.carsharing.databinding.ActivityChooseACarBinding
import java.sql.DriverManager.*
import java.util.*


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChooseACarBinding
    private lateinit var carArrayList: ArrayList<Car>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChooseACarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(
            R.drawable.polo_w
        )

        val carName = arrayOf(
            "Volkswagen"
        )

        val addressCar = arrayOf(
            "г.Москва, ул. Островитянова",
            "г.Москва, ул. Проспект Вернадского"
        )

        carArrayList = ArrayList()


    }
}