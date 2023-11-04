package com.example.customtopappbar

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.customtopappbar.bottomnav.BottomBar
import com.example.customtopappbar.bottomnav.BottomNavGraph
import com.example.customtopappbar.data.InvestList
import com.example.customtopappbar.screen.ReportScreen
import com.example.customtopappbar.ui.theme.CustomTopAppBarTheme
import com.example.customtopappbar.util.SearchAppBarState
import com.example.customtopappbar.util.SharedViewModel

class MainActivity : ComponentActivity() {

    private val sharedViewModel: SharedViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomTopAppBarTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    val searchAppBarState: SearchAppBarState by sharedViewModel.searchAppBarState
                    val searchTextState: String by sharedViewModel.searchTextState
                    val navigateToDetail: (InvestList) -> Unit = { investList ->
                        // Define the action to perform when navigating to the detail
                        // This could be opening a new screen, fragment, or some other action.
                        // For example:
                         startActivity(DetailInvestActivity.newIntent(this, investList ))
//                        Toast.makeText(applicationContext, "test", Toast.LENGTH_SHORT).show()
                    }

                    Greeting(
                        sharedViewModel = sharedViewModel,
                        searchAppBarState = searchAppBarState,
                        searchTextState = searchTextState,
                        navigateToDetail = navigateToDetail


                    )

                }
            }
        }
    }
}

@Composable
fun Greeting(
    sharedViewModel: SharedViewModel,
    searchAppBarState: SearchAppBarState,
    searchTextState: String,
    navigateToDetail: (InvestList) -> Unit

) {
    val navController = rememberNavController()

    Scaffold(

        bottomBar = { BottomBar(navController = navController) } ,
        topBar = {
        CustomTopAppBar(
            sharedViewModel = sharedViewModel,
            searchAppBarState = searchAppBarState,
            searchTextState = searchTextState
        )
    })

    {
        BottomNavGraph(
            navController = navController,
            navigateToDetail
            )
//        ReportScreen()
    }



//    Text(modifier = Modifier.padding(top = 90.dp), text = "Hello There!")
}

