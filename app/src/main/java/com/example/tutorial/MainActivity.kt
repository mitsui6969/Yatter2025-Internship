package com.example.tutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.example.tutorial.ui.theme.TutorialTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // XXXの部分は自身が設定したプロジェクト名
            TutorialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    EditText()
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
//    Text(stringResource(R.string.app_name))
    Text(
        stringResource(R.string.app_name),
        color = Color.Gray,
        fontSize = 30.sp
    )

//    Image(
//        painter = painterResource(id = R.drawable.ic_launcher_background)
//    )
//
//    Image(
//        painter = painterResource(id = R.drawable.kantankantan)
//    )
}

//@Composable
//fun EditText(mainViewModel: MainViewModel = viewModel()) {
//    val text by mainViewModel.textStateFlow.collectAsState()
//
//    OutlinedTextField(
//        value = text,
//        onValueChange = mainViewModel::onTextChange,
//        label = { Text("テキストを入力") },
//        singleLine = true,
//        modifier = Modifier.wrapContentSize()
//    )
//}