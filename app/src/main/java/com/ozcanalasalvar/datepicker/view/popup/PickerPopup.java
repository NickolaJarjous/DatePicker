package com.ozcanalasalvar.datepicker.view.popup;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ozcanalasalvar.datepicker.R;

public class PickerPopup extends BottomSheetDialog implements IPopupInterface {

    public TextView confirm;
    private LinearLayout container;

    public PickerPopup(@NonNull Context context) {
        super(context);
        init();
    }

    public PickerPopup(@NonNull Context context, int theme) {
        super(context, theme);
        init();
    }

    private void init() {
        setContentView(R.layout.picker_popup_layout);
        confirm = findViewById(R.id.text_confirm);
        container = findViewById(R.id.popup_container);
    }


    @Override
    public void addView(View view) {
        container.addView(view);
    }
}