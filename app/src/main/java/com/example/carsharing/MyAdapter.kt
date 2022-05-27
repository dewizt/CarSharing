package com.example.carsharing

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MyAdapter (private val context: Activity, private val arrayList: ArrayList<Car>) : ArrayAdapter<Car>(context,
                    R.layout.list_item,arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.list_item,null)

        val imageView : ImageView = view.findViewById(R.id.car_image)
        val carsName : TextView = view.findViewById(R.id.car_name)
        val addressCars : TextView = view.findViewById(R.id.address_car)

        imageView.setImageResource(arrayList[position].imageId)
        carsName.text = arrayList[position].carName
        addressCars.text = arrayList[position].addressCar

        return view
    }
}