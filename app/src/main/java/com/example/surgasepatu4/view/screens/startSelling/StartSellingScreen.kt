package com.example.surgasepatu4.view.screens.startSelling

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
fun StartSellingScreen(
    modifier: Modifier = Modifier,
    navController : NavController
) {
    Box(
        modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier
                .padding(bottom = 24.dp)
        ) {
            Surface(
                tonalElevation = 8.dp,
                shadowElevation = 8.dp,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(54.dp),
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    IconButton(
                        onClick = {
                            navController.popBackStack()
                        },
                        modifier = Modifier
                            .align(Alignment.CenterStart)
                            .padding(start = 8.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back",
                            tint = colorResource(id = R.color.ocean_boat_blue)
                        )
                    }

                    Text(
                        text = "Selamat Datang",
                        modifier = Modifier.align(Alignment.Center),
                        fontWeight = FontWeight.Medium,
                        fontSize = 18.sp,
                        color = colorResource(id = R.color.onyx_black)
                    )
                }
            }


            Image(
                painter = painterResource(id = R.drawable.welcome_start_selling) ,
                contentDescription = "image welcome start selling",
                modifier = Modifier
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Untuk memulai berjualan, daftar sebagai\n" +
                "penjual dengna melengkapi informasi\n" +
                        "yang diperlukan.",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth(),
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = colorResource(id = R.color.onyx_black),
                lineHeight = 24.sp
            )

            Spacer(modifier = Modifier.weight(1f))
            Button(
                onClick = {
                    navController.navigate("market information screen")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(horizontal = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.ocean_boat_blue)
                )
            ) {
                Text(
                    text = "Mulai Pendaftaran",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )
            }

        }
    }
}


@Preview
@Composable
private fun view() {
    val navController = rememberNavController()
    StartSellingScreen(navController = navController)
}