package www.iiysystem.g_map;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class PastRidesFragment extends Fragment {


    public PastRidesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((NavigationActivity)getActivity()).setActionBarTitle("Pass Rides");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_past_rides, container, false);
    }

}
