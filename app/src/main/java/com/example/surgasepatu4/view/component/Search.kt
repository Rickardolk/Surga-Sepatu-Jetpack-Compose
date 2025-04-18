package com.example.surgasepatu4.view.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.surgasepatu4.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Search(
    modifier: Modifier = Modifier
) {
    var searchQuery by remember { mutableStateOf("") }
    val items = listOf("a", "a1", "a2", "a3", "b", "c", "d")
    var active by remember { mutableStateOf(false) }
    val filteredItems = items.filter { it.contains(searchQuery, ignoreCase = true) }

    Column(
        modifier
            .fillMaxWidth()
    ) {
        SearchBar(
            query = searchQuery,
            onQueryChange = {searchQuery =it},
            onSearch = {active = false},
            active = active,
            onActiveChange = {active = it},
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text(text = "Search")},
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search ,
                    contentDescription = "ic search"
                )
            },
            colors = SearchBarDefaults.colors(
                containerColor = colorResource(id = R.color.bright_gray)
            )
        ) {
            if (searchQuery.isNotEmpty()) {
                if (filteredItems.isNotEmpty()) {
                    LazyColumn {
                        items(filteredItems.size) { index ->
                            Text(
                                text = filteredItems[index] ,
                                modifier.padding(16.dp)
                            )
                        }
                    }
                } else {
                    Text(
                        text = "Not Found" ,
                        modifier.padding(16.dp)
                    )
                }
            } else {
                Text(
                    text = "Type to search" ,
                    modifier.padding(16.dp)
                )
            }
        }
    }
}

@Preview
@Composable
private fun view() {
    Search()
}