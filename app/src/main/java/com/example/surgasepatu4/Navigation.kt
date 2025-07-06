package com.example.surgasepatu4

import android.app.Activity
import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.surgasepatu4.model.BottomNavBarNavigation
import com.example.surgasepatu4.model.Preferences.isUserLoggedIn
import com.example.surgasepatu4.view.component.BottomNavBar
import com.example.surgasepatu4.view.screens.menu.CartScreen
import com.example.surgasepatu4.view.screens.menu.HistoryScreen
import com.example.surgasepatu4.view.screens.menu.HomeScreen
import com.example.surgasepatu4.view.screens.ListItemScreen
import com.example.surgasepatu4.view.screens.LoginScreen
import com.example.surgasepatu4.view.screens.menu.ProfileScreen
import com.example.surgasepatu4.view.screens.RegisterScreen
import com.example.surgasepatu4.view.screens.ResetPasswordScreen
import com.example.surgasepatu4.view.screens.startSelling.AddProductScreen
import com.example.surgasepatu4.view.screens.startSelling.DeliverySettingsScreen
import com.example.surgasepatu4.view.screens.startSelling.MarketAddressScreen
import com.example.surgasepatu4.view.screens.startSelling.MarketInformationScreen
import com.example.surgasepatu4.view.screens.startSelling.MyMarketScreen
import com.example.surgasepatu4.view.screens.startSelling.MyProductScreen
import com.example.surgasepatu4.view.screens.startSelling.StartSellingScreen
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

@Composable
fun Navigation() {
    val context = LocalContext.current
    val navController = rememberNavController()
    val currentRoute = navController.currentBackStackEntryAsState()?.value?.destination?.route
    var backPressed by remember { mutableStateOf(false) }
    val coroutineScope = rememberCoroutineScope()
    var resetBackPressed by remember { mutableStateOf<Job?>(null) }

    val startDestination = remember {
        if (isUserLoggedIn(context)) "home"
        else "login"
    }

    BackHandler(
        enabled = currentRoute == BottomNavBarNavigation.Home.route
    ) {
        if (backPressed) {
            resetBackPressed?.cancel()
            (context as Activity).finish()
        } else {
            backPressed = true
            Toast.makeText(
                context,
                "Ketuk lagi untuk keluar",
                Toast.LENGTH_SHORT
            ).show()

            resetBackPressed = coroutineScope.launch {
                kotlinx.coroutines.delay(3000)
                backPressed = false
            }
        }
    }


    Scaffold(
        bottomBar = {
            if (currentRoute in listOf(
                    BottomNavBarNavigation.Home.route,
                    BottomNavBarNavigation.Cart.route,
                    BottomNavBarNavigation.History.route,
                    BottomNavBarNavigation.Profile.route)
            )
                BottomNavBar(navController)
        }
    ) { innerPadding ->
        NavHost(
            navController =  navController,
            startDestination = startDestination,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable("login") {
                LoginScreen(
                    navController = navController,
                    context = context
                )
            }

            composable("register") {
                RegisterScreen(
                    navController = navController,
                    context = context
                )
            }

            composable("reset password") {
                ResetPasswordScreen(
                    navController = navController,
                    context = context
                )
            }

            composable("home") {
                HomeScreen(
                    context = context,
                    navController = navController
                )
            }

            composable("cart") {
                CartScreen(
                    navController = navController
                )
            }

            composable("history") {
                HistoryScreen()
            }

            composable("profile") {
                ProfileScreen(
                    navController = navController,
                    context = context
                )
            }

            composable("list item") {
                ListItemScreen(
                    navController = navController
                )
            }

            composable("add product") {
                StartSellingScreen(
                    navController = navController
                )
            }

            composable("market information screen") {
                MarketInformationScreen(
                    navController = navController
                )
            }

            composable("market address screen") {
                MarketAddressScreen(
                    navController = navController
                )
            }

            composable("delivery settings screen") {
                DeliverySettingsScreen(
                    navController = navController
                )
            }

            composable("my market screen") {
                MyMarketScreen(
                    navController = navController
                )
            }

            composable("my product screen") {
                MyProductScreen(
                    navController = navController
                )
            }
            
            composable("add product screen") {  
                AddProductScreen(navController = navController)
            }

        }
    }
}