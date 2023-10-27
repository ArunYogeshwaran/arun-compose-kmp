import androidx.compose.material.Chip
import androidx.compose.material.ChipDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CategoryChip(
    color: Color,
    text: String,
    icon: ImageVector
) {
    Chip(
        border = ChipDefaults.outlinedBorder,
        colors = ChipDefaults.outlinedChipColors(backgroundColor = color),
        leadingIcon = {
            Icon(
                icon,
                contentDescription = "Localized description"
            )
        },
        onClick = {},
    ) {
        Text(
            text = text,
        )
    }
}

enum class CategoryModel(val color: Color, val text: String, val icon: ImageVector) {
    Cashier(Color(0xFFE2F9F3), text = "Cashier", icon = Icons.Filled.Call),
    Driver(Color(0xFFECEDFD), text = "Driver", icon = Icons.Filled.Add),
    Barista(Color(0xFFFDEBEE), text = "Barista", icon = Icons.Filled.AccountBox),
    Hospitality(Color(0xFFDDF4E7), text = "Hospitality", icon = Icons.Filled.Settings)
}