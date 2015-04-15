package com.serverus.todolist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by alvinvaldez on 4/12/15.
 */
public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.MyViewHolder>{
    private LayoutInflater inflater;

    private Context context;

    List<Data> data = Collections.emptyList();

    public ToDoAdapter(Context context, List<Data> data){
        inflater = LayoutInflater.from(context);

        this.data = data;
        this.context = context;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.todo_row, viewGroup, false);

        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int position) {

        Data current = data.get(position);

        myViewHolder.title.setText(current.todoItem);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView title;

        public MyViewHolder(View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.listText);

        }
    }
}
