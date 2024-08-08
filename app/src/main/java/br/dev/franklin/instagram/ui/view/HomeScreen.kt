package br.dev.franklin.instagram.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.dev.franklin.instagram.data.Story

@Composable
fun HomeScreen() {

  Column(
    modifier = Modifier
      .fillMaxSize()
      .background(MaterialTheme.colorScheme.background)
  ) {
    InstagramToolBar()

    val stories = listOf(
      Story(userNickName = "janedoewithjohndeere", userAvatar = "https://www.tecnologiahorticola.com/wp-content/uploads/2024/03/01_John-Deere-S7-900-combine-harvesting-wheat-min-1280x640.jpg"),
      Story(userNickName = "janejohndeere", userAvatar = "https://www.tecnologiahorticola.com/wp-content/uploads/2024/03/01_John-Deere-S7-900-combine-harvesting-wheat-min-1280x640.jpg"),
      Story(userNickName = "jane", userAvatar = "https://www.tecnologiahorticola.com/wp-content/uploads/2024/03/01_John-Deere-S7-900-combine-harvesting-wheat-min-1280x640.jpg"),
      Story(userNickName = "johndeere", userAvatar = "https://www.tecnologiahorticola.com/wp-content/uploads/2024/03/01_John-Deere-S7-900-combine-harvesting-wheat-min-1280x640.jpg"),
      Story(userNickName = "janejohn", userAvatar = "https://www.tecnologiahorticola.com/wp-content/uploads/2024/03/01_John-Deere-S7-900-combine-harvesting-wheat-min-1280x640.jpg"),
      Story(userNickName = "janewithjohn", userAvatar = "https://www.tecnologiahorticola.com/wp-content/uploads/2024/03/01_John-Deere-S7-900-combine-harvesting-wheat-min-1280x640.jpg"),
      Story(userNickName = "doewithdeere", userAvatar = "https://www.tecnologiahorticola.com/wp-content/uploads/2024/03/01_John-Deere-S7-900-combine-harvesting-wheat-min-1280x640.jpg"),
      Story(userNickName = "j", userAvatar = "https://www.tecnologiahorticola.com/wp-content/uploads/2024/03/01_John-Deere-S7-900-combine-harvesting-wheat-min-1280x640.jpg"),
      Story(userNickName = "janedoewithjohndeere", userAvatar = "https://www.tecnologiahorticola.com/wp-content/uploads/2024/03/01_John-Deere-S7-900-combine-harvesting-wheat-min-1280x640.jpg"),
      Story(userNickName = "janedoewithjohndeere", userAvatar = "https://www.tecnologiahorticola.com/wp-content/uploads/2024/03/01_John-Deere-S7-900-combine-harvesting-wheat-min-1280x640.jpg"),
    )

    StoryList(stories = stories)
  }
}

@Composable
fun StoryList(stories: List<Story>) {
  LazyRow() {
    itemsIndexed(stories) { _, item ->
      StoryItem(story = item)
    }
  }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
  HomeScreen()
}