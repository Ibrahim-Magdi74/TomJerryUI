package com.thechance.tomjerryui.component.tomSectionView

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.tomjerryui.ui.theme.IbmPlexSansFont
import com.thechance.tomjerryui.ui.theme.primaryTextColor
import com.thechance.tomjerryui.ui.theme.secondaryTextColor


@Composable
fun TomCardText(
    modifier: Modifier = Modifier,
    title: String,
    subTitle: String,
    titleSize: Int
) {


    Column(
        modifier = modifier.padding(4.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontFamily = IbmPlexSansFont,
            fontWeight = FontWeight.Medium,
            fontSize = titleSize.sp,
            color = primaryTextColor
        )
        Text(
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
fun PreViewDefaultTextAppBar() {
    TomCardText(
        title = "Hi Jerry ",
        subTitle = "Which Tom do you want to buy ?",
        titleSize = 14
    )
}