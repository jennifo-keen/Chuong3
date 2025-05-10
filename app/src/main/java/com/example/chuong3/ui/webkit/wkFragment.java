package com.example.chuong3.ui.webkit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.chuong3.databinding.FragmentWkBinding;
import com.example.chuong3.ui.webkit.wkViewModel;

public class wkFragment extends Fragment {
    private FragmentWkBinding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        wkViewModel wkViewModel =
                new ViewModelProvider(this).get(wkViewModel.class);

        binding = FragmentWkBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
