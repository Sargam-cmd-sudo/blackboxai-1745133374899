package com.example.electorsparties

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import androidx.room.Delete

@Dao
interface ElectorDao {

    @Query("SELECT * FROM electors")
    suspend fun getAllElectors(): List<Elector>

    @Query("SELECT * FROM electors WHERE partyId = :partyId")
    suspend fun getElectorsByParty(partyId: Int): List<Elector>

    @Insert
    suspend fun insertElector(elector: Elector)

    @Update
    suspend fun updateElector(elector: Elector)

    @Delete
    suspend fun deleteElector(elector: Elector)
}
