package com.example.broadcast_receivers.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AiroplaneMode : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val isAiroplaneModeEnabled = intent?.getBooleanExtra("state", false) ?: return
        if(isAiroplaneModeEnabled){
           Toast.makeText(context, "AIROPLANE MODE ENABLED", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(context, "AIROPLANE MODE DISABLED", Toast.LENGTH_LONG).show()
        }
    }
}