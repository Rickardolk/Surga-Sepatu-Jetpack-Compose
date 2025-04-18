package com.example.surgasepatu4.view.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.surgasepatu4.model.BottomNavBarNavigation
import com.example.surgasepatu4.view.component.ProductItem
import com.example.surgasepatu4.view.component.Search

@Composable
fun ListItemScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    BackHandler {
        navController.popBackStack()
    }

    Box {
        modifier
            .fillMaxSize()
            .background(Color.White)
    }
    Column(
        modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp)
    ) {
        Search()
        Spacer(modifier = Modifier.height(24.dp))
        ProductItem()
    }

}


@Preview
@Composable
private fun view() {
    val navController = rememberNavController()
    ListItemScreen(navController = navController)
}