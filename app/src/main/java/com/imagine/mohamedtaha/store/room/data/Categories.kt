package com.imagine.mohamedtaha.store.room.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "categories")
data class Categories(@ColumnInfo(name = "category_name")var categoryName:String,@ColumnInfo(name = "natural_category")var naturalCategory:String,
                      @ColumnInfo(name = "notes")var notes:String) {
    @PrimaryKey(autoGenerate = true)var id:Long? = null
    @ColumnInfo(name = "created_at")var createdAt:String?=null
    @ColumnInfo(name = "time")var time:String?=null
    @ColumnInfo(name = "updated_at")var updatedAt:String?= null}