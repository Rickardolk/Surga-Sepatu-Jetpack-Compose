package com.example.surgasepatu4.view.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.surgasepatu4.R

@Composable
fun MyProductButton(
    modifier: Modifier = Modifier
) {
    val categories = listOf("Live", "Habis", "Perlu Diperiksa", "Perlu Tindakan", "Di Arsipkan")
    var selectedIndex by remember { mutableIntStateOf(1) }
    Surface(
        tonalElevation = 4.dp,
        shadowElevation = 4.dp
    ) {
        Box(
            modifier
                .fillMaxWidth()
                .height(52.dp)
                .background(Color.White)
        ) {
            Row(
                modifier
                    .horizontalScroll(rememberScrollState())
                    .padding(horizontal = 16.dp)
                    .padding(top = 12.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                categories.forEachIndexed() { index, title->
                    val isSelected = selectedIndex == index

                    Column(
                        modifier
                            .padding(horizontal = 12.dp)
                            .clickable { selectedIndex = index },
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "$title\n(0)" ,
                            lineHeight = 14.sp,
                            textAlign = TextAlign.Center,
                            color = if (isSelected) colorResource(id = R.color.ocean_boat_blue)
                                else colorResource(id = R.color.onyx_black),
                            fontWeight = if (isSelected) FontWeight.SemiBold
                                else FontWeight.Normal,
                            fontSize = 10.sp
                        )
                        Spacer(modifier = Modifier.weight(1f))
                        HorizontalDivider(
                            color = Color.Transparent,
                            thickness = 2.dp,
                            modifier = Modifier
                                .width(40.dp)
                                .background(
                                    color = if (isSelected) colorResource(id = R.color.ocean_boat_blue)
                                        else Color.Transparent,
                                    shape = RoundedCornerShape(50)
                                )
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun view() {
    MyProductButton()
}