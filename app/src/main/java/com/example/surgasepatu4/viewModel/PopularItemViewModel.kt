package com.example.surgasepatu4.viewModel

import android.util.Log
import androidx.compose.animation.core.snap
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.surgasepatu4.model.Product
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class PopularItemViewModel : ViewModel() {
    private val dbRef = FirebaseDatabase.getInstance().getReference("add_product")

    private val _productList = mutableStateListOf<Product>()
    val productList: List<Product> get() = _productList

    init {
        fetchProducts()
    }

    private fun fetchProducts() {
        dbRef.addValueEventListener(object :ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                _productList.clear()
                for (productSnapshot in snapshot.children) {
                    val product = productSnapshot.getValue(Product::class.java)
                    product?.let {
                        _productList.add(it)
                    }
                }
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("fetchProducts", "Error: ${error.message}")
            }
        })
    }
}