package co.techlax.firstcompose

//import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//                TextInput()
            Column {
                PreviewFunction(R.drawable.prof,"Shourya","Sde 1")
                PreviewFunction(R.drawable.prof,"Shourya","Sde 1")
                PreviewFunction(R.drawable.prof,"Shourya","Sde 1")
                PreviewFunction(R.drawable.prof,"Shourya","Sde 1")

            }
        }
    }
}

//@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
fun PreviewFunction(imgId:Int, name:String, des:String){
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

    Row(Modifier.padding(8.dp)) {
        Image(painter = painterResource(id = imgId),
            contentDescription ="",
            Modifier.size(80.dp)
        )
        Column {
            Text(text = name, fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Text(text = des, fontSize = 18.sp)
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextInput(){
val state = remember{ mutableStateOf("")}
TextField(
    value = state.value,
    onValueChange = {
        Log.d("MyCode", it)
        state.value = it

    },
    label = { Text(text = "Enter input ")}
)

}