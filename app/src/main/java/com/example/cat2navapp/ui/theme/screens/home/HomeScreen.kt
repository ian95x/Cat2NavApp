package com.example.cat2navapp.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cat2navapp.R
import com.example.cat2navapp.navigation.ROUTE_BMI
import com.example.cat2navapp.navigation.ROUTE_CALCULATOR
import com.example.cat2navapp.navigation.ROUTE_INTENT
import com.example.cat2navapp.ui.theme.Cat2NavAppTheme

@Composable
fun HomeScreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    )
    {
        Text(
            text = "CAT DESIGN",
            fontSize = 40.sp,
            modifier = Modifier
                .padding(start = 20.dp, top = 20.dp, bottom = 20.dp),
            color = Color.White,
            fontWeight = FontWeight.Bold

        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, bottom = 20.dp),
                horizontalArrangement = Arrangement.SpaceEvenly) {

                Card(
                    modifier = Modifier
                        .width(150.dp)
                        .height(100.dp),
                    elevation = CardDefaults
                        .cardElevation(defaultElevation = 10.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Red,
                    )
                ){
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Icon(painter = painterResource(id = R.drawable.baseline_play_circle_24),
                                contentDescription ="My icon",
                                tint = Color.Cyan
                            )
                        }
                        Column(modifier = Modifier
                            .background(Color.White)
                            .fillMaxWidth()
                            .height(70.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceEvenly)
                        {
                            Button(onClick = {
                                navController.navigate(ROUTE_INTENT)
                            }) {
                                Text(text = "Intent")

                            }


                        }
                    }



                }

                Card(
                    modifier = Modifier
                        .width(150.dp)
                        .height(100.dp),
                    elevation = CardDefaults
                        .cardElevation(defaultElevation = 10.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Red,
                    )
                ){
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Icon(painter = painterResource(id = R.drawable.baseline_calculate_24),
                                contentDescription ="My icon",
                                tint = Color.Cyan
                            )
                        }
                        Column(modifier = Modifier
                            .background(Color.White)
                            .fillMaxWidth()
                            .height(70.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceEvenly)
                        {
                            Button(onClick = {
                                navController.navigate(ROUTE_CALCULATOR)
                            }) {
                                Text(text = "Calculator")

                            }


                        }
                    }



                }

                Card(
                    modifier = Modifier
                        .width(150.dp)
                        .height(100.dp),
                    elevation = CardDefaults
                        .cardElevation(defaultElevation = 10.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Red,
                    )
                ){
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Icon(painter = painterResource(id = R.drawable.baseline_linear_scale_24),
                                contentDescription ="My icon",
                                tint = Color.Cyan
                            )
                        }
                        Column(modifier = Modifier
                            .background(Color.White)
                            .fillMaxWidth()
                            .height(70.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceEvenly)
                        {
                            Button(onClick = {
                                navController.navigate(ROUTE_BMI)
                            }) {
                                Text(text = "BMI")

                            }


                        }
                    }



                }


            }
        }

    }

}





@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    Cat2NavAppTheme {
        HomeScreen(rememberNavController())
    }

}
