package com.thechance.tomjerryui.component.tomCard

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
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
fun TomImageCard(
    modifier: Modifier = Modifier,
    painter: Painter
) {

    Image(
        modifier = modifier
            .clip(RoundedCornerShape(32.dp))
            .height(100.dp)
            .width(115.dp),
        painter = painter,
        contentDescription = "Tom"
    )

}


@Preview(showBackground = true)
@Composable
fun PreViewTomImageCard() {
    TomImageCard(painter = painterResource(R.drawable.tom))
}