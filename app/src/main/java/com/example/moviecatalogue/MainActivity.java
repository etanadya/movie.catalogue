package com.example.moviecatalogue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private MovieAdapter adapter;
    private String[] dataJudul;
    private String[] dataDeskripsi;
    private TypedArray dataPhoto;
    private ArrayList<Movie> movies;

//    private String[] dataTglTayang;
//    private String[] dataNamaDirector;
//    private String[] dataNamaScreenplay;
//    private String[] dataIsiRate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.lv_list);
        adapter = new MovieAdapter(this);

        listView.setAdapter(adapter);

        prepare();
        addItem();



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent sendData = new Intent(MainActivity.this, MovieDetail.class);
                sendData.putExtra(MovieDetail.EXTRA_MOVIE, movies.get(i));
                startActivity(sendData);
                //Toast.makeText(MainActivity.this, movies.get(i).getNama(), Toast.LENGTH_SHORT).show();

            }
        });
    }


    private void prepare() {
        dataJudul = getResources().getStringArray(R.array.data_judul_film);
        dataDeskripsi = getResources().getStringArray(R.array.data_deskripsi_film);
        dataPhoto = getResources().obtainTypedArray(R.array.data_photo);
//
//        dataTglTayang = getResources().getStringArray(R.array.data_tglTayang);
//        dataNamaDirector = getResources().getStringArray(R.array.data_director);
//        dataNamaScreenplay = getResources().getStringArray(R.array.data_screen_play);
//        dataIsiRate = getResources().getStringArray(R.array.data_rate_film);
    }

    private void addItem() {
        movies = new ArrayList<>();

        for (int i = 0; i < dataJudul.length; i++) {
            Movie movie = new Movie();
            movie.setPhoto(dataPhoto.getResourceId(i, -1));
            movie.setJudul(dataJudul[i]);
            movie.setDeskripsi(dataDeskripsi[i]);

//            movie.setTglTayang(dataTglTayang[i]);
//            movie.setDirector(dataNamaDirector[i]);
//            movie.setScreenplay(dataNamaScreenplay[i]);
//            movie.setRate(dataIsiRate[i]);

            movies.add(movie);
        }
        adapter.setMovies(movies);
    }


    @Override
    public void onClick(View view) {
    }
}






















