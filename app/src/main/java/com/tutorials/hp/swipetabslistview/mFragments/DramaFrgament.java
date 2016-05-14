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
public class DramaFrgament extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.drama_frgament,container,false);

        ListView lv= (ListView) rootView.findViewById(R.id.dramaListView);
        CustomAdapter adapter=new CustomAdapter(this.getActivity(),getDramaMovies());
        lv.setAdapter(adapter);

        return rootView;
    }


    private ArrayList<TVShow> getDramaMovies() {
        ArrayList<TVShow> movies=new ArrayList<>();
        TVShow tvShow=new TVShow("Star Wars",R.drawable.starwars);
        movies.add(tvShow);

        tvShow=new TVShow("Ghost Rider",R.drawable.rider);
        movies.add(tvShow);

        tvShow=new TVShow("Game Of Thrones",R.drawable.thrones);
        movies.add(tvShow);

        tvShow=new TVShow("Ghost",R.drawable.ghost);
        movies.add(tvShow);

        return movies;
    }

    @Override
    public String toString() {
        return "Drama";
    }
}
