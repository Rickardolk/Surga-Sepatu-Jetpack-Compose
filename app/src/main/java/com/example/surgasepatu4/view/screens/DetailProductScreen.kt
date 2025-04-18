package com.example.surgasepatu4.view.screens

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.surgasepatu4.R
import com.example.surgasepatu4.view.component.SizeCart

@Composable
fun DetailProductScreen(
    modifier: Modifier = Modifier
) {
    var selectedSizeCart by remember { mutableStateOf("38") }
    val scrollState = rememberScrollState()

    Box(
        modifier
            .fillMaxSize()
    ) {
        Column(
            modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp)
                .verticalScroll(scrollState)
        ) {
            Card(
                modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp)
                    .height(394.dp),
                elevation = CardDefaults.elevatedCardElevation(
                    defaultElevation = 20.dp
                )
            ) {
                Box(
                    modifier
                        .fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.shoe_image) ,
                        contentDescription = "shoe image",
                        contentScale = ContentScale.Crop
                    )

                    Column(
                        modifier
                            .padding(16.dp)
                            .fillMaxSize()
                    ) {
                        Row(
                            modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Button(
                                onClick = { /*TODO*/ },
                                shape = CircleShape,
                                contentPadding = PaddingValues(0.dp),
                                modifier = Modifier.size(40.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = colorResource(id = R.color.onyx_black_semi_transparent)
                                )
                            ) {
                                Icon(
                                    imageVector = Icons.Default.KeyboardArrowLeft ,
                                    contentDescription = "ic arrow left"
                                )
                            }

                            Button(
                                onClick = { /*TODO*/ },
                                shape = CircleShape,
                                contentPadding = PaddingValues(0.dp),
                                modifier = Modifier.size(40.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = colorResource(id = R.color.onyx_black_semi_transparent)
                                )
                            ) {
                                Icon(
                                    imageVector = Icons.Default.FavoriteBorder ,
                                    contentDescription = "ic arrow left"
                                )
                            }
                        }

                        Column(
                            modifier
                                .fillMaxHeight() ,
                            verticalArrangement = Arrangement.Bottom
                        ) {
                            Column(
                                modifier
                                    .fillMaxWidth()
                                    .background(
                                        color = colorResource(id = R.color.onyx_black_semi_transparent) ,
                                        shape = RoundedCornerShape(16.dp)
                                    )
                                    .padding(8.dp)
                            ) {
                                Text(
                                    text = "Ponte Nero Terra Dark Choco" ,
                                    fontSize = 16.sp,
                                    color = Color.White
                                )

                                Spacer(modifier = Modifier.height(8.dp))
                                Row(
                                    modifier
                                        .fillMaxWidth(),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceAround
                                ) {
                                    Row(
                                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Icon(
                                            painter = painterResource(id = R.drawable.ic_price) ,
                                            contentDescription = "ic price",
                                            modifier.size(16.dp),
                                            tint = Color.Red
                                        )

                                        Text(
                                            text = "Rp 458.000,00" ,
                                            fontSize = 12.sp,
                                            color = Color.Red
                                        )
                                    }

                                    Row(
                                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Icon(
                                            painter = painterResource(id = R.drawable.ic_price) ,
                                            contentDescription = "ic price",
                                            modifier.size(16.dp),
                                            tint = Color.White
                                        )

                                        Text(
                                            text = "Rp 399.000,00" ,
                                            fontSize = 12.sp,
                                            color = Color.White
                                        )
                                    }

                                    Row(
                                        horizontalArrangement = Arrangement.spacedBy(4.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Star ,
                                            contentDescription = "ic rating",
                                            modifier.size(16.dp),
                                            tint = Color.White
                                        )

                                        Text(
                                            text = "4.6" ,
                                            fontSize = 12.sp,
                                            color = Color.White
                                        )
                                    }


                                }
                            }
                        }
                    }
                }


            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(40.dp)
            ) {
                Text(
                    text = "Overview" ,
                    fontSize = 16.sp ,
                    fontWeight = FontWeight.SemiBold,
                    color = colorResource(id = R.color.onyx_black)
                )

                Text(
                    text = "Details" ,
                    fontSize = 14.sp ,
                    fontWeight = FontWeight.SemiBold ,
                    color = colorResource(id = R.color.onyx_black_semi_transparent)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))
            SizeCart(onSizeNumberSelected = {selectedSizeCart = it})
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Ponte merupakan sepatu semi formal khas brodo dengan menggunakan" +
                        " material PU yang durable dan flexible, penggunaan material mesh " +
                        "yang adem pada bagian lining memberikan kenyamanan lebih pada saat " +
                        "digunakan. Cocok digunakan untuk kamu yang ingin berpenampilan formal " +
                        "dengan harga yang terjangkau. Ponte merupakan sepatu semi formal khas brodo dengan menggunakan" +
                        "material PU yang durable dan flexible, penggunaan material mesh" +
                        "yang adem pada bagian lining memberikan kenyamanan lebih pada saat" +
                        "digunakan. Cocok digunakan untuk kamu yang ingin berpenampilan formal" +
                        "dengan harga yang terjangkau.",
                fontSize = 14.sp,
                color = colorResource(id = R.color.onyx_black),
                lineHeight = 22.sp,
                textAlign = TextAlign.Justify
            )
        }

        Column(
            modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom
        ) {
            Column(
                modifier
                    .fillMaxWidth()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent ,
                                Color.White
                            )
                        )
                    )
                    .padding(horizontal = 24.dp)
                    .padding(bottom = 34.dp , top = 60.dp)
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.ocean_boat_blue)
                    ),
                    elevation = ButtonDefaults.elevatedButtonElevation(
                        defaultElevation = 16.dp
                    )
                ) {
                    Text(
                        text = "Buy Now" ,
                        fontSize = 16.sp ,
                        fontWeight = FontWeight.SemiBold
                    )

                }
            }
        }
    }

}


@Preview (showBackground = true)
@Composable
private fun view() {
    DetailProductScreen()
}