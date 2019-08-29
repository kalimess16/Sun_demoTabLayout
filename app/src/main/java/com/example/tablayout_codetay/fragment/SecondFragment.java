package com.example.tablayout_codetay.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.tablayout_codetay.R;
import com.example.tablayout_codetay.SendData;

public class SecondFragment extends Fragment {

    private Button mButton;
    private TextView mTextView;
    private SendData mSendData;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sencond, container, false);

        mTextView = view.findViewById(R.id.text_second);
        mButton = view.findViewById(R.id.button_gotoFirst);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSendData.setButtonNP(0);
            }
        });

        return view;
    }

    public void setEditText(String name){
        mTextView.setText(name);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mSendData = (SendData) getActivity();
    }
}
