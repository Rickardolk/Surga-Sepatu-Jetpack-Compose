package com.example.surgasepatu4.view.screens

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.surgasepatu4.R
import com.example.surgasepatu4.viewModel.ResetPasswordViewModel

@Composable
fun ResetPasswordScreen(
    modifier: Modifier = Modifier,
    resetPasswordViewModel: ResetPasswordViewModel = viewModel(),
    navController: NavController,
    context: Context
) {
    var email by remember { mutableStateOf("") }

    Box(
        modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
                .padding(top = 100.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_black_text) ,
                contentDescription = "logo",
                modifier.size(200.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Reset Password",
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.rich_black)
            )

            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = email,
                onValueChange = {email = it},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp) ,
                label = { Text(text = "Email") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email ,
                        contentDescription = "ic email"
                    )
                },
                maxLines = 1,
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done) ,
                colors = OutlinedTextFieldDefaults.colors(
                    focusedLeadingIconColor = colorResource(id = R.color.ocean_boat_blue) ,
                    focusedLabelColor = colorResource(id = R.color.ocean_boat_blue) ,
                    focusedBorderColor = colorResource(id = R.color.ocean_boat_blue) ,
                    unfocusedLabelColor = colorResource(id = R.color.old_silver) ,
                    unfocusedTextColor = colorResource(id = R.color.old_silver) ,
                    unfocusedBorderColor = colorResource(id = R.color.old_silver) ,
                    unfocusedLeadingIconColor = colorResource(id = R.color.old_silver) ,
                    cursorColor = colorResource(id = R.color.ocean_boat_blue)
                )
            )

            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    resetPasswordViewModel.resetPassword(email, context)
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.ocean_boat_blue)
                )
            ) {
                Text(
                    text = "Reset Password" ,
                    fontSize = 16.sp ,
                    fontWeight = FontWeight.Bold
                )
            }

            Row(
                modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                TextButton(
                    onClick = {
                        navController.navigate("login")
                    }
                ) {
                    Text(
                        text = "Back" ,
                        fontSize = 12.sp,
                        color = colorResource(id = R.color.ocean_boat_blue)
                    )
                }
            }


        }
    }

}