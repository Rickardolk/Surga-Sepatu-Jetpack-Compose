package com.example.surgasepatu4.view.screens.menu

import android.content.Context
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.surgasepatu4.R
import com.example.surgasepatu4.view.component.PopularButton
import com.example.surgasepatu4.view.component.PopularItem
import com.example.surgasepatu4.view.component.Search
import com.example.surgasepatu4.viewModel.HomeViewModel

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    homeViewModel: HomeViewModel = viewModel(),
    navController: NavController,
    context: Context
) {
    val username by homeViewModel.username
    var selectedCategory by remember { mutableStateOf("Formal") }

    Box(
        modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Column(
            modifier
                .fillMaxWidth()
                .padding(top = 40.dp)
        ) {
            Row(
                modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Text(
                        text = "Hi, $username👋🏻" ,
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Medium,
                        color = colorResource(id = R.color.rich_black)
                    )

                    Text(
                        text = "Elevate your style with every step!" ,
                        fontSize = 14.sp,
                        color = colorResource(id = R.color.old_silver)
                    )
                }

                Button(
                    onClick = {
                        navController.navigate("profile")
                    },
                    shape = CircleShape,
                    modifier = Modifier
                        .size(50.dp)
                        .border(
                            width = 3.dp ,
                            color = colorResource(id = R.color.ocean_boat_blue) ,
                            shape = CircleShape
                        ),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.person) ,
                        contentDescription = "ic person",
                        contentScale = ContentScale.Crop
                    )
                }
            }


            Spacer(modifier = Modifier.height(16.dp))
            Search(modifier = Modifier.padding(horizontal = 24.dp))

            Row(
                modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
                    .padding(horizontal = 24.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Popular" ,
                    fontSize = 20.sp ,
                    fontWeight = FontWeight.Medium,
                    color = colorResource(id = R.color.rich_black)
                )

                TextButton(
                    onClick = { /*TODO*/ }
                ) {
                    Text(
                        text = "View all" ,
                        fontSize = 12.sp,
                        color = colorResource(id = R.color.rich_black)
                    )
                }
            }

            PopularButton(onCategorySelected = { selectedCategory = it })
            PopularItem()
        }
    }
}

@Preview
@Composable
private fun view() {
    val navController = rememberNavController()
    val context = LocalContext.current

    HomeScreen(navController = navController , context = context)
}