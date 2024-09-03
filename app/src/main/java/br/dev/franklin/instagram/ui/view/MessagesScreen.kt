package br.dev.franklin.instagram.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.dev.franklin.instagram.ui.theme.InstagramTheme
import br.dev.franklin.instagram.ui.theme.spacingLarge

@Composable
fun MessagesScreen(navController: NavController, userName: String) {
  LazyColumn(
    modifier = Modifier
      .background(MaterialTheme.colorScheme.background)
      .safeDrawingPadding()
      .fillMaxSize(),
    verticalArrangement = Arrangement.Top,
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    item {
      Row(
        modifier = Modifier
          .padding(horizontal = spacingLarge)
          .height(42.dp),
        verticalAlignment = Alignment.CenterVertically
      ) {

        Text(
          text = userName,
          modifier = Modifier.weight(1f),
          style = MaterialTheme.typography.headlineLarge
        )
      }
    }
    item {
      Column(modifier = Modifier.fillParentMaxHeight(), verticalArrangement = Arrangement.Center)
      {
        Text(text = "You are in the Messages Screen")
        Button(onClick = { navController.navigate("homeScreen/$userName") }) {
          Text(text = "Back to Home Screen")
        }
      }
    }

  }
}


@Preview(showBackground = true)
@Composable
fun MessagesScreenPreview() {
  InstagramTheme() {
    MessagesScreen(navController = rememberNavController(), "User Name")
  }
}

@Preview(showBackground = true)
@Composable
fun MessagesScreenPreviewDark() {
  InstagramTheme(darkTheme = true) {
    MessagesScreen(navController = rememberNavController(), "User Name")
  }
}