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
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.dev.franklin.instagram.ui.theme.InstagramTheme

@Composable
fun LoginScreen(navController: NavController) {

  var name by rememberSaveable { mutableStateOf("") }
  var pass by rememberSaveable { mutableStateOf("") }

  Column(
    modifier = Modifier
      .background(MaterialTheme.colorScheme.background)
      .safeDrawingPadding()
      .fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center,
  ) {
    Text(text = "Login", modifier = Modifier.padding(top = 16.dp), fontSize = 32.sp)

    OutlinedTextField(
      value = name,
      onValueChange = { name = it },
      modifier = Modifier.padding(top = 16.dp),
      label = { Text("Please, enter your name") })

    OutlinedTextField(
      value = pass,
      visualTransformation = PasswordVisualTransformation(),
      onValueChange = { pass = it },
      modifier = Modifier.padding(bottom = 16.dp),
      label = { Text("Please, enter your password") })

    Button(
      onClick = {
        val userName = name.ifEmpty { "User Name" }
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

@Preview(showBackground = true)
@Composable
fun LoginScreenPreviewDark() {
  InstagramTheme(darkTheme = true) {
    LoginScreen(navController = rememberNavController())
  }
}