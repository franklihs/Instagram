package br.dev.franklin.instagram.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.dev.franklin.instagram.data.model.Story
import br.dev.franklin.instagram.data.repository.stories
import br.dev.franklin.instagram.ui.theme.DividerColor

@Composable
fun HomeScreen() {

  Column(
    modifier = Modifier
      .fillMaxSize()
      .background(MaterialTheme.colorScheme.background)
  ) {
    InstagramToolBar()

    StoryList(stories = stories)

    HorizontalDivider(thickness = 0.2.dp, color = DividerColor)
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