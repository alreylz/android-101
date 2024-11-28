package com.alreylz.android101

import android.icu.text.ListFormatter.Width
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
// Resources
import com.alreylz.android101.R.drawable.androidparty
import com.alreylz.android101.R.drawable.thispersondoesnotexist
import com.alreylz.android101.ui.theme.Android101Theme


/**
 * Practice
 */
class HappyBirthdayStringsAsResources : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Android101Theme {
                val bgImage = painterResource(androidparty);

                // Import string resources
                val nameBirthdayPerson = stringResource(R.string.birthday_person);
                val ageBirthdayPerson = 27;
                val messageBirthdayPerson = stringResource(R.string.birthday_message)


                Box {
                    Image(
                        painter = bgImage, "background of party",
                        alpha = 0.5F
                    )
                    ImageBirthdayCard(
                        nameBirthdayPerson,
                        ageBirthdayPerson,
                        message = messageBirthdayPerson
                    );
                }
            }

        }
    }
}


@Preview(
    showBackground = true
)
@Composable
fun ShowCodePreviewImages2() {
    Android101Theme {
        val bgImage = painterResource(androidparty);

        // Import string resources
        val nameBirthdayPerson = stringResource(R.string.birthday_person);
        val ageBirthdayPerson = 27;
        val messageBirthdayPerson = stringResource(R.string.birthday_message)

        Box {
            ImageBirthdayCard(
                nameBirthdayPerson,
                ageBirthdayPerson,
                message = messageBirthdayPerson
            );
        }
    }
}