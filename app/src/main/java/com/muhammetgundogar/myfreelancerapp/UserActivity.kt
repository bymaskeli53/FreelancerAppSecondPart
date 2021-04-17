package com.muhammetgundogar.myfreelancerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_user.*

class UserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        var text = ""
        imageButton.setOnClickListener {
          if (checkBox.isChecked || checkBox2.isChecked || checkBox3.isChecked || checkBox4.isChecked){
                var checkBoxArrayList= arrayListOf<CheckBox>(checkBox,checkBox2,checkBox3,checkBox4)
                for (checked in checkBoxArrayList){
                    if (checked.isChecked){
                        text += checked.text

                    }
                }

         Toast.makeText(applicationContext,"Well Done.You Are : "+text+" developer",Toast.LENGTH_LONG).show()
              text = ""
          }

        }
    }
}