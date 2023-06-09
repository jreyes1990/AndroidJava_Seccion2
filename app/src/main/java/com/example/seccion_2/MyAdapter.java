package com.example.seccion_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {
  private Context context;
  private int layout;
  private List<String> names;

  public MyAdapter(Context context, int layout, List<String> names) {
    this.context = context;
    this.layout = layout;
    this.names = names;
  }

  @Override
  public int getCount() {
    return this.names.size();
  }

  @Override
  public Object getItem(int position) {
    return this.names.get(position);
  }

  @Override
  public long getItemId(int id) {
    return id;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup viewGroup) {
    // View Holder Pattern
    ViewHolder holder;

    if (convertView == null){
      // Inflamos la vista que nos ha llegado con nuestro layout personalizado
      LayoutInflater layoutInflater = LayoutInflater.from(this.context);
      convertView = layoutInflater.inflate(this.layout, null);

      holder = new ViewHolder();

      // Referenciamos el elemento a modificar y lo rellenamos
      holder.nameTextView = (TextView) convertView.findViewById(R.id.textView);
      convertView.setTag(holder);
    }else{
      holder = (ViewHolder) convertView.getTag();
    }

    // Copiamos la vista
    // View v = convertView;

    // Nos traemos el valor actual dependiente de la posicion
    String currentName = names.get(position);

    // Referenciamos el elemento a modificar y lo rellenamos
    // TextView textView = (TextView) v.findViewById(R.id.textView);
    holder.nameTextView.setText(currentName);

    return convertView; // Devolvemos la vista inflada y modificada con nuestros datos
  }

  static class ViewHolder{
    private TextView nameTextView;
  }
}
