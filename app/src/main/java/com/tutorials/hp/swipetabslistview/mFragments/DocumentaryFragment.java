package com.tutorials.hp.swipetabslistview.mFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.tutorials.hp.swipetabslistview.R;
import com.tutorials.hp.swipetabslistview.mData.TVShow;
import com.tutorials.hp.swipetabslistview.mListView.CustomAdapter;

import java.util.ArrayList;

/**
 * Created by Oclemmy on 5/9/2016 for ProgrammingWizards Channel and http://www.Camposha.com.
 */
public class DocumentaryFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.documentary_fragment,container,false);

        ListView lv= (ListView) rootView.findViewById(R.id.docsListView);
        CustomAdapter adapter=new CustomAdapter(this.getActivity(),getDocumentaries());

        lv.setAdapter(adapter);
        return rootView;
    }
    private ArrayList<TVShow> getDocumentaries() {
        ArrayList<TVShow> movies=new ArrayList<>();
        TVShow movie=new TVShow("Columbia",R.drawable.shuttlecarrier);
        movies.add(movie);

        movie=new TVShow("How to Live to 100",R.drawable.fruits);
        movies.add(movie);

        movie=new TVShow("Death of The Sun",R.drawable.space);
        movies.add(movie);

        movie=new TVShow("Inventions That Changed The World",R.drawable.thrones);
        movies.add(movie);

        movie=new TVShow("The Super Jumbo ",R.drawable.moderncity);
        movies.add(movie);

        return movies;
    }

    @Override
    public String toString() {
        return "Documentary";
    }
}
