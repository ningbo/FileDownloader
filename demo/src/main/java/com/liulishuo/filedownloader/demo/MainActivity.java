package com.liulishuo.filedownloader.demo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.liulishuo.filedownloader.demo.performance.PerformanceTestActivity;

/**
 * Created by Jacksgong on 12/17/15.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void onClickMultitask(final View view) {
        startActivity(new Intent(this, MultitaskTestActivity.class));
    }

    public void onClickSingle(final View view) {
        startActivity(new Intent(this, SingleTaskTestActivity.class));
    }

    public void onClickMix(final View view) {
        startActivity(new Intent(this, HybridTestActivity.class));
    }

    public void onClickPerformance(final View view){
        startActivity(new Intent(this, PerformanceTestActivity.class));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_github:
                openGitHub();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void openGitHub() {
        Uri uri = Uri.parse(getString(R.string.app_github_url));
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
