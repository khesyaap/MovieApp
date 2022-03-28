package com.khesya.idn.movieapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.khesya.idn.movieapp.models.Movies
import kotlinx.android.synthetic.main.movie_item.view.*

class MovieAdapter (
    private val movies: List<Movies>
        ) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>(){

    class MovieViewHolder(view: View) : RecyclerView.ViewHolder(view){
        private val IMAGE_BASE = "https://image.tmbd.org/t/p/w500/"
        fun bindMovie(movies: Movies){
            itemView.movie_title.text = movies.title
            itemView.movie_release_date.text = movies.release
            Glide.with(itemView).load(IMAGE_BASE + movies.poster).into(itemView.movie_poster)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        )
    }

    override fun getItemCount(): Int = movies.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bindMovie(movies.get(position))
    }


}