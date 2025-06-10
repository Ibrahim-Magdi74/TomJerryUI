package com.thechance.tomjerryui.component.tomSectionView

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.thechance.tomjerryui.R
import com.thechance.tomjerryui.TomCardModel

@Composable
fun TomSectionScrollView(cards: List<TomCardModel>) {

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.fillMaxSize()
    ) {

        items(cards.size) { index ->
            TomCard(cards[index])
        }


    }


}

@Preview(showBackground = true)
@Composable
fun PreviewTomSectionScrollView() {
    TomSectionScrollView(
        listOf(
            TomCardModel(
                title = "Sport Tom",
                description = "He runs 1 meter... trips over his boot.",
                image = painterResource(R.drawable.sporttom),
                cheeseNumber = 3
            ),
            TomCardModel(
                title = "Tom the lover",
                description = "He loves one-sidedly... and is beaten by the other side.",
                image = painterResource(R.drawable.tomthelover),
                cheeseNumber = 5
            ),
            TomCardModel(
                title = "Tom the bomb",
                description = "He blows himself up before Jerry can catch him.",
                image = painterResource(R.drawable.tomthebomb),
                cheeseNumber = 10
            )

        )
    )
}