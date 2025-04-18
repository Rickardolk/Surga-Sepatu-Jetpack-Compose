package com.example.surgasepatu4.view.component

import android.content.Context
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.surgasepatu4.R
import com.example.surgasepatu4.model.Preferences.logout

@Composable
fun LogoutButton(
    navController: NavController,
    context: Context
) {

    var showExitDialog by remember { mutableStateOf(false) }
    Button(
        onClick = {
            showExitDialog = true
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 6.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(id = R.color.ocean_boat_blue)
        ),
        elevation = ButtonDefaults.elevatedButtonElevation(
            defaultElevation = 4.dp
        )
    ) {
        Text(
            text = "Logout" ,
            fontSize = 16.sp ,
            fontWeight = FontWeight.Medium ,
            color = Color.White
        )

    }

    if (showExitDialog) {
        AlertDialog(
            onDismissRequest = { showExitDialog } ,
            title = { Text(text = "Konfirmasi")},
            text = { Text(text = "Apakah anda ingin keluar?")},
            confirmButton = {
                Button(
                    onClick = {
                        showExitDialog = false
                        logout(context)
                        navController.navigate("login")
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.ocean_boat_blue)
                    )
                ) {
                    Text(text = "Ya", color = Color.White)
                }
            },
            dismissButton = {
                Button(
                    onClick = { showExitDialog = false },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.ocean_boat_blue)
                    )
                ) {
                    Text(text = "Tidak", color = Color.White)
                }
            }
        )
    }
}

@Preview
@Composable
private fun view() {
    val context = LocalContext.current
    val navController = rememberNavController()
    LogoutButton(navController =  navController, context = context)
}