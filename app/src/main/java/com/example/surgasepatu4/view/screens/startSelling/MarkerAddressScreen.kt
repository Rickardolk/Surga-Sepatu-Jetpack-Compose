package com.example.surgasepatu4.view.screens.startSelling

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
fun MarketAddressScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Column(
        modifier
            .fillMaxSize()
            .background(Color.White) ,
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
                        contentDescription = "ic arrow back",
                        tint = colorResource(id = R.color.ocean_boat_blue),
                        modifier = Modifier
                            .padding(start = 16.dp)
                            .size(32.dp)
                            .align(Alignment.CenterStart)
                    )
                }

                Text(
                    text = "Alamat Toko" ,
                    fontSize = 16.sp ,
                    fontWeight = FontWeight.Medium,
                    color = colorResource(id = R.color.onyx_black),
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }


        Spacer(modifier = Modifier.height(8.dp))
        Column(
            modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = "Kontak" ,
                fontSize = 14.sp ,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.onyx_black)
            )

            Surface(
                tonalElevation = 4.dp,
                shadowElevation = 4.dp,
                shape = RoundedCornerShape(16.dp),
                color = Color.White
            ) {
                Column(
                    modifier
                        .fillMaxWidth()
                        .height(96.dp)
                        .padding(horizontal = 14.dp)
                        .padding(vertical = 8.dp),
                    verticalArrangement = Arrangement.SpaceAround
                ) {
                    BasicTextField(
                        value = "",
                        onValueChange = {},
                        decorationBox = {
                            Text(
                                text = "Nama Lengkap",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Normal,
                                color = colorResource(id = R.color.onyx_black_semi_transparent)
                            )
                        }
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
                        decorationBox = {
                            Text(
                                text = "Nomor Telepon" ,
                                fontSize = 14.sp ,
                                fontWeight = FontWeight.Normal,
                                color = colorResource(id = R.color.onyx_black_semi_transparent)
                            )
                        }
                    )
                }
            }
        }

        Column(
            modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = "Alamat" ,
                fontSize = 14.sp ,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.onyx_black)
            )

            Surface(
                tonalElevation = 4.dp,
                shadowElevation = 4.dp,
                shape = RoundedCornerShape(16.dp),
                color = Color.White
            ) {
                Column(
                    modifier
                        .fillMaxWidth()
                        .height(144.dp)
                        .padding(horizontal = 14.dp)
                        .padding(vertical = 8.dp),
                    verticalArrangement = Arrangement.SpaceAround
                ) {
                    BasicTextField(
                        value = "",
                        onValueChange = {},
                        decorationBox = {
                            Row(
                                modifier
                                    .fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(
                                    text = "Profinsi, Kota, Kecamatan, Kode Pos" ,
                                    fontSize = 14.sp,
                                    color = colorResource(id = R.color.onyx_black_semi_transparent)
                                )

                                Icon(
                                    imageVector = Icons.Default.KeyboardArrowRight ,
                                    contentDescription = "icon arrow right",
                                    tint = colorResource(id = R.color.onyx_black_semi_transparent)
                                )
                            }
                        }
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
                        decorationBox = {
                            Text(
                                text = "Nama Jalan, Gedung, No. Rumah" ,
                                fontSize = 14.sp ,
                                fontWeight = FontWeight.Normal,
                                color = colorResource(id = R.color.onyx_black_semi_transparent)
                            )
                        }
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
                        decorationBox = {
                            Text(
                                text = "Detail Lainnya (Cth: Blok / Unit No. Patokan)" ,
                                fontSize = 14.sp ,
                                fontWeight = FontWeight.Normal,
                                color = colorResource(id = R.color.onyx_black_semi_transparent)
                            )
                        }
                    )
                }
            }
        }

        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = {
                navController.popBackStack()
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.ocean_boat_blue)
            ),
            modifier = Modifier
                .padding(bottom = 36.dp)
                .fillMaxWidth()
                .height(54.dp)
                .padding(horizontal = 14.dp),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "Simpan" ,
                fontSize = 16.sp ,
                fontWeight = FontWeight.Medium,
                color = Color.White
            )
        }


    }

}


@Preview
@Composable
private fun view() {
    val navController = rememberNavController()
    MarketAddressScreen(navController = navController)
}