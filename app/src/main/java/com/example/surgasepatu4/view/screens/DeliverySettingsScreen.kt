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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
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
import com.example.surgasepatu4.R
import com.example.surgasepatu4.view.component.SwitchButton

@Composable
fun DeliverySettingsScreen(
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
                Icon(
                    imageVector = Icons.Default.ArrowBack ,
                    contentDescription = "ic arrow back",
                    tint = colorResource(id = R.color.ocean_boat_blue),
                    modifier = Modifier
                        .align(alignment = Alignment.CenterStart)
                        .padding(start = 16.dp)
                        .size(32.dp)
                )

                Text(
                    text = "Pengaturan Jasa Kirim" ,
                    fontSize = 16.sp ,
                    fontWeight = FontWeight.Medium,
                    color = colorResource(id = R.color.onyx_black),
                    modifier = Modifier.align(alignment = Alignment.Center)
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
                text = "Pilih Jasa Pengiriman" ,
                fontSize = 14.sp ,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.onyx_black)
            )

            Spacer(modifier = Modifier.height(4.dp))
            Surface(
                tonalElevation = 4.dp,
                shadowElevation = 4.dp,
                shape = RoundedCornerShape(16.dp),
                color = Color.White
            ) {
                Column(
                    modifier
                        .fillMaxWidth()
                        .height(344.dp)
                        .padding(vertical = 8.dp)
                        .padding(horizontal = 14.dp) ,
                    verticalArrangement = Arrangement.SpaceAround
                ) {
                    Text(
                        text = "Regular (Cashless)" ,
                        fontSize = 14.sp ,
                        fontWeight = FontWeight.SemiBold,
                        color = colorResource(id = R.color.onyx_black)
                    )

                    Spacer(modifier = Modifier.height(11.dp))
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
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Aktifkan COD" ,
                            fontSize = 14.sp ,
                            fontWeight = FontWeight.Medium,
                            color = colorResource(id = R.color.onyx_black_semi_transparent)
                        )

                        SwitchButton()
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
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Anteraja Reguler" ,
                            fontSize = 14.sp ,
                            fontWeight = FontWeight.Medium,
                            color = colorResource(id = R.color.onyx_black_semi_transparent)
                        )

                        SwitchButton()
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
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "SiCepat REG" ,
                            fontSize = 14.sp ,
                            fontWeight = FontWeight.Medium,
                            color = colorResource(id = R.color.onyx_black_semi_transparent)
                        )

                        SwitchButton()
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
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Ninja Xpress" ,
                            fontSize = 14.sp ,
                            fontWeight = FontWeight.Medium,
                            color = colorResource(id = R.color.onyx_black_semi_transparent)
                        )

                        SwitchButton()
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
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "J&T Express" ,
                            fontSize = 14.sp ,
                            fontWeight = FontWeight.Medium,
                            color = colorResource(id = R.color.onyx_black_semi_transparent)
                        )

                        SwitchButton()
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
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "JNE Express" ,
                            fontSize = 14.sp ,
                            fontWeight = FontWeight.Medium,
                            color = colorResource(id = R.color.onyx_black_semi_transparent)
                        )

                        SwitchButton()
                    }
                }
            }
        }

        Column(
            modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Surface(
                tonalElevation = 4.dp,
                shadowElevation = 4.dp,
                shape = RoundedCornerShape(16.dp),
                color = Color.White
            ) {
                Column(
                    modifier
                        .fillMaxWidth()
                        .height(240.dp)
                        .padding(vertical = 8.dp)
                        .padding(horizontal = 14.dp) ,
                    verticalArrangement = Arrangement.SpaceAround
                ) {
                    Text(
                        text = "Kargo" ,
                        fontSize = 14.sp ,
                        fontWeight = FontWeight.SemiBold,
                        color = colorResource(id = R.color.onyx_black)
                    )

                    Spacer(modifier = Modifier.height(11.dp))
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
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Xpress Kargo" ,
                            fontSize = 14.sp ,
                            fontWeight = FontWeight.Medium,
                            color = colorResource(id = R.color.onyx_black_semi_transparent)
                        )

                        SwitchButton()
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
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Sentral Cargo" ,
                            fontSize = 14.sp ,
                            fontWeight = FontWeight.Medium,
                            color = colorResource(id = R.color.onyx_black_semi_transparent)
                        )

                        SwitchButton()
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
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Lion Parcel Cargo" ,
                            fontSize = 14.sp ,
                            fontWeight = FontWeight.Medium,
                            color = colorResource(id = R.color.onyx_black_semi_transparent)
                        )

                        SwitchButton()
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
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "JNE Trucking (JTR)" ,
                            fontSize = 14.sp ,
                            fontWeight = FontWeight.Medium,
                            color = colorResource(id = R.color.onyx_black_semi_transparent)
                        )

                        SwitchButton()
                    }
                }
            }
        }

        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = { /*TODO*/ },
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
    DeliverySettingsScreen()
}