package com.example.chuong3.ui.slidingdrawer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.chuong3.databinding.FragmentSdBinding;
import com.example.chuong3.ui.slidingdrawer.sdViewModel;

public class sdFragment extends Fragment {
    private FragmentSdBinding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        sdViewModel sdViewModel =
                new ViewModelProvider(this).get(sdViewModel.class);

        binding = FragmentSdBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
