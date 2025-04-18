package com.example.surgasepatu4.view.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.surgasepatu4.R

@Composable
fun HistoryScreen(
    modifier: Modifier = Modifier
) {
    Box(
        modifier
            .fillMaxSize()
    ){
        Column(
            modifier
                .fillMaxSize()
                .background(color = colorResource(id = R.color.ocean_boat_blue))
                .padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = "History" ,
                fontSize = 16.sp ,
                fontWeight = FontWeight.Medium ,
                color = Color.White
            )

            Column(
                modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp),
                horizontalAlignment = Alignment.End
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_date) ,
                    contentDescription = "ic date",
                    modifier.size(24.dp),
                    tint = Color.White
                )
            }

            Spacer(modifier = Modifier.height(16.dp))
            Column(
                modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = "Good Morning User" ,
                    fontSize = 14.sp ,
                    fontWeight = FontWeight.Medium ,
                    color = Color.White
                )

                Text(
                    text = "Have you ordered shoe today?" ,
                    fontSize = 12.sp ,
                    fontWeight = FontWeight.Normal,
                    color = Color.White
                )
            }

            Spacer(modifier = Modifier.height(24.dp))
            Column(
                modifier
                    .fillMaxSize()
                    .background(
                        Color.White ,
                        shape = RoundedCornerShape(topStart = 24.dp , topEnd = 24.dp)
                    )
            ) {
                Row(
                    modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent
                        )
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_market) ,
                                    contentDescription = "ic market",
                                    modifier.size(18.dp),
                                    tint = colorResource(id = R.color.onyx_black)
                                )

                                Text(
                                    text = "Market" ,
                                    fontSize = 14.sp ,
                                    fontWeight = FontWeight.Normal,
                                    color = colorResource(id = R.color.onyx_black)
                                )
                            }

                            Text(
                                text = "Add Shoe" ,
                                fontSize = 14.sp ,
                                fontWeight = FontWeight.Medium,
                                color = colorResource(id = R.color.onyx_black)
                            )
                        }
                    }

                    VerticalDivider(
                        modifier = Modifier
                            .height(50.dp)
                            .background(
                                color = colorResource(id = R.color.onyx_black) ,
                                shape = RoundedCornerShape(16.dp)
                            ),
                        thickness = 2.dp,
                        color = Color.Transparent
                    )

                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent
                        )
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_buy_now) ,
                                    contentDescription = "ic credit",
                                    modifier.size(18.dp),
                                    tint = colorResource(id = R.color.onyx_black)
                                )

                                Text(
                                    text = "Buy now" ,
                                    fontSize = 14.sp ,
                                    fontWeight = FontWeight.Normal,
                                    color = colorResource(id = R.color.onyx_black)
                                )
                            }

                            Text(
                                text = "Check Shoe" ,
                                fontSize = 14.sp ,
                                fontWeight = FontWeight.Medium,
                                color = colorResource(id = R.color.onyx_black)
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))
                Column(
                    modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp)
                ) {
                    Text(
                        text = "Latest Transaction" ,
                        fontSize = 14.sp ,
                        fontWeight = FontWeight.Medium,
                        color = colorResource(id = R.color.onyx_black)
                    )

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        VerticalDivider(
                            thickness = 2.dp,
                            modifier = Modifier
                                .height(50.dp)
                                .background(
                                    color = colorResource(id = R.color.ocean_boat_blue) ,
                                    shape = RoundedCornerShape(16.dp)
                                ),
                            color = Color.Transparent
                        )

                        Column {
                            Text(
                                text = "Tuesday, 08/10/2025" ,
                                fontSize = 12.sp ,
                                fontWeight = FontWeight.Normal,
                                color = colorResource(id = R.color.onyx_black_semi_transparent)
                            )

                            Text(
                                text = "Amount 2" ,
                                fontSize = 12.sp ,
                                fontWeight = FontWeight.Normal,
                                color = colorResource(id = R.color.onyx_black_semi_transparent)
                            )
                        }

                    }
                }
            }
        }
    }

}


@Preview
@Composable
private fun view() {
    HistoryScreen()
}