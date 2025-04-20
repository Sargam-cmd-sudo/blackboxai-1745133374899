package com.example.electorsparties

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "parties")
data class Party(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    var name: String
)
