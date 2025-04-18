package com.example.surgasepatu4.view.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
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
fun CartScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Box(
        modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Column(
            modifier
                .fillMaxWidth()
                .padding(top = 50.dp)
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Cart" ,
                fontSize = 20.sp ,
                fontWeight = FontWeight.Medium,
                color = colorResource(id = R.color.onyx_black)
            )

            Column(
                modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.End
            ) {
                Button(
                    onClick = { },
                    contentPadding = PaddingValues(),
                    modifier = Modifier
                        .size(50.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent
                    )
                ) {
                    Icon(
                        imageVector = Icons.Default.Delete ,
                        contentDescription = "ic delete",
                        tint =  colorResource(id = R.color.onyx_black)
                    )
                }
            }


            Spacer(modifier = Modifier.height(120.dp))
            Text(
                text = "Opss!" ,
                fontSize = 14.sp ,
                fontWeight = FontWeight.Medium,
                color = colorResource(id = R.color.onyx_black)
            )

            Image(
                painter = painterResource(id = R.drawable.empty_cart) ,
                contentDescription = "empty cart",
                modifier = Modifier.size(200.dp)
            )

            Text(
                text = "Your cart is empty\n" + "Need to buy something?" ,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = colorResource(id = R.color.onyx_black),
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    navController.navigate("list item")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.ocean_boat_blue)
                )
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_add_cart) ,
                        contentDescription = "ic cart"
                    )

                    Text(
                        text = "Let's see the product" ,
                        fontSize = 14.sp ,
                        fontWeight = FontWeight.Medium
                    )
                }
            }




        }
    }

}

@Preview
@Composable
private fun view() {
    val navController = rememberNavController()
    CartScreen(navController = navController)
}