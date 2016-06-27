package com.example.clarkhinchcliff.androidtodo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> todoItems;
    ArrayAdapter<String> toDoAdapter;
    ListView lvItems;
    EditText todoSubmitText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populateArrayItems();
        lvItems = (ListView) findViewById(R.id.lvItems);
        lvItems.setAdapter(toDoAdapter);
        todoSubmitText = (EditText) findViewById(R.id.todoSubmitText);
    }

    public void populateArrayItems() {
        todoItems = new ArrayList<String>();
        todoItems.add("Eat a house");
        todoItems.add("Build the pizza");
        todoItems.add("Paint the application");
        toDoAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, todoItems);
    }

    public void onSubmitItem(View view) {
        toDoAdapter.add(todoSubmitText.getText().toString());
        todoSubmitText.setText("");
    }
}
