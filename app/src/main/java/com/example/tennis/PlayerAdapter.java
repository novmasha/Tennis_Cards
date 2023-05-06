package com.example.tennis;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.ViewHolder> {

    private final LayoutInflater inflater;
    private final List<Players> players;

    public PlayerAdapter(Context context, List<Players> players) {
        this.inflater = LayoutInflater.from(context);
        this.players = players;
    }

    @Override
    public PlayerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(PlayerAdapter.ViewHolder holder, int position) {
        Players player = players.get(position);
        holder.playerView.setImageResource(player.getPlayerResource());
        holder.nameView.setText(player.getName());
        holder.playerDescriptionView.setText(player.getPlayerDescription());
        holder.ratingView.setText(player.getRating());
    }


    @Override
    public int getItemCount() {
        return players.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        final ImageView playerView;
        final TextView nameView, playerDescriptionView, ratingView;

        ViewHolder(View view) {
            super(view);
            playerView = view.findViewById(R.id.playerResource);
            nameView = view.findViewById(R.id.name);
            playerDescriptionView = view.findViewById(R.id.playerDescription);
            ratingView = view.findViewById(R.id.rating);
        }
    }
}
