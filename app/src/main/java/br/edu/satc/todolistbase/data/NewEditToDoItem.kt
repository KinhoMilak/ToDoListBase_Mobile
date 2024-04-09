package br.edu.satc.todolistbase.data

import android.icu.text.CaseMap.Title
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.EventLogTags.Description
import android.widget.Button
import android.widget.EditText
import androidx.room.Database
import androidx.room.Room
import br.edu.satc.todolistbase.R
import br.edu.satc.todolistbase.roomdatabase.ToDoItem

class NewEditToDoItem : AppCompatActivity() {

    private lateinit var newTitle:  EditText
    private lateinit var newDescription: EditText
    private lateinit var FirstButton: Button
    private lateinit var Db : Database

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_edit_to_do_item)
    }

    override fun onStart() {
        super.onStart()
        loadData()
    }

    private fun loadData() {
       // ToDoItem.clear()
       // ToDoItem.addAll(db.toDoItemList)
    }

    private fun save(){
        //cria
        val toDoItem = ToDoItem(
            null,
            newTitle.text.toString(),
            newDescription.text.toString(),
            false
        )
    }
}