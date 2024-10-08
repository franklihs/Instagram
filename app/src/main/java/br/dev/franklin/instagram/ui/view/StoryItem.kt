package br.dev.franklin.instagram.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.dev.franklin.instagram.R
import br.dev.franklin.instagram.data.model.Story
import br.dev.franklin.instagram.data.repository.storiesList
import br.dev.franklin.instagram.ui.theme.InstagramTheme
import br.dev.franklin.instagram.ui.theme.StoryCircleColor
import br.dev.franklin.instagram.ui.theme.spacingSmall
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun StoryItem(story: Story) {

  val avatarContentDesc =
    stringResource(id = R.string.content_description_story, story.userNickName)

  Column(
    modifier = Modifier
      .padding(spacingSmall)
      .background(MaterialTheme.colorScheme.background)
  ) {
    GlideImage(
      model = story.userAvatar,
      contentDescription = avatarContentDesc,
      modifier = Modifier
        .size(64.dp)
        .align(Alignment.CenterHorizontally)
        .fillMaxSize()
        .clip(CircleShape)
        .border(2.dp, StoryCircleColor, CircleShape),
      contentScale = ContentScale.Crop
    )

    Text(
      text = story.userNickName,
      modifier = Modifier.size(width = 72.dp, height = 24.dp),
      maxLines = 1,
      overflow = TextOverflow.Ellipsis,
      textAlign = TextAlign.Center
    )
  }
}

@Preview(showBackground = true)
@Composable
fun StoryItemPreview() {
  InstagramTheme {
    StoryItem(story = storiesList[0])
  }
}

@Preview(showBackground = true)
@Composable
fun StoryItemPreviewDark() {
  InstagramTheme(darkTheme = true) {
    StoryItem(story = storiesList[1])
  }
}