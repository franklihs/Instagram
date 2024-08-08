package br.dev.franklin.instagram.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.dev.franklin.instagram.data.Story

@Composable
fun HomeScreen() {

  Column(modifier = Modifier
    .fillMaxSize()
    .background(MaterialTheme.colorScheme.background)) {
    InstagramToolBar()
    StoryItem(story = Story(userNickName = "janedoewithjohndeere", userAvatar = "https://wow.zamimg.com/uploads/screenshots/normal/177061-p%C3%ADcaro-human-rogue-by-glenn-rane.jpg"))
  }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
  HomeScreen()
}