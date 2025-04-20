package com.example.electorsparties

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import androidx.room.Delete

@Dao
interface PartyDao {

    @Query("SELECT * FROM parties")
    suspend fun getAllParties(): List<Party>

    @Insert
    suspend fun insertParty(party: Party)

    @Update
    suspend fun updateParty(party: Party)

    @Delete
    suspend fun deleteParty(party: Party)
}
