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
        description = "Nossos 9RX 710, 770 e 830 são os tratores de produção mais potentes da John Deere. A combinação do motor JD18 com a nova transmissão e21 PST e os chassis redesenhados garantem uma potência de tração inigualável na barra de tração, tudo isso sem a necessidade de fluido para escapamento de veículos a diesel (DEF). Para você, mais potência significa implementos mais largos, menos tempo no campo e menos trabalho operacional, atingindo o máximo. Equipados com correntes de esteira de 30 polegadas, a largura total dos tratores é inferior a 3 metros.",
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