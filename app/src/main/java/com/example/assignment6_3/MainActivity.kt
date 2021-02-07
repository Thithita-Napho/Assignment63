package com.example.assignment6_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val x = 3
        val y = 5
        val z = 7
        btOK.setOnClickListener {
            if (textMoney.text.toString() != "") {
                var salary = textMoney.text.toString().toDouble()
                var aa: Double = salary * x / 100
                var bb: Double = aa + salary
                var cc = bb * x / 100
                var dd: Double = cc + bb
                var ee = dd * x / 100
                var ff: Double = ee + dd
                var gg = ff * y / 100
                var hh: Double = gg + ff
                var ii = hh * y / 100
                var jj: Double = ii + hh
                var kk = jj * y / 100
                var ll: Double = kk + jj
                var mm = ll * y / 100
                var nn: Double = mm + ll
                var oo = nn * z / 100
                var pp: Double = oo + nn
                var qq = pp * z / 100
                var rr: Double = qq + pp
                var ss = rr * z / 100
                var tt: Double = ss + rr
                var interr = aa+cc+ee+gg+ii+kk+mm+oo+qq+ss
                textTotal.setText("$interr")
                total.setText("$tt")
            }
        }
        btClear.setOnClickListener(){
            textMoney.setText(null)
            textTotal.setText(null)
            total.setText(null)
        }
    }
    }
