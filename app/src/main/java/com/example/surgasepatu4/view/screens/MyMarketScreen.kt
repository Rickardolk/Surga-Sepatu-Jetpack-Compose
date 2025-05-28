package com.example.surgasepatu4.view.screens

import android.graphics.Paint.Align
import android.widget.Space
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
fun MyMarketScreen(
    modifier: Modifier = Modifier
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
                        .padding(start = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack ,
                        contentDescription = "icon arrow back",
                        tint = colorResource(id = R.color.ocean_boat_blue),
                        modifier = Modifier.size(32.dp)
                    )

                    Text(
                        text = "Toko Saya" ,
                        fontSize = 16.sp ,
                        fontWeight = FontWeight.Medium,
                        color = colorResource(id = R.color.onyx_black)
                    )
                }

                Row(
                    modifier
                        .align(Alignment.CenterEnd)
                        .padding(end = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Settings ,
                        contentDescription = "ic settings",
                        tint = colorResource(id = R.color.ocean_boat_blue),
                        modifier = Modifier.size(24.dp)
                    )

                    Icon(
                        imageVector = Icons.Outlined.Notifications ,
                        contentDescription = "ic settings",
                        tint = colorResource(id = R.color.ocean_boat_blue),
                        modifier = Modifier.size(24.dp)
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.ic_chat),
                        contentDescription = "ic settings",
                        tint = colorResource(id = R.color.ocean_boat_blue),
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        }

        Surface(
            tonalElevation = 4.dp,
            shadowElevation = 4.dp
        ) {
            Box(
                modifier
                    .fillMaxWidth()
                    .height(76.dp)
                    .background(Color.White)
            ) {
                Row(
                    modifier
                        .align(Alignment.CenterStart)
                        .padding(start = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.person) ,
                        contentDescription = "image person",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(52.dp)
                            .clip(CircleShape)
                    )

                    Column(
                        verticalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Text(
                            text = "Siapa.id" ,
                            fontSize = 16.sp ,
                            fontWeight = FontWeight.SemiBold,
                            color = colorResource(id = R.color.onyx_black)
                        )

                        Text(
                            text = "surgasepatu.co.id/casdfsad" ,
                            fontSize = 12.sp ,
                            fontWeight = FontWeight.Normal,
                            color = colorResource(id = R.color.onyx_black_semi_transparent)
                        )
                    }
                }

                OutlinedButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .height(24.dp)
                        .padding(end = 16.dp),
                    border = BorderStroke(
                        width = 1.dp,
                        color = colorResource(id = R.color.ocean_boat_blue)
                    ),
                    contentPadding = PaddingValues(2.dp),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = "Kunjungi Toko" ,
                        fontSize = 12.sp ,
                        fontWeight = FontWeight.Normal,
                        color = colorResource(id = R.color.onyx_black),
                        modifier = Modifier
                            .padding(horizontal = 8.dp)
                    )
                }
            }
        }

        Surface(
            tonalElevation = 4.dp,
            shadowElevation = 4.dp
        ) {
            Column(
                modifier
                    .fillMaxWidth()
                    .height(114.dp)
                    .background(Color.White)
                    .padding(horizontal = 14.dp , vertical = 10.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Row(
                    modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Status Pesanan" ,
                        fontSize = 14.sp ,
                        fontWeight = FontWeight.SemiBold,
                        color = colorResource(id = R.color.onyx_black)
                    )

                    Text(
                        text = "Riwayat Penjualan" ,
                        fontSize = 14.sp ,
                        fontWeight = FontWeight.Normal,
                        color = colorResource(id = R.color.onyx_black_semi_transparent)
                    )
                }

                Row(
                    modifier
                        .fillMaxWidth()
                        .padding(horizontal = 34.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Text(
                            text = "0" ,
                            fontSize = 24.sp ,
                            fontWeight = FontWeight.Normal,
                            color = colorResource(id = R.color.onyx_black)
                        )
                        
                        Text(
                            text = "Perlu Dikirim" ,
                            fontSize = 12.sp ,
                            fontWeight = FontWeight.Normal,
                            color = colorResource(id = R.color.onyx_black_semi_transparent)
                        )
                    }

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Text(
                            text = "0" ,
                            fontSize = 24.sp ,
                            fontWeight = FontWeight.Normal,
                            color = colorResource(id = R.color.onyx_black)
                        )

                        Text(
                            text = "Pembatalan" ,
                            fontSize = 12.sp ,
                            fontWeight = FontWeight.Normal,
                            color = colorResource(id = R.color.onyx_black_semi_transparent)
                        )
                    }

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Text(
                            text = "0" ,
                            fontSize = 24.sp ,
                            fontWeight = FontWeight.Normal,
                            color = colorResource(id = R.color.onyx_black)
                        )

                        Text(
                            text = "Pengembalian" ,
                            fontSize = 12.sp ,
                            fontWeight = FontWeight.Normal,
                            color = colorResource(id = R.color.onyx_black_semi_transparent)
                        )
                    }
                }
            }
        }

        Surface(
            tonalElevation = 4.dp,
            shadowElevation = 4.dp
        ) {
            Column(
                modifier
                    .fillMaxWidth()
                    .height(176.dp)
                    .background(Color.White)
                    .padding(horizontal = 24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Row(
                    modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        modifier
                            .width(98.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Button(
                            onClick = { /*TODO*/ },
                            shape = RoundedCornerShape(8.dp),
                            contentPadding = PaddingValues(2.dp) ,
                            modifier = Modifier.size(40.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(id = R.color.ocean_boat_blue)
                            )
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_product) ,
                                contentDescription = "ic product",
                                tint = Color.White,
                                modifier = Modifier
                                    .size(24.dp)
                            )
                        }

                        Text(
                            text = "Product" ,
                            fontSize = 12.sp ,
                            fontWeight = FontWeight.Normal,
                            color = colorResource(id = R.color.onyx_black)
                        )
                    }

                    Column(
                        modifier
                            .width(98.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Button(
                            onClick = { /*TODO*/ },
                            shape = RoundedCornerShape(8.dp),
                            contentPadding = PaddingValues(2.dp) ,
                            modifier = Modifier.size(40.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(id = R.color.ocean_boat_blue)
                            )
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_keuangan) ,
                                contentDescription = "ic keuangan",
                                tint = Color.White,
                                modifier = Modifier
                                    .size(24.dp)
                            )
                        }

                        Text(
                            text = "Keuangan" ,
                            fontSize = 12.sp ,
                            fontWeight = FontWeight.Normal,
                            color = colorResource(id = R.color.onyx_black)
                        )
                    }

                    Column(
                        modifier
                            .width(98.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Button(
                            onClick = { /*TODO*/ },
                            shape = RoundedCornerShape(8.dp),
                            contentPadding = PaddingValues(2.dp) ,
                            modifier = Modifier.size(40.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(id = R.color.ocean_boat_blue)
                            )
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_performa_toko) ,
                                contentDescription = "ic performa toko",
                                tint = Color.White,
                                modifier = Modifier
                                    .size(24.dp)
                            )
                        }

                        Text(
                            text = "Performa Toko" ,
                            fontSize = 12.sp ,
                            fontWeight = FontWeight.Normal,
                            color = colorResource(id = R.color.onyx_black)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        modifier
                            .width(98.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Button(
                            onClick = { /*TODO*/ },
                            shape = RoundedCornerShape(8.dp),
                            contentPadding = PaddingValues(2.dp) ,
                            modifier = Modifier.size(40.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(id = R.color.ocean_boat_blue)
                            )
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_promosi_toko) ,
                                contentDescription = "ic promosi toko",
                                tint = Color.White,
                                modifier = Modifier
                                    .size(24.dp)
                            )
                        }

                        Text(
                            text = "Promosi Toko" ,
                            fontSize = 12.sp ,
                            fontWeight = FontWeight.Normal,
                            color = colorResource(id = R.color.onyx_black)
                        )
                    }

                    Column(
                        modifier
                            .width(98.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Button(
                            onClick = { /*TODO*/ },
                            shape = RoundedCornerShape(8.dp),
                            contentPadding = PaddingValues(2.dp) ,
                            modifier = Modifier.size(40.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(id = R.color.ocean_boat_blue)
                            )
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_perogram_penjualan) ,
                                contentDescription = "ic perogram penjualan",
                                tint = Color.White,
                                modifier = Modifier
                                    .size(24.dp)
                            )
                        }

                        Text(
                            text = "Program Pejualan" ,
                            fontSize = 12.sp ,
                            fontWeight = FontWeight.Normal,
                            color = colorResource(id = R.color.onyx_black)
                        )
                    }

                    Column(
                        modifier
                            .width(98.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Button(
                            onClick = { /*TODO*/ },
                            shape = RoundedCornerShape(8.dp),
                            contentPadding = PaddingValues(2.dp) ,
                            modifier = Modifier.size(40.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(id = R.color.ocean_boat_blue)
                            )
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_pusat_bantuan) ,
                                contentDescription = "ic pusat bantuan",
                                tint = Color.White,
                                modifier = Modifier
                                    .size(24.dp)
                            )
                        }

                        Text(
                            text = "Pusat Bantuan" ,
                            fontSize = 12.sp ,
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
    MyMarketScreen()
}