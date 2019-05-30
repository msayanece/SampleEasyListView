package com.sayan.android.sampleeasylistview;

import android.content.Context;
import android.view.View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ViewUtil {

    public static void setVisibilityGone(View view) {
        if (view == null) {
            return;
        }
        view.setVisibility(View.GONE);
    }

    public static void setVisibilityGoneMultiple(View... views) {
        if (views == null) {
            return;
        }
        if (views.length == 0) {
            return;
        }
        for (View view : views) {
            view.setVisibility(View.GONE);
        }
    }

    public static void setVisibleMultiple(View... views) {
        if (views == null) {
            return;
        }
        for (View view : views) {
            view.setVisibility(View.VISIBLE);
        }
    }

    public static void setVisible(View view) {
        if (view == null) {
            return;
        }
        view.setVisibility(View.VISIBLE);
    }

    public static void setInvisible(View view) {
        if (view == null) {
            return;
        }
        view.setVisibility(View.INVISIBLE);
    }

    public static void setButtonDisable(Context context, View view) {
        if (context == null) {
            return;
        }
        if (view == null) {
            return;
        }
        view.setClickable(false);
        view.setEnabled(false);
        view.setBackgroundColor(context.getResources().getColor(R.color.colorAccent));
    }
    public static void setButtonEnable(Context context, View view) {
        if (context == null) {
            return;
        }
        if (view == null) {
            return;
        }
        view.setClickable(true);
        view.setEnabled(true);
        view.setBackgroundColor(context.getResources().getColor(R.color.colorPrimaryDark));
    }

    public static void setDisable(View view) {
        if (view == null) {
            return;
        }
        view.setClickable(false);
        view.setEnabled(false);
    }
    public static void setEnable(View view) {
        if (view == null) {
            return;
        }
        view.setClickable(true);
        view.setEnabled(true);
    }

    public static String convertDateFormat(String dateString) {
        if (dateString == null) {
            return "";
        }
        if (dateString.isEmpty()){
            return "";
        }
        String result = "";
        if (!DataValidationFilter.isValidString(dateString)) {
            return result;
        }
        SimpleDateFormat oldFormatter = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        SimpleDateFormat newFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
        Date date = null;
        try {
            date = oldFormatter.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (date != null) {
            result = newFormatter.format(date);
        }
        return result;
    }
    public static int convertDpToPx(Context context, float dp) {
        if (context == null) {
            return 0;
        }
        if (dp < 0){
            return 0;
        }
        return (int) (dp * context.getResources().getDisplayMetrics().density);
    }

}
