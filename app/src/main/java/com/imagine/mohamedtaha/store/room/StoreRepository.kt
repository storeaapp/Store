package com.imagine.mohamedtaha.store.room

import androidx.annotation.WorkerThread
import com.imagine.mohamedtaha.store.room.data.*
import kotlinx.coroutines.flow.Flow

class StoreRepository(private val storeDao: StoreDao) {
    //_____________________________Methods Categories____________________________

    val getAllCategories :Flow<List<Categories>> = storeDao.getAllCategories()
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insertCategory(categories: Categories){
        storeDao.insertCategory(categories)
    }
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun updateCategory(id:Long,category_name:String,natural_category:String,notes:String,update_date:String){
        storeDao.updateCategory(id,category_name,natural_category ,notes,update_date)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun deleteCategory(id:Long){
        storeDao.deleteCategory(id)
    }
    //_____________________________Methods Permissions____________________________

    val getAllPermissions :Flow<List<Permissions>> = storeDao.getAllPermission()
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insertPermissions(permissions: Permissions){
        storeDao.insertPermissions(permissions)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun updatePermissions(id:Long,permission_name:String,notes:String,update_date:String){
        storeDao.updatePermissions(id,permission_name,notes,update_date)
    }
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun updatePermissions(permissions: Permissions){
        storeDao.updatePermissions(permissions)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun deletePermission(id:Long){
        storeDao.deletePermission(id)
    }


    //_____________________________Methods Stores____________________________

    val getAllStores :Flow<List<Stores>> = storeDao.getAllStores()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insertStores(stores: Stores){
        storeDao.insertStore(stores)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun updateStore(id:Long,type_store:String,notes:String,update_date:String){
        storeDao.updateStore(id,type_store,notes,update_date)
    }
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun deleteStore(id:Long){
        storeDao.deleteStore(id)
    }

    //_____________________________Methods Convert Store____________________________
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insertConvertStore(convertStores: ConvertStores){
        storeDao.insertConvertStore(convertStores)
    }
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun updateConvertStore(id:Long,convert_store:String,notes:String,update_date: String){
        storeDao.updateConvertStore(id,convert_store,notes,update_date)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun deleteConvertStore(id:Long){
        storeDao.deleteConvertStore(id)
    }





    val getAllStokeHouseByCategoryAndStory: kotlinx.coroutines.flow.Flow<List<ItemStore>> = storeDao.getAllStokeHouseByCategoryAndStory()
    val getAllStokeWareHouse: kotlinx.coroutines.flow.Flow<List<StockingHouse>> = storeDao.getAllStokeWareHouse()
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insertStokeWarehouse(stockingHouse: StockingHouse){
        storeDao.insertStokeWarehouse(stockingHouse)
    }

}