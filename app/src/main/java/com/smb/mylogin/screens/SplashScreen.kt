package com.smb.mylogin.screens

import androidx.compose.animation.Animatable
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth
import com.smb.mylogin.MyLogin
import com.smb.mylogin.navigation.Navigation
import com.smb.mylogin.navigation.Screens
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@Composable
fun SplashScreen(navController: NavController) {

    //Text(text = "SplashScreen") //poner esto al principio

    LaunchedEffect(key1 = true) {
        delay(1500)

        navController.navigate(Screens.LoginScreen.name)  //poner esto al comienzo
        //si ya está logeado el usuario no necesita autenticarse de nuevo // poner esto al final
/*        if (FirebaseAuth.getInstance().currentUser?.email.isNullOrEmpty()) {
            navController.navigate(Screens.LoginScreen.name)
        } else {
            navController.navigate(Screens.HomeScreen.name) {
                // al pulsar botón atras vuelve a splash, para evitar esto sacamos
                // splash de la lista de pantallas recorridas
                popUpTo(Screens.SplashScreen.name) {
                    inclusive = true
                }
            }
        }*/
    }


    val color = MaterialTheme.colorScheme.primary
    Surface(
        modifier = Modifier
            .padding(15.dp)
            .size(330.dp),
        shape = CircleShape,
        color = Color.White,
        border = BorderStroke(width = 2.dp, color = color)
    ) {
        Column(
            modifier = Modifier.padding(1.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "My Login",
                style = MaterialTheme.typography.displayLarge,
                color = color.copy(alpha = 0.5f)
            )
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = "Mi app",
                style = MaterialTheme.typography.displaySmall,
                color = color
            )
        }
    }
}