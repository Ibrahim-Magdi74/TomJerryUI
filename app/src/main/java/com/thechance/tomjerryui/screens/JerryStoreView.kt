package com.thechance.tomjerryui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.thechance.tomjerryui.R
import com.thechance.tomjerryui.TomCardModel
import com.thechance.tomjerryui.component.appBar.AppBarView
import com.thechance.tomjerryui.component.search.FilterSearchView
import com.thechance.tomjerryui.component.tomCard.TomCardView
import com.thechance.tomjerryui.component.tomSectionTextView.DefaultTextView
import com.thechance.tomjerryui.component.tomSectionView.TomSectionScrollView
import com.thechance.tomjerryui.ui.theme.backgroundAPPColor

@Composable
fun JerryStoreView() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundAPPColor)
            .padding(vertical = 48.dp)
    ) {
        AppBarView()

        FilterSearchView()

        Spacer(modifier = Modifier.height(8.dp))

        TomCardView()

        DefaultTextView("Cheap tom section", "view all")


        val dataView = listOf(
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
            ),
            TomCardModel(
                title = "Spy Tom",
                description = "Disguises itself as a table.",
                image = painterResource(R.drawable.spytom),
                cheeseNumber = 3
            ),
            TomCardModel(
                title = "Frozen Tom",
                description = "He was chasing Jerry, he froze after the first look",
                image = painterResource(R.drawable.frozentom),
                cheeseNumber = 5
            ),
            TomCardModel(
                title = "Sleeping Tom",
                description = "He doesn't chase anyone, he just snores in stereo.",
                image = painterResource(R.drawable.sleepingtom),
                cheeseNumber = 10
            )
        )

        TomSectionScrollView(dataView)

    }


}


@Preview
@Composable
fun PreviewJerryStoreView() {
    JerryStoreView()
}