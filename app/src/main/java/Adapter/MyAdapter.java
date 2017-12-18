package Adapter;

import android.app.LauncherActivity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mravi.myapplicationmd4.R;

import java.util.List;

import Model.ListItem;

/**
 * Created by mravi on 19-12-2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context context;

    private List<ListItem> listItems;

    public MyAdapter(Context context, List listitem) {
this.context=context;
        this.listItems=listitem;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row,parent,false);



        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {

        ListItem  item=listItems.get(position);



holder.name.setText(item.getName());
        holder.description.setText(item.getDescription());
holder.rating.setText(item.getRating());

    }

    @Override
    public int getItemCount() {
        //return 0;

   return listItems.size();

    }


    public class ViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener {

public TextView name;
        public TextView description;

public TextView rating;

        public ViewHolder(View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);
        name=(TextView)itemView.findViewById(R.id.title);
            description =(TextView)itemView.findViewById(R.id.description);
rating=(TextView)itemView.findViewById(R.id.rating);


        }

        @Override
        public void onClick(View view) {
            //get the position of the row clicked or taped
            int position=getAdapterPosition();
            ListItem item=listItems.get(position);
            Toast.makeText(context,item.getName(), Toast.LENGTH_SHORT).show();


        }
    }

}

