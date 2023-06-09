package com.example.seccion_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
  private ListView listView;
  private List<String> names;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    listView = (ListView) findViewById(R.id.listView);

    // Datos a mostrar
    names = new ArrayList<String>();
    names.add("Alejandro");
    names.add("Fernando");
    names.add("Ruben");
    names.add("Santiago");
    names.add("Carmen");
    names.add("Margarita");
    names.add("Juan");
    names.add("Jose");
    names.add("Alberto");
    names.add("Jolberth");
    names.add("Sherly");
    names.add("Emmanuel");
    names.add("Michael");
    names.add("Jaqueline");
    names.add("Ludwin");

    // Adaptador, la forma visual en que mostraremos nuestros datos
    // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);

    // Enlazamos el adaptador con nuestro List View
    // listView.setAdapter(adapter);

    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(ListActivity.this, "Clicked: "+ names.get(position), Toast.LENGTH_SHORT).show();
      }
    });

    // Enlazamos con nuestro adaptador personalizado
    MyAdapter myAdapter = new MyAdapter(this, R.layout.list_item, names);
    listView.setAdapter(myAdapter);
  }
}

