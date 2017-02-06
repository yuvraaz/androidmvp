package com.antonioleiva.mvpexample.app.main.posts.adapters;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.antonioleiva.mvpexample.app.R;
import com.antonioleiva.mvpexample.app.model.pojo.Post;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PostsListAdapter extends RecyclerView.Adapter<PostsListAdapter.ViewHolder> {

    private List<Post> posts;

    public PostsListAdapter() {
        this.posts = new ArrayList<>();
    }

    public void addPosts(List<Post> newPosts) {
        posts.addAll(newPosts);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int position) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_row_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.postTitle.setText(posts.get(position).getTitle());
        viewHolder.postBody.setText(posts.get(position).getBody());
        viewHolder.image.setImageURI(Uri.parse("https://www.gstatic.com/webp/gallery/1.sm.jpg"));

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.post_title)
        TextView postTitle;
        @BindView(R.id.post_body)
        TextView postBody;

        @BindView(R.id.baseline_jpeg)
        SimpleDraweeView image;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

}
