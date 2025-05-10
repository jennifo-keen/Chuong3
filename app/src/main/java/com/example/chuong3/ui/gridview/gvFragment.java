package com.example.chuong3.ui.gridview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.chuong3.R;
import com.example.chuong3.databinding.FragmentGvBinding;

public class gvFragment extends Fragment {
    private FragmentGvBinding binding;
    private GridView gridView;

    // Dữ liệu hiển thị trong GridView
    private final String[] item = {
            "item 1", "item 2", "item 3",
            "item 4", "item 5", "item 6",
            "item 7", "item 8", "item 9"
    };

    private final int[] images = {
            R.drawable.a, R.drawable.b, R.drawable.c,
            R.drawable.d, R.drawable.e, R.drawable.f,
            R.drawable.g, R.drawable.h, R.drawable.i
    };

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // ViewModel giữ nguyên
        gvViewModel gvViewModel =
                new ViewModelProvider(this).get(gvViewModel.class);

        binding = FragmentGvBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Gán GridView từ binding (ID: gridView)
        gridView = binding.gridView;

        // Tạo adapter và gán vào GridView
        CustomAdapter adapter = new CustomAdapter(requireContext(), item, images);
        gridView.setAdapter(adapter);

        // Xử lý sự kiện click item
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(requireContext(),
                        "Click on " + item[position],
                        Toast.LENGTH_SHORT).show();
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
