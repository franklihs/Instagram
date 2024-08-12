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
import br.dev.franklin.instagram.data.model.Feed
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

    FeedItem(
      feed = Feed(
        userNickName = "John Deere",
        localName = "Brasil zil zil zil zil zil",
        userAvatar = "https://www.deere.com/assets/images/common/our-company/history/JD_Trademark_Current_884x663.png",
        imageUrl = "https://www.deere.es/assets/images/region-2/tractors/large/9r-series/9rx-490-640-9rx-r2g035179-large.jpg",
        description = "O 9RX 490-640 é alimentado por um motor JD14 com até 691 hp e aumenta a produtividade com uma notável capacidade de lastro de até 30.391 kg.",
        postedAgo = "Há 2 horas"
      )
    )
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