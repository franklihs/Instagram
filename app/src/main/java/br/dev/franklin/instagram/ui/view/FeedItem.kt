package br.dev.franklin.instagram.ui.view

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.dev.franklin.instagram.R
import br.dev.franklin.instagram.data.model.Feed
import br.dev.franklin.instagram.data.repository.feedList
import br.dev.franklin.instagram.ui.theme.Gray
import br.dev.franklin.instagram.ui.theme.InstagramTheme
import br.dev.franklin.instagram.ui.theme.spacingLarge
import br.dev.franklin.instagram.ui.theme.spacingMedium
import br.dev.franklin.instagram.ui.theme.spacingSmall
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun FeedItem(feed: Feed) {

  val likeIcon = R.drawable.ic_notification
  val likedIcon = R.drawable.ic_liked
  val commentIcon = R.drawable.ic_comment
  val messageIcon = R.drawable.ic_message
  val bookmarkIcon = R.drawable.ic_bookmark

  val userAvatarContentDesc = stringResource(R.string.content_description_feed_avatar)
  val feedImageContentDesc = stringResource(R.string.content_description_feed_image)
  val likeContentDesc = stringResource(R.string.content_description_like_button)
  val commentContentDesc = stringResource(R.string.content_description_comment_button)
  val messageContentDesc = stringResource(R.string.content_description_message_button)
  val bookmarkContentDesc = stringResource(R.string.content_description_bookmark_button)

  var isLiked by rememberSaveable {
    mutableStateOf(false)
  }

  val iconsColor = MaterialTheme.colorScheme.onBackground
  val likedColor = if (isLiked) Color.Red else iconsColor

  Column(modifier = Modifier.background(MaterialTheme.colorScheme.background)) {
    Row(
      modifier = Modifier
        .padding(horizontal = spacingSmall)
        .padding(top = spacingLarge)
    ) {
      GlideImage(
        model = feed.userAvatar,
        contentDescription = userAvatarContentDesc,
        modifier = Modifier
          .size(36.dp)
          .fillMaxSize()
          .clip(CircleShape),
        contentScale = ContentScale.Crop
      )
      Column {
        Text(
          text = feed.userNickName,
          modifier = Modifier
            .fillMaxWidth()
            .padding(start = spacingMedium),
          fontWeight = FontWeight.Bold,
          maxLines = 1,
          overflow = TextOverflow.Ellipsis,
          textAlign = TextAlign.Start
        )

        Text(
          text = feed.localName,
          modifier = Modifier
            .fillMaxWidth()
            .padding(start = spacingMedium),
          maxLines = 1,
          overflow = TextOverflow.Visible,
          textAlign = TextAlign.Start
        )
      }
    }
    GlideImage(
      model = feed.imageUrl,
      contentDescription = feedImageContentDesc,
      modifier = Modifier
        .padding(top = spacingLarge)
        .height(256.dp)
        .fillMaxWidth(),
      contentScale = ContentScale.Crop
    )

    Row(
      modifier = Modifier
        .fillMaxWidth()
        .height(40.dp)
        .padding(start = spacingMedium, top = spacingLarge),
    ) {
      FeedIcons(
        icon = if (isLiked) likedIcon else likeIcon,
        contentDescription = likeContentDesc,
        color = likedColor
      ) { isLiked = !isLiked }

      FeedIcons(icon = commentIcon, contentDescription = commentContentDesc, color = iconsColor) {}

      FeedIcons(icon = messageIcon, contentDescription = messageContentDesc, color = iconsColor) {}

      Image(
        painter = painterResource(id = bookmarkIcon),
        contentDescription = bookmarkContentDesc,
        modifier = Modifier
          .size(40.dp)
          .padding(end = spacingMedium)
          .weight(1f)
          .wrapContentWidth(align = Alignment.End),
        colorFilter = ColorFilter.tint(iconsColor)
      )
    }

    Row(
      modifier = Modifier
        .padding(horizontal = spacingSmall)
        .padding(top = spacingLarge)
    ) {

      val description = buildAnnotatedString {
        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
          append(feed.userNickName)
        }
        append(" ")
        append(feed.description)
      }

      Text(
        text = description,
        modifier = Modifier.padding(horizontal = spacingMedium),
        maxLines = 3,
        overflow = TextOverflow.Ellipsis,
        textAlign = TextAlign.Start
      )
    }

    Text(
      text = feed.postedAgo,
      modifier = Modifier.padding(start = 12.dp, top = spacingSmall),
      maxLines = 1,
      color = Gray,
      overflow = TextOverflow.Ellipsis,
      textAlign = TextAlign.Start
    )
  }
}

@Composable
fun FeedIcons(
  @DrawableRes icon: Int, contentDescription: String, color: Color, onClick: () -> Unit
) {
  Image(
    painter = painterResource(id = icon),
    contentDescription = contentDescription,
    modifier = Modifier
      .size(40.dp)
      .padding(end = spacingLarge)
      .clickable { onClick() },
    colorFilter = ColorFilter.tint(color)
  )
}

@Preview(showBackground = true)
@Composable
fun FeedItemPreview() {
  InstagramTheme {
    FeedItem(
      feed = feedList[0]
    )
  }
}

@Preview(showBackground = true)
@Composable
fun FeedItemPreviewDark() {
  InstagramTheme(darkTheme = true) {
    FeedItem(
      feed = feedList[1]
    )
  }
}