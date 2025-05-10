package com.example.chuong3.ui.picturegallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.chuong3.databinding.FragmentPgBinding;
import com.example.chuong3.ui.picturegallery.pgViewModel;

public class pgFragment extends Fragment {
    private FragmentPgBinding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        pgViewModel pgViewModel =
                new ViewModelProvider(this).get(pgViewModel.class);

        binding = FragmentPgBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
