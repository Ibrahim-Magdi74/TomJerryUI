package com.thechance.tomjerryui.component.tomCard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.thechance.tomjerryui.R
import com.thechance.tomjerryui.ui.theme.GradiantCardColor1
import com.thechance.tomjerryui.ui.theme.GradiantCardColor2

@Composable
fun TomCardView(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {

        Card(
            modifier = modifier
                .fillMaxWidth()
                .height(100.dp),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(1.dp)
        ) {

            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(
                                GradiantCardColor1,
                                GradiantCardColor2
                            )
                        )
                    )
            ) {
                TomTextCard(
                    title = "Buy 1 Tom and get 2 for free",
                    subTitle = "Adopt Tom! (Free Fail-Free Guarantee)"
                )

                Spacer(modifier = Modifier.weight(1f))

            }

        }

        TomImageCard(
            painter = painterResource(R.drawable.tomma),
            modifier = Modifier
                .height(125.dp).width(100.dp)
                .align(Alignment.TopEnd)
                .offset(y = (-16).dp)
                .zIndex(1f)
        )


    }

}


@Preview(showBackground = true)
@Composable
fun PreViewDefaultCardView() {
    TomCardView()
}