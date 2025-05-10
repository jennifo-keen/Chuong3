package com.example.chuong3.ui.implicit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.chuong3.databinding.FragmentIiBinding;
import com.example.chuong3.ui.implicit.iiViewModel;

public class iiFragment extends Fragment {
    private FragmentIiBinding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        iiViewModel iiViewModel =
                new ViewModelProvider(this).get(iiViewModel.class);

        binding = FragmentIiBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
