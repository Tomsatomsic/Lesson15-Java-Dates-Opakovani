package cz.secda1.spsmb.javaDates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class DateTimeUtils {

    /**
     * Vypište aktuální datum ve formátu den.měsíc.rok hodina:minuta (např. 12.12.2023 14:41)
     *
     * @param date
     * @return
     */
    public static String formattedDate(LocalDateTime date) {
        return null;
    }

    /**
     * Naparsujte datum "03.11.2023" pomocí parseru se zadaným fromátem. Správný zápis formátu můžete vyhledat.
     *
     * @param dateString
     * @return
     */
    public static LocalDate parseDate(String dateString) {
        return null;
    }

    /**
     * Přičtěte k zadanému datu (LocalDate) 12 hodin a vypište ve formátu 12.12.2023 12:00
     *
     * @param date libovolné datum
     * @return vložené datum s časem 12:00
     */
    public static String atMoonTime(LocalDate date) {
        return null;
    }

    /**
     * Vypište aktuální den v týdnu v české lokalizaci.
     *
     * @return String "Dnes je středa."
     */
    public static String whatsTheDateToday(LocalDate today) {
        //dopolňte do proměnné dayOfWeek den v týdnu.
        DayOfWeek dayOfWeek = null;

        String dayNameInCzech = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault());

        //Sestavte message "Dnes je <denVTýdnu>." pomocí String.format()
        String formattedMessage = null;
        return formattedMessage;
    }

    /**
     * Definujte proměnou Vánoce (LocalDate), která bude ukazovat na datum 24.12.2023
     * <p>
     * 1) Vypište kolik dní zbývá  do začátku Vánoc pomocí String format();
     * 2) pro výpočet použijte proměnnou Vánoce a aktuální datum.
     * 3) Výsledný výstup z metody bude String ve formátu "Do Vánoc zbývá XY dní."
     *
     * @return
     */
    public static String daysToChristmas() {
        return null;
    }

    /**
     *
     * @param start
     * @param end
     * @return
     *
     * Napište metodu, která porovná dva vložené datumy a vrátí vždy nižší datum na provní pozici a vyšší na druhé.
     * Pokud je tedy druhé datum nižší než to první, pak oba datumy prohodí prohodí a vrátí je jako list.
     *
     * @examples
     * např. pro start = 01.01.2023 a end = 31.12.2023 vrátí list ve stejném pořadí
     * např. pro start = 31.12.2023  a end = 01.01.2023 vrátí list ve opět s nižším datem na první pozici a s vyšším na pozici druhé, tedy opět 01.01.2023, 31.12.2023.
     */
    public static List<LocalDate> smallerFirst(LocalDate start, LocalDate end){
        return null;
    }

    /**
     * Najděte a vypište první pondělí po Vánocích 24.12.2023
     *
     * @return
     */
    public static LocalDate firstMondayAfterChristmas(){
        return null;
    }

}
