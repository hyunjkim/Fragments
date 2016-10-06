package nyc.c4q.hyun.meme;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Hyun on 10/5/16.
 */
public class GitPushFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_gitpush, container,false);
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
