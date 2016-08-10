package com.github.byteskode.example;

import android.app.Activity;
import android.app.Application;
import android.widget.TextView;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author lally elias
 * @email lallyelias87@gmail.com, lally.elias@byteskode.com
 * @date 8/10/16
 */

@RunWith(RobolectricTestRunner.class)
@Config(manifest = "library/src/main/AndroidManifest.xml", application = Application.class)
public class RobolectricTest {
    @Test
    public void testIt() {

        Activity activity =
                Robolectric.setupActivity(MainActivity.class);

        TextView results =
                (TextView) activity.findViewById(R.id.title);
        String resultsText = results.getText().toString();

        // failing test gives much better feedback
        // to show that all works correctly ;)
        assertThat(resultsText, equalTo("Hello world!"));
    }
}
