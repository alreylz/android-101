//package Components
//
//
//import android.util.Log
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.border
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.PaddingValues
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.material.icons.Icons
////import androidx.compose.material.icons.filled.ShoppingBag
//import androidx.compose.material3.Button
//import androidx.compose.material3.ButtonColors
//import androidx.compose.material3.ButtonDefaults
//import androidx.compose.material3.FilledIconButton
//import androidx.compose.material3.Icon
//import androidx.compose.material3.IconButtonDefaults
//import androidx.compose.material3.OutlinedButton
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.rotate
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.painter.Painter
//import androidx.compose.ui.graphics.vector.ImageVector
//import androidx.compose.ui.res.colorResource
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//
//
//
////Un botón secundario (con pinta de outlined) se crea con Outlined Button.
//// Permite definir la elevation (sombre bajo el coso
//@Composable
//fun SecondaryActionButton(
//    label: String = "Button",
//    enabled: Boolean = true,
//    modifier: Modifier = Modifier,
//    imageVector: ImageVector? = null,
//    isBorderedImageVector: Boolean = true,
//    onClick: () -> Unit
//) {
//
//    val borderWidth = 1.dp;
//    val outlineColor = colorResource(id = R.color.deep_purple_400)
//    val outlineColorDisabled = colorResource(id = R.color.cardview_dark_background)
//    val textColorDisabled = Color.White
//
//
//    OutlinedButton(
//        onClick = { onClick() },
//        elevation = ButtonDefaults.buttonElevation(
//            defaultElevation = 1.dp,
//            pressedElevation = 100.dp,
//            focusedElevation = 0.dp,
//            hoveredElevation = 1.dp,
//            disabledElevation = 0.dp
//        ),
//        border = androidx.compose.foundation.BorderStroke(
//            width = borderWidth,
//            color = if (enabled) outlineColor else outlineColorDisabled
//        ),
//        colors = ButtonDefaults.outlinedButtonColors().copy(
//            contentColor = if (enabled) ButtonDefaults.outlinedButtonColors().contentColor else textColorDisabled ,
//            containerColor = if(!enabled) outlineColorDisabled else ButtonDefaults.outlinedButtonColors().containerColor ,
//            disabledContentColor = if(!enabled) outlineColorDisabled else ButtonDefaults.outlinedButtonColors().disabledContentColor,
//            disabledContainerColor = textColorDisabled
//        ),
//
//        modifier = Modifier.padding(16.dp)
//    ) {
//
//        Text("${label}")
//
//    }
//
//
//}
//
//@Preview(name = "alreylz", device = "id:pixel_8", showBackground = true)
////@PreviewScreenSizes
//@Composable
//fun PreviewThis() {
//
//    Column {
//        Text("@alreylz - Showing options of a button")
//        SecondaryActionButton(onClick = { Log.d("@alreylz", "Secondary button"); })
//        SecondaryActionButton(enabled = false, onClick = { Log.d("@alreylz", "Secondary button"); })
//
//        Text("Showing options of a button")
//        CustomButton(text = "Hey this is a button", imageVector = Icons.Filled.ShoppingBag)
//
//        BackButton { }
//
//
//    }
//
//}