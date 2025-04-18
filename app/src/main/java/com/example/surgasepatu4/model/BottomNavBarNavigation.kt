package com.example.surgasepatu4.model

import com.example.surgasepatu4.R

sealed class BottomNavBarNavigation (
    val route: String,
    val title: String,
    val icon: Int
) {
    data object Home: BottomNavBarNavigation("home", "Home", R.drawable.ic_home)
    data object Cart: BottomNavBarNavigation("cart", "Cart", R.drawable.ic_cart)
    data object History: BottomNavBarNavigation("history", "History", R.drawable.ic_history)
    data object Profile: BottomNavBarNavigation("profile", "Profile", R.drawable.ic_profile)
}