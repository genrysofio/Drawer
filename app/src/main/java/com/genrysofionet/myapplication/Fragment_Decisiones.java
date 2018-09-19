package com.genrysofionet.myapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragment_Decisiones.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment_Decisiones#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_Decisiones extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    View view;
    TextView resultado;
    EditText dato1,dato2;
    int digito1,digito2;
    Button resta,suma,divisor,multipli;

    private OnFragmentInteractionListener mListener;



    public Fragment_Decisiones() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_Decisiones.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_Decisiones newInstance(String param1, String param2) {
        Fragment_Decisiones fragment = new Fragment_Decisiones();
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
        view = inflater.inflate(R.layout.fragment_fragment__decisiones, container, false);

        resultado = view.findViewById(R.id.resultado);
        dato1 = view.findViewById(R.id.dato1);
        dato2 = view.findViewById(R.id.dato2);
        resta = (Button) view.findViewById(R.id.btnresta);
        suma = (Button) view.findViewById(R.id.btnsuma);
        divisor = (Button) view.findViewById(R.id.btndivicion);
        multipli=(Button)view.findViewById(R.id.btnmulti);
        resta.setOnClickListener(this);
        suma.setOnClickListener(this);
        divisor.setOnClickListener(this);
        multipli.setOnClickListener(this);



        return view;


    }

    public void onClick(View view){
        digito1=Integer.parseInt(dato1.getText().toString());
        digito2=Integer.parseInt(dato2.getText().toString());
        switch (view.getId()){
            case R.id.btnsuma:suma();
                break;
            case R.id.btnresta:resta();
                break;
            case R.id.btnmulti:multiplicacion();
                break;
            case R.id.btndivicion:divicion();
                break;
        }
    }

    private void divicion() {

            try {
                int divicion=digito1/digito2;
                resultado.setText("el resulado es "+divicion);
            }catch (ArithmeticException e){
                resultado.setText("no se puede dividir en cero");
            }catch (NumberFormatException e){
                resultado.setText("El dato no es numerico");
            }finally {
                Toast.makeText(getContext(),"proceso terminado",Toast.LENGTH_SHORT).show();
            }
    }

    private void multiplicacion() {
        try{
            int multi=digito1*digito2;
            resultado.setText("multiplicacion es  "+multi);
        }catch (Exception e){
            resultado.setText("el dato no es correcto");
        }finally {
            Toast.makeText(getContext(),"proceso terminado",Toast.LENGTH_SHORT).show();
        }

    }

    private void resta() {


        try {
            int resta=digito1-digito2;
            resultado.setText("la resta es  "+resta);
        }catch (Exception e){
            resultado.setText("el dato no es correcto");
        }finally {
            Toast.makeText(getContext(),"proceso terminado",Toast.LENGTH_SHORT).show();
        }
    }

    private void suma() {

        try {
            int suma=digito1+digito2;
            resultado.setText("la suma es  "+suma);

        }catch (Exception e){
            resultado.setText("el dato no es correcto");
        }finally {
            Toast.makeText(getContext(),"proceso terminado",Toast.LENGTH_SHORT).show();
        }
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
