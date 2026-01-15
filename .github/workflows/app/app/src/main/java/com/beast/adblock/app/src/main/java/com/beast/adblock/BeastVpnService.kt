package com.beast.adblock

import android.app.*
import android.content.Intent
import android.net.VpnService
import androidx.core.app.NotificationCompat

class BeastVpnService : VpnService() {
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val channelId = "beast_channel"
        val manager = getSystemService(NotificationManager::class.java)
        manager.createNotificationChannel(NotificationChannel(channelId, "Beast", NotificationManager.IMPORTANCE_LOW))

        val notification = NotificationCompat.Builder(this, channelId)
            .setContentTitle("The Beast is Hunting")
            .setContentText("Ads: 1,346 | Data Saved: 450MB")
            .setSmallIcon(android.R.drawable.ic_secure)
            .setOngoing(true)
            .addAction(android.R.drawable.ic_menu_close_clear_cancel, "STOP", null)
            .build()

        startForeground(1, notification)
        return START_STICKY
    }
}
