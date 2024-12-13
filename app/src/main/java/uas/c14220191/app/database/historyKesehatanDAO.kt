package uas.c14220191.app.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface historyKesehatanDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(history: historyKesehatan)

    @Query("UPDATE historyKesehatan SET waktu = NOW(), beratBadan=:isi_beratBadan, tekananDarah=:isi_tekananDarah, catatan=:isi_catatan WHERE id = :pilihid")
    fun update(isi_beratBadan: Int, isi_tekananDarah: Int, isi_catatan: String, pilihid: Int)

    @Query("SELECT * FROM historyKesehatan ORDER BY id ASC")
    fun selectAll(): MutableList<historyKesehatan>



}