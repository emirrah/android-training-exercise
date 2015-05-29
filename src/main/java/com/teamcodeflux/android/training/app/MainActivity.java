package com.teamcodeflux.android.training.app;

import android.app.Activity;
import android.os.Bundle;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.main)
public class MainActivity extends Activity  {

    @Click(R.id.get_started)
    void getStarted() {
        GetStartedActivity_.intent(this).start();
    }

}
