import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.di2p1g6_booking.R
import compose.icons.FeatherIcons
import compose.icons.feathericons.Calendar
import compose.icons.feathericons.LogOut

@Composable
fun RoomListScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Header()
        SearchRoomForm()
    }
}

@Composable
fun Header() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xCDFF5722))
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.profilimg),
                contentDescription = "Profil image",
                modifier = Modifier.size(80.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(text = "Bienvenu", fontWeight = FontWeight.Bold, color = Color.White)
                Text(text = "Jack", color = Color.White)
            }
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Icon(
                imageVector = FeatherIcons.LogOut,
                contentDescription = "Logout",
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
            Text(text = "Logout", color = Color.White, style = MaterialTheme.typography.labelSmall)
        }
    }
}

@Composable
fun SearchRoomForm() {
    var selectedSpace by remember { mutableStateOf("") }
    var selectedDate by remember { mutableStateOf("") }
    var selectedStartTime by remember { mutableStateOf("") }
    var selectedEndTime by remember { mutableStateOf("") }
    var selectedEmail by remember { mutableStateOf("") }
    var guestCount by remember { mutableStateOf("") }
    var selectedEquipment by remember { mutableStateOf("") }
    val guestOptions = listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    var expanded by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("Trouvez l'espace avec les critères", fontSize = 18.sp, color = Color.Black)

        // Ajout des placeholders et des modifications pour un meilleur espacement
        val textFieldModifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)

        // Définition de chaque champ avec placeholder
        OutlinedTextField(
            value = selectedSpace,
            onValueChange = { selectedSpace = it },
            placeholder = { Text("Creative Space") },
            leadingIcon = { Icon(Icons.Default.Place, contentDescription = "Location") },
            modifier = textFieldModifier,
            singleLine = true
        )

        OutlinedTextField(
            value = selectedDate,
            onValueChange = { selectedDate = it },
            placeholder = { Text("jj/mm/aa") },
            leadingIcon = { Icon(imageVector = FeatherIcons.Calendar, contentDescription = "Calendar") },
            modifier = textFieldModifier,
            singleLine = true
        )

        OutlinedTextField(
            value = selectedStartTime,
            onValueChange = { selectedStartTime = it },
            placeholder = { Text("12h") },
            leadingIcon = { Icon(imageVector = FeatherIcons.Calendar, contentDescription = "Start Time") },
            modifier = textFieldModifier,
            singleLine = true
        )

        OutlinedTextField(
            value = selectedEndTime,
            onValueChange = { selectedEndTime = it },
            placeholder = { Text("13h") },
            modifier = textFieldModifier,
            singleLine = true
        )

        OutlinedTextField(
            value = selectedEmail,
            onValueChange = { selectedEmail = it },
            placeholder = { Text("invite@gmail.com") },
            leadingIcon = { Icon(imageVector = FeatherIcons.Calendar, contentDescription = "Email") },
            modifier = textFieldModifier,
            singleLine = true,
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done)
        )

        // Liste déroulante pour le nombre d'invités
        Box(modifier = textFieldModifier) {
            OutlinedTextField(
                value = guestCount,
                onValueChange = { guestCount = it },
                placeholder = { Text("Nombre de personnes") },
                readOnly = true,
                trailingIcon = { Icon(Icons.Default.ArrowDropDown, "Dérouler", Modifier.clickable { expanded = !expanded }) },
                modifier = Modifier.fillMaxWidth()
            )

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier.fillMaxWidth()
            ) {
                guestOptions.forEach { label ->
                    DropdownMenuItem(
                        text = { Text(label) },
                        onClick = {
                            guestCount = label
                            expanded = false
                        }
                    )
                }
            }
        }

        OutlinedTextField(
            value = selectedEquipment,
            onValueChange = { selectedEquipment = it },
            placeholder = { Text("Projecteur") },
            leadingIcon = { Icon(imageVector = FeatherIcons.Calendar, contentDescription = "Equipment") },
            modifier = textFieldModifier,
            singleLine = true
        )

        Button(
            onClick = { /* Trigger search */ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            shape = RoundedCornerShape(4.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF5722))
        ) {
            Text("Rechercher", color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRoomListScreen() {
    MaterialTheme {
        RoomListScreen()
    }
}
