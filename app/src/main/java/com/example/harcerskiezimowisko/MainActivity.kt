package com.example.harcerskiezimowisko

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update
import com.example.harcerskiezimowisko.ui.theme.HarcerskieZimowiskoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pytania()
        setContent {
            HarcerskieZimowiskoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Green),
                ) {
                    Pierwszy()

                }
            }
        }
    }
    private fun drugi(){
        setContent {
            HarcerskieZimowiskoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Green),
                ) {
                    Ludzie()
                }
            }
        }
    }
    private fun ostrzezenie(){
        setContent {
            HarcerskieZimowiskoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Green),
                ) {
                    PierwszyO()
                }
            }
        }
    }
    private fun ostrzezenied(){
        setContent {
            HarcerskieZimowiskoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Green),
                ) {
                    LudzieO()
                }
            }
        }
    }
    private var pytanie:HashMap<Int, String> = HashMap()
    private var odp:HashMap<Int, String> = HashMap()
    private fun pytania(){
        pytanie[1] = "Pytanie 1"
        pytanie[2] = "Pytanie 2"
        pytanie[3] = "Pytanie 3"
        pytanie[4] = "Pytanie 4"
        pytanie[5] = "Pytanie 5"
        pytanie[6] = "Pytanie 6"
        pytanie[7] = "Pytanie 7"
        pytanie[8] = "Pytanie 8"
        pytanie[9] = "Pytanie 9"
        pytanie[10] = "Pytanie 10"
        pytanie[11] = "Pytanie 11"
        pytanie[12] = "Pytanie 12"
        pytanie[13] = "Pytanie 13"
        pytanie[14] = "Pytanie 14"
        pytanie[15] = "Pytanie 15"
        pytanie[16] = "Pytanie 16"
        pytanie[17] = "Pytanie 17"
        pytanie[18] = "Pytanie 18"
        pytanie[19] = "Pytanie 19"
        pytanie[20] = "Pytanie 20"

        odp[1] = "odp 1"
        odp[2] = "odp 2"
        odp[3] = "odp 3"
        odp[4] = "odp 4"
        odp[5] = "odp 5"
        odp[6] = "odp 6"
        odp[7] = "odp 7"
        odp[8] = "odp 8"
        odp[9] = "odp 9"
        odp[10] = "odp 10"
        odp[11] = "odp 11"
        odp[12] = "odp 12"
        odp[13] = "odp 13"
        odp[14] = "odp 14"
        odp[15] = "odp 15"
        odp[16] = "odp 16"
        odp[17] = "odp 17"
        odp[18] = "odp 18"
        odp[19] = "odp 19"
        odp[20] = "odp 20"


    }
    private var typy: Int? = 0

    private fun setludzie(ilosc: Int?){
        typy = ilosc
    }
    @Composable
    fun PierwszyO(){
        var textinput by remember { mutableStateOf("") }
        val nazwa = textinput
        var amountinput by remember { mutableStateOf("") }
        val ilosc: Int? = amountinput.toIntOrNull()
        Column(
            modifier = Modifier
                .padding(32.dp)
                .background(color = Color(1, 50, 32)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.title),
                color = Color.White,
                fontSize = 24.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(8.dp))
            EdittextField(value = textinput, onChange ={textinput = it} )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = stringResource(id = R.string.subtitle),
                color = Color.White,
                fontSize = 24.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(8.dp))
            EditNumberField(value = amountinput, onValueChange = {amountinput = it} )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Wpisz coś w obu wierszach!", color = Color.Red)
            Spacer(modifier = Modifier.height(48.dp))
            setludzie(ilosc)
            Button(
                onClick = { wybor(nazwa = nazwa, ilosc = ilosc)}, modifier = Modifier
                    .height(40.dp)
                    .width(200.dp)
            ) {
                Text(text = stringResource(id = R.string.dalej))
            }
        }

    }
    @Composable
    fun Pierwszy() {
        var textinput by remember { mutableStateOf("") }
        val nazwa = textinput
        var amountinput by remember { mutableStateOf("") }
        val ilosc: Int? = amountinput.toIntOrNull()
        Column(
            modifier = Modifier
                .padding(32.dp)
                .background(color = Color(1, 50, 32)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.title),
                color = Color.White,
                fontSize = 24.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(8.dp))
            EdittextField(value = textinput, onChange ={textinput = it} )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = stringResource(id = R.string.subtitle),
                color = Color.White,
                fontSize = 24.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(8.dp))
            EditNumberField(value = amountinput, onValueChange = {amountinput = it} )
            Spacer(modifier = Modifier.height(48.dp))
            setludzie(ilosc)
            if(textinput == "Basia123" && amountinput == "6513"){

            }
            Button(
                onClick = { wybor(nazwa = nazwa, ilosc = ilosc)}, modifier = Modifier
                    .height(40.dp)
                    .width(200.dp)
            ) {
                Text(text = stringResource(id = R.string.dalej))
            }
        }
    }
    private fun wybor(nazwa: String, ilosc: Int?){
     if (nazwa.isNullOrEmpty() || ilosc ==null){
         ostrzezenie()
     }   else  {drugi()}
    }
    @Composable
    fun EdittextField(value: String, onChange: (String) -> Unit) {

        TextField(value = value,
            onValueChange = onChange
        )
    }

    @Composable
    fun EditNumberField(value: String, onValueChange: (String) -> Unit){

        TextField(
            value = value,
            onValueChange = onValueChange,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
    }

    @Composable
    fun Ludzie() {
        var czlekj by remember { mutableStateOf("") }
        var czlekd by remember { mutableStateOf("") }
        var czlek3 by remember { mutableStateOf("") }
        var czlek4 by remember { mutableStateOf("") }
        var czlek5 by remember { mutableStateOf("") }
        Column(
            modifier = Modifier
                .padding(32.dp)
                .background(color = Color(1, 50, 32)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.osoby),
                color = Color.White,
                fontSize = 24.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(16.dp))
            WpiszSie(
                valuej = czlekj,
                onWpisj = {czlekj = it},
                valued = czlekd,
                onWpisd = {czlekd = it},
                valuet = czlek3,
                onWpist = {czlek3 = it},
                valuec = czlek4,
                onWpisc = {czlek4 = it},
                valuep = czlek5,
                onWpisp = {czlek5 = it}
            )

            Spacer(modifier = Modifier.height(48.dp))
            Button(
                onClick = { if (czlekj.isNullOrEmpty() ||czlekd.isNullOrEmpty() && typy!! > 1|| czlek3.isNullOrEmpty() && typy!! > 2 || czlek4.isNullOrEmpty()  && typy!! > 3|| czlek5.isNullOrEmpty() && typy!! > 4){
                    ostrzezenied()
                }}, modifier = Modifier
                    .height(40.dp)
                    .width(200.dp)
            ) {
                Text(text = stringResource(id = R.string.dalej))
            }
        }

    }
    @Dao
    interface ZespolDao{
        @Update
        fun updateUsers(vararg zespoly: Zespol)
    }
    @Composable
    fun LudzieO() {
        var czlekj by remember { mutableStateOf("") }
        var czlekd by remember { mutableStateOf("") }
        var czlek3 by remember { mutableStateOf("") }
        var czlek4 by remember { mutableStateOf("") }
        var czlek5 by remember { mutableStateOf("") }
        Column(
            modifier = Modifier
                .padding(32.dp)
                .background(color = Color(1, 50, 32)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.osoby),
                color = Color.White,
                fontSize = 24.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(16.dp))
            WpiszSie(
                valuej = czlekj,
                onWpisj = {czlekj = it},
                valued = czlekd,
                onWpisd = {czlekd = it},
                valuet = czlek3,
                onWpist = {czlek3 = it},
                valuec = czlek4,
                onWpisc = {czlek4 = it},
                valuep = czlek5,
                onWpisp = {czlek5 = it}
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Wpisz coś w obu wierszach!", color = Color.Red)
            Spacer(modifier = Modifier.height(48.dp))
            Button(
                onClick = { if (czlekj.isNullOrEmpty() ||czlekd.isNullOrEmpty() && typy!! > 1|| czlek3.isNullOrEmpty() && typy!! > 2 || czlek4.isNullOrEmpty()  && typy!! > 3|| czlek5.isNullOrEmpty() && typy!! > 4){
                    ostrzezenied()
                }else{

                }}, modifier = Modifier
                    .height(40.dp)
                    .width(200.dp)
            ) {
                Text(text = stringResource(id = R.string.dalej))
            }
        }

    }
    @Composable
    fun WpiszSie( valuej: String, onWpisj: (String) -> Unit, valued: String, onWpisd: (String) -> Unit, valuet: String, onWpist: (String) -> Unit, valuec: String, onWpisc: (String) -> Unit, valuep: String, onWpisp: (String) -> Unit){
        when (typy){
            1 -> TextField(
                value = valuej,
                onValueChange = onWpisj,
                )
            2 -> {TextField(
                value = valuej,
                onValueChange = onWpisj,
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = valued,
                onValueChange = onWpisd,
            ) }
            3 -> {TextField(
                value = valuej,
                onValueChange = onWpisj,
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = valued,
                onValueChange = onWpisd,
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = valuet,
                onValueChange = onWpist,
            )     }
            4 -> {TextField(
                value = valuej,
                onValueChange = onWpisj,
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = valued,
                onValueChange = onWpisd,
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = valuet,
                onValueChange = onWpist,
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = valuec,
                onValueChange = onWpisc,
            )       }
            5 ->{TextField(
                value = valuej,
                onValueChange = onWpisj,
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = valued,
                onValueChange = onWpisd,
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = valuet,
                onValueChange = onWpist,
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = valuec,
                onValueChange = onWpisc,
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = valuep,
                onValueChange = onWpisp,
            )  }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        HarcerskieZimowiskoTheme {
            Pierwszy()
            Ludzie()
        }
    }
}