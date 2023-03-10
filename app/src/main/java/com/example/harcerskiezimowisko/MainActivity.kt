package com.example.harcerskiezimowisko

import android.os.Bundle
import android.telephony.SmsManager
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
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.room.*
import com.example.harcerskiezimowisko.ui.theme.HarcerskieZimowiskoTheme

class MainActivity : ComponentActivity() {
    @Database(entities = [Zespol::class], version = 1)
    abstract class AppDatabase : RoomDatabase() {
        abstract fun zespolDao(): ZespolDao
    }
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        pytania()
        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "Zespol"
        ).allowMainThreadQueries().build()
        if(db.zespolDao().getczlonek().isEmpty()){
         poczatek()
        } else{
            pytajnik()
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
    private fun pytajnik(){
        setContent {
            HarcerskieZimowiskoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Green),
                ) {
                    pytanie()
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
    private fun poczatek(){
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
    private fun ostrzezeniep(){
        setContent {
            HarcerskieZimowiskoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Green),
                ) {
                    pytanieo()
                }
            }
        }
    }
    private fun zakoncz(){
        setContent {
            HarcerskieZimowiskoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Green),
                ) {
                    koniec()
                }
            }
        }
    }
    private var pytanie:HashMap<Int, String> = HashMap()
    private var odp:HashMap<Int, String> = HashMap()
    private fun pytania(){
        pytanie[1] = "Nikt na ziemi nie szed?? t?? drog??. Co to za droga?"
        pytanie[2] = "785"
        pytanie[3] = "Gdy kupujemy, jest czarny. U??ywamy go- zmienia si?? w czerwony. Wyrzucamy ju?? szary. Co to jest?"
        pytanie[4] = "219"
        pytanie[5] = "Ile razy w ci??gu doby wskaz??wki zegara dwunastogodzinnego pokrywaj?? si???"
        pytanie[6] = "Jakie jest najwy??ej po??o??one schronisko g??rskie w Polsce?"
        pytanie[7] = "Marysia i Julia wysz??y razem na drinka. Obie zam??wi??y Sex On The Beach. Julia by??a naprawd?? spragniona i wypi??a pi???? drink??w w czasie, jaki zaj????o Marysi uko??czenie pierwszego. Napoje by??y zatrute, ale zmar??a tylko Marysia. Jak to mo??liwe? (4 s??owa)"
        pytanie[8] = "po kod prosz?? sie udac na zadanie do Basi"
        pytanie[9] = "Jakiej strefy przedwojennej Polski dotyczy??a -wojna na p??dzle-?"
        pytanie[10] = "Dlaczego Jastrz??biec?"
        pytanie[11] = "Jaki szcyt Tatr Zachodnich jest najwy??szy?"
        pytanie[12] = "998"
        pytanie[13] = "Najwi??kszy wodospad w Tatrach"
        pytanie[14] = "Kto by?? prezydemtem Rzeczypospolitej Zakopia??skiej?"
        pytanie[15] = "Jaki jest najwy??szy jar ca??ych Tatr?"
        pytanie[16] = "Czym zajmuj?? sie Klechdarz"
        pytanie[17] = "Najwy??ej po??ozona wyspa w Polsce. Na jakiej jest wysoko??ci?"
        pytanie[18] = "Jak nazywa?? si?? namalowany w 1896r. najwi??kszy polski obraz?"
        pytanie[19] = "Kto to jest tzw. nosicz w niekt??rych schroniskach"
        pytanie[20] = "Schronisko pod Wag?? inaczej?"

        odp[1] = "Droga Mleczna"
        odp[2] = "Zygmunt III"
        odp[3] = "W??giel"
        odp[4] = "Lodowy Stawek"
        odp[5] = "22"
        odp[6] = "Schronisko w Dolinie Pi??ciu Staw??w Polskich"
        odp[7] = "Trucizna by??a w lodzie"
        odp[8] = "Jaskinia Ariadny"
        odp[9] = "Turystyki"
        odp[10] = "Od rodowego herbu zasad??cy, Wiktoryna Zdanowskiego, kt??ry by?? szlachcicem"
        odp[11] = "Bystra"
        odp[12] = "Wielki Staw Polski"
        odp[13] = "Ci????ka Siklawa"
        odp[14] = "Stefan ??eromski"
        odp[15] = "Szkaradny ??leb"
        odp[16] = "zajmuje si?? opowiadaniem i wymy??laniem klechd"
        odp[17] = "1689 m n.p.m."
        odp[18] = "Panorama Tatr"
        odp[19] = "Tragarz Tatrza??ski"
        odp[20] = "Chata pod Rysami"


    }
    private var nazwazespolu: String? = null
    private fun setZespol(nazwazespol:String?){
        nazwazespolu = nazwazespol
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
            Text(text = "Wpisz co?? w obu wierszach!", color = Color.Red)
            Spacer(modifier = Modifier.height(48.dp))
            setludzie(ilosc)
            setZespol(nazwa)
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
            setZespol(nazwa)
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
    fun odpowiedz(value: String, onValueChange: (String) -> Unit){
        TextField(
            value = value,
            onValueChange = onValueChange,

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
                } else {
                    zapisz(czlonek1 = czlekj, czlonek2 = czlekd, czlonek3 = czlek3, czlonek4 = czlek4, czlonek5 = czlek5 )
                }}, modifier = Modifier
                    .height(40.dp)
                    .width(200.dp)
            ) {
                Text(text = stringResource(id = R.string.dalej))
            }
        }

    }
    private fun zapisz(czlonek1: String?,czlonek2: String?,czlonek3: String?,czlonek4: String?,czlonek5: String?){
        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "Zespol"
        ).allowMainThreadQueries().build()

        var zespol =  Zespol(1,nazwazespolu,czlonek1,1)
        db.zespolDao().insertAll(zespol)
        zespol =  Zespol(2,null,czlonek2,null)
        db.zespolDao().insertAll(zespol)
        zespol =  Zespol(3,null,czlonek3,null)
        db.zespolDao().insertAll(zespol)
        zespol =  Zespol(4,null,czlonek4,null)
        db.zespolDao().insertAll(zespol)
        zespol =  Zespol(5,null,czlonek5,null)
        db.zespolDao().insertAll(zespol)
        var tel = SmsManager.getDefault()
        tel.sendTextMessage("725262205", null, "Zespo??owi: " + db.zespolDao().getzespol()[0] + " uda??o si?? zapisa?? z cz??onkami " + db.zespolDao().getczlonek(), null, null)
        pytajnik()
    }

    @Dao
    interface ZespolDao{
        @Update
        fun update(pytanie: Zespol)
        @Insert(onConflict = OnConflictStrategy.REPLACE)
        fun insertAll(vararg zespol: Zespol)


        @Query("SELECT pytanie FROM Zespol")
        fun getpytanie(): List<Int?>

        @Query("SELECT czlonek FROM Zespol")
        fun getczlonek(): List<String?>

        @Query("SELECT Zespol FROM Zespol")
        fun getzespol(): List<String?>
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
            Text(text = "Wpisz wszystkie osoby", color = Color.Red)
            Spacer(modifier = Modifier.height(48.dp))
            Button(
                onClick = { if (czlekj.isNullOrEmpty() ||czlekd.isNullOrEmpty() && typy!! > 1|| czlek3.isNullOrEmpty() && typy!! > 2 || czlek4.isNullOrEmpty()  && typy!! > 3|| czlek5.isNullOrEmpty() && typy!! > 4){
                    ostrzezenied()
                }else {
                    zapisz(czlonek1 = czlekj, czlonek2 = czlekd, czlonek3 = czlek3, czlonek4 = czlek4, czlonek5 = czlek5 )
                }}, modifier = Modifier
                    .height(40.dp)
                    .width(200.dp)
            ) {
                Text(text = stringResource(id = R.string.dalej))
            }
        }

    }
    @Composable
    fun pytanieo() {
        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "Zespol"
        ).allowMainThreadQueries().build()
        var odpowiedz by remember { mutableStateOf("") }
        var key = db.zespolDao().getpytanie()[0]
        var tresc = pytanie.get(key = key)
        Column(
            modifier = Modifier
                .padding(32.dp)
                .background(color = Color(1, 50, 32)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = tresc.toString(),
                color = Color.White,
                fontSize = 24.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(40.dp))
            odpowiedz(value = odpowiedz, onValueChange = {odpowiedz = it})
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "To nie jest prawid??owa odpowied??! Spr??buj ponownie", color = Color.Red)
            Spacer(modifier = Modifier.height(48.dp))
            Button(
                onClick = {
                    if (odpowiedz.equals(odp.get(key = key)?.trim(), ignoreCase = true)){
                        var tel = SmsManager.getDefault()
                        tel.sendTextMessage("725262205", null, "Zespo??owi: " + db.zespolDao().getzespol()[0] + " uda??o si?? odpowiedzie?? na pytanie: " + db.zespolDao().getpytanie()[0], null, null)
                        poprawnie()
                        odpowiedz = ""
                    } else {
                        odpowiedz = ""
                        pytajnik()
                        Thread.sleep(1000)
                        ostrzezeniep()
                    }
                }, modifier = Modifier
                    .height(40.dp)
                    .width(200.dp)
            ) {
                Text(text = stringResource(id = R.string.dalej))
            }
        }

    }
    @Composable
    fun pytanie() {
        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "Zespol"
        ).allowMainThreadQueries().build()
        var odpowiedz by remember { mutableStateOf("") }
        var key = db.zespolDao().getpytanie()[0]
        var tresc = pytanie.get(key = key)
        Column(
            modifier = Modifier
                .padding(32.dp)
                .background(color = Color(1, 50, 32)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = tresc.toString(),
                color = Color.White,
                fontSize = 24.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(40.dp))
            odpowiedz(value = odpowiedz, onValueChange = {odpowiedz = it})
            Spacer(modifier = Modifier.height(48.dp))
            Button(
                onClick = {
                    if (odpowiedz.equals(odp.get(key = key)?.trim(), ignoreCase = true) ){
                        var tel = SmsManager.getDefault()
                        tel.sendTextMessage("725262205", null, "Zespo??owi: " + db.zespolDao().getzespol()[0] + " uda??o si?? odpowiedzie?? na pytanie: " + db.zespolDao().getpytanie()[0], null, null)
                        poprawnie()
                        odpowiedz = ""
                    } else {
                        odpowiedz = ""
                        pytajnik()
                        Thread.sleep(1000)
                        ostrzezeniep()
                    }
                 }, modifier = Modifier
                    .height(40.dp)
                    .width(200.dp)
            ) {
                Text(text = stringResource(id = R.string.dalej))
            }
        }

    }
    private fun poprawnie(){
        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "Zespol"
        ).allowMainThreadQueries().build()
        var numerpyt = db.zespolDao().getpytanie()[0]
        if (numerpyt != 20) {
            if (numerpyt != null) {
                numerpyt += 1
                db.zespolDao().update(Zespol(1, db.zespolDao().getzespol()[0], db.zespolDao().getczlonek()[0], numerpyt))
                pytajnik()
            }
        } else {
            zakoncz()
        }
    }
    @Composable
    fun koniec(){
        Column(
            modifier = Modifier
                .padding(32.dp)
                .background(color = Color(1, 50, 32)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Gratulujacje!",
                color = Color.White,
                fontSize = 40.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Uko??czyli??cie gr??! Oczekujcie nagrody!",
                color = Color.White,
                fontSize = 32.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
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
            pytanieo()
        }
    }
}