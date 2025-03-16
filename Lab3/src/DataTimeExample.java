import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DataTimeExample {
    public static void main(String[] args) {
        DataExample();
        SimpleDateFormat();
        CalendarExample();
        MethodCalendar();

    }

    public static void DataExample(){
        Date date = new Date(); //w () możemy podać konkretny timestamp
        System.out.println(date.toString());

        //liczba milisekund, które upłynęły od nastania Ery Unixu: 1 stycznia 1970, 0:00:00 GMT.
        System.out.println(date.getTime());
    }
    public static void SimpleDateFormat(){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss 'w dniu' dd MM yyyy");
        System.out.println(dateFormat.format(date));

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("'dzisiaj jest: 'E 'lub możemy wypisać' EEEE");
        System.out.println(dateFormat1.format(date));
    }

    public static void CalendarExample(){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss 'w dniu' dd MM yyyy");
        System.out.println(dateFormat.format(date));

        //korzystamy z już zadeklarowanej zmiennej date
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        //za pomocą add dodajemy lub odejmujemy od aktualnego np. miesiąca wartości
        cal.add(Calendar.MONTH, 6);

        Date for6months = cal.getTime();
        System.out.println("Przerejestrowanie działalności należy wykonać: " + for6months);

        cal.add(Calendar.WEEK_OF_MONTH, 5);
        Date nextVaccine = cal.getTime();

        SimpleDateFormat df = new SimpleDateFormat("EEEE dd.MM.YYYY 'na godzinę' HH:mm:ss");

        System.out.println("Pierwsza dawka szczepionki planowana na : " + df.format(for6months));
        System.out.println("Następna dawka szczepionki: " + df.format(nextVaccine));
    }
    public static void MethodCalendar(){
        //określanie dnia tygonia
        //za pomocą set ustawiamy datę - uwaga na miesiąc, numeracja rozpoczyna się od 0
        Calendar cal2 = GregorianCalendar.getInstance();
        cal2.set(Calendar.YEAR, 2000);
        cal2.set(Calendar.MONTH, 9); // numeracja miesięcy od 0
        cal2.set(Calendar.DAY_OF_MONTH, 5);
        cal2.set(Calendar.HOUR_OF_DAY, 2);
        cal2.set(Calendar.MINUTE, 0);
        cal2.set(Calendar.SECOND, 0);
        Date test = cal2.getTime();
        SimpleDateFormat bdf = new SimpleDateFormat("EEEE dd.MM.YYYY 'o godzinie' HH:mm:ss");
        System.out.println("Urodziłam się " + bdf.format(test));
    }

    public static void LocalDateExample(){
        //LocalDate
        LocalDate ld = LocalDate.now();
        System.out.println(ld); //2021-05-27
        System.out.println(ld.getDayOfMonth()); //27
        System.out.println(ld.getMonth()); //MAY
        System.out.println(ld.getMonthValue()); //5
        System.out.println(ld.getYear()); //2021
        //dodawanie i odejmowanie
        System.out.println(ld.plusDays(5)); //2021-06-01
        System.out.println(ld.minusMonths(1)); //2021-04-27
    }

    public static void LocalTimeExample(){
        LocalTime lt = LocalTime.now();
        System.out.println(lt); //14:06:42.649617200
        System.out.println(lt.getHour()); //14
        System.out.println(lt.getMinute()); //6
        System.out.println(lt.getSecond()); //42
        System.out.println(lt.getNano()); //649617200
        //dodawanie i odejmowanie
        System.out.println(lt.plusHours(5)); //19:06:42.649617200
        System.out.println(lt.minusMinutes(1)); //14:05:42.649617200
    }

    public static void LocalDTExample(){
        //LocalDateTime
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); //2021-05-27T14:23:20.115568100
        //sformatujemy wyświetlanie daty kolejną klasą
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(dtf.format(ldt));//27-05-2021 14:23:20
        //pobieramy dane
        System.out.println(ldt.getDayOfMonth()); //27
        System.out.println(ldt.getHour()); //14
        //dodajemy i odejmujemy
        System.out.println(ldt.minusYears(1));//2020-05-27T14:26:04.070597700
        System.out.println(ldt.plusDays(1));//2021-05-28T14:26:04.070597700
    }
}
