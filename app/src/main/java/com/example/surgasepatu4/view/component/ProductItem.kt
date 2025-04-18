package com.example.surgasepatu4.view.component

import android.widget.Button
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.surgasepatu4.R
import com.example.surgasepatu4.viewModel.ProductItemViewModel

@Composable
fun ProductItem(
    modifier: Modifier = Modifier,
    productItemViewModel: ProductItemViewModel = viewModel()
) {
    val products = productItemViewModel.productItem

    LazyColumn(
        modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(products.size) { index ->
            val product = products[index]
            Box(
                modifier
                    .padding(bottom = 16.dp)
            ) {
                Column(
                    modifier
                        .fillMaxWidth()
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_market) ,
                            contentDescription = "ic market",
                            modifier = Modifier.size(14.dp),
                            tint = colorResource(id = R.color.onyx_black)
                        )

                        Text(
                            text = product.brandName ,
                            fontSize = 14.sp ,
                            fontWeight = FontWeight.Medium,
                            color = colorResource(id = R.color.onyx_black)
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        modifier
                            .fillMaxWidth()
                    ) {
                        Card(
                            modifier
                                .height(120.dp)
                                .width(140.dp) ,
                            shape = RoundedCornerShape(20.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize(),
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.image_product) ,
                                    contentDescription = "image product",
                                    contentScale = ContentScale.Crop
                                )

                                Column(
                                    modifier
                                        .fillMaxSize(),
                                    horizontalAlignment = Alignment.End,
                                    verticalArrangement = Arrangement.Bottom
                                ) {
                                    Row(
                                        modifier
                                            .padding(8.dp),
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.spacedBy(4.dp)
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Star ,
                                            contentDescription = "ic rating",
                                            modifier.size(16.dp),
                                            tint = colorResource(id = R.color.onyx_black)
                                        )

                                        Text(
                                            text = "5.0" ,
                                            fontSize = 12.sp,
                                            color = colorResource(id = R.color.onyx_black)
                                        )
                                    }
                                }
                            }
                        }


                        Column(
                            modifier
                                .padding(horizontal = 16.dp),
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Text(
                                text = product.productName ,
                                fontSize = 14.sp ,
                                fontWeight = FontWeight.Medium,
                                color = colorResource(id = R.color.onyx_black)
                            )

                            Row(
                                modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.ic_size) ,
                                        contentDescription = "ic size",
                                        modifier = Modifier.size(20.dp),
                                        tint = colorResource(id = R.color.onyx_black)
                                    )

                                    Text(
                                        text = "${product.productSize}" ,
                                        fontSize = 14.sp,
                                        color = colorResource(id = R.color.onyx_black)
                                    )
                                }

                                Text(
                                    text = "pre-order" ,
                                    fontSize = 14.sp ,
                                    color = colorResource(id = R.color.onyx_black)
                                )
                            }

                            Row(
                                modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(8.dp)
                                ) {
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                                    ) {
                                        Icon(
                                            painter = painterResource(id = R.drawable.ic_price) ,
                                            contentDescription = "ic price",
                                            modifier = Modifier.size(16.dp),
                                            tint = Color.Red
                                        )

                                        Text(
                                            text =  "Rp 999.000.00",
                                            fontSize = 14.sp,
                                            color = Color.Red
                                        )
                                    }


                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                                    ) {
                                        Icon(
                                            painter = painterResource(id = R.drawable.ic_price) ,
                                            contentDescription = "ic price",
                                            modifier = Modifier.size(16.dp),
                                            tint = colorResource(id = R.color.onyx_black)
                                        )

                                        Text(
                                            text = product.productPrice ,
                                            fontSize = 14.sp,
                                            color = colorResource(id = R.color.onyx_black)
                                        )
                                    }
                                }

                                Button(
                                    onClick = { /*TODO*/ },
                                    contentPadding = PaddingValues(horizontal = 2.dp, vertical = 0.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color.Transparent
                                    ),
                                    modifier = Modifier
                                        .border(
                                            width = 2.dp ,
                                            color = colorResource(id = R.color.ocean_boat_blue) ,
                                            shape = RoundedCornerShape(16.dp)
                                        )
                                        .height(40.dp)
                                ) {
                                    Text(
                                        text = "12%" ,
                                        fontSize = 14.sp,
                                        color = colorResource(id = R.color.onyx_black)
                                    )
                                }



                            }
                        }
                    }



                }
            }
        }
    }
}


@Preview (showBackground = true)
@Composable
private fun view() {
    ProductItem()
}