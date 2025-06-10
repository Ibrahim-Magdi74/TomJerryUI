package com.thechance.tomjerryui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.thechance.tomjerryui.screens.JerryStoreView
import com.thechance.tomjerryui.ui.theme.TomJerryUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TomJerryUITheme {
                //  WelcomeView()
                 JerryStoreView()

            }

        }
    }
}

