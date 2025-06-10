package com.thechance.tomjerryui.component.search

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun FilterSearchView() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 12.dp, bottom = 8.dp)
    ) {
        SearchBar(searchTitle = "Search about tom ...")

        Spacer(modifier = Modifier.weight(1f))

        FilterButton { }
    }

}

@Preview(showBackground = true)
@Composable
fun PreViewFilterSearchView() {
    FilterSearchView()
}