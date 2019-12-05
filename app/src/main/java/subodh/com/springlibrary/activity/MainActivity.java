package subodh.com.springlibrary.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import subodh.com.recyclerviewanimation.animatedRecyclerView.AdapterCustomAnimationType;
import subodh.com.springlibrary.R;
import subodh.com.springlibrary.adapter.RecyclerAdapter;
import subodh.com.springlibrary.dataprovider.DataProvider;

public class MainActivity extends AppCompatActivity {


    RecyclerAdapter recyclerAdapter;
    RecyclerView recyclerView;
    AdapterCustomAnimationType TYPE = AdapterCustomAnimationType.SCALE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this, RecyclerView.VERTICAL, false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerAdapter = new RecyclerAdapter(MainActivity.this, DataProvider.getData(), recyclerView, TYPE);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerAdapter.notifyDataSetChanged();
    }

    public void scaleFromBottom(View view) {
        recyclerAdapter.clear();
        TYPE = AdapterCustomAnimationType.SLIDE_FROM_BOTTOM;
        recyclerAdapter = new RecyclerAdapter(MainActivity.this, DataProvider.getData(), recyclerView, TYPE);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerAdapter.notifyDataSetChanged();

    }

    public void scaleFromRight(View view) {
        recyclerAdapter.clear();
        TYPE = AdapterCustomAnimationType.SLIDE_FROM_RIGHT;
        recyclerAdapter = new RecyclerAdapter(MainActivity.this, DataProvider.getData(), recyclerView, TYPE);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerAdapter.notifyDataSetChanged();

    }

    public void slideFromLeft(View view) {
        recyclerAdapter.clear();
        TYPE = AdapterCustomAnimationType.SLIDE_FROM_LEFT;
        recyclerAdapter = new RecyclerAdapter(MainActivity.this, DataProvider.getData(), recyclerView, TYPE);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerAdapter.notifyDataSetChanged();

    }

    public void scale(View view) {
        recyclerAdapter.clear();
        TYPE = AdapterCustomAnimationType.SCALE;
        recyclerAdapter = new RecyclerAdapter(MainActivity.this, DataProvider.getData(), recyclerView, TYPE);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerAdapter.notifyDataSetChanged();

    }
}
