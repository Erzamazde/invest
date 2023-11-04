package com.example.customtopappbar.data

import java.io.Serializable

data class InvestList(
    val id: Int,
    val title: String,
    val sex: String,
    val age: Int,
    val description: String,
    val imageList: Int = 0
) : Serializable