package com.genrysofionet.myapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentEncapsu.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentEncapsu#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentEncapsu extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    private ListView lvItem;
    private Adaptador adaptador;

    public FragmentEncapsu() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentEncapsu.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentEncapsu newInstance(String param1, String param2) {
        FragmentEncapsu fragment = new FragmentEncapsu();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view= inflater.inflate(R.layout.fragment_encapsu, container, false);

        lvItem=view.findViewById(R.id.lvItem);
        adaptador=new Adaptador(getContext(),GetArrayItem());
        lvItem.setAdapter(adaptador);




        return view;
    }

    private ArrayList<Entidades>GetArrayItem(){
        ArrayList<Entidades>listItem=new ArrayList<>();
        listItem.add(new Entidades("Dragon Ball",R.drawable.goku,"Goku","Super Sayayin"));
        listItem.add(new Entidades("Naruto",R.drawable.sasuke,"Sasuke","Sharingan"));
        listItem.add(new Entidades("Saint Seiya",R.drawable.ikki,"Ikki","Ave de Fenix"));
        listItem.add(new Entidades("Bleach",R.drawable.rangiku,"Rangiku","Habilidad con la espada"));
        listItem.add(new Entidades("Naruto",R.drawable.naruto,"Naruto","Kyubi de 9 colas"));

        return listItem;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
