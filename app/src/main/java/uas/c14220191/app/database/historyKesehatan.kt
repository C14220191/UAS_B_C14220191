package uas.c14220191.app.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class historyKesehatan(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int = 0,

    @ColumnInfo(name = "waktu")
    val tanggal: String? = null,

    @ColumnInfo(name = "beratBadan")
    val beratBadan: Int? = null,

    @ColumnInfo(name = "tekananDarah")
    val tekananDarah: Int? = null,

    @ColumnInfo(name = "catatan")
    val catatan: String? = null,

)
