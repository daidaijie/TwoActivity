package com.daidaijie.twoactivity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.util.Log

import kotlinx.android.synthetic.main.activity_b.*

class BActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        setSupportActionBar(toolbar)

        Log.d("SingleInstance","BActivity onCreate")
        fab.setOnClickListener { view ->
            startActivity(AActivity.newIntent(this))
        }
    }

    companion object {
        @JvmStatic
        fun newIntent(context: Context) = Intent(context, BActivity::class.java)
    }

}
