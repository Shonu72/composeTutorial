package co.techlax.firstcompose
// import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//                TextInput()
//            Column {
//                listViewFunction(R.drawable.prof,"Shourya","Sde 1")
//                listViewFunction(R.drawable.prof,"Shourya","Sde 1")
//                listViewFunction(R.drawable.prof,"Shourya","Sde 1")
//                listViewFunction(R.drawable.prof,"Shourya","Sde 1")
//            }

            PreviewItem()
        }
    }
}

// @Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
fun listViewFunction(imgId: Int, name: String, des: String, modifier: Modifier) {
    // in case of column we arrange items in the vertical(ek ke niche ek) but in row we arrange them in horizontal(ek k baad ek)
//    Column(
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(text = "A", fontSize = 24.sp)
//        Text(text = "B", fontSize = 24.sp)
//    }

//    Row(
//        horizontalArrangement = Arrangement.Center,
//        verticalAlignment = Alignment.Top
//
//    ) {
//        Text(text = "X", fontSize = 24.sp)
//        Text(text = "Y", fontSize = 24.sp)
//    }

    Row(modifier.padding(8.dp)) {
        Image(
            painter = painterResource(id = imgId),
            contentDescription = "",
            Modifier.size(200.dp),
        )
        Column {
            Text(
                text = name,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(text = des, fontSize = 18.sp)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextInput() {
    val state = remember { mutableStateOf("") }
    TextField(
        value = state.value,
        onValueChange = {
            Log.d("MyCode", it)
            state.value = it
        },
        label = { Text(text = "Enter input ") },
    )
}

@Composable
private fun previewFUnction() {
    Text(
        text = "Preview",
        fontSize = 20.sp,
        color = Color.White,
        modifier = Modifier
            .clickable { }
            .background(Color.Blue)
            .size(200.dp)
            .padding(10.dp)
            .border(4.dp, Color.Red)
            .clip(CircleShape)
            .background(Color.Yellow),
    )
}

@Composable
fun circlePreview() {
    Image(
        painter = painterResource(id = R.drawable.prof),
        contentScale = ContentScale.Crop,
        modifier = Modifier.size(80.dp)
            .clip(CircleShape)
            .border(2.dp, Color.LightGray, CircleShape),
        contentDescription = "",
    )
}
