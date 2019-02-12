package com.winter.demo.emoji;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.pnikosis.materialishprogress.ProgressWheel;
import com.winter.demo.R;

import pl.droidsonroids.gif.GifImageView;

/**
 * Created by Winter on 2019-01-15.
 */
public class GifView extends FrameLayout {

    private GifImageView gifImageView;
    private TextView textView;
    private ProgressWheel progressWheel;

    public GifView(Context context) {
        this(context, null);
    }

    public GifView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public GifView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View view = inflate(context, R.layout.gif_view, this);
        gifImageView = view.findViewById(R.id.gif_photo_view);
        textView = view.findViewById(R.id.gif_tv_progress);
        progressWheel = view.findViewById(R.id.gif_progress_wheel);
    }

    /**
     * 设置gif url
     *
     * @param gifUrl
     */
    public void setGif(String gifUrl) {
        AlxGifHelper.displayImage(gifUrl,
                gifImageView,
                progressWheel,
                textView,
                -1
        );
    }
}
