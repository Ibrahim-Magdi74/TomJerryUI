package com.thechance.tomjerryui.component.appBar

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.thechance.tomjerryui.R

@Composable
fun AppBarImage(
    modifier: Modifier = Modifier,
    painter: Painter,
    size: Int,
    contentDescription: String
) {

    Image(
        modifier = modifier
            .padding(top = 4.dp, start = 16.dp, bottom = 4.dp, end = 4.dp)
            .size(size.dp)
            .clip(RoundedCornerShape(12.dp)),
        painter = painter,
        contentDescription = contentDescription,

        )


}

@Preview(showBackground = true)
@Composable
fun PreViewAppBarImage() {
    AppBarImage(
        painter = painterResource(R.drawable.jerry),
        size = 48,
        contentDescription = "jerry icon"
    )
}