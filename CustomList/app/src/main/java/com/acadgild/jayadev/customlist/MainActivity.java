package com.acadgild.jayadev.customlist;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView listview=(GridView)findViewById(R.id.listView);
        String[] imgnam={"Cupcake","Donut","Eclair","Froyo","GingerBread","Honeycomb","Ice Cream Sandwich","Jelly Bean","KitKat"};
        BaseAdaptorLearn learnadaptor=new BaseAdaptorLearn(this, imgnam);

        listview.setAdapter(learnadaptor);
    }

   /* public class listItems{
        Drawable name=null;
    }
    public List<listItems> getItems(){
        List<listItems> items=new ArrayList<listItems>();
        for(i=0;i<10;i++){
            listItems ob=new listItems();
            ob.name= getResources().getDrawable(R.drawable.and1);
            //ob.phno="PhoneNumber"+i;
            items.add(ob);
        }
        return items;
    }*/
}
