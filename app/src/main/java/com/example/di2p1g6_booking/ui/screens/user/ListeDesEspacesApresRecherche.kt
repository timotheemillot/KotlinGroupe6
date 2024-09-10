import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.di2p1g6_booking.R
import compose.icons.FeatherIcons
import compose.icons.feathericons.Calendar

data class Space(val name: String, val imageUrl: String, val capacity: Int, val availabilityTime: String)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchResultScreen(spaces: List<Space>) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Résultat des recherches") },
                navigationIcon = {
                    IconButton(onClick = { /* handle back navigation */ }) {
                        Icon(imageVector = FeatherIcons.Calendar, contentDescription = "Retour")
                    }
                }
            )
        }
    ) { innerPadding ->
        LazyColumn(contentPadding = innerPadding) {
            items(spaces) { space ->
                SpaceCard(space)
            }
        }
    }
}

@Composable
fun SpaceCard(space: Space) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.creative_space), // Replace with actual image loading logic
                contentDescription = space.name,
                modifier = Modifier
                    .size(100.dp)
                    .weight(1f)
            )
            Column(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .weight(2f)
            ) {
                Text(space.name, fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(IimageVector = FeatherIcons.Calendar, contentDescription = "Capacité", tint = Color.Gray)
                    Text("${space.capacity} personnes", fontSize = 14.sp)
                    Spacer(Modifier.width(16.dp))
                    Icon(imageVector = FeatherIcons.Calendar, contentDescription = "Heure", tint = Color.Gray)
                    Text(space.availabilityTime, fontSize = 14.sp)
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewSearchResultScreen() {
    val sampleSpaces = listOf(
        Space("Creative Space", "url_to_image", 4, "08:00 - 18:00"),
        Space("Meeting Space", "url_to_image", 8, "09:00 - 17:00")
    )
    SearchResultScreen(sampleSpaces)
}
