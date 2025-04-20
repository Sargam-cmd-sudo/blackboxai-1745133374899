package com.example.electorsparties

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Elector::class, Party::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun electorDao(): ElectorDao
    abstract fun partyDao(): PartyDao
}
