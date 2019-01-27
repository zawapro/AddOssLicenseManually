package com.zawapro.addosslicensemanually

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.gms.oss.licenses.OssLicensesMenuActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // OssLicensesMenuActivityにインテントを投げる
        findViewById<Button>(R.id.button).setOnClickListener{
            startActivity(Intent(this, OssLicensesMenuActivity::class.java))
        }
    }
}
