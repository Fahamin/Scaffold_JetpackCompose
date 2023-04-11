package medication.smartpatient.scaffold_jetpackcompose

import android.content.Context
import android.graphics.drawable.Icon
import android.widget.Toast
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource

@Composable
fun topAppBar() {

    val context = LocalContext.current
    var more = painterResource(id = R.drawable.baseline_more_vert_24)
    var imae = painterResource(id = R.drawable.baseline_arrow_circle_left_24)
    val showMenu = remember {
        mutableStateOf(false)
    }
    TopAppBar(title = { Text(text = "hello compose") }, navigationIcon = {
        IconButton(onClick = {}) {
            Icon(Icons.Default.Menu, contentDescription = "")
        }
    }, actions = {
        IconButton(onClick = { makeTost(context, "helo") }) {
            Icon(painter = imae, contentDescription = "")

        }

        IconButton(onClick = { showMenu.value = true }) {
            Icon(painter = more, contentDescription = "")

        }

        DropdownMenu(expanded = showMenu.value, onDismissRequest = { showMenu.value = false }) {
            DropdownMenuItem(onClick = { makeTost(context, "dropdownmenu") }) {
                Icon(painter = imae, contentDescription = "")

            }

            DropdownMenuItem(onClick = { makeTost(context, "dropdownmenu2") }) {
                Icon(painter = more, contentDescription = "")

            }
        }
    })
}

fun makeTost(context: Context, s: String) {
    Toast.makeText(context, s, Toast.LENGTH_SHORT).show()
}
