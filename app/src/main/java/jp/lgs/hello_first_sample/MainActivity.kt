package jp.lgs.hello_first_sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showTxt.setText(R.string.helloFirst)

        button.setOnClickListener {
            showTxt.setText(R.string.helloAgain)
        }

    }



}
