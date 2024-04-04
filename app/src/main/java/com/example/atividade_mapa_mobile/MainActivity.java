package com.example.atividade_mapa_mobile;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.github.chrisbanes.photoview.PhotoView;


public class MainActivity extends AppCompatActivity {

    PhotoView photoView;
    TextView titulo;
    TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        photoView = (PhotoView) findViewById(R.id.photo_view);
        photoView.setImageResource(R.drawable.mapa_regiao_sul);
        titulo = (TextView) findViewById(R.id.titulo);
        info = (TextView) findViewById(R.id.informacoes);

    }

    public void pesquisarEstado(View view){

    }
}
