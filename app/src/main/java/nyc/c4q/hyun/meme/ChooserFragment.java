package nyc.c4q.hyun.meme;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class ChooserFragment extends Fragment {

    private String TAG = "ChooseMemes";

    private View view;
    Button baby, starwars, gitpush, butts;

    public ChooserFragment(){
        //default constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // We're passing in the layout that we want to see
        view = inflater.inflate(R.layout.fragment_chooser,container,false);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        buttons();
    }

    private void buttons() {
        baby = (Button) view.findViewById(R.id.baby_btn);
        baby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity activity = getActivity();
                FragmentManager fragmentManager = activity.getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_layout, new Babyfragment(),"Baby Fragment").commit();
            }
        });
        starwars = (Button) view.findViewById(R.id.stars_btn);
        starwars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                FragmentManager fragmentManager = activity.getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_layout, new PhoneWarsFragment(),"StarWars Fragment").commit();

            }
        });
        gitpush = (Button) view.findViewById(R.id.gitpush_btn);
        gitpush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity activity = (MainActivity) getActivity();
                activity.hostFragment(new GitPushFragment());
            }
        });
        butts = (Button) view.findViewById(R.id.butts_btn);
        butts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                android.support.v4.app.FragmentTransaction transaction  = activity.getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.activity_main, new ButtsFragment()).commit();
            }
        });
    }
}
