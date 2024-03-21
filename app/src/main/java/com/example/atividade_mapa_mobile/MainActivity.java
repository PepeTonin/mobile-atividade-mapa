package com.example.atividade_mapa_mobile;

import static com.example.atividade_mapa_mobile.R.id.editText;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        photoView = (PhotoView) findViewById(R.id.photo_view);
        photoView.setImageResource(R.drawable.mapa_regiao_sul);
        editText = (TextInputEditText) findViewById(R.id.editText);
        titulo = (TextView) findViewById(R.id.titulo);

    }

    public void pesquisarEstado(View view){
        String entradaUsuario = editText.getText().toString().toLowerCase();
        if (entradaUsuario.equals("parana")){
            photoView.setImageResource(R.drawable.mapa_parana);
            titulo.setText("parana");
        } else if (entradaUsuario.equals("santa catarina")) {
            photoView.setImageResource(R.drawable.mapa_santa_catarina);
            titulo.setText("santa catarina");
        } else if (entradaUsuario.equals("rio grande do sul")) {
            photoView.setImageResource(R.drawable.mapa_rio_grande_do_sul);
            titulo.setText("rio grande do sul");
        } else {
            titulo.setText("estado não encontrado");
        }
    }
}
