package com.teamcodeflux.android.training.app;

import android.app.Activity;
import android.widget.EditText;
import android.widget.Toast;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by em.dogelio on 5/29/15.
 */
@EActivity(R.layout.activity_get_started)
public class GetStartedActivity extends Activity {

    @ViewById
    EditText filter;

    @Click(R.id.search)
    void search() {
        String keyword = filter.getText().toString();

        if (keyword.matches("")) {
            filter.setError("Please specify!");
        }
        else {
            ShowResultsActivity_.intent(this).keyword(keyword).start();
        }
    }
}
