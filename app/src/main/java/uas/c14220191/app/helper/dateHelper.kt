package uas.c14220191.app.helper

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object dateHelper {
    fun getCurrentDate(): String {
        val dateFormat = SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.getDefault())
        val date = Date()
        return dateFormat.format(date)
    }
}