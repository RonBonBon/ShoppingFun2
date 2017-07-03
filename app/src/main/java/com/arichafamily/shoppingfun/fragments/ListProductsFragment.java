package com.arichafamily.shoppingfun.fragments;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.arichafamily.shoppingfun.R;
import com.arichafamily.shoppingfun.models.UserList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListProductsFragment extends Fragment {

    @BindView(R.id.rvProducts)
    RecyclerView rvProducts;
    @BindView(R.id.fabAddProduct)
    FloatingActionButton fabAddProduct;
    @BindView(R.id.etProductName)
    EditText etProductName;
    Unbinder unbinder;
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
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list_products, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick(R.id.fabAddProduct)
    public void onAddProductClicked() {
        String productName = etProductName.getText().toString();

    }
}
