package nyc.c4q.hyun.meme;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;


/**
 * We're using one activity and multiple fragments
 */

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hostFragment(new ChooserFragment());

//        FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction transaction = fragmentManager.beginTransaction();
//        transaction.add(R.id.activity_main, new ChooserFragment(),"Chooser fragment");
//        transaction.commit();

//        getFragmentManager().beginTransaction().add();
    }
//    public void onClick(View view){
//
//    }
//
    public void onBackPressed(){
        super.onBackPressed();
        hostFragment(new ChooserFragment());

    }
    public void hostFragment (Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.activity_main, fragment).commit();
    }
}
