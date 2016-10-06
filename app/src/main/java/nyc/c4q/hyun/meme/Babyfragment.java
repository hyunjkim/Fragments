package nyc.c4q.hyun.meme;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Hyun on 10/5/16.
 */
public class Babyfragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_baby, container,false);
    }
    // what we want to show on this screen
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
//        ImageView imageView = (ImageView) view.findViewById(R.id.babyView);
//        TextView textView = (TextView) view.findViewById(R.id.babyText);
//        imageView.setImageResource(R.drawable.meme_one);
//        textView.setText("Baby meme");
    }
}
