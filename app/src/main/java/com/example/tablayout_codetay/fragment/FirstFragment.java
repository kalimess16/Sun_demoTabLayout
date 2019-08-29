package com.example.tablayout_codetay.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.tablayout_codetay.R;
import com.example.tablayout_codetay.SendData;

public class FirstFragment extends Fragment {

    private Button mButton;
    private SendData mSendData;
    private EditText mEditText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first,container,false);
        mButton = view.findViewById(R.id.button_GotoSecond);
        mEditText = view.findViewById(R.id.txt_text);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSendData.setButtonNP(1);
                mSendData.sendText(mEditText.getText().toString());
            }
        });

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mSendData = (SendData) getActivity();
    }

}
