package com.example.medicalstore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class MyMovieAdapter  extends RecyclerView.Adapter<MyMovieAdapter.ViewHolder>{
   MyMovieData[] myMovieData;
   Context context;


   // view code of how many activity view of list of items like as:-
   


   public MyMovieAdapter(MyMovieData[] myMovieData,MainActivity2 activity2) {
      this.myMovieData = myMovieData;
      this.context = activity2;
   }
   public MyMovieAdapter(MyMovieData[] myMovieData,ten_percent ten_percent) {
      this.myMovieData = myMovieData;
      this.context = ten_percent;
   }
   public MyMovieAdapter(MyMovieData[] myMovieData,twenty_percent twenty_percent) {
      this.myMovieData = myMovieData;
      this.context = twenty_percent;
   }




   @NonNull
   @Override
   public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
      View view = layoutInflater.inflate(R.layout.movie_item_list,parent,false);
      ViewHolder viewHolder = new ViewHolder(view);
      return viewHolder;
   }

   @Override
   public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
      final MyMovieData myMovieDataList = myMovieData[position];
      holder.textViewName.setText(myMovieDataList.getMovieName());
      holder.textViewDate.setText(myMovieDataList.getMovieData());
      holder.movieImage.setImageResource(myMovieDataList.getMovieImage());

      holder.itemView.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            Toast.makeText(context, myMovieDataList.getMovieName(),Toast.LENGTH_SHORT).show();
         }
      });

   }

   @Override
   public int getItemCount() {
      return myMovieData.length;
   }

   public class ViewHolder extends RecyclerView.ViewHolder{
      ImageView movieImage;
      TextView textViewName;
      TextView textViewDate;



      public ViewHolder(@NonNull View itemView) {
         super(itemView);

         movieImage = itemView.findViewById(R.id.ImageView);
         textViewName = itemView.findViewById(R.id.textName);
         textViewDate = itemView.findViewById(R.id.textdate);
      }
   }
}
