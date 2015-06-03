package com.teamcodeflux.android.training.app;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import se.walkercrou.places.Place;

@EActivity(R.layout.main)
public class MainActivity extends Activity  {

    @Click(R.id.get_started)
    void getStarted() {
        GetStartedActivity_.intent(this).start();
    }

    private GoogleApiClient mGoogleApiClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mGoogleApiClient = new GoogleApiClient
                .Builder(this)
                .addApi(Places.GEO_DATA_API)
                .addApi(Places.PLACE_DETECTION_API)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .build();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mGoogleApiClient.connect();
    }

    @Override
    protected void onStop() {
        mGoogleApiClient.disconnect();
        super.onStop();
    }

}
