package com.example.electorsparties

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey

@Entity(tableName = "electors",
    foreignKeys = [ForeignKey(entity = Party::class,
        parentColumns = ["id"],
        childColumns = ["partyId"],
        onDelete = ForeignKey.CASCADE)]
)
data class Elector(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    var name: String,
    var age: Int,
    var guardianName: String,
    var address: String,
    var houseNo: String,
    var idNumber: String,
    var serialNumber: String,
    var partyId: Int
)
