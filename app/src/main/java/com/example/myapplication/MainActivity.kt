package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button : Button = findViewById(R.id.button)
        button.text = "Calculate Age"
        val resultTV : TextView = findViewById(R.id.textresult)
        val txt : TextView = findViewById(R.id.textView2)
        txt.text = "Choose the year of birth: "
        resultTV.text = " "
        var day: String = "1"
        var month: String = "1"
        var year: String = "2020"

        val spinnerDay: Spinner = findViewById(R.id.Day)
        val spinnerMonth: Spinner = findViewById(R.id.Month)
        val spinnerVal: Spinner = findViewById(R.id.spSelect)
        var options = arrayOf("1980","1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988",
            "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002", "2003", "2004", "2005","2006", "2007", "2008",
            "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"
            ,"2020", "2021")

        var doptions = arrayOf("1", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
            "18", "19", "20", "21", "22", "23", "24", "25", "26", "27",
            "28", "29", "30", "31")

        var moptions = arrayOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",)

        spinnerDay.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,doptions)
        spinnerMonth.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,moptions)
        spinnerVal.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,options)

        spinnerDay.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                day = doptions.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }

        spinnerMonth.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                month = moptions.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

            spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                year = options.get(p2)

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        button.setOnClickListener{view ->
            var yearx: Int = year.toInt()
            var monthx: Int = month.toInt()
            var dayx: Int = day.toInt()

            var age = 2022 - yearx - 1
            if(monthx < 7)
                age = age + 1
            if(monthx == 7)
                if(dayx < 6)
                    age = age + 1

            resultTV.text = "You are " + age + " years old!"

        }


    }
}