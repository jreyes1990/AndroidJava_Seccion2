package com.example.seccion_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
  private ListView listView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    listView = (ListView) findViewById(R.id.listView);

    // Datos a mostrar
    List<String> names = new ArrayList<String>();
    names.add("Alejandro");
    names.add("Fernando");
    names.add("Ruben");
    names.add("Santiago");

    // Adaptador, la forma visual en que mostraremos nuestros datos
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);

    // Enlazamos el adaptador con nuestro List View
    listView.setAdapter(adapter);
  }
}