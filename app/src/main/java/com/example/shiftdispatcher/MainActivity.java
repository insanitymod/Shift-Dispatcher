package com.example.shiftdispatcher;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {

    private List<Agent> agents = new ArrayList<>();
    private Shop shop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Exemple statique pour tester
        shop = new Shop("Mon Magasin", "08:00", "18:00", 2);

        agents.add(new Agent("1", "Simo", 10));
        agents.add(new Agent("2", "Bob", 15));
        agents.add(new Agent("3", "Momo", 12));

        ScheduleGenerator generator = new ScheduleGenerator();
        List<Shift> schedule = generator.generateSchedule(agents, shop);

        // Affichage console (à remplacer par un affichage dans la vue)
        for (Shift shift : schedule) {
            Log.d("PLANNING", shift.toString());
        }
    }
}