package com.example.surgasepatu4.viewModel

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.surgasepatu4.model.Product
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlin.math.log

class ProductItemViewModel : ViewModel() {
    private val dbRef = FirebaseDatabase.getInstance().getReference("add_product")

    private val _productItem = mutableStateListOf<Product>()
    val productItem: List<Product> get() = _productItem

    init {
        fetchProductItem()
    }

    private fun fetchProductItem() {
        dbRef.addValueEventListener(object :ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                _productItem.clear()
                for (productItemSnapshot in snapshot.children) {
                    val product = productItemSnapshot.getValue(Product::class.java)
                    product?.let {
                        _productItem.add(it)
                    }
                }
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("fetchProductItem", "Error ${error.message}")
            }
        })
    }
}