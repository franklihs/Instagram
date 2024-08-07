package br.dev.franklin.instagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.dev.franklin.instagram.ui.theme.InstagramTheme
import br.dev.franklin.instagram.ui.view.HomeScreen

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      InstagramTheme {
        HomeScreen()
      }
    }
  }
}

