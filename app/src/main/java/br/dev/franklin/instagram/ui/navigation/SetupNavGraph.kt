package br.dev.franklin.instagram.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import br.dev.franklin.instagram.ui.view.HomeScreen
import br.dev.franklin.instagram.ui.view.LoginScreen
import br.dev.franklin.instagram.ui.view.MessagesScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {
  NavHost(navController = navController, startDestination = Screens.LoginScreen.route) {

    composable(route = Screens.LoginScreen.route) {
      LoginScreen(navController = navController)
    }

    composable(route = Screens.HomeScreen.route, arguments = listOf(
      navArgument(TEXT) {
        type = NavType.StringType
        defaultValue = ""
        nullable = true
      }
    )) {
      HomeScreen(navController = navController, userName = it.arguments?.getString(TEXT) ?: "")
    }

    composable(route = Screens.MessagesScreen.route, arguments = listOf(
      navArgument(TEXT) {
        type = NavType.StringType
        defaultValue = ""
        nullable = true
      }
    )) {
      MessagesScreen(navController = navController, userName = it.arguments?.getString(TEXT) ?: "")
    }

  }
}