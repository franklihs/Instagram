package br.dev.franklin.instagram.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.dev.franklin.instagram.ui.theme.InstagramTheme

@Composable
fun LoginScreen(navController: NavController) {

  var text by rememberSaveable { mutableStateOf("") }

  Column(
    modifier = Modifier
      .background(MaterialTheme.colorScheme.background)
      .safeDrawingPadding()
      .fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center,
  ) {
    Text(text = "You are in the Login Screen", modifier = Modifier.padding(top = 16.dp))

    OutlinedTextField(
      value = text,
      onValueChange = { text = it },
      modifier = Modifier.padding(16.dp),
      label = { Text("Please, enter your name to login...") })

    Button(
      onClick = {
        val userName = text.ifEmpty { "cara" }
        navController.navigate("homeScreen/$userName")
      },
      modifier = Modifier.padding(top = 16.dp)
    ) {
      Text(text = "Login")
    }
  }
}


@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
  InstagramTheme {
    LoginScreen(navController = rememberNavController())
  }
}