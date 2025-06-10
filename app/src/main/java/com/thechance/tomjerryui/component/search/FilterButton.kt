package com.thechance.tomjerryui.component.search

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.thechance.tomjerryui.R

@Composable
fun FilterButton(
    onClick: () -> Unit
) {
    Image(
        painter = painterResource(R.drawable.filterbutton_svg),
        contentDescription = "filter button",
        modifier = Modifier
            .size(48.dp)
            .clickable {
                onClick()
            }

    )

}

@Preview(showBackground = true)
@Composable
fun PreViewFilterButton() {
    FilterButton(onClick = {})
}