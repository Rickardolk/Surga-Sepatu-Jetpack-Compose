package com.example.surgasepatu4.view.screens.startSelling

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.surgasepatu4.R

@Composable
fun MarketInformationScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {

    Column(
        modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Surface(
            tonalElevation = 4.dp,
            shadowElevation = 4.dp
        ) {
            Box(
                modifier
                    .fillMaxWidth()
                    .height(54.dp)
                    .background(Color.White)
            ) {
                IconButton(
                    onClick = {
                        navController.popBackStack()
                    }

                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack ,
                        contentDescription = "icon arrow back",
                        modifier = Modifier
                            .padding(start = 16.dp)
                            .size(32.dp)
                            .align(Alignment.CenterStart),
                        tint = colorResource(id = R.color.ocean_boat_blue)
                    )
                }

                Text(
                    text = "Atur Informasi Toko" ,
                    fontSize = 16.sp ,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .align(Alignment.Center)
                )
            }
        }


        Spacer(modifier = Modifier.height(8.dp))
        Surface(
            tonalElevation = 4.dp,
            shadowElevation = 4.dp,
            color = Color.White,
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .padding(horizontal = 14.dp)
        ) {
            Column(
                modifier
                    .fillMaxWidth()
                    .height(96.dp)
                    .padding(horizontal = 18.dp)
                    .padding(vertical = 8.dp)
                    .background(
                        color = Color.White ,
                        shape = RoundedCornerShape(16.dp)
                    ),
                verticalArrangement = Arrangement.SpaceAround
            ){
                Text(
                    text = "Nama Toko" ,
                    fontSize = 14.sp ,
                    fontWeight = FontWeight.Medium,
                    color = colorResource(id = R.color.onyx_black)
                )

                HorizontalDivider(
                    color = Color.Transparent,
                    modifier = Modifier
                        .background(
                            color = colorResource(id = R.color.onyx_black_semi_transparent),
                            shape = RoundedCornerShape(12.dp)
                        )
                )

                BasicTextField(
                    value = "",
                    onValueChange = {},
                    singleLine = true,
                    decorationBox = {
                        Text(
                            text = "Masukan Nama Toko" ,
                            fontSize = 14.sp,
                            color = colorResource(id = R.color.onyx_black_semi_transparent)
                        )
                    }
                )
            }
        }



        Surface(
            tonalElevation = 4.dp,
            shadowElevation = 4.dp,
            shape = RoundedCornerShape(16.dp),
            color = Color.White,
            modifier = Modifier
                .padding(horizontal = 14.dp)
        ) {
            Box(
                modifier
                    .fillMaxWidth()
                    .padding(horizontal = 18.dp)
                    .height(42.dp)
                    .clickable {
                        navController.navigate("market address screen")
                    }
            ) {
                Text(
                    text = "Alamat" ,
                    fontSize = 14.sp ,
                    fontWeight = FontWeight.Medium,
                    color = colorResource(id = R.color.onyx_black),
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                )

                Row(
                    modifier
                        .align(Alignment.CenterEnd),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(2.dp)
                ) {
                    Text(
                        text = "Atur" ,
                        fontSize = 14.sp ,
                        fontWeight = FontWeight.Medium,
                        color = colorResource(id = R.color.onyx_black_semi_transparent)
                    )

                    Icon(
                        imageVector = Icons.Default.KeyboardArrowRight ,
                        contentDescription = "icon arrow right",
                        tint = colorResource(id = R.color.onyx_black_semi_transparent)
                    )
                }
            }
        }



        Surface(
            tonalElevation = 4.dp,
            shadowElevation = 4.dp,
            shape = RoundedCornerShape(16.dp),
            color = Color.White,
            modifier = Modifier
                .padding(horizontal = 14.dp)
        ) {
            Box(
                modifier
                    .fillMaxWidth()
                    .padding(horizontal = 18.dp)
                    .height(42.dp)
                    .clickable {
                        navController.navigate("delivery settings screen")
                    }
            ) {
                Text(
                    text = "Jasa Pengiriman" ,
                    fontSize = 14.sp ,
                    fontWeight = FontWeight.Medium,
                    color = colorResource(id = R.color.onyx_black),
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                )

                Row(
                    modifier
                        .align(Alignment.CenterEnd),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(2.dp)
                ) {
                    Text(
                        text = "Atur" ,
                        fontSize = 14.sp ,
                        fontWeight = FontWeight.Medium,
                        color = colorResource(id = R.color.onyx_black_semi_transparent)
                    )

                    Icon(
                        imageVector = Icons.Default.KeyboardArrowRight ,
                        contentDescription = "icon arrow right",
                        tint = colorResource(id = R.color.onyx_black_semi_transparent)
                    )
                }
            }
        }


        Surface(
            tonalElevation = 4.dp,
            shadowElevation = 4.dp,
            color = Color.White,
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .padding(horizontal = 14.dp)
        ) {
            Column(
                modifier
                    .fillMaxWidth()
                    .height(96.dp)
                    .padding(horizontal = 18.dp)
                    .padding(vertical = 8.dp)
                    .background(
                        color = Color.White ,
                        shape = RoundedCornerShape(16.dp)
                    ),
                verticalArrangement = Arrangement.SpaceAround
            ){
                Text(
                    text = "Email" ,
                    fontSize = 14.sp ,
                    fontWeight = FontWeight.Medium,
                    color = colorResource(id = R.color.onyx_black)
                )

                HorizontalDivider(
                    color = Color.Transparent,
                    modifier = Modifier
                        .background(
                            color = colorResource(id = R.color.onyx_black_semi_transparent),
                            shape = RoundedCornerShape(12.dp)
                        )
                )

                BasicTextField(
                    value = "",
                    onValueChange = {},
                    singleLine = true,
                    decorationBox = {
                        Text(
                            text = "Masukan Email" ,
                            fontSize = 14.sp,
                            color = colorResource(id = R.color.onyx_black_semi_transparent)
                        )
                    }
                )
            }
        }


        Spacer(modifier = Modifier.weight(1f))
        Row(
            modifier
                .fillMaxWidth()
                .padding(bottom = 36.dp)
                .height(54.dp)
                .padding(horizontal = 14.dp) ,
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Button(
                onClick = {
                    navController.popBackStack()
                },
                modifier = Modifier
                    .weight(1f)
                    .height(54.dp),
                colors = ButtonDefaults.buttonColors(
                    colorResource(id = R.color.bright_gray)
                ),
                shape = RoundedCornerShape(16.dp)
            ) {
                Text(
                    text = "Kembali" ,
                    fontSize = 16.sp ,
                    fontWeight = FontWeight.Medium,
                    color = colorResource(id = R.color.old_silver)
                )
            }

            Button(
                onClick = {
                    navController.navigate("my market screen")
                },
                modifier = Modifier
                    .weight(1f)
                    .height(54.dp),
                colors = ButtonDefaults.buttonColors(
                    colorResource(id = R.color.ocean_boat_blue)
                ),
                shape = RoundedCornerShape(16.dp)
            ) {
                Text(
                    text = "Lanjut" ,
                    fontSize = 16.sp ,
                    fontWeight = FontWeight.Medium,
                    color = Color.White
                )
            }
        }
    }
}

@Preview
@Composable
private fun view() {
    val navController = rememberNavController()
    MarketInformationScreen(navController = navController)
}

