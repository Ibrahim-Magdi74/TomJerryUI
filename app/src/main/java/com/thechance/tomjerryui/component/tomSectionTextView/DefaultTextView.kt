package com.thechance.tomjerryui.component.tomSectionTextView

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import com.thechance.tomjerryui.ui.theme.primaryTextColor
import com.thechance.tomjerryui.ui.theme.textColor

@Composable
fun DefaultTextView(title: String, subTitle: String) {

    Row(
        modifier = Modifier.padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = title,
            fontFamily = IbmPlexSansFont,
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
            color = primaryTextColor
        )

        Spacer(modifier = Modifier.weight(1f))

        Text(
            modifier = Modifier.padding(8.dp),
            text = subTitle,
            fontFamily = IbmPlexSansFont,
            fontWeight = FontWeight.SemiBold,
            fontSize = 12.sp,
            color = textColor
        )

        Image(
            painter = painterResource(R.drawable.arrowright_svg),
            contentDescription = "arrow"
        )

    }

}

@Preview(showBackground = true)
@Composable
fun PreViewDefaultTextView() {
    DefaultTextView("Cheap tom section", "view all")
}
