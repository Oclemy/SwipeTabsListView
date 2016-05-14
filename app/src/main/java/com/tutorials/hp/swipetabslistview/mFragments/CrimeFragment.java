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
public class CrimeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.crime_fragment,container,false);

        ListView lv= (ListView) rootView.findViewById(R.id.crimeListView);
        CustomAdapter adapter=new CustomAdapter(this.getActivity(),getCrimeMovies());
        lv.setAdapter(adapter);


        return rootView;
    }

    private ArrayList<TVShow> getCrimeMovies() {
        //COLECTION OF CRIME MOVIES
        ArrayList<TVShow> movies=new ArrayList<>();

        //SINGLE MOVIE
        TVShow tvShow=new TVShow("BLACKLIST",R.drawable.red);

        //ADD ITR TO COLLECTION
        movies.add(tvShow);

        tvShow=new TVShow("Breaking Bad",R.drawable.breaking);
        movies.add(tvShow);

        tvShow=new TVShow("Crisis",R.drawable.crisis);
        movies.add(tvShow);

        tvShow=new TVShow("BlackList",R.drawable.blacklist);
        movies.add(tvShow);

        tvShow=new TVShow("Men In Black",R.drawable.meninblack);
        movies.add(tvShow);

        return movies;
    }

    @Override
    public String toString() {
        String title="Crime";
        return title;
    }
}
