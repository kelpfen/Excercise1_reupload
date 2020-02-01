package com.example.excercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btncalc.setOnClickListener(){
            //fucntion call
            calLoan()
        }
    }

        private fun calLoan(){
            val carPrice:Double = price_edit.text.toString().toDouble()
            val downPayment:Double = downPayment_edit.text.toString().toDouble()
            val period:Double = loanPeriod_edit.text.toString().toDouble()
            val interestRate:Double = interest_edit.text.toString().toDouble()

            val carloan:Double = carPrice - downPayment
            val interest:Double = carloan * interestRate * period
            val mRepayment:Double = (carloan + interest) / period / 12

            view_carloan.text = "RM %.2f".format((carloan))
            view_interest.text = "RM %.2f".format((interest))
            view_repayment.text = "RM %.2f".format((mRepayment))


    }
}
