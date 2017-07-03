package com.arichafamily.shoppingfun.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.arichafamily.shoppingfun.R;
import com.arichafamily.shoppingfun.models.UserList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListProductsFragment extends Fragment {

    private UserList userList;


    public ListProductsFragment() {
        // Required empty public constructor
    }


    public static ListProductsFragment newInstance(UserList userList) {

        Bundle args = new Bundle();
        args.putParcelable("list", userList);
        ListProductsFragment fragment = new ListProductsFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        userList = getArguments().getParcelable("list");
        Toast.makeText(getContext(), userList.toString(), Toast.LENGTH_SHORT).show();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_products, container, false);
    }

}
