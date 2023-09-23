package co.techlax.firstcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
@Preview(heightDp = 700)
@Composable
fun PreviewItem() {
    LazyColumn(content = {
        items(getCategoryList()) {
                item ->
            BlogCategory(img = item.img, title = item.title, subTitle = item.subTitle)
        }
    })
}

@Composable
fun BlogCategory(img: Int, title: String, subTitle: String) {
    Card(
        elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier.padding(8.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp),
        ) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "",
                modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .weight(.2f),
            )
            itemDescription(
                title,
                subTitle,
                Modifier.weight(.8f),
            )
        }
    }
}

@Composable
fun itemDescription(title: String, subTitle: String, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.headlineSmall,
        )
        Text(
            text = subTitle,
            style = MaterialTheme.typography.titleSmall,
            fontWeight = FontWeight.Thin,
        )
    }
}

data class Category(val img: Int, val title: String, val subTitle: String)
fun getCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.prof, "AI & ML", "Subtitle1"))
    list.add(Category(R.drawable.prof, "Technology", "Subtitle1"))
    list.add(Category(R.drawable.prof, "Data Science", "Subtitle1"))
    list.add(Category(R.drawable.prof, "App Development", "Subtitle1"))
    list.add(Category(R.drawable.prof, "Web Development", "Subtitle1"))
    list.add(Category(R.drawable.prof, "Game Design", "Subtitle1"))
    list.add(Category(R.drawable.prof, "Graphic design", "Subtitle1"))
    list.add(Category(R.drawable.prof, "AI & ML", "Subtitle1"))
    list.add(Category(R.drawable.prof, "Technology", "Subtitle1"))
    list.add(Category(R.drawable.prof, "Data Science", "Subtitle1"))
    list.add(Category(R.drawable.prof, "App Development", "Subtitle1"))
    list.add(Category(R.drawable.prof, "Web Development", "Subtitle1"))
    list.add(Category(R.drawable.prof, "Game Design", "Subtitle1"))
    list.add(Category(R.drawable.prof, "Graphic design", "Subtitle1"))

    return list
}
