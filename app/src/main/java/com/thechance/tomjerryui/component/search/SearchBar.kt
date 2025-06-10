package com.thechance.tomjerryui.component.search

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.tomjerryui.R
import com.thechance.tomjerryui.ui.theme.IbmPlexSansFont
import com.thechance.tomjerryui.ui.theme.primaryTextColor
import com.thechance.tomjerryui.ui.theme.secondaryTextColor

@Composable
fun SearchBar(
    modifier: Modifier = Modifier,
    searchTitle: String
) {

    Card(
        modifier = modifier
            .width(272.dp)
            .height(48.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(1.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White)
                .padding(start = 16.dp),
            verticalAlignment = Alignment.CenterVertically

        ) {

            Image(
                painter = painterResource(R.drawable.search_normal),
                contentDescription = "searchIcon"
            )

            Text(
                text = searchTitle,
                modifier = Modifier.padding(
                    start = 16.dp,
                ),
                fontFamily = IbmPlexSansFont,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                color = secondaryTextColor
            )


        }


    }

}

@Preview(showBackground = true)
@Composable
fun PreViewDefaultSearchBar() {
    SearchBar(searchTitle = "Search about tom ...")
}