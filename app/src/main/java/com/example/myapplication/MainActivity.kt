package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button1)
        val resultTV: TextView = findViewById(R.id.result)
        var flag: String = "sum"
        val spinnerVal: Spinner = findViewById(R.id.spSelect)
        var options = arrayOf("sum", "multiply")
        val edtxt1: EditText = findViewById(R.id.num1)
        val edtxt2: EditText = findViewById(R.id.num2)

        spinnerVal.adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,options)

        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
        button.setOnClickListener { view->
            var x:Int = edtxt1.text.toString().toInt()
            var y:Int = edtxt2.text.toString().toInt()


            if(flag == "sum")
                resultTV.text = sum(x,y).toString()
            else
                resultTV.text = multiply(x,y).toString()


        }

        }

        }


public fun sum(a: Int, b: Int): Int {
    return a+b
}
public fun multiply(a: Int, b: Int): Int {
    return a*b
}

