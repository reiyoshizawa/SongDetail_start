package com.example.android.fragmentexample;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleFragment extends Fragment {
    private static final  int YES = 0;
    private static final  int NO = 1;
    private static String name;

    public static SimpleFragment newInstance() {
        // factory method
        return new SimpleFragment();
    }

    public SimpleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_simple, container, false);
        final RadioGroup radioGroup = rootView.findViewById(R.id.radio_group);

        // set the listener (yes or no)
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton radio = group.findViewById(checkedId);
                int index = radioGroup.indexOfChild(radio);
                TextView textView = rootView.findViewById(R.id.fragment_header);

                switch (index) {
                    case YES: // user choose "YES"
                        // upload the text
                        textView.setText("ARTICLE: Liked");

                        break;
                    case NO: // user choose "NO"
                        // upload the text
                        textView.setText("ARTICLE: Thanks");

                        break;
                        default:
                }

            }
        });

        return rootView;
    }

}
