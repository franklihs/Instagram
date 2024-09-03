package br.dev.franklin.instagram.ui.view

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.dev.franklin.instagram.R
import br.dev.franklin.instagram.ui.theme.InstagramTheme
import br.dev.franklin.instagram.ui.theme.spacingLarge
import br.dev.franklin.instagram.ui.theme.spacingMedium

@Composable
fun InstagramToolBar(navController: NavController, userName: String) {

  val iconsColor = MaterialTheme.colorScheme.onBackground

  val notificationsIcon = painterResource(R.drawable.ic_notification)
  val directMessagesIcon = painterResource(R.drawable.ic_message)

  val instagramLabel = stringResource(id = R.string.app_name)
  val notificationContentDesc = stringResource(R.string.content_description_notification_icon)
  val directMessageContentDesc = stringResource(R.string.content_description_message_button)
  val notificationToastText = stringResource(R.string.button_notification_toast)
  val directMessageToastText = stringResource(R.string.button_DM_toast)

  val context = LocalContext.current
  val duration = Toast.LENGTH_SHORT

  Box(
    modifier = Modifier
      .background(MaterialTheme.colorScheme.background)
      .safeDrawingPadding()
  ) {
    Row(
      modifier = Modifier
        .padding(horizontal = spacingLarge)
        .height(42.dp),
      verticalAlignment = Alignment.CenterVertically
    ) {

      Text(
        text = instagramLabel,
        modifier = Modifier.weight(1f),
        style = MaterialTheme.typography.headlineLarge
      )

      Image(
        painter = notificationsIcon,
        modifier = Modifier
          .size(32.dp)
          .padding(end = spacingMedium)
          .clickable {
            Toast
              .makeText(context, notificationToastText, duration)
              .show()
          },
        contentDescription = notificationContentDesc,
        colorFilter = ColorFilter.tint(iconsColor)
      )
      Image(
        painter = directMessagesIcon,
        modifier = Modifier
          .size(32.dp)
          .padding(start = spacingMedium)
          .clickable { navController.navigate("messagesScreen/$userName") },
        contentDescription = directMessageContentDesc,
        colorFilter = ColorFilter.tint(iconsColor)
      )
    }
  }
}

@Preview(showBackground = true)
@Composable
fun InstagramToolbarPreview() {
  InstagramTheme {
    InstagramToolBar(navController = rememberNavController(), "User Name")
  }
}

@Preview(showBackground = true)
@Composable
fun InstagramToolbarPreviewDark() {
  InstagramTheme(darkTheme = true) {
    InstagramToolBar(navController = rememberNavController(), "User Name")
  }
}