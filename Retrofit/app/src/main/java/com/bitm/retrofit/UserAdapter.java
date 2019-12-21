package com.bitm.retrofit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    private List<User> users;

    public UserAdapter(List<User> users) {
        this.users = users;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_user_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        User user = users.get(position);
        holder.userIDTV.setText(String.valueOf(user.getUserId()));
        holder.idTV.setText(user.getId());
        holder.titleTV.setText(user.getTitle());
        holder.bodyTV.setText(user.getBody());

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView userIDTV, idTV, titleTV, bodyTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            userIDTV.findViewById(R.id.userIdTV);
            idTV.findViewById(R.id.idTV);
            titleTV.findViewById(R.id.titleTV);
            bodyTV.findViewById(R.id.bodyTV);

        }
    }
}
