package com.example.tarefa4;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragment_a extends Fragment {
    private EditText editText;
    private Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        editText = view.findViewById(R.id.editTextFragmentA);
        button = view.findViewById(R.id.buttonFragmentA);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = editText.getText().toString();
                Fragment_B fragmentB = Fragment_B.newInstance(userInput, "");

                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragmentB)
                        .commit();
            }
        });

        return view;
    }
}
