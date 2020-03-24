package jp.lgs.hello_first_sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
    }
}
