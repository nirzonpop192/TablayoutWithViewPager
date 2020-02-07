package com.example.tablayoutwithviewpager;


import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class BangladeshFragment extends Fragment {

    private CardView cardView;



    public BangladeshFragment() {
        // Required empty public constructor


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_bangladesh,container,false);

        cardView= view.findViewById(R.id.mrinalCardId);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId()==R.id.mrinalCardId)
                {
                    startActivity(new Intent(getActivity(),Main2Activity.class));
                }

            }
        });

        return view;

    }

}
