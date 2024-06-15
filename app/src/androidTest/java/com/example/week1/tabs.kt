package com.example.week1

import androidx.compose.foundation.layout.Column

import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TwoScreenTabLayout() {
    var selectedTabIndex by remember { mutableStateOf(0) }
    val titles = listOf("FOOD", "FUN")

    Column {
        TabRow(selectedTabIndex = selectedTabIndex) {
            titles.forEachIndexed { index, title ->
                Tab(
                    text = { Text(title) },selected = selectedTabIndex == index,
                    onClick = { selectedTabIndex = index }
                )
            }
        }

        when (selectedTabIndex) {
            0 -> FOODScreen()
            1 -> FUNScreen()
        }
    }
}

@Composable
fun FUNScreen() {
   Text(" ")
}

@Composable
fun FOODScreen() {
    Text(" ")
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TwoScreenTabLayout()
}
