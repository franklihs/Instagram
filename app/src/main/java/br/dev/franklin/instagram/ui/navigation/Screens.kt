package br.dev.franklin.instagram.ui.navigation

import br.dev.franklin.instagram.ui.navigation.Routes.HOME_ROUTE
import br.dev.franklin.instagram.ui.navigation.Routes.LOGIN_ROUTE
import br.dev.franklin.instagram.ui.navigation.Routes.MESSAGES_ROUTE

sealed class Screens (val route: String) {
  object LoginScreen: Screens(LOGIN_ROUTE)
  object HomeScreen: Screens(HOME_ROUTE)
  object MessagesScreen: Screens(MESSAGES_ROUTE)
}