package com.thechance.tomjerryui.component.tomSectionView

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.tomjerryui.R
import com.thechance.tomjerryui.ui.theme.IbmPlexSansFont
import com.thechance.tomjerryui.ui.theme.backgroundAPPColor
import com.thechance.tomjerryui.ui.theme.textColor

@Composable
fun CheeseCard(
    numberOfCheese: Int
) {

    Row(
        modifier = Modifier
            .fillMaxWidth().background(color = backgroundAPPColor)
            .padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier,
            painter = painterResource(R.drawable.moneybag_svg),
            contentDescription = "moneyBag"
        )

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = numberOfCheese.toString(),
            color = textColor,
            fontSize = 12.sp,
            fontFamily = IbmPlexSansFont,
            fontWeight = FontWeight.SemiBold
        )

        Text(
            text = "  Cheeses",
            color = textColor,
            fontSize = 12.sp,
            fontFamily = IbmPlexSansFont,
            fontWeight = FontWeight.SemiBold
        )
    }


}

@Preview(showBackground = true)
@Composable
fun PreviewCheeseCard() {
    CheeseCard(numberOfCheese = 5)
}