package com.example.roomdatabase_015.view.uicontroller

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.roomdatabase_015.view.EntrySiswaScreen
import com.example.roomdatabase_015.view.HomeScreen
import com.example.roomdatabase_015.view.route.DestinasiEntry
import com.example.roomdatabase_015.view.route.DestinasiHome
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.roomdatabase_015.view.DetailSiswaScreen
import com.example.roomdatabase_015.view.route.DestinasiDetailSiswa
import com.example.roomdatabase_015.view.route.DestinasiDetailSiswa.itemIdArg

@Composable
fun SiswaApp(navController: NavHostController= rememberNavController(), modifier: Modifier) {
    HostNavigasi(navController = navController)
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    NavHost(navController = navController, startDestination = DestinasiHome.route, modifier = Modifier)
    {
        composable(DestinasiHome.route) {
            HomeScreen(
                navigateToItemEntry = {navController.navigate(DestinasiEntry.route)}
            )
        }
        composable(DestinasiEntry.route) {
            EntrySiswaScreen(navigateBack = { navController.popBackStack() })
        }
        //edit 2: tambahkan 2 composable route
        composable(route = DestinasiDetailSiswa.routeWithArgs,

