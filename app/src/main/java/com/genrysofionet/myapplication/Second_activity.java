package com.genrysofionet.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;


public class Second_activity extends Base_Activity implements FragmentEncapsu.OnFragmentInteractionListener,
        Fragment_Decisiones.OnFragmentInteractionListener,Fragment_Ciclos.OnFragmentInteractionListener {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.second);


        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_drawer, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        android.support.v4.app.Fragment mifragment=null;
        boolean fragselec=false;

        if (id == R.id.nav_camera) {
            mifragment=new Fragment_Ciclos();
            fragselec=true;

        } else if (id == R.id.nav_gallery) {
            mifragment=new FragmentEncapsu();
            fragselec=true;

        } else if (id == R.id.nav_slideshow) {
            mifragment=new Fragment_Decisiones();
            fragselec=true;
        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }
        if (fragselec==true){
            getSupportFragmentManager().beginTransaction().replace(R.id.conten_main,mifragment).commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
