package com.example.android.wearable.composestarter.presentation.screensimport androidx.compose.foundation.layout.*import androidx.compose.runtime.*import androidx.compose.ui.Alignmentimport androidx.compose.ui.Modifierimport androidx.compose.ui.draw.clipimport androidx.compose.ui.draw.scaleimport androidx.compose.ui.graphics.Colorimport androidx.compose.ui.graphics.RectangleShapeimport androidx.compose.ui.unit.dpimport androidx.navigation.NavControllerimport androidx.wear.compose.material.*import com.example.android.wearable.composestarter.presentation.theme.wearColorPalette@Composablefun HomeScreen(navController: NavController) {    Scaffold(modifier = Modifier.fillMaxSize()) {        var cButton by remember { mutableStateOf(false) }        var nButton by remember { mutableStateOf(false) }        var checked by remember { mutableStateOf(false) }        Column(            modifier = Modifier                .fillMaxSize()                .padding(16.dp),            verticalArrangement = Arrangement.Center,            horizontalAlignment = Alignment.CenterHorizontally        ) {            Row(                modifier = Modifier                    .fillMaxWidth()                    .padding(horizontal = 16.dp, vertical = 8.dp),                horizontalArrangement = Arrangement.SpaceBetween,                verticalAlignment = Alignment.CenterVertically            ) {                Text(text = "Compact Button",                    color = if (cButton) wearColorPalette.primary                    else wearColorPalette.primaryVariant)                CompactButton(                    modifier = Modifier.clip(shape = RectangleShape),                    onClick = { cButton = !cButton }) {                }            }            Row(                modifier = Modifier                    .fillMaxWidth()                    .padding(8.dp),                horizontalArrangement = Arrangement.SpaceBetween,                verticalAlignment = Alignment.CenterVertically            ) {                Text(                    text = "Normal Button",                    color = if (nButton) wearColorPalette.primary                    else wearColorPalette.primaryVariant                )                Button(onClick = { nButton = !nButton }) {                }            }            Row(                modifier = Modifier                    .fillMaxWidth()                    .padding(horizontal = 16.dp, vertical = 8.dp),                horizontalArrangement = Arrangement.SpaceBetween,                verticalAlignment = Alignment.CenterVertically            ) {                Text(text = "Toggle Button",                    color = if (checked) wearColorPalette.primary                    else wearColorPalette.primaryVariant)                ToggleButton(checked = checked, onCheckedChange = {                    checked = !checked                }) {                }            }        }    }}