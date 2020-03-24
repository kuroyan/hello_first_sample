package jp.lgs.hello_first_sample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showTxt.setText(R.string.helloFirst)

        //button.setOnClickListener {
        //    showTxt.setText(R.string.helloAgain)
        //}

    }

    override fun onStart() {
        super.onStart()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    fun onButtonClick(view: View) {
        val intent = Intent(applicationContext,SubActivity::class.java)
        //-- toastは以下でもstartActivityの後でも表示タイミングは関係ないようだ
        //toastMake("画面変更中！！",0,-100)
        startActivity(intent)
        toastMake("画面１変更中！！",0,-100)
    }

    fun onButtonClick2(view: View){
        val intent = Intent(applicationContext,Sub2Activity::class.java)
        startActivity(intent)
        toastMake("画面２変更中！！",0,-100)
    }



    fun toastMake(message: String, x: Int, y: Int) {
        val toast = Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT)
        // 位置調整
        toast.setGravity(Gravity.CENTER, x, y)
        toast.show()
    }

}
