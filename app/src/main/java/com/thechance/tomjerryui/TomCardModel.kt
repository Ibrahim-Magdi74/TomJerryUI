package com.thechance.tomjerryui

import androidx.compose.ui.graphics.painter.Painter

data class TomCardModel(
    val title: String,
    val description: String,
    val image: Painter,
    val cheeseNumber: Int
)
