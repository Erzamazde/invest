package com.example.customtopappbar.screen

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.customtopappbar.R
import com.example.customtopappbar.data.InvestList

@Composable
fun DetailScreen(investList: InvestList) {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        BoxWithConstraints {
            Surface {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(scrollState)
                ) {
                    //DetailHeader
                    DetailHeader(
                        investList = investList,
                        containerHeight = this@BoxWithConstraints.maxHeight
                    )
                    //DetailContent
                    DetailContent(
                        investList = investList,
                        containerHeight = this@BoxWithConstraints.maxHeight
                    )
                }
            }
        }
    }
}

@Composable
private fun DetailHeader(
    investList: InvestList,
    containerHeight: Dp
) {
    Image(
        modifier = Modifier
            .heightIn(max = containerHeight / 2)
            .fillMaxWidth(),
        painter = painterResource(id = investList.imageList),
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}

@Composable
private fun DetailContent(investList: InvestList, containerHeight: Dp) {
    Column {
        //Title
        Title(investList = investList)
        //DetailProperty
        DetailProperty(
            label = stringResource(id = R.string.sex),
            value = investList.sex,

            )
        DetailProperty(
            label = stringResource(id = R.string.age),
            value = investList.age.toString(),
        )
        DetailProperty(
            label = stringResource(id = R.string.personality),
            value = investList.description,
        )
    }

    Spacer(modifier = Modifier.height((containerHeight - 320.dp).coerceAtLeast(0.dp)))
}

@Composable
private fun Title(investList: InvestList) {
    Column(
        modifier = Modifier
            .padding(16.dp)
    ) {
        Text(
            text = investList.title,
            style = MaterialTheme.typography.h5,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun DetailProperty(label: String, value: String) {
    Column(
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp, bottom = 20.dp)
    ) {
        Divider()
        Text(
            text = label,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.caption
        )
        Text(
            text = value,
            modifier = Modifier.height(50.dp),
            style = MaterialTheme.typography.body1
        )
    }
}