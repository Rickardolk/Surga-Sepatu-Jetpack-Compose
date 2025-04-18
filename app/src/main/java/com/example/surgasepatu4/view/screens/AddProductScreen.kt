package com.example.surgasepatu4.view.screens

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.surgasepatu4.R
import com.example.surgasepatu4.viewModel.AddProductViewModel

@Composable
fun AddProductScreen(
    modifier: Modifier = Modifier,
    addProductViewModel: AddProductViewModel = viewModel(),
    context: Context
) {
    var brandName by remember { mutableStateOf("") }
    var productName by remember { mutableStateOf("") }
    var descProduct by remember { mutableStateOf("") }
    var productPrice by remember { mutableStateOf("") }
    var productSize by remember { mutableStateOf("") }
    val sizeValue = productSize.toLongOrNull() ?: 0L

    Box(
        modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 24.dp)
    ) {
        Column(
            modifier
                .fillMaxWidth()
                .padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Add Product" ,
                fontSize = 16.sp ,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.onyx_black)
            )

            Spacer(modifier = Modifier.height(40.dp))
            OutlinedTextField(
                value = brandName,
                onValueChange = {brandName = it},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                label = { Text(text = "Brand name")},
                maxLines = 1,
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = colorResource(id = R.color.ocean_boat_blue),
                    focusedLabelColor = colorResource(id = R.color.ocean_boat_blue),
                    cursorColor = colorResource(id = R.color.ocean_boat_blue)
                )
            )

            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = productName,
                onValueChange = {productName = it},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                label = { Text(text = "Product name")},
                maxLines = 1,
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = colorResource(id = R.color.ocean_boat_blue),
                    focusedLabelColor = colorResource(id = R.color.ocean_boat_blue),
                    cursorColor = colorResource(id = R.color.ocean_boat_blue)
                )
            )

            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = descProduct,
                onValueChange = {descProduct = it},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                label = { Text(text = "Description")},
                maxLines = 1,
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = colorResource(id = R.color.ocean_boat_blue),
                    focusedLabelColor = colorResource(id = R.color.ocean_boat_blue),
                    cursorColor = colorResource(id = R.color.ocean_boat_blue)
                )
            )

            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = productPrice,
                onValueChange = {productPrice = it},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                label = { Text(text = "Price")},
                maxLines = 1,
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = colorResource(id = R.color.ocean_boat_blue),
                    focusedLabelColor = colorResource(id = R.color.ocean_boat_blue),
                    cursorColor = colorResource(id = R.color.ocean_boat_blue)
                )
            )

            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = productSize,
                onValueChange = {productSize = it},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                label = { Text(text = "Size")},
                maxLines = 1,
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = colorResource(id = R.color.ocean_boat_blue),
                    focusedLabelColor = colorResource(id = R.color.ocean_boat_blue),
                    cursorColor = colorResource(id = R.color.ocean_boat_blue)
                )
            )


            Spacer(modifier = Modifier.height(24.dp))
            Button(
                onClick = {
                    addProductViewModel.addProduct(brandName, productName, descProduct, productPrice, sizeValue, context)
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.ocean_boat_blue)
                )
            ) {
                Text(
                    text = "Save" ,
                    fontSize = 14.sp ,
                    fontWeight = FontWeight.Medium,
                    color = Color.White
                )
            }
        }
    }
}