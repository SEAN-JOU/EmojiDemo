package com.winter.demo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.winter.demo.emoji.GifView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private EmojiAdapter mEmojiAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEmojiAdapter = new EmojiAdapter(this);
        mEmojiAdapter.setData(getDatas());
        recyclerView = findViewById(R.id.recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mEmojiAdapter);
    }

    private List<String> getDatas() {
        List<String> datas = new ArrayList<>();
        datas.add("http://wx2.sinaimg.cn/large/0066wpcPly1fsjz95ywl9g3087087763.gif");
        datas.add("http://wx2.sinaimg.cn/bmiddle/006BkP2Hly1fds70lm93hg308c08c0ve.gif");
        datas.add("http://wx2.sinaimg.cn/bmiddle/006BkP2Hly1fds70e8g4bg304x04xmxf.gif");
        datas.add("http://wx3.sinaimg.cn/bmiddle/006oOWahly1fu0xgy34v0g305y05yab8.gif");
        datas.add("http://wx3.sinaimg.cn/bmiddle/006BkP2Hly1fds70ehbv7g307606gacd.gif");
        datas.add("http://ws2.sinaimg.cn/bmiddle/9150e4e5gy1fuxuqx647ig208c08cjt4.gif");
        datas.add("http://wx4.sinaimg.cn/bmiddle/006BkP2Hly1fds70ep590g304x04xmyt.gif");
        datas.add("http://wx1.sinaimg.cn/bmiddle/006APoFYly1ft3zud1dagg309f07ngqw.gif");
        datas.add("http://wx1.sinaimg.cn/bmiddle/62528dc5gy1fl2oj3384jg206o06o7ai.gif");
        datas.add("http://ws1.sinaimg.cn/bmiddle/9150e4e5gy1fu36b4skflg206o06owgj.gif");
        datas.add("http://wx1.sinaimg.cn/bmiddle/006BkP2Hly1fds70fkm6wg30300300sr.gif");
        datas.add("http://wx4.sinaimg.cn/bmiddle/006APoFYly1fqbgnyi62gg306o06o78a.gif");
        datas.add("http://wx3.sinaimg.cn/bmiddle/ceeb653ely1fqbh4lw7u9g208c06rq4y.gif");
        datas.add("http://wx4.sinaimg.cn/bmiddle/a9cf8ef6ly1fo2ca0hyoig206o06oq70.gif");
        datas.add("http://wx1.sinaimg.cn/bmiddle/6e3e5b9bly1ft76miiq9hg208r08rtty.gif");
        datas.add("https://qq.yh31.com/tp/zjbq/201711101610227260.gif");
        datas.add("https://qq.yh31.com/tp/zjbq/201711101610225087.gif");
        datas.add("https://qq.yh31.com/tp/zjbq/201711101610220607.gif");
        return datas;
    }

    public class EmojiAdapter extends RecyclerView.Adapter<EmojiAdapter.ViewHolder> {

        private Context context;
        private List<String> mEmojis=new ArrayList<>();

        EmojiAdapter(Context context) {
            this.context = context;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.gif_item, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
            holder.gifView.setGif(mEmojis.get(position));
        }

        @Override
        public int getItemCount() {
            return mEmojis != null ? mEmojis.size() : 0;
        }

        public void setData(List<String> emojiUrls) {
            this.mEmojis = emojiUrls;
            notifyDataSetChanged();
        }

        private class ViewHolder extends RecyclerView.ViewHolder {

            private GifView gifView;

            ViewHolder(View itemView) {
                super(itemView);
                gifView = itemView.findViewById(R.id.gifview);
            }
        }
    }
}
