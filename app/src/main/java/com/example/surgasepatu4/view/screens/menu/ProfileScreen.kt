package com.example.surgasepatu4.view.screens.menu

import android.content.Context
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.surgasepatu4.view.component.LogoutButton
import com.example.surgasepatu4.view.component.StartSellingButton

@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    context: Context
) {
    Box(
        modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column(
            modifier.fillMaxSize()
        ) {
            StartSellingButton(navController = navController)
            LogoutButton(navController = navController , context = context)
        }
    }

}

@Preview
@Composable
private fun view() {
    val context = LocalContext.current
    val navController = rememberNavController()
    ProfileScreen(
        navController = navController ,
        context = context
    )
}