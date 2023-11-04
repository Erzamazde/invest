package com.example.customtopappbar.bottomnav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.customtopappbar.data.InvestList
import com.example.customtopappbar.screen.HomeScreen
import com.example.customtopappbar.screen.ProfileScreen
import com.example.customtopappbar.screen.ReportScreen

@Composable
fun BottomNavGraph(
    navController: NavHostController,
    navigateToDetail: (InvestList) -> Unit

){
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ){
        composable(route = BottomBarScreen.Home.route)
        {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Report.route)
        {
            ReportScreen(
                navigateToDetail

            )
        }
        composable(route = BottomBarScreen.Profile.route)
        {
            ProfileScreen()
        }
    }
}