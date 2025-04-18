package com.example.surgasepatu4.viewModel

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.example.surgasepatu4.model.Product
import com.google.firebase.database.FirebaseDatabase

class AddProductViewModel : ViewModel() {
    private val dbRef = FirebaseDatabase.getInstance().getReference("add_product")

    fun addProduct(
        brandName: String,
        productName: String,
        descProduct: String,
        productPrice: String,
        productSize: Long,
        context: Context
    ) {
        val productId = dbRef.push().key!!
        if (
            brandName.isNotEmpty() &&
            productName.isNotEmpty() &&
            descProduct.isNotEmpty() &&
            productPrice.isNotEmpty() &&
            productSize != 0L
        ) {
            val product = Product(
                brandName = brandName,
                productName = productName,
                descProduct = descProduct,
                productPrice = productPrice,
                productSize = productSize
            )

            dbRef.child(productId).setValue(product)
                .addOnSuccessListener {
                    Toast.makeText(
                        context,
                        "Disimpan",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                .addOnFailureListener {
                    Toast.makeText(
                        context,
                        "Gagal menyimpan",
                        Toast.LENGTH_SHORT
                    ).show()
                }
        } else {
            Toast.makeText(
                context,
                "Kolom tidak boleh kosong" ,
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}