package com.thechance.tomjerryui.component.tomSectionView

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.thechance.tomjerryui.R
import com.thechance.tomjerryui.TomCardModel

@Composable
fun TomCard(card: TomCardModel) {
    Box(
        modifier = Modifier
            .padding(top = 24.dp, bottom = 8.dp, end = 8.dp, start = 8.dp)
    ) {

        Card(
            modifier = Modifier
                .width(180.dp)
                .height(219.dp),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(1.dp),

            ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.White)
                    .padding(top = 70.dp, start = 4.dp, end = 4.dp, bottom = 8.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                TomCardText(
                    modifier = Modifier
                        .fillMaxWidth(),
                    title = card.title,
                    subTitle = card.description,
                    titleSize = 18
                )

                Spacer(modifier = Modifier.weight(1f))

                AddToCart(card.cheeseNumber)


            }


        }

        Image(
            modifier = Modifier
                .size(100.dp)
                .align(Alignment.TopCenter)
                .offset(y = (-25).dp)
                .zIndex(1f),
            painter = card.image,
            contentDescription = "tom Pic 1"
        )


    }

}


@Preview(showBackground = true)
@Composable
fun PreViewTomCard() {
    TomCard(
        TomCardModel(
            title = "Tom the lover",
            description = "He loves one-sidedly... and is beaten by the other side.",
            image = painterResource(R.drawable.tomthelover),
            cheeseNumber = 10
        )
    )
}