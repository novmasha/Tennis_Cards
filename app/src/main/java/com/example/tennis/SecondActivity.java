package com.example.tennis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    List<Players> players = new ArrayList<Players>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.list_player);

        PlayerAdapter adapter = new PlayerAdapter(this, players);

        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        players.add( new Players("Новак Джокович", "22 мая 1987 г.",
                R.drawable.djocovic, "1 место"));

        players.add( new Players("Рафаэль Надаль", "3 июня 1986 г.",
                R.drawable.nadal, "14 место"));

        players.add( new Players("Роджер Федерер", "8 августа 1981 г.",
                R.drawable.federer, "Закончил карьеру(жив и здоров)"));

        players.add( new Players("Доминик Тим", "3 сентября 1993 г.",
                R.drawable.thiem, "93 место"));

        players.add( new Players("Маттео Беретини", "12 апреля 1996 г.",
                R.drawable.matteo, "21 место"));
    }
}