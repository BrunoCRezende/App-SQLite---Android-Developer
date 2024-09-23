package com.example.inventory.data

import androidx.room.TypeConverter
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class Converters {

    private val dateFormat = SimpleDateFormat("dd-MM-yyyy", Locale("pt","br"))

    @TypeConverter
    fun fromDate(date: Date?): String? {
        return date?.let {
            dateFormat.format(it)
        }
    }

    @TypeConverter
    fun toDate(dateString: String?): Date? {
        return dateString?.let {
            dateFormat.parse(it)
        }
    }
}
