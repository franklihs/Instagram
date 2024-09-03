package br.dev.franklin.instagram.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.dev.franklin.instagram.data.model.Feed
import br.dev.franklin.instagram.data.model.Story
import br.dev.franklin.instagram.data.repository.feedList
import br.dev.franklin.instagram.data.repository.storiesList
import br.dev.franklin.instagram.ui.theme.InstagramTheme

@Composable
fun HomeScreen(navController: NavController, userName: String) {

  LazyColumn(
    modifier = Modifier.background(MaterialTheme.colorScheme.background)
  ) {
    item { InstagramToolBar(navController = navController, userName) }
    item { StoryList(stories = storiesList) }
    item { HorizontalDivider(thickness = 0.2.dp, color = MaterialTheme.colorScheme.onSurface) }

    feedList(feeds = feedList)
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

fun LazyListScope.feedList(feeds: List<Feed>) {
  itemsIndexed(feeds) { _, item ->
    FeedItem(feed = item)
  }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
  InstagramTheme() {
    HomeScreen(navController = rememberNavController(), "User Name")
  }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreviewDark() {
  InstagramTheme(darkTheme = true) {
    HomeScreen(navController = rememberNavController(), "User Name")
  }
}
