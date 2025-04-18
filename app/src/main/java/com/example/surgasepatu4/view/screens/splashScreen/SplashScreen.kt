package com.example.surgasepatu4.view.screens.splashScreen

import android.app.Activity
import android.content.Intent
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.surgasepatu4.MainActivity
import com.example.surgasepatu4.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen() {
    val context = LocalContext.current
    var startActivity by remember { mutableStateOf(false) }

    val alphaAnim = animateFloatAsState(
        targetValue = if (startActivity) 1f else 0f,
        animationSpec = androidx.compose.animation.core.tween(durationMillis = 1000),
        label = ""
    )

    LaunchedEffect(key1 = true) {
        startActivity = true
        delay(3000)
        context.startActivity(Intent(context, MainActivity::class.java))
        (context as? Activity)?.finish()
    }


    Splash(alpha = alphaAnim.value)

}

@Composable
fun Splash(
    modifier: Modifier = Modifier,
    alpha: Float
) {
    Box(
        modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        colorResource(id = R.color.ocean_boat_blue) ,
                        colorResource(id = R.color.rich_black)
                    )
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_white_text),
            contentDescription = "logo",
            modifier
                .size(210.dp)
                .alpha(alpha)
        )
    }
}