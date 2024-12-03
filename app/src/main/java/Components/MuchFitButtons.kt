//package Components
//
//
import android.graphics.drawable.Icon
import android.util.Log
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.Icons as MaterialIcons

import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Build
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.ShoppingCart
//import androidx.compose.material.icons.filled.ShoppingBag
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.VectorPainter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.alreylz.android101.R
import com.alreylz.android101.color


enum class ButtonType {
    FILLED,
    TONAL,
    OUTLINED,
    TEXT,
    ICON

}


enum class MuchFitColors(val hexCode: String) {
    PURPLE("#8966C8")
}


//@Composable
//fun Button(
//    label: String = "Button",
//    type:ButtonType = ButtonType.FILLED,
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
//            contentColor = if (enabled) ButtonDefaults.outlinedButtonColors().contentColor else textColorDisabled,
//            containerColor = if (!enabled) outlineColorDisabled else ButtonDefaults.outlinedButtonColors().containerColor,
//            disabledContentColor = if (!enabled) outlineColorDisabled else ButtonDefaults.outlinedButtonColors().disabledContentColor,
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

@Preview(
    name = "alreylz",
    showSystemUi = true,
    device = "id:pixel_8", showBackground = true
)
//@PreviewScreenSizes
@Composable
fun PreviewThis() {

    // Full screen centered column with scroll
    Column(
        Modifier
            .fillMaxSize()
            .wrapContentSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Text(
            text = "MunchFit Buttons",
            textDecoration = TextDecoration.Underline,
            modifier = Modifier.padding(3.dp),
            fontSize = 10.em
        )


        Spacer(Modifier.padding(top = 20.dp))
        //Main actions
        Button(onClick = {}) {
            Text("Filled")
        }
        Spacer(Modifier.padding(top = 20.dp))
        FilledTonalButton(onClick = {}) {
            Text("Tonal")
        }
        Spacer(Modifier.padding(top = 20.dp))

        OutlinedButton(onClick = {}) {
            Text("Outlined")
        }
        Spacer(Modifier.padding(top = 20.dp))
        ElevatedButton(onClick = {}) {
            Text("Elevated")
        }
        Spacer(Modifier.padding(top = 20.dp))
        TextButton(onClick = {}) {
            Text("Text Button")
        }
        Spacer(Modifier.padding(top = 20.dp))

    //        Text("Ejemplo usando Drawable propio R.drawable")
    //        Spacer(Modifier.padding(top = 20.dp))
    //        IconButton(R.drawable.money)
    //        IconButton(R.drawable.percent)
        Spacer(Modifier.padding(top = 20.dp))



        // ---------------------------------------------------------------------------
        Text("Ejemplo usando Iconos de 'Material' Google")
        Text("@Composable IconButton")
        Spacer(Modifier.padding(top = 20.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            IconButton(MaterialIcons.Rounded.Add, onClick = {})
            IconButton(MaterialIcons.Rounded.Build, onClick = {})
            IconButton(MaterialIcons.Rounded.AccountBox, onClick = {})
            IconButton(MaterialIcons.Rounded.ShoppingCart, onClick = {})
            IconButton(MaterialIcons.Rounded.Search, onClick = {})
        }
        Text("Opciones")
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            IconButton(MaterialIcons.Rounded.Add, onClick = {}, label = "add")
            IconButton(
                MaterialIcons.Rounded.Build,
                onClick = {},
                label = "configure",
                iconLabelPosition = IconLabelPositions.LEFT
            )
            IconButton(MaterialIcons.Rounded.AccountBox, onClick = {}, label = "user", iconLabelPosition = IconLabelPositions.UP)
            IconButton(MaterialIcons.Rounded.ShoppingCart, onClick = {}, label = "shop", iconLabelPosition = IconLabelPositions.RIGHT)
        }
        // ---------------------------------------------------------------------------

        Spacer(Modifier.padding(top = 20.dp))


        var timesClicked: Int by remember { mutableIntStateOf(0) }
        var surfaceState: String? by remember { mutableStateOf(null) }


        /* Test surface element */
        Surface(
            modifier = Modifier
                .height(150.dp)
                .width(250.dp)
                .padding(1.dp)/*Padding for surface*/,
            color = Color(0xFFA1E2EB),
            shadowElevation = 10.dp,
            tonalElevation = 200.dp,
            enabled = true,
            // ??? interactionSource = InteractionSource,
            shape = RoundedCornerShape(20.dp),
            onClick = {
                surfaceState = "Veces que has clicado este componente Surface: ${timesClicked++}"
            }
        ) {

            Column(Modifier.padding(16.dp)) {
                Text(
                    text = "Clickable Surface component ",
                    Modifier.padding(16.dp)/*Padding for Text*/
                )
                if (surfaceState == null) Text("Contenido Inicial")
                else Text("${surfaceState}")
            }
        }
    }
}





//Equivalente para iconos imagevector

@Composable
fun IconButton(
    iconImgVectorResource: ImageVector,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    contentDescription: String? = null,
    iconTint: Color = MuchFitColors.PURPLE.hexCode.color, //TODO: Sustituir por primary color
    label: String? = null,
    iconLabelPosition: IconLabelPositions? = null
) {

    val iconComposable = @Composable {
        Icon(
            imageVector = iconImgVectorResource,
            contentDescription = contentDescription,
            tint = iconTint
        )
    }

    IconButtonBase(
        icon = iconComposable,
        onClick = onClick,
        label = label,
        iconLabelPositions = iconLabelPosition
    )

}

// todo: uncomment when previous function is finalized
//Función para crear botones con icono Drawable
//@Composable
//fun IconButton(
//    @DrawableRes iconAsResource: Int,
//    onClick: () -> Unit,
//    modifier: Modifier = Modifier,
//    label: String? = null,
//    altContentDescription: String? = null, /* accesibility */
//
//    tint: Color = MuchFitColors.PURPLE.hexCode.color,
//) {
//
//
//    val iconComposable = @Composable {
//        Icon(
//            painter = painterResource(id = iconAsResource), altContentDescription,
//            tint = tint
//        )
//    }
//
//
//    IconButtonBase(icon = iconComposable, onClick = {}, label = label)
//
//}




enum class IconLabelPositions {
    UP,
    LEFT,
    RIGHT,
    DOWN
}


//Controls how the actual icon box looks like
@Composable
private fun IconButtonBase(
    icon: @Composable () -> Unit,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    label: String? = null,
    iconLabelPositions: IconLabelPositions? = IconLabelPositions.DOWN
) {


    val DEFAULT_LABEL_COLOR = Color.Gray; // Todo: cambiar por importación de colors.xml
    val DEFAULT_LABEL_TEXT_ALIGN = TextAlign.Center;
    val DEFAULT_LABEL_FONT_SIZE = 2.em;
    val DEFAULT_ICON_LABEL_SPACING = 1.dp;




    Surface(onClick = onClick) {


        if (label == null) { //Si no hay label, simplemente mostramos el icono
            icon()
        } else { //En caso contrario gestionamos el mostrado del label en la posición correcta


            // Local function to define a Label configurable composable
            // (set here default settings for the label look)
            @Composable
            fun ConfiguredIconLabelText(
                label: String,
                modifier: Modifier? = null,
                fontSize: TextUnit? = null,
                color: Color? = null,
                textAlign: TextAlign? = null
            ) {
                Text(
                    "$label",
                    fontSize = fontSize ?: DEFAULT_LABEL_FONT_SIZE,
                    color = color ?: DEFAULT_LABEL_COLOR,
                    textAlign = textAlign ?: DEFAULT_LABEL_TEXT_ALIGN,
                    modifier = modifier ?: Modifier
                )
            }


            //Account for the label positions LR -> Row ; UD -> Column
            when (iconLabelPositions) {
                IconLabelPositions.LEFT -> Row(verticalAlignment = Alignment.CenterVertically){
                    ConfiguredIconLabelText(label)
                    Spacer(Modifier.padding(DEFAULT_ICON_LABEL_SPACING))
                    icon()
                }

                IconLabelPositions.RIGHT -> Row(verticalAlignment = Alignment.CenterVertically) {
                    icon()
                    Spacer(Modifier.padding(DEFAULT_ICON_LABEL_SPACING))
                    ConfiguredIconLabelText(label)
                }

                IconLabelPositions.UP -> Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    ConfiguredIconLabelText(label)
                    Spacer(Modifier.padding(DEFAULT_ICON_LABEL_SPACING))
                    icon()
                }
                //IconLabelPositions.DOWN
                else -> Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    icon()
                    Spacer(Modifier.padding(DEFAULT_ICON_LABEL_SPACING))
                    ConfiguredIconLabelText(label)
                }

            }
        }


    }
}








