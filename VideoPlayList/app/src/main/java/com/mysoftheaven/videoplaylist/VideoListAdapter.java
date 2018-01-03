package com.mysoftheaven.videoplaylist;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by USER on 9/18/2017.
 */

public class VideoListAdapter extends ArrayAdapter<Video> {


    List<Video> videoList;

    //activity context
    Context context;

    //the layout resource file for the list items
    int resource;
    public VideoListAdapter(Context context, int resource, List<Video> videoList) {
        super(context, resource, videoList);
        this.context = context;
        this.resource = resource;
        this.videoList = videoList;
    }


    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //we need to get the view of the xml for our list item
        //And for this we need a layoutinflater
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        //getting the view
        View view = layoutInflater.inflate(resource, null, false);

        //getting the view elements of the list from the view
        TextView videoTitle = (TextView) view.findViewById(R.id.title);
        ImageView imageIcon = (ImageView) view.findViewById(R.id.play_icon_image);



        //getting the hero of the specified position
        Video contact = videoList.get(position);

        //adding values to the list item
        imageIcon.setImageDrawable(context.getResources().getDrawable(contact.getImage()));
        videoTitle.setText(contact.getTitle());


        //adding a click listener to the button to remove item from the list
      /*  textViewTelephone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //we will call this method to remove the selected value from the list
                //we are passing the position which is to be removed in the method


            }
        });*/


        //finally returning the view
        return view;
    }
}
