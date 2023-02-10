package com.example.fragmenttry;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DefinitionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DefinitionFragment extends Fragment {

    TextView tvConcept,tvDefinition;
    public DefinitionFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_definition, container, false);
        tvConcept= (TextView) view.findViewById(R.id.concepts);
        tvDefinition= (TextView)view.findViewById(R.id.definition);
        return view;
    }

    public void display(String concept, String definition){
        tvConcept.setText(concept);
        tvDefinition.setText(definition);

    }
}