package com.thechance.tomjerryui.component.tomCard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.tomjerryui.ui.theme.IbmPlexSansFont
import com.thechance.tomjerryui.ui.theme.secondaryTextColor

@Composable
fun TomTextCard(
    title: String,
    subTitle: String
) {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            text = title,
            fontFamily = IbmPlexSansFont,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            color = Color.White
        )
        Text(
            modifier = Modifier.padding(top = 8.dp),
            text = subTitle,
            fontFamily = IbmPlexSansFont,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp,
            color = secondaryTextColor
        )

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTomTextCard() {
    TomTextCard(
        title = "Buy 1 Tom and get 2 for free",
        subTitle = "Adopt Tom! (Free Fail-Free Guarantee)"
    )
}