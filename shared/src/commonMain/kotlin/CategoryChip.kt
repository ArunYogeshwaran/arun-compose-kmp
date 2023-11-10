import androidx.compose.material.Chip
import androidx.compose.material.ChipDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CategoryChip(
    color: Color,
    text: String,
    icon: ImageVector,
    tint: Color
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
            color = tint
        )
    }
}

enum class CategoryModel(
    val localizationKey: String,
    val surface: Color,
    val icon: ImageVector,
    val tint: Color
) {
    BARISTA(
        localizationKey = "category_chip_barista",
        surface = Color(250, 243, 232),
        icon = Icons.Filled.Call,
        tint = Color(113, 75, 4)
    ),
    BARTENDER(
        localizationKey = "category_chip_bartender",
        surface = Color(249, 231, 242),
        icon = Icons.Filled.Settings,
        tint = Color(147, 23, 95)
    ),
    BREAKFAST_SERVICE(
        localizationKey = "category_chip_breakfast_service",
        surface = Color(251, 239, 228),
        icon = Icons.Filled.Add,
        tint = Color(126, 55, 1)
    ),
    CASHIER(
        localizationKey = "category_chip_cashier",
        surface = Color(230, 249, 233),
        icon = Icons.Filled.AccountBox,
        tint = Color(0, 97, 13)
    ),
    COURIER(
        localizationKey = "category_chip_courier",
        surface = Color(216, 245, 253),
        icon = Icons.Filled.Star,
        tint = Color(2, 83, 116)
    ),
    DRIVER(
        localizationKey = "category_chip_driver",
        surface = Color(219, 249, 247),
        icon = Icons.Filled.Search,
        tint = Color(5, 87, 113)
    ),
    GARDENER(
        localizationKey = "category_chip_gardener",
        surface = Color(232, 246, 217),
        icon = Icons.Filled.Send,
        tint = Color(43, 90, 2)
    ),
    HELPER(
        localizationKey = "category_chip_helper",
        surface = Color(221, 244, 231),
        icon = Icons.Filled.Close,
        tint = Color(4, 93, 38)
    ),
    HOSPITALITY(
        localizationKey = "category_chip_hospitality",
        surface = Color(236, 237, 253),
        icon = Icons.Filled.Call,
        tint = Color(53, 60, 194)
    ),
    KITCHEN_HELPER(
        localizationKey = "category_chip_kitchen_helper",
        surface = Color(253, 235, 238),
        icon = Icons.Filled.AccountBox,
        tint = Color(148, 25, 70)
    ),
    OFFICE_HELP(
        localizationKey = "category_chip_office_help",
        surface = Color(227, 232, 249),
        icon = Icons.Filled.Send,
        tint = Color(20, 58, 184)
    ),
    PROMOTER(
        localizationKey = "category_chip_promoter",
        surface = Color(241, 232, 253),
        icon = Icons.Filled.Call,
        tint = Color(100, 36, 185)
    ),
    REPLENISHER(
        localizationKey = "category_chip_replenisher",
        surface = Color(226, 249, 243),
        icon = Icons.Filled.Search,
        tint = Color(4, 93, 71)
    ),
    SALES_ASSISTANT(
        localizationKey = "category_chip_sales_assistant",
        surface = Color(232, 232, 255),
        icon = Icons.Filled.Close,
        tint = Color(77, 30, 154)
    ),
    OTHER(
        localizationKey = "category_chip_others",
        surface = Color(227, 232, 235),
        icon = Icons.Filled.Star,
        tint = Color(62, 73, 96)
    );
}