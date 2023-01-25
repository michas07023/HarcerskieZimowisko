package com.example.harcerskiezimowisko

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Zespol(
    @PrimaryKey @ColumnInfo(name = "rowid") val id: Int,
    @ColumnInfo(name = "Zespol") val Zespol: String?,
    @ColumnInfo(name = "Czlonek") val Czlonek: String?,
    @ColumnInfo(name = "pytanie") val Pytanie: Int?
    )
