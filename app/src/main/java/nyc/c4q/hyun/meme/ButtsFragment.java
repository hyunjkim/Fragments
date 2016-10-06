package nyc.c4q.hyun.meme;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by Hyun on 10/5/16.
 */
public class ButtsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_butts, container,false);
    }
    // what we want to show on this screen
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ImageView imageView = (ImageView) view.findViewById(R.id.butts_imagebtn);
        TextView textView = (TextView) view.findViewById(R.id.butts_tv);
        imageView.setImageResource(R.drawable.meme_four);
        textView.setText("Butts meme");
    }

}
