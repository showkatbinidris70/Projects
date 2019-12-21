package com.bitm.retrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private UserAdapter userAdapter;
    private List<User> users;
    private RetrofitInterface retrofitInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        getData();

    }

    private void getData() {

        retrofitInterface = ApiClient.getInstance().getApi();
       Call<List<User>> call = retrofitInterface.getAllData();
       call.enqueue(new Callback<List<User>>() {
           @Override
           public void onResponse(Call<List<User>> call, Response<List<User>> response) {

               users = response.body();
               userAdapter = new UserAdapter(users);
               recyclerView.setAdapter(userAdapter);
           }

           @Override
           public void onFailure(Call<List<User>> call, Throwable t) {
               Toast.makeText(MainActivity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();
           }
       });
    }

    private void init() {
        recyclerView = findViewById(R.id.modelUserDesign);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        users = new ArrayList<>();

    }
}
