package com.example.aditya.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String [] listItem;
    String [] sublistItem;


    Integer [] imgid ={R.drawable.im1,R.drawable.im1,
            R.drawable.im1,R.drawable.im1,
            R.drawable.im2,R.drawable.im2,
            R.drawable.im2,R.drawable.im3,
            R.drawable.im3,R.drawable.im3,
            R.drawable.im3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listItem = getResources().getStringArray(R.array.Class_List);
        sublistItem = getResources().getStringArray(R.array.Class_subList);

        MyListAdapter adapter=new MyListAdapter(this, listItem, sublistItem,imgid);
        listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    //code specific to first list item
                    Toast.makeText(getApplicationContext(),"First Option",Toast.LENGTH_SHORT).show();
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Toast.makeText(getApplicationContext(),"Second Option",Toast.LENGTH_SHORT).show();
                }

                else if(position == 2) {

                    Toast.makeText(getApplicationContext(),"Third Option",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {

                    Toast.makeText(getApplicationContext(),"Forth Option",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {

                    Toast.makeText(getApplicationContext(),"Fifth Option",Toast.LENGTH_SHORT).show();
                }
                else if(position == 5) {

                    Toast.makeText(getApplicationContext(),"sixth Option",Toast.LENGTH_SHORT).show();
                }
                else if(position == 6) {

                    Toast.makeText(getApplicationContext(),"seventh option",Toast.LENGTH_SHORT).show();
                }
                else if(position == 7) {

                    Toast.makeText(getApplicationContext(),"eighth Option",Toast.LENGTH_SHORT).show();
                }
                else if(position == 8) {

                    Toast.makeText(getApplicationContext(),"ninth option",Toast.LENGTH_SHORT).show();
                }
                else if(position == 9) {

                    Toast.makeText(getApplicationContext(),"tenth option",Toast.LENGTH_SHORT).show();
                }
                else if(position == 10) {

                    Toast.makeText(getApplicationContext(),"competitive option",Toast.LENGTH_SHORT).show();
                }


            }
        });

    }

}
