package com.example.listagemsimples;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String nomes[] = new String[]{"João", "Maria", "Cristina", "Marcos", "Eric", "Tâmara", "Joana", "Junior", "Bruna", "André"};
		ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.activity_main, nomes);
		setListAdapter(arrayAdapter);
		
		ListView listView = getListView();
		listView.setOnItemClickListener(new OnItemClickListener() {
			//Implementando metodo onItemClick...
			public void onItemClick(AdapterView arg0, View arg1, int arg2, long arg3) {
				//Ao pressionar algum item da lista irá exibir um Toast com o texto do item selecionado.
				Toast.makeText(getApplicationContext(), ((TextView) arg1).getText(), Toast.LENGTH_SHORT).show();
			}
		});

	}

}
