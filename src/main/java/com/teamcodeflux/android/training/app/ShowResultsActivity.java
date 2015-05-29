package com.teamcodeflux.android.training.app;

import android.app.Activity;
import android.widget.TextView;
import org.androidannotations.annotations.*;

/**
 * Created by em.dogelio on 5/29/15.
 */
@EActivity(R.layout.activity_show_results)
public class ShowResultsActivity extends Activity {

    @ViewById(R.id.results_list)
    TextView results;

    @Extra
    String keyword;

    @AfterViews
    void displayResults() {
        results.setText(keyword);
    }
}
