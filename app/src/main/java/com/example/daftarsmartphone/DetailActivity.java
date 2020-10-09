package com.example.daftarsmartphone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {
    ImageView img;
    TextView txtnama2, txtklan2, txtdesk;
    String isinama, isiklan, isidesk, isifoto;
    //String imgbaru = String.valueOf(img);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        img = findViewById(R.id.img_tokoh);


        txtnama2 = findViewById(R.id.txt_nama2);
        txtklan2 = findViewById(R.id.txt_klan2);
        txtdesk = findViewById(R.id.txt_desk);



        isinama = getIntent().getStringExtra("txtnama");
        txtnama2.setText(isinama);

        isiklan = getIntent().getStringExtra("txtklan");
        txtklan2.setText(isiklan);

        isidesk = getIntent().getStringExtra("txtdesk");
        txtdesk.setText(isidesk);

        isifoto = getIntent().getStringExtra("image");
        //img.setImageResource(Integer.parseInt(String.valueOf(isifoto)));
        Glide.with(this)
                .load(isifoto)
                .apply(new RequestOptions().override(1000, 1000))
                .into(img);

    }
}
