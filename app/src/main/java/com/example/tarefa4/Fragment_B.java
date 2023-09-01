package com.example.tarefa4;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_B extends Fragment {
    private TextView textView;

    // Método newInstance para criar uma nova instância de Fragment_B
    public static Fragment_B newInstance(String userInput, String param2) {
        Fragment_B fragment = new Fragment_B();
        Bundle args = new Bundle();
        args.putString("param1", userInput);
        args.putString("param2", param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment__b, container, false);
        textView = view.findViewById(R.id.textViewFragmentB);

        Bundle bundle = getArguments();
        if (bundle != null) {
            String userInput = bundle.getString("param1");
            textView.setText(userInput);
        }

        return view;
    }
}
