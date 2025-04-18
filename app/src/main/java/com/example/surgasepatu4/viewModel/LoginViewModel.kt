package com.example.surgasepatu4.viewModel

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import com.example.surgasepatu4.model.Preferences.saveLoginSession
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel() {
    private val authRef = FirebaseAuth.getInstance()

    fun login(
        email: String,
        password: String,
        context: Context,
        navController: NavController
    ) {
        viewModelScope.launch {
            if (email.isNotEmpty() && password.isNotEmpty()) {
                authRef.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener { task->
                        if (task.isSuccessful) {
                            navController.navigate("home")
                            saveLoginSession(email, context)
                            Toast.makeText(
                                context,
                                "Login berhasil",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
                    .addOnFailureListener {
                        Toast.makeText(
                            context,
                            "Email atau password salah",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
            } else {
                Toast.makeText(
                    context,
                    "Kolom tidak boleh kosong",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}