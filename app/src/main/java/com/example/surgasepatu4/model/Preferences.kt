package com.example.surgasepatu4.model

import android.content.Context

object Preferences {

    fun saveLoginSession(
        email: String,
        context: Context
    ) {
        val preferences = context.getSharedPreferences("user_prefs", Context.MODE_PRIVATE)
        preferences.edit()
            .putString("email", email)
            .putBoolean("is_user_logged_in", true)
            .apply()
    }

    fun isUserLoggedIn(context: Context): Boolean {
        val preferences = context.getSharedPreferences("user_prefs", Context.MODE_PRIVATE)
        return preferences.getBoolean("is_user_logged_in", false)
    }

    fun logout(context: Context) {
        val preferences = context.getSharedPreferences("users_prefs", Context.MODE_PRIVATE)
        return preferences.edit()
            .clear()
            .apply()
    }
}