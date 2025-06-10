package com.thechance.tomjerryui.component.appBar

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.thechance.tomjerryui.R

@Composable
fun AppBarIcon() {
    Image(
        painter = painterResource(R.drawable.user_avatar),
        contentDescription = "User Avatar",
        modifier =  Modifier.padding(end = 16.dp, top = 8.dp, bottom = 8.dp)
    )

}


@Preview(showBackground = true)
@Composable
fun PreViewAppBarIcon() {
    AppBarIcon()
}