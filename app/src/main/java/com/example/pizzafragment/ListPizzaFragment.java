package com.example.pizzafragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.pizzafragment.model.Pizza;
import com.example.pizzafragment.repository.PizzaRepository;


public class ListPizzaFragment extends Fragment {

    public static final String TAG = "listPizzaFragment";
    private ListView listView;
    private ArrayAdapter<Pizza> adapter;



    public ListPizzaFragment() {
        // Required empty public constructor
    }

    /**
     * METODO QUE CREA LA VISTA DEL FRAGMENT
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        Log.d(TAG,"ListPizzaFragment -> onAttach()");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(TAG,"ListPizzaFragment -> onCreateView()");
        return inflater.inflate(R.layout.fragment_list_pizza, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listView=view.findViewById(R.id.list);
        adapter = new ArrayAdapter<>(getContext(),android.R.layout.simple_list_item_1, PizzaRepository.getList());
        listView.setAdapter(adapter);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
                //Se puede pasar un argumento a otro Fragment de dos formas:
                //1. Sin comprobación de tipos, usando un objeto Bundle
                //Bundle bundle= new Bundle();
                //bundle.putSerializable("pizza",(Pizza)adapter.getItemAtPosition(position));
                //NavHostFragment.findNavController(ListPizzaFragment.this).navigate(R.id.action_listPizzaFragment_to_viewPizzaFragment,bundle);

                //2. Usando el plugin safe-args
                ListPizzaFragmentDirections.ActionListPizzaFragmentToViewPizzaFragment action =
                        ListPizzaFragmentDirections.actionListPizzaFragmentToViewPizzaFragment((Pizza)adapter.getItemAtPosition(position));
                NavHostFragment.findNavController(ListPizzaFragment.this).navigate(action);
            }
        });
        Log.d(TAG,"ListPizzaFragment -> onViewCreated()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG,"ListPizzaFragment -> onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG,"ListPizzaFragment -> onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG,"ListPizzaFragment -> onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG,"ListPizzaFragment -> onStop()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG,"ListPizzaFragment -> onDetach()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"ListPizzaFragment -> onDestroy()");
    }
}