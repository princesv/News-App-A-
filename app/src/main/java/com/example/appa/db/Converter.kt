package com.example.appa.db

import androidx.room.TypeConverter
import com.example.appa.pojo.Source

class Converter {
    @TypeConverter
     fun fromSource(source: Source) {
         source.name
     }

    @TypeConverter
    fun toSource(name: String){
        Source(name,name)
    }
}