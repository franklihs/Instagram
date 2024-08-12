package br.dev.franklin.instagram.ui.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.dev.franklin.instagram.data.model.Feed

@Composable
fun FeedItem(feed: Feed) {

}

@Preview(showBackground = true)
@Composable
fun FeedItemPreview() {
  FeedItem(
    feed = Feed(
      userNickName = "John Deere",
      localName = "Brasil",
      userAvatar = "",
      imageUrl = "",
      description = "",
      postedAgo = "há 2 dias"
    )
  )
}