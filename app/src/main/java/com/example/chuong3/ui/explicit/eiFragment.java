package com.example.chuong3.ui.explicit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.chuong3.databinding.FragmentEiBinding;
import com.example.chuong3.ui.explicit.eiViewModel;

public class eiFragment extends Fragment {
    private FragmentEiBinding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        eiViewModel eiViewModel =
                new ViewModelProvider(this).get(eiViewModel.class);

        binding = FragmentEiBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
