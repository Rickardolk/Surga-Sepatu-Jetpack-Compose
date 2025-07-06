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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import com.example.surgasepatu4.R
import com.example.surgasepatu4.view.component.MyProductButton
import com.example.surgasepatu4.view.component.MyProductItem

@Composable
fun MyProductScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    val buttonCategories = listOf("Baru", "Stok")
    var selectedButton by remember { mutableIntStateOf(0) }

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
                    IconButton(
                        onClick = {
                            navController.popBackStack()
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack ,
                            contentDescription = "icon arrow back",
                            tint = colorResource(id = R.color.ocean_boat_blue),
                            modifier = Modifier.size(32.dp)
                        )
                    }

                    Text(
                        text = "Produk Saya" ,
                        fontSize = 16.sp ,
                        fontWeight = FontWeight.Medium,
                        color = colorResource(id = R.color.onyx_black)
                    )
                }

                Row(
                    modifier
                        .align(Alignment.CenterEnd)
                        .padding(end = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Search ,
                        contentDescription = "ic search",
                        tint = colorResource(id = R.color.ocean_boat_blue),
                        modifier = Modifier.size(24.dp)
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.ic_chat) ,
                        contentDescription = "ic chat",
                        tint = colorResource(id = R.color.ocean_boat_blue),
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        }

        MyProductButton()

        Surface(
            tonalElevation = 4.dp,
            shadowElevation = 4.dp,
            shape = RoundedCornerShape(24.dp),
            modifier = Modifier
                .padding(horizontal = 24.dp)
        ) {
            Row(
                modifier
                    .fillMaxWidth()
                    .height(34.dp)
                    .background(
                        color = Color.White ,
                        shape = RoundedCornerShape(24.dp)
                    )
                    .padding(horizontal = 58.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                buttonCategories.forEachIndexed() {index, title->
                    Button(
                        onClick = { selectedButton = index},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent
                        )
                    ) {
                        Text(
                            text = title ,
                            fontSize = 10.sp,
                            color = if (selectedButton == index) colorResource(id = R.color.ocean_boat_blue)
                                else colorResource(id = R.color.onyx_black)
                        )
                    }
                }
            }
        }

        MyProductItem()

        Text(
            text = "Tidak ada lainnya" ,
            fontSize = 10.sp,
            color = colorResource(id = R.color.onyx_black),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = {
                navController.navigate("add product screen")
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
                text = "Tambah Produk Baru" ,
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
    MyProductScreen(navController = navController )
}