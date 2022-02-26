import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public interface DatesToCronConverter {
    String nameSurname = "Makarenko Gleb";
    String className = "DatesToCronConverter";
    String packageName = "com.makarenko.gleb";
    String githubLink = "https://github.com/djonny3";
    String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";
    SimpleDateFormat oldFormat = new SimpleDateFormat(DATE_FORMAT, Locale.ENGLISH);
    SimpleDateFormat cronFormat = new SimpleDateFormat("ss mm hh dd MM yyyy", Locale.ENGLISH);

    default List<String> convert(List<String> var1) throws DatesToCronConvertException {
        try {
            for (String date : var1) {
                eachToCron(date);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return var1;
    }

    static String eachToCron(String dateList) throws ParseException {
        Date date = oldFormat.parse(dateList);
        String cron = cronFormat.format(date);
        return cron;
    }

    default String getImplementationInfo() {
        return nameSurname + " " + className + " " + packageName + " " + githubLink;
    }

}
