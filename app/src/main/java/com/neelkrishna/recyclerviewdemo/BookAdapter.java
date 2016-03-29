package com.neelkrishna.recyclerviewdemo;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by neelkrishna on 3/29/16.
 */
public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder>{

    public static class BookViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView title;
        ImageView cover;

        BookViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cardview);
            title = (TextView)itemView.findViewById(R.id.title);
            cover = (ImageView)itemView.findViewById(R.id.photo);
        }
    }

    List<Book> books;

    BookAdapter(List<Book> books){
        this.books = books;
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    @Override
    public BookViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view_layout, viewGroup, false);
        BookViewHolder bvh = new BookViewHolder(v);
        return bvh;
    }

    @Override
    public void onBindViewHolder(BookViewHolder bookViewHolder, int i) {

        bookViewHolder.title.setText(books.get(i).title);
        bookViewHolder.cover.setImageResource(books.get(i).photoId);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}