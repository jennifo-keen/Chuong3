package com.example.chuong3.ui.customlayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.chuong3.databinding.FragmentClBinding;
import com.example.chuong3.ui.customlayout.clViewModel;

public class clFragment extends Fragment {
    private FragmentClBinding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        clViewModel clViewModel =
                new ViewModelProvider(this).get(clViewModel.class);

        binding = FragmentClBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
