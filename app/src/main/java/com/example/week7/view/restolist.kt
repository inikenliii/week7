package com.example.week7.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.week7.R
import com.example.week7.model.RestoData
import com.example.week7.route.AppRouting
import com.example.week7.route.RestoScreen
import com.example.week7.viewmodel.viewmodelList

@Composable
fun RestoList(
    navController: NavController? = null,
    viewModel: viewmodelList = viewModel(),
    modifier: Modifier = Modifier
) {
    val resto by viewModel.resto.collectAsState()
    LazyColumn(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        items(resto) { restaurant ->
            RestoCard(
                restaurant,
                onCardClick = { navController?.navigate(RestoScreen.RestoDetail.name + "/${restaurant.id}") }
            )
        }
    }
}

@Composable
fun RestoCard(
    restaurant: RestoData, onCardClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        onClick = onCardClick,
                colors = CardDefaults.cardColors(
                containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(125.dp)
                    .clip(RoundedCornerShape(16.dp))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.baseline_image_24),
                    contentDescription = null,
                    modifier = Modifier.size(470.dp),
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(modifier = Modifier.width(12.dp))
            Column(modifier = Modifier.padding(top = 8.dp)) {
                Text(
                    text = restaurant.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.height(4.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_star_24),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "${restaurant.rating}", fontSize = 16.sp)
                }
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = restaurant.location, fontSize = 14.sp)
                Spacer(modifier = Modifier.height(6.dp))
                Row {
                    Text(
                        text = "${restaurant.distance} km ",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "from your house",
                        fontSize = 14.sp
                    )
                }
            }
        }
    }
    Spacer(modifier = Modifier.height(8.dp))
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun RestoListPreview() {
    RestoList()
}
