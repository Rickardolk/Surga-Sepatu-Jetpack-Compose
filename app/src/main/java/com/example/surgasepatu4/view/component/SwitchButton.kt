package com.example.surgasepatu4.view.component

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.surgasepatu4.R

@Composable
fun SwitchButton(
//    modifier: Modifier = Modifier
) {
    var isChecked by remember { mutableStateOf(false) }

    Switch(
        checked =  isChecked,
        onCheckedChange = {isChecked = it},
        colors = SwitchDefaults.colors(
            checkedThumbColor = Color.White,
            checkedBorderColor = colorResource(id = R.color.ocean_boat_blue),
            checkedTrackColor = colorResource(id = R.color.ocean_boat_blue),
            uncheckedThumbColor = Color.White,
            uncheckedBorderColor = colorResource(id = R.color.old_silver),
            uncheckedTrackColor = colorResource(id = R.color.old_silver),
        )
    )

}

@Preview
@Composable
private fun view() {
    SwitchButton()
}