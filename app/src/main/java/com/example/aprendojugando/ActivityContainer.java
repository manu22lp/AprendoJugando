package com.example.aprendojugando;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import Fragment.FragmentNivel1;

public class ActivityContainer extends AppCompatActivity {

    //public static String modoAcercaDe;

    private Fragment fragment;

    private FragmentManager fragmentManager;

    private Fragment[] array_fragments;

    private  int modoNiveles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_container );
        fragmentManager = getSupportFragmentManager();
        load();

        cargararray ();


        loadFragments(array_fragments [modoNiveles]);

    }
    private void load() {
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            modoNiveles = bundle.getInt( "modoNiveles" );
        }
        else {
            modoNiveles = 0;
        }


    }

   /* private void loadFragmentLetras(String modoLetras) {
    }*/





    public void loadFragments(Fragment fragment) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.ContenedorFragment, fragment);
        fragmentTransaction.commit();
    }


    private void cargararray (){

        array_fragments = new Fragment [6];
        array_fragments[1] = new FragmentNivel1();


    }
}
