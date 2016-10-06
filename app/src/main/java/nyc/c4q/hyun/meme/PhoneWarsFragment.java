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
public class PhoneWarsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_starwars,container,false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
    }
}
