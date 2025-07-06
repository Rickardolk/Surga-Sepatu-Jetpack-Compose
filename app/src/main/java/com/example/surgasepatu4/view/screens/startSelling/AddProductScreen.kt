package com.example.surgasepatu4.view.screens.startSelling

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.surgasepatu4.R

@Composable
fun AddProductScreen(
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
                Row(
                    modifier
                        .align(Alignment.CenterStart)
                        .padding(start = 14.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        onClick = {
                            navController.popBackStack()
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack ,
                            contentDescription = "ic arrow back",
                            modifier = Modifier.size(32.dp),
                            tint = colorResource(id = R.color.ocean_boat_blue)
                        )
                    }

                    Text(
                        text = "Tambah Produk" ,
                        fontSize = 16.sp ,
                        fontWeight = FontWeight.Medium,
                        color = colorResource(id = R.color.onyx_black)
                    )
                }
            }
        }

        Surface(
            tonalElevation = 4.dp,
            shadowElevation = 4.dp,
            modifier = Modifier
                .padding(horizontal = 14.dp),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .height(114.dp)
                    .padding(10.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = "Foto dan Video Produk" ,
                    fontSize = 10.sp ,
                    fontWeight = FontWeight.Medium,
                    color = colorResource(id = R.color.onyx_black)
                )
                
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Column(
                        modifier
                            .size(70.dp)
                            .border(
                                width = 1.dp ,
                                color = colorResource(id = R.color.ocean_boat_blue) ,
                                shape = RoundedCornerShape(6.dp)
                            ),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "+Tambah\n" + "Foto" ,
                            fontSize = 10.sp,
                            textAlign = TextAlign.Center,
                            color = colorResource(id = R.color.ocean_boat_blue)
                        )
                    }

                    Column(
                        modifier
                            .size(70.dp)
                            .border(
                                width = 1.dp ,
                                color = colorResource(id = R.color.ocean_boat_blue) ,
                                shape = RoundedCornerShape(6.dp)
                            ),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "+Tambah\n" + "Video" ,
                            fontSize = 10.sp,
                            textAlign = TextAlign.Center,
                            color = colorResource(id = R.color.ocean_boat_blue)
                        )
                    }
                }
            }
        }

        Surface(
            tonalElevation = 4.dp,
            shadowElevation = 4.dp,
            modifier = Modifier
                .padding(horizontal = 14.dp),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .background(Color.White)
                    .padding(10.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = "Nama Produk" ,
                    fontSize = 10.sp ,
                    fontWeight = FontWeight.Medium
                )

                BasicTextField(
                    value =  "",
                    onValueChange = {},
                    singleLine = true,
                    decorationBox = {
                        Text(
                            text = "Masukan Nama Produk" ,
                            fontSize = 10.sp,
                            color = colorResource(id = R.color.onyx_black_semi_transparent)
                        )
                    }
                )
            }
        }

        Surface(
            tonalElevation = 4.dp,
            shadowElevation = 4.dp,
            modifier = Modifier
                .padding(horizontal = 14.dp),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .background(Color.White)
                    .padding(10.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = "Deskripsi Produk" ,
                    fontSize = 10.sp ,
                    fontWeight = FontWeight.Medium
                )

                BasicTextField(
                    value =  "",
                    onValueChange = {},
                    singleLine = true,
                    decorationBox = {
                        Text(
                            text = "Masukan Deskripsi Produk" ,
                            fontSize = 10.sp,
                            color = colorResource(id = R.color.onyx_black_semi_transparent)
                        )
                    }
                )
            }
        }

        Surface(
            tonalElevation = 4.dp,
            shadowElevation = 4.dp,
            modifier = Modifier
                .padding(horizontal = 14.dp),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                modifier
                    .fillMaxWidth()
                    .height(104.dp)
                    .background(Color.White)
                    .padding(10.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Row(
                    modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_harga) ,
                        contentDescription = "ic harga",
                        modifier = Modifier.size(14.dp),
                        tint = colorResource(id = R.color.onyx_black)
                    )

                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Harga" ,
                        fontSize = 10.sp ,
                        fontWeight = FontWeight.Medium,
                        color = colorResource(id = R.color.onyx_black)
                    )

                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = "Atur" ,
                        fontSize = 10.sp ,
                        fontWeight = FontWeight.Medium,
                        color = colorResource(id = R.color.onyx_black_semi_transparent)
                    )
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
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_stok) ,
                        contentDescription = "ic stok",
                        modifier = Modifier.size(14.dp),
                        tint = colorResource(id = R.color.onyx_black)
                    )

                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Stok" ,
                        fontSize = 10.sp ,
                        fontWeight = FontWeight.Medium,
                        color = colorResource(id = R.color.onyx_black)
                    )

                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = "0" ,
                        fontSize = 10.sp ,
                        fontWeight = FontWeight.Medium,
                        color = colorResource(id = R.color.onyx_black_semi_transparent)
                    )
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
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_ongkos_kirim) ,
                        contentDescription = "ic ongkos kirim",
                        modifier = Modifier.size(14.dp),
                        tint = colorResource(id = R.color.onyx_black)
                    )

                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Ongkos Kirim" ,
                        fontSize = 10.sp ,
                        fontWeight = FontWeight.Medium,
                        color = colorResource(id = R.color.onyx_black)
                    )

                    Spacer(modifier = Modifier.weight(1f))
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowRight ,
                        contentDescription = "ic arrow right",
                        tint = colorResource(id = R.color.onyx_black)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = {
                navController.popBackStack()
            },
            modifier = Modifier
                .padding(bottom = 14.dp)
                .fillMaxWidth()
                .height(46.dp)
                .padding(horizontal = 14.dp) ,
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.ocean_boat_blue)
            )
        ) {
            Text(
                text = "Simpan" ,
                fontSize = 16.sp ,
                fontWeight = FontWeight.Medium
            )

        }





    }
}

@Preview
@Composable
private fun view() {
    val navController = rememberNavController()
    AddProductScreen(navController = navController)
}