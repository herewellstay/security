package com.herewellstay.security;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class PrivacyPolicy {
    private Context context;
    private String url;

    public PrivacyPolicy(Context context) {
        this.context = context;
        this.url = url;
    }

    public void open() {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(context.getString(R.string.privacy_url)));
        context.startActivity(browserIntent);
    }
}
