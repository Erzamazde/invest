package com.example.customtopappbar.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.customtopappbar.InvestListItem
import com.example.customtopappbar.data.DataProvider
import com.example.customtopappbar.data.InvestList

@Composable
fun ReportScreen(
    navigateToDetail: (InvestList) -> Unit
){
//    Column(
//        modifier = Modifier.fillMaxSize()
//    ) {
//        Text(text = "Report Screen", fontSize = 20.sp)
//    }

    val invest =  remember {DataProvider.InvestListList}
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)

    ){
        items(
            items = invest,
            itemContent = {
                InvestListItem(
                    investList = it ,
                    navigateToDetail
                )
            }
        )
    }
}