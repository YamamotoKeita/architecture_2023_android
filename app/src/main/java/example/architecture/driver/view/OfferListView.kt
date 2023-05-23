package example.architecture.driver.view

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import example.architecture.driver.ui.theme.Architecture2023Theme

@Composable
fun OfferListView(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Architecture2023Theme {
        OfferListView("Android")
    }
}