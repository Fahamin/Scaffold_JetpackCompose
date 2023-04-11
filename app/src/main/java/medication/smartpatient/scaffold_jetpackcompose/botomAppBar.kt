package medication.smartpatient.scaffold_jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun testbottomAppBar() {

    BottomAppBar() {
        Row(
            modifier = Modifier.fillMaxWidth(1f),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = {}) {
                Icon(Icons.Default.Send, contentDescription = "")
            }
            IconButton(onClick = {}) {
                Icon(Icons.Default.Search, contentDescription = "")
            }
            IconButton(onClick = {}) {
                Icon(Icons.Default.Menu, contentDescription = "")
            }
            IconButton(onClick = {}) {
                Icon(Icons.Default.Edit, contentDescription = "")
            }
        }
    }
}