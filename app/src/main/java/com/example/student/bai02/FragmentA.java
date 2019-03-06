package com.example.student.bai02;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentA extends Fragment {

    TextView txtND;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_a,container,false);
        txtND=(TextView) v.findViewById(R.id.txt_ND);

        Bundle bundle = getArguments();
        if (bundle !=null)
        {
            txtND.setText(bundle.getString("ho"));
        }

        return v;
    }
}
