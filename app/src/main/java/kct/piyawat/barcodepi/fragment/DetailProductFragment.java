package kct.piyawat.barcodepi.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kct.piyawat.barcodepi.R;

/**
 * Created by asus on 8/12/2560.
 */

public class DetailProductFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail_product, container, false);
        return view;
    }
}// Main Class
