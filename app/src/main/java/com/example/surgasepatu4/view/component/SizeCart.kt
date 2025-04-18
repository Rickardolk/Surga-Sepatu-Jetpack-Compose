package com.example.surgasepatu4.view.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.surgasepatu4.R

@Composable
fun SizeCart(
    modifier: Modifier = Modifier,
    onSizeNumberSelected: (String) ->Unit
) {
    val sizeNumber = listOf("38", "39", "40", "41", "42", "43")
    var selectedSizeNumber by remember { mutableIntStateOf(0) }

    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "Size Cart" ,
                fontSize = 14.sp,
                color = colorResource(id = R.color.onyx_black),
                fontWeight = FontWeight.Normal
            )

            Icon(
                painter = painterResource(id = R.drawable.ic_size) ,
                contentDescription = "ic size",
                tint = colorResource(id = R.color.onyx_black),
                modifier = Modifier.size(20.dp)
            )
        }

        LazyRow(
            modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(2.dp)
        ) {
            items(sizeNumber.size) { index ->
                if (selectedSizeNumber == index) {
                    Button(
                        onClick = {
                            selectedSizeNumber = index
                            onSizeNumberSelected(sizeNumber[index])
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent
                        ),
                        shape = RoundedCornerShape(30.dp),
                        modifier = Modifier
                            .border(
                                width = 2.dp,
                                shape = RoundedCornerShape(30.dp),
                                color = colorResource(id = R.color.onyx_black)
                            )
                    ) {
                        Text(
                            text = sizeNumber[index] ,
                            color = colorResource(id = R.color.onyx_black)
                        )
                    }
                } else {
                    Button(
                        onClick = {
                            selectedSizeNumber = index
                            onSizeNumberSelected(sizeNumber[index])
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent
                        ),
                        shape = RoundedCornerShape(30.dp)
                    ) {
                        Text(
                            text = sizeNumber[index] ,
                            color = colorResource(id = R.color.onyx_black)
                        )
                    }
                }
            }
        }



    }

}