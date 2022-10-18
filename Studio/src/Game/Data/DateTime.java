package Game.Data;

import java.time.*;

public class DateTime {

    public int year, month, day, hour, minute, second, millisecond;

    public DateTime now(){

        return null;

    }

    public long fromUnixTimestamp(){

        long unixTime = Instant.now().getEpochSecond();

        return unixTime;

    }

    public long fromUnixTimestampMilli(){

        long unixTime = Instant.now().getEpochSecond()*1000;

        return unixTime;

    }

    public DateTime fromUniversalTime(int yyyy, int mm, int dd, int hh, int min, int s, int ms){

        return null;

    }

    public DateTime fromLocalTime(int yyyy, int mm, int dd, int hh, int min, int s, int ms){

        return null;

    }

    public DateTime fromIsoDate(String isoDate){

        return null;

    }

    public DateTime toUniversalTime(){

        return this;

    }

    public DateTime toLocalTime(){

        return this;

    }

    public String toIsoDate(){

        return null;

    }

    public String formatUniversalTime(String format, String time){

        return null;

    }

    public String formatLocalTime(String format, String time){

        return null;

    }
}
