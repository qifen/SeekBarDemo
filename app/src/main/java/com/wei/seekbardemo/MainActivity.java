package com.wei.seekbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView data;
    private TextView state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar = (SeekBar) findViewById(R.id.seek_bar);
        data = (TextView) findViewById(R.id.data);
        state = (TextView) findViewById(R.id.state);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                state.setText("开始拖动");
                data.setText("当前进度为: "+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                state.setText("开始拖动");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                state.setText("停止拖动");
            }
        });
    }
}
