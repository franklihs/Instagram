package br.dev.franklin.instagram.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
  primary = Purple80,
  secondary = PurpleGrey80,
  tertiary = Pink80,
  background = Color.Black,
  onBackground = Color.White,
  onSurface = DividerColorDark,
)

private val LightColorScheme = lightColorScheme(
  primary = Purple40,
  secondary = PurpleGrey40,
  tertiary = Pink40,
  background = Color.White,
  onBackground = Color.Black,
  onSurface = DividerColor,
)

@Composable
fun InstagramTheme(
  darkTheme: Boolean = isSystemInDarkTheme(),
  // Dynamic color is available on Android 12+
  dynamicColor: Boolean = true,
  content: @Composable () -> Unit
) {
    val colorScheme = when {

      darkTheme -> DarkColorScheme
      else -> LightColorScheme
    }

  val typography = typography(colorScheme.onBackground)

  MaterialTheme(
  colorScheme = colorScheme,
  typography = typography,
  content = content
  )
}