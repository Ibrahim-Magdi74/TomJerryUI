package com.thechance.tomjerryui.component.tomSectionView

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.thechance.tomjerryui.R

@Composable
fun AddToCart(
    numberOfCheese: Int
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 2.dp, end = 2.dp)
    ) {
        Card(
            modifier = Modifier
                .width(106.dp)
                .height(30.dp),
            shape = RoundedCornerShape(8.dp),
            elevation = CardDefaults.cardElevation(1.dp)
        ) {

            CheeseCard(numberOfCheese = numberOfCheese)

        }

        Spacer(modifier = Modifier.weight(1f))

        Image(
            painter = painterResource(R.drawable.addtocartcontainer_svg),
            contentDescription = "addToCart"
        )

    }


}


@Preview(showBackground = true)
@Composable
fun PreviewAddToCart() {
    AddToCart(numberOfCheese = 10)
}