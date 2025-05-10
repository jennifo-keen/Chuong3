package com.example.chuong3.ui.tabselector;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.chuong3.databinding.FragmentTabsBinding;
import com.example.chuong3.ui.tabselector.tabsViewModel;

public class tabsFragment extends Fragment {
    private FragmentTabsBinding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        tabsViewModel tabsViewModel =
                new ViewModelProvider(this).get(tabsViewModel.class);

        binding = FragmentTabsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
