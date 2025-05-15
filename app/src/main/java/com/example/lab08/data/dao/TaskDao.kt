package com.example.lab08.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.lab08.data.model.Task


@Dao
interface TaskDao {
    //obtener todas las tareas
    @Query("SELECT * FROM tasks")
    suspend fun getAllTasks(): List<Task>

    //insertar  una nueva tarea
    @Insert
    suspend fun insertTask(task: Task)

    //marcar una tarea como terminado
    @Update
    suspend fun updateTask(task: Task)

    //eliminar una tarea
    @Query("DELETE FROM tasks")
    suspend fun deleteAllTasks()

}