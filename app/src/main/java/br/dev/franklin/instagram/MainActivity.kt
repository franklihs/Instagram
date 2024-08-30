package br.dev.franklin.instagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.dev.franklin.instagram.ui.theme.InstagramTheme
import br.dev.franklin.instagram.ui.view.HomeScreen
import br.dev.franklin.instagram.ui.view.MessagesScreen

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      InstagramTheme {
        val navController = rememberNavController()

        NavHost(navController = navController, startDestination = "homeScreen") {
          composable(route = "homeScreen") {
            HomeScreen(navController = navController)
          }

          composable(route = "messagesScreen") {
            MessagesScreen(navController = navController)
          }
        }
      }
    }
  }
}

