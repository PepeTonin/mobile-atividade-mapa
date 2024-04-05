package com.example.atividade_mapa_mobile;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.github.chrisbanes.photoview.PhotoView;


public class MainActivity extends AppCompatActivity {

    PhotoView photoView;
    TextView titulo;
    TextView tvAreaTerrit;
    TextView tvPopResid;
    TextView tvDensidDemog;
    TextView tvIdh;
    TextView tvRendaMensal;
    TextView tvTotalVeic;
    private CheckBox checkBoxAreaTerrit;
    private CheckBox checkBoxPopResid;
    private CheckBox checkBoxDensidDemog;
    private CheckBox checkBoxIdh;
    private CheckBox checkBoxRendaMensal;
    private CheckBox checkBoxTotalVeic;
    private RadioGroup radioGroupEscolhaEstado;
    private RadioButton radioButtonPr;
    private RadioButton radioButtonSc;
    private RadioButton radioButtonRs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        photoView = (PhotoView) findViewById(R.id.photo_view);
        photoView.setImageResource(R.drawable.mapa_regiao_sul);

        titulo = (TextView) findViewById(R.id.titulo);

        tvAreaTerrit = (TextView) findViewById(R.id.textViewAreaTerrit);
        tvPopResid = (TextView) findViewById(R.id.textViewPopResid);
        tvDensidDemog = (TextView) findViewById(R.id.textViewDensiDemog);
        tvIdh = (TextView) findViewById(R.id.textViewIdh);
        tvRendaMensal = (TextView) findViewById(R.id.textViewRendaMensal);
        tvTotalVeic = (TextView) findViewById(R.id.textViewTotalVeic);

        checkBoxAreaTerrit = (CheckBox) findViewById(R.id.checkBoxAreaTerrit);
        checkBoxPopResid = (CheckBox) findViewById(R.id.checkBoxPopResid);
        checkBoxDensidDemog = (CheckBox) findViewById(R.id.checkBoxDensiDemog);
        checkBoxIdh = (CheckBox) findViewById(R.id.checkBoxIdh);
        checkBoxRendaMensal = (CheckBox) findViewById(R.id.checkBoxRendaMensal);
        checkBoxTotalVeic = (CheckBox) findViewById(R.id.checkBoxTotalVeic);

        radioGroupEscolhaEstado = (RadioGroup) findViewById(R.id.radioGroupEscolhaEstado);
        radioButtonPr = (RadioButton) findViewById(R.id.radioBtnPr);
        radioButtonSc = (RadioButton) findViewById(R.id.radioBtnSc);
        radioButtonRs = (RadioButton) findViewById(R.id.radioBtnRs);

        radioButtonListener();
    }

    public void pesquisar(View view){
        checkBoxActions();
    }

    public void checkBoxActions(){
        if(radioButtonPr.isChecked() || radioButtonSc.isChecked() || radioButtonRs.isChecked()){
            if(checkBoxAreaTerrit.isChecked()){
                tvAreaTerrit.setVisibility(View.VISIBLE);
            } else {
                tvAreaTerrit.setVisibility(View.GONE);
            }

            if(checkBoxPopResid.isChecked()){
                tvPopResid.setVisibility(View.VISIBLE);
            } else {
                tvPopResid.setVisibility(View.GONE);
            }

            if(checkBoxDensidDemog.isChecked()){
                tvDensidDemog.setVisibility(View.VISIBLE);
            } else {
                tvDensidDemog.setVisibility(View.GONE);
            }

            if(checkBoxIdh.isChecked()){
                tvIdh.setVisibility(View.VISIBLE);
            } else {
                tvIdh.setVisibility(View.GONE);
            }

            if(checkBoxRendaMensal.isChecked()){
                tvRendaMensal.setVisibility(View.VISIBLE);
            } else {
                tvRendaMensal.setVisibility(View.GONE);
            }

            if(checkBoxTotalVeic.isChecked()){
                tvTotalVeic.setVisibility(View.VISIBLE);
            } else {
                tvTotalVeic.setVisibility(View.GONE);
            }
        }
    }

    public void radioButtonListener(){
        radioGroupEscolhaEstado.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radioBtnPr){
                    photoView.setImageResource(R.drawable.mapa_parana);

                    titulo.setText("parana");

                    tvAreaTerrit.setText("Área territorial: 199.298,981 km²");
                    tvPopResid.setText("População residente: 11.444.380 pessoas");
                    tvDensidDemog.setText("Densidade demográfica: 57,42 hab/km²");
                    tvIdh.setText("IDH: 0,769");
                    tvRendaMensal.setText("Renda mensal média: R$2.115");
                    tvTotalVeic.setText("Total de veículos: 8.575.905");
                } else if (checkedId == R.id.radioBtnSc) {
                    photoView.setImageResource(R.drawable.mapa_santa_catarina);

                    titulo.setText("santa catarina");

                    tvAreaTerrit.setText("Área territorial: 95.730,690 km²");
                    tvPopResid.setText("População residente: 7.610.361 pessoas");
                    tvDensidDemog.setText("Densidade demográfica: 79,50 hab/km²");
                    tvIdh.setText("IDH: 0,792");
                    tvRendaMensal.setText("Renda mensal média: R$2.269");
                    tvTotalVeic.setText("Total de veículos: 5.947.106");
                } else if (checkedId == R.id.radioBtnRs) {
                    photoView.setImageResource(R.drawable.mapa_rio_grande_do_sul);

                    titulo.setText("rio grande do sul");

                    tvAreaTerrit.setText("Área territorial: 281.707,151 km²");
                    tvPopResid.setText("População residente: 10.882.965 pessoas");
                    tvDensidDemog.setText("Densidade demográfica: 38,63 hab/km²");
                    tvIdh.setText("IDH: 0,771");
                    tvRendaMensal.setText("Renda mensal média: R$2.304");
                    tvTotalVeic.setText("Total de veículos: 7.869.630");
                }
            }
        });
    }
}
