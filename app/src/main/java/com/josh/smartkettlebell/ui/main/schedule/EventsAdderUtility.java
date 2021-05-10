package com.josh.smartkettlebell.ui.main.schedule;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;


public class EventsAdderUtility {

    public static ArrayList<String> nameOfEvent = new ArrayList<String>();
    public static ArrayList<String> startDates = new ArrayList<String>();
    public static ArrayList<String> endDates = new ArrayList<String>();
    public static ArrayList<String> descriptions = new ArrayList<String>();
    public static ArrayList<String> ev = new ArrayList<String>();
    public static String MAGIC_TAG = "#SmartKettleBell";

    static String TAG  = "myTag";

    public static ArrayList<String> readCalendarEvent(Context context) {
        Log.d(TAG, "readCalendarEvent: ");
        Calendar startTime = Calendar.getInstance();
        startTime.set(Calendar.HOUR_OF_DAY,0);
        startTime.set(Calendar.MINUTE,0);
        startTime.set(Calendar.SECOND, 0);

        Calendar endTime= Calendar.getInstance();
        endTime.setTime(startTime.getTime());
        endTime.add(Calendar.DATE, 1);

        String selection = "(( " + CalendarContract.Events.DTSTART + " >= " + startTime.getTimeInMillis() + " ) AND ( "
                + CalendarContract.Events.DTSTART + " <= " + endTime.getTimeInMillis() + " ) AND ( deleted != 1 ))";




        Cursor cursor = context.getContentResolver()
                .query(
                        Uri.parse("content://com.android.calendar/events"),
                        new String[] { "calendar_id", "title", "description",
                                "dtstart", "dtend", "eventLocation" }, selection,
                        null, null);
        cursor.moveToFirst();
        // fetching calendars name
        String CNames[] = new String[cursor.getCount()];

        // fetching calendars id
        nameOfEvent.clear();
        startDates.clear();
        endDates.clear();
        descriptions.clear();
        ev.clear();
        for (int i = 0; i < CNames.length; i++) {

            //nameOfEvent.add(cursor.getString(1));
            //startDates.add(getDate(Long.parseLong(cursor.getString(3))));
            //endDates.add(getDate(Long.parseLong(cursor.getString(4))));
            //descriptions.add(cursor.getString(2));

            String title = cursor.getString(1);
            String description = cursor.getString(2);
            String start_time = getDate(cursor.getLong(3));
            String end_time = getDate(cursor.getLong(4));
            if(description == null)
                continue;
            Log.d(TAG, "readCalendarEvent: "+description);
            if(description.contains(MAGIC_TAG)) {
                ev.add(String.format("%s, %s - %s", title, start_time, end_time));
            }

            /*String s = "";//測試用
            for(int j = 1 ; j<cursor.getColumnCount();j++){
                s += cursor.getString(j);
            }
            ev.add(s);*/

            CNames[i] = cursor.getString(1);
            cursor.moveToNext();

        }
        return ev;
    }

    public static String getDate(long milliSeconds) {
        SimpleDateFormat formatter = new SimpleDateFormat(
                "HH:MM");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(milliSeconds);
        return formatter.format(calendar.getTime());
    }
}
