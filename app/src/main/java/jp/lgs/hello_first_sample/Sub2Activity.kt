package jp.lgs.hello_first_sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Sub2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub2)
    }

    fun  onButtonClick3(view: View) {
        finish()
    }

}
