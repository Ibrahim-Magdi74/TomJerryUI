package com.thechance.tomjerryui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.thechance.tomjerryui.ui.theme.IbmPlexSansFont
import com.thechance.tomjerryui.ui.theme.backgroundAPPColor

@Composable
fun WelcomeView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundAPPColor),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "Welcome TO Tom & Jerry Ui",
            color = Color.Blue,
            fontFamily = IbmPlexSansFont,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
        )
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewWelcomeView() {
    WelcomeView()
}