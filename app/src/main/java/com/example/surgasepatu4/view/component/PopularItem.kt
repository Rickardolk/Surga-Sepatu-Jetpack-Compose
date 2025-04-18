package com.example.surgasepatu4.view.component

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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import com.example.surgasepatu4.viewModel.PopularItemViewModel
import kotlin.math.round

@Composable
fun PopularItem(
    modifier: Modifier = Modifier,
    popularItemViewModel: PopularItemViewModel = viewModel()
) {
    val products = popularItemViewModel.productList

    LazyRow(
        modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        items(products.size) { index ->
            val product = products[index]
            Card(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(22.dp),
                modifier = Modifier.padding(bottom = 16.dp).padding(start = 16.dp),
                elevation = CardDefaults.elevatedCardElevation(
                    defaultElevation = 16.dp
                )
            ) {
                Box(
                    modifier
                        .height(398.dp)
                        .width(258.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.shoe_image) ,
                        contentDescription = "popular items",
                        contentScale = ContentScale.Crop
                    )

                    Column(
                        modifier
                            .fillMaxSize()
                            .padding(horizontal = 8.dp , vertical = 16.dp)
                    ) {
                        Column(
                            modifier
                                .fillMaxWidth(),
                            horizontalAlignment = Alignment.End
                        ) {
                            Button(
                                onClick = { /*TODO*/ },
                                shape = CircleShape,
                                modifier = Modifier.size(40.dp),
                                contentPadding = PaddingValues(0.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = colorResource(id = R.color.onyx_black_semi_transparent)
                                )
                            ) {
                                Image(
                                    imageVector = Icons.Default.FavoriteBorder ,
                                    contentDescription = "ic favorite",
                                    colorFilter = ColorFilter.tint(Color.White),
                                    modifier = Modifier.size(28.dp)
                                )
                            }
                        }

                        Column(
                            modifier
                                .fillMaxHeight(),
                            verticalArrangement = Arrangement.Bottom
                        ) {
                            Column(
                                modifier
                                    .background(
                                        shape = RoundedCornerShape(8.dp) ,
                                        color = colorResource(id = R.color.onyx_black_semi_transparent)
                                    )
                                    .padding(8.dp)
                            ) {
                                Text(
                                    text = product.productName,
                                    fontSize = 14.sp ,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color.White
                                )

                                Spacer(modifier = Modifier.height(8.dp))
                                Row(
                                    modifier
                                        .fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                                    ) {
                                        Icon(
                                            painter = painterResource(id = R.drawable.ic_price) ,
                                            contentDescription = "ic price",
                                            tint = Color.White,
                                            modifier = Modifier.size(12.dp)
                                        )

                                        Text(
                                            text = product.productPrice,
                                            fontSize = 12.sp,
                                            color = Color.White
                                        )
                                    }

                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.spacedBy(4.dp)
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Star ,
                                            contentDescription = "ic rating",
                                            modifier = Modifier.size(14.dp),
                                            tint = Color.White
                                        )

                                        Text(
                                            text = "5.0" ,
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
        }
    }

}

@Preview
@Composable
private fun view() {
    PopularItem()
}