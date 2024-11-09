package com.example.week7.route

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.week7.view.RestoDetail
import com.example.week7.view.RestoList

enum class RestoScreen {
    RestoList,
    RestoDetail
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppRouting() {
    val navController = rememberNavController()
    val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route
    val titleText = when (currentRoute) {
        RestoScreen.RestoList.name -> "Restaurant List"
        RestoScreen.RestoDetail.name + "/{id}" -> "Restaurant Detail"
        else -> "Restoran"
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        titleText,
                        fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
                    )
                }
            )
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = RestoScreen.RestoList.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = RestoScreen.RestoList.name) {
                RestoList(navController = navController)
            }

            composable(
                route = RestoScreen.RestoDetail.name + "/{id}",
                arguments = listOf(navArgument("id") { type = NavType.StringType })
            ) { backStackEntry ->
                val id = backStackEntry.arguments?.getString("id")
                if (id != null) {
                    RestoDetail(id)
                }
            }
        }
    }
}
