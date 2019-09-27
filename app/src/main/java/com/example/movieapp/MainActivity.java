package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MovieAdapter movieAdapter;
    private List<Movie> movieList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        movieAdapter = new MovieAdapter(movieList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(movieAdapter);
        prepareMovieData();

    }
    private void prepareMovieData(){
        Movie movie = new Movie("Avenger EndGame","Action","2019");
        movieList.add(movie);
        movie = new Movie("IT 2","Horror","2019");
        movieList.add(movie);
        movie = new Movie("Toy Story 4","Science Friction","2019");
        movieList.add(movie);
        movie = new Movie("Angry Bird 2","Animation","2019");
        movieList.add(movie);
        movie = new Movie("Hell Boy 2","Action", "2019");
        movieList.add(movie);
        movie = new Movie("Spiderman Home Coming","Animation","2019");
        movieList.add(movie);
        movieAdapter.notifyDataSetChanged();

    }
}


