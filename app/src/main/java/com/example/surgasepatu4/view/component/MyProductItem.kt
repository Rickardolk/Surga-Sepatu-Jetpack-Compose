package com.example.surgasepatu4.view.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.surgasepatu4.R

@Composable
fun MyProductItem(
    modifier: Modifier = Modifier
) {

    Column(
        modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(horizontal = 14.dp)
            .padding(bottom = 6.dp)
    ) {
        Card(
            modifier
                .height(206.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            elevation = CardDefaults.elevatedCardElevation(
                defaultElevation = 4.dp
            )
        ) {
            Column(
                modifier
                    .padding(10.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.shoe_image) ,
                        contentDescription = "shoe image",
                        modifier = Modifier
                            .size(76.dp)
                            .clip(RoundedCornerShape(12.dp)),
                        contentScale = ContentScale.Crop
                    )

                    Column {
                        Text(
                            text = "Ponte Nerro Terra Dark Choco" ,
                            fontSize = 10.sp ,
                            lineHeight = 20.sp,
                            fontWeight = FontWeight.Medium,
                            color = colorResource(id = R.color.onyx_black)
                        )

                        Text(
                            text = "Rp 458. 000.00" ,
                            fontSize = 10.sp ,
                            lineHeight = 20.sp,
                            fontWeight = FontWeight.Medium,
                            color = colorResource(id = R.color.onyx_black)
                        )
                    }
                }

                HorizontalDivider(
                    color = Color.Transparent,
                    modifier = Modifier
                        .background(
                            color = colorResource(id = R.color.onyx_black_semi_transparent),
                            shape = RoundedCornerShape(12.dp)
                        )
                )

                Row(
                    modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        modifier
                            .height(38.dp)
                            .weight(1f),
                        verticalArrangement = Arrangement.spacedBy(10.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_stok) ,
                                contentDescription = "ic stok",
                                modifier = Modifier.size(14.dp),
                                tint = colorResource(id = R.color.onyx_black)
                            )

                            Text(
                                text = "Stok 99" ,
                                fontSize = 10.sp ,
                                fontWeight = FontWeight.Medium,
                                color = colorResource(id = R.color.onyx_black)
                            )
                        }

                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_stok) ,
                                contentDescription = "ic stok",
                                modifier = Modifier.size(14.dp),
                                tint = colorResource(id = R.color.onyx_black)
                            )

                            Text(
                                text = "Stok 99" ,
                                fontSize = 10.sp ,
                                fontWeight = FontWeight.Medium,
                                color = colorResource(id = R.color.onyx_black)
                            )
                        }
                    }

                    Column(
                        modifier
                            .height(38.dp)
                            .weight(1f),
                        verticalArrangement = Arrangement.spacedBy(10.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_stok) ,
                                contentDescription = "ic stok",
                                modifier = Modifier.size(14.dp),
                                tint = colorResource(id = R.color.onyx_black)
                            )

                            Text(
                                text = "Stok 99" ,
                                fontSize = 10.sp ,
                                fontWeight = FontWeight.Medium,
                                color = colorResource(id = R.color.onyx_black)
                            )
                        }

                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_stok) ,
                                contentDescription = "ic stok",
                                modifier = Modifier.size(14.dp),
                                tint = colorResource(id = R.color.onyx_black)
                            )

                            Text(
                                text = "Stok 99" ,
                                fontSize = 10.sp ,
                                fontWeight = FontWeight.Medium,
                                color = colorResource(id = R.color.onyx_black)
                            )
                        }
                    }
                }

                HorizontalDivider(
                    color = Color.Transparent,
                    modifier = Modifier
                        .background(
                            color = colorResource(id = R.color.onyx_black_semi_transparent),
                            shape = RoundedCornerShape(12.dp)
                        )
                )

                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    OutlinedButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .height(32.dp)
                            .width(100.dp),
                        contentPadding = PaddingValues(1.dp),
                        shape = RoundedCornerShape(8.dp),
                        border = BorderStroke(
                            width = 1.dp,
                            color = colorResource(id = R.color.ocean_boat_blue)
                        )
                    ) {
                        Text(
                            text = "Edit" ,
                            fontSize = 10.sp ,
                            fontWeight = FontWeight.Normal,
                            color = colorResource(id = R.color.onyx_black)
                        )
                    }

                    OutlinedButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .height(32.dp)
                            .width(100.dp),
                        contentPadding = PaddingValues(1.dp),
                        shape = RoundedCornerShape(8.dp),
                        border = BorderStroke(
                            width = 1.dp,
                            color = Color.Red
                        )
                    ) {
                        Text(
                            text = "Hapus" ,
                            fontSize = 10.sp ,
                            fontWeight = FontWeight.Normal,
                            color = colorResource(id = R.color.onyx_black)
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
    MyProductItem()
}