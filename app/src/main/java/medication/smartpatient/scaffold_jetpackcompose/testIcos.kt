package medication.smartpatient.scaffold_jetpackcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.outlined.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun testIcon() {
    Column(
        modifier = Modifier.fillMaxSize(1f),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var icon = painterResource(id = R.drawable.baseline_build_24)
        Icon(painter = icon, contentDescription = "")
        Icon(Icons.Default.Email, contentDescription = "")
        Icon(Icons.Outlined.Email, contentDescription = "")
    }
}