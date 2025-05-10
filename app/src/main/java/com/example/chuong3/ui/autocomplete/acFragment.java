package com.example.chuong3.ui.autocomplete;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.chuong3.databinding.FragmentAcBinding;

public class acFragment extends Fragment {
    private FragmentAcBinding binding;
    private AutoCompleteTextView autoCompleteTextView;
    private ArrayAdapter<String> arrayAdapter;

    private final String[] items = {
            "Android", "iPhone", "Windows Mobile", "BlackBerry", "Symbian", "Palm OS",
            "KaiOS", "Tizen", "HarmonyOS", "Ubuntu Touch", "Sailfish OS",
            "Google Pixel", "Samsung Galaxy", "Nokia Lumia", "Xiaomi", "Oppo",
            "Vivo", "Realme", "Asus Zenfone", "Sony Xperia", "LG", "Motorola",
            "HTC", "OnePlus", "Lenovo", "ZTE", "Meizu", "Huawei", "Honor"
    };

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        acViewModel acViewModel =
                new ViewModelProvider(this).get(acViewModel.class);

        binding = FragmentAcBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // 1. Gán AutoCompleteTextView từ binding
        autoCompleteTextView = binding.autoComplete;

        // 2. Tạo adapter và gán cho AutoCompleteTextView
        arrayAdapter = new ArrayAdapter<>(
                requireContext(),
                android.R.layout.simple_list_item_1,
                items
        );
        autoCompleteTextView.setAdapter(arrayAdapter);

        // 3. Ẩn bàn phím khi chọn một item
        autoCompleteTextView.setOnItemClickListener((adapterView, view, i, l) -> {
            InputMethodManager imm = (InputMethodManager)
                    requireContext().getSystemService(Context.INPUT_METHOD_SERVICE);
            if (imm != null && requireActivity().getCurrentFocus() != null) {
                imm.hideSoftInputFromWindow(
                        requireActivity().getCurrentFocus().getWindowToken(), 0
                );
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
