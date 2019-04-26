package com.example.mediaplayeractivity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //TODO (3) : Use inflater to inflate a fragment_main.xml

        String[] phrases= {"how are you","hello","good morning","good night"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1, phrases);
        ListView listView =view.findViewById(R.id.phrases);
        listView.setAdapter(adapter);
         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                 //TODO (4) : Use Bundle to add position and phrase



                 PlayerFragment playerFragment =new PlayerFragment();
                 playerFragment.setArguments(bundle);
                 //TODO (5) : Use getFragmentManager() to replace current fragment with PlayerFragment , also use addToBackStack()



             }
         });

        return view;
    }
}
