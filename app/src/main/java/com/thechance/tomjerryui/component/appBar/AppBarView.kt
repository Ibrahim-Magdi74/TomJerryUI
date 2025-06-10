package com.thechance.tomjerryui.component.appBar

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.thechance.tomjerryui.R

@Composable
fun AppBarView() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        AppBarImage(
            painter = painterResource(R.drawable.jerry),
            size = 48,
            contentDescription = "jerry icon"
        )

        AppBarText(
            title = "Hi,Jerry ",
            subTitle = "Which Tom do you want to buy ?",
            titleSize = 14
        )

        Spacer(modifier = Modifier.weight(1f))

        AppBarIcon()
    }

}


@Preview(showBackground = true)
@Composable
fun PreviewAppBarView() {
    AppBarView()
}