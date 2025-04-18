package com.example.surgasepatu4.view.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.surgasepatu4.R

@Composable
fun PopularButton(
    modifier: Modifier = Modifier,
    onCategorySelected: (String) -> Unit
) {
    val buttonName = listOf("Formal", "Loafers", "Running", "Sneakers", "Boots")
    var buttonSelected by remember { mutableIntStateOf(0) }

    LazyRow(
        modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        items(buttonName.size) { index ->
            Button(
                onClick = {
                    buttonSelected = index
                    onCategorySelected(buttonName[index])
                },
                modifier = Modifier
                    .width(100.dp)
                    .padding(start = 16.dp , bottom = 8.dp),
                elevation = ButtonDefaults.elevatedButtonElevation(
                    defaultElevation = if (buttonSelected == index) 8.dp else 0.dp
                ),
                colors = ButtonDefaults.buttonColors(
                    containerColor =
                        if (buttonSelected == index) colorResource(id = R.color.ocean_boat_blue)
                        else colorResource(id = R.color.bright_gray)
                ),
                contentPadding = PaddingValues(0.dp)
            ) {
                Text(
                    text = buttonName[index] ,
                    color = if (buttonSelected == index) Color.White
                    else colorResource(id = R.color.onyx_black),
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp
                )
            }
        }
    }
}

@Preview
@Composable
private fun view() {
    PopularButton {

    }
}