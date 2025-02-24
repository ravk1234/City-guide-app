package example.com.cityguide.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import example.com.cityguide.R;
import example.com.cityguide.adapter.ShopAdapter;
import example.com.cityguide.data.ShopData;
import example.com.cityguide.utils.Utils;

public class ShopFragment extends Fragment {

    //no-arg constructor
    public ShopFragment() {
    }
    public static Fragment newInstance(Bundle args){
// get your data and do whatever
        if (args != null) {
            String value = args.getString("key");
        }
        return new ShopFragment(); }
    /**
     * define inflation logic
     * @param inflater inflater object to inflate new layout
     * @param container viewgroup to which the new layout is to be attached
     * @param savedInstanceState reference to savedInstanceState using which saved fragment state can be restored
     * @return newly inflated view
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_fragment, container, false);
    }

    /**
     * access views that have been initialized in the fragment UI
     * @param view reference to fragment view
     * @param savedInstanceState reference to savedInstanceState using which saved fragment state can be restored
     */
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        Utils.setUpRecyclerView(recyclerView);
        if (getContext() != null) {
            recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
            recyclerView.setAdapter(new ShopAdapter(getContext(), ShopData.fetchShoppingPlaces(getContext())));
        }
    }


}
