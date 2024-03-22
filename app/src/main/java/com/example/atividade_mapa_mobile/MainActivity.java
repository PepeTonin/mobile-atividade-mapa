package com.example.atividade_mapa_mobile;

import static com.example.atividade_mapa_mobile.R.id.editText;
import static com.example.atividade_mapa_mobile.R.id.informacoes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText editText;
    PhotoView photoView;
    TextView titulo;
    TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        photoView = (PhotoView) findViewById(R.id.photo_view);
        photoView.setImageResource(R.drawable.mapa_regiao_sul);
        editText = (TextInputEditText) findViewById(R.id.editText);
        titulo = (TextView) findViewById(R.id.titulo);
        info = (TextView) findViewById(R.id.informacoes);

    }

    public void pesquisarEstado(View view){
        String entradaUsuario = editText.getText().toString().toLowerCase();
        if (entradaUsuario.equals("parana")){
            photoView.setImageResource(R.drawable.mapa_parana);
            titulo.setText("parana");
            info.setText("Área territorial: 199.298,981 km²\nPopulação residente: 11.444.380 pessoas\nDensidade demográfica: 57,42 hab/km²\nIDH: 0,769\nRenda mensal média: R$2.115");
        } else if (entradaUsuario.equals("santa catarina")) {
            photoView.setImageResource(R.drawable.mapa_santa_catarina);
            titulo.setText("santa catarina");
            info.setText("Área territorial: 95.730,690 km²\nPopulação residente: 7.610.361 pessoas\nDensidade demográfica: 79,50 hab/km²\nIDH: 0,792\nRenda mensal média: R$2.269");
        } else if (entradaUsuario.equals("rio grande do sul")) {
            photoView.setImageResource(R.drawable.mapa_rio_grande_do_sul);
            titulo.setText("rio grande do sul");
            info.setText("Área territorial: 281.707,151 km²\nPopulação residente: 10.882.965 pessoas\nDensidade demográfica: 38,63 hab/km²\nIDH: 0,771\nRenda mensal média: R$2.304");
        } else {
            titulo.setText("estado não encontrado");
        }
    }
}
