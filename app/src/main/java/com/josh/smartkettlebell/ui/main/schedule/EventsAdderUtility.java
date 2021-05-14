package com.josh.smartkettlebell.ui.main.schedule;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;


public class EventsAdderUtility {

    public static ArrayList<String> nameOfEvent = new ArrayList<>();
    public static ArrayList<String> startDates = new ArrayList<>();
    public static ArrayList<String> endDates = new ArrayList<>();
    public static ArrayList<String> descriptions = new ArrayList<>();
    public static ArrayList<String> eventList = new ArrayList<>();
    public static String MAGIC_TAG = "#SmartKettleBell";

    public static ArrayList<String> readCalendarEvent(Context context) {
        Calendar startTime = Calendar.getInstance();
        startTime.set(Calendar.HOUR_OF_DAY, 0);
        startTime.set(Calendar.MINUTE, 0);
        startTime.set(Calendar.SECOND, 0);

        Calendar endTime = Calendar.getInstance();
        endTime.setTime(startTime.getTime());
        endTime.add(Calendar.DATE, 1);

        String selection = "(( " + CalendarContract.Events.DTSTART + " >= " + startTime.getTimeInMillis() + " ) AND ( "
                + CalendarContract.Events.DTSTART + " <= " + endTime.getTimeInMillis() + " ) AND ( " +
                CalendarContract.Events.DELETED + " != 1 ))";

        Cursor cursor = context.getContentResolver()
                .query(Uri.parse("content://com.android.calendar/events"),
                        new String[]{CalendarContract.Events.CALENDAR_ID,
                                CalendarContract.Events.TITLE,
                                CalendarContract.Events.DESCRIPTION,
                                CalendarContract.Events.DTSTART,
                                CalendarContract.Events.DTEND,
                                CalendarContract.Events.EVENT_LOCATION}, selection,
                        null, null);

        // fetching calendars id
        nameOfEvent.clear();
        startDates.clear();
        endDates.clear();
        descriptions.clear();
        eventList.clear();

        while (cursor.moveToNext()) {

            String title = cursor.getString(cursor.getColumnIndex(CalendarContract.Events.TITLE));
            String description = cursor.getString(cursor.getColumnIndex(CalendarContract.Events.DESCRIPTION));
            String start_time = getDate(cursor.getLong(cursor.getColumnIndex(CalendarContract.Events.DTSTART)));
            String end_time = getDate(cursor.getLong(cursor.getColumnIndex(CalendarContract.Events.DTEND)));

            if (description == null)
                continue;

            if (description.equals(MAGIC_TAG)) {
                eventList.add(String.format("%s, %s - %s", title, start_time, end_time));
            }

        }
        cursor.close();
        return eventList;
    }

    public static String getDate(long milliSeconds) {
        SimpleDateFormat formatter = new SimpleDateFormat(
                "HH:mm", Locale.getDefault());
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(milliSeconds);
        return formatter.format(calendar.getTime());
    }
}
