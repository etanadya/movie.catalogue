package com.example.moviecatalogue;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MovieDetail extends AppCompatActivity {

    public static final String EXTRA_MOVIE = "extra_movie";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_movie_detail);

        Movie movie = getIntent().getParcelableExtra(EXTRA_MOVIE);

        if (movie != null) {
            TextView tvJudulDetail = findViewById(R.id.tv_judul_detail);
            tvJudulDetail.setText(movie.getJudul());

            TextView tvTglTayang = findViewById(R.id.tv_tglTayang);
            tvTglTayang.setText(movie.getTglTayang());

            TextView tvNamaDirector = findViewById(R.id.tv_namaDirector);
            tvNamaDirector.setText(movie.getDirector());

            TextView tvNamaScreenplay = findViewById(R.id.tv_namaScreenplay);
            tvNamaScreenplay.setText(movie.getScreenplay());

            TextView tvDeskripsiDetail = findViewById(R.id.tv_deskripsi_isiDetail);
            tvDeskripsiDetail.setText(movie.getDeskripsi());

            TextView tvIsiRate = findViewById(R.id.tv_isiRate);
            tvIsiRate.setText(movie.getRate());

            ImageView imgPhotoDetail = findViewById(R.id.img_photo_detail);
            imgPhotoDetail.setImageResource(movie.getPhoto());
        }


    }


}
