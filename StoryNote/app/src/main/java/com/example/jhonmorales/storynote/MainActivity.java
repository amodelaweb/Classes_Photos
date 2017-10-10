package com.example.jhonmorales.storynote;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> nombrearchivos;
    private List<String> rutaarchivos;
    private ArrayAdapter<String> adaptador;
    private String directorioraiz;
    private TextView carpetaactual;
    GridView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carpetaactual = (TextView) findViewById(R.id.textoruta);
        lista= (GridView) findViewById(R.id.vistaarchivo);
        directorioraiz= Environment.getExternalStorageDirectory().getPath();
    }
}
