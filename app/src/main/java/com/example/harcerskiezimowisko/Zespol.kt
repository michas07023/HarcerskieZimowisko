package com.example.harcerskiezimowisko

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

class Zespol {
    @Entity(primaryKeys = ["nazwaZespol","czlonek1", "czlonek2", "czlonek3", "czlonek4","czonek5","pytanie"])
    data class Zespol(
         val nazwaZespol: String?,
         val czlonek1: String?,
         val czlonek2: String?,
         val czlonek3: String?,
         val czlonek4: String?,
         val czlonek5: String?,
         var pytanie: Int?
    )
}