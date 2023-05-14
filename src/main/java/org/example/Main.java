package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import com.fasterxml.jackson.core.JsonParser;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Guest> guests = new ArrayList<>();

        TreeMap<Date, Period> p = new TreeMap<>();

        p.put( new GregorianCalendar(2022, Calendar.APRIL, 20, 1,5).getTime(),
                new Period("park", null, 550,
                new GregorianCalendar(2022, Calendar.APRIL, 19, 1,10).getTime(),
                new GregorianCalendar(2022, Calendar.APRIL, 20, 1,10).getTime()));

        p.put( new GregorianCalendar(2022, Calendar.APRIL, 20, 2,5).getTime(),
                new Period("cafe", null, 650,
                        new GregorianCalendar(2022, Calendar.APRIL, 19, 1,10).getTime(),
                        new GregorianCalendar(2022, Calendar.APRIL, 20, 3,10).getTime()));

        guests.add(new Guest(1, 1, "Egor", "Manasipov", "Sergeevich",
                new GregorianCalendar(2002, Calendar.OCTOBER, 13).getTime(),
                "Saratov", 1212, new GregorianCalendar(2002, Calendar.OCTOBER, 13).getTime(),
                12113, p));

        p = new TreeMap<>();

        p.put( new GregorianCalendar(2021, Calendar.APRIL, 20, 1,5).getTime(),
                new Period("restaurant", null, 250,
                        new GregorianCalendar(2021, Calendar.APRIL, 19, 1,10).getTime(),
                        new GregorianCalendar(2021, Calendar.APRIL, 20, 1,10).getTime()));

        p.put( new GregorianCalendar(2021, Calendar.APRIL, 20, 2,5).getTime(),
                new Period("embankment", null, 750,
                        new GregorianCalendar(2021, Calendar.APRIL, 19, 1,10).getTime(),
                        new GregorianCalendar(2021, Calendar.APRIL, 20, 3,10).getTime()));

        guests.add(new Guest(2, 2, "Anton", "Ivanov", "Ivanovich",
                new GregorianCalendar(2001, Calendar.OCTOBER, 12).getTime(),
                "Saratov", 1232, new GregorianCalendar(2001, Calendar.OCTOBER, 12).getTime(),
                12123, p));

        p = new TreeMap<>();

        p.put( new GregorianCalendar(2020, Calendar.APRIL, 20, 1,5).getTime(),
                new Period("bar", null, 1350,
                        new GregorianCalendar(2020, Calendar.APRIL, 19, 1,10).getTime(),
                        new GregorianCalendar(2020, Calendar.APRIL, 20, 1,10).getTime()));

        p.put( new GregorianCalendar(2020, Calendar.APRIL, 20, 2,5).getTime(),
                new Period("market", null, 950,
                        new GregorianCalendar(2020, Calendar.APRIL, 19, 1,10).getTime(),
                        new GregorianCalendar(2020, Calendar.APRIL, 20, 3,10).getTime()));

        guests.add(new Guest(3, 3, "Ivan", "Ivanov", "Ivanovich",
                new GregorianCalendar(2000, Calendar.OCTOBER, 11).getTime(),
                "Saratov", 214, new GregorianCalendar(2000, Calendar.OCTOBER, 11).getTime(),
                214, p));

        p = new TreeMap<>();

        p.put( new GregorianCalendar(2019, Calendar.APRIL, 20, 1,5).getTime(),
                new Period("shop", null, 2350,
                        new GregorianCalendar(2019, Calendar.APRIL, 19, 1,10).getTime(),
                        new GregorianCalendar(2019, Calendar.APRIL, 20, 1,10).getTime()));

        p.put( new GregorianCalendar(2019, Calendar.APRIL, 20, 2,5).getTime(),
                new Period("market", null, 2250,
                        new GregorianCalendar(2019, Calendar.APRIL, 19, 1,10).getTime(),
                        new GregorianCalendar(2019, Calendar.APRIL, 20, 3,10).getTime()));

        guests.add(new Guest(4, 4, "Ivan", "Ivanov", "Antonovich",
                new GregorianCalendar(2003, Calendar.OCTOBER, 11).getTime(),
                "Saratov", 2143, new GregorianCalendar(2003, Calendar.OCTOBER, 11).getTime(),
                2142, p));

        p = new TreeMap<>();

        p.put( new GregorianCalendar(2022, Calendar.APRIL, 20, 1,5).getTime(),
                new Period("park", null, 550,
                        new GregorianCalendar(2022, Calendar.APRIL, 19, 1,10).getTime(),
                        new GregorianCalendar(2022, Calendar.APRIL, 20, 1,10).getTime()));

        p.put( new GregorianCalendar(2022, Calendar.APRIL, 20, 2,5).getTime(),
                new Period("cafe", null, 650,
                        new GregorianCalendar(2022, Calendar.APRIL, 19, 1,10).getTime(),
                        new GregorianCalendar(2022, Calendar.APRIL, 20, 3,10).getTime()));

        guests.add(new Guest(5, 5, "Egor", "Petrov", "Sergeevich",
                new GregorianCalendar(2002, Calendar.OCTOBER, 13).getTime(),
                "Saratov", 12122, new GregorianCalendar(2002, Calendar.OCTOBER, 13).getTime(),
                121132, p));

        p = new TreeMap<>();

        p.put( new GregorianCalendar(2021, Calendar.APRIL, 20, 1,5).getTime(),
                new Period("restaurant", null, 250,
                        new GregorianCalendar(2021, Calendar.APRIL, 19, 1,10).getTime(),
                        new GregorianCalendar(2021, Calendar.APRIL, 20, 1,10).getTime()));

        p.put( new GregorianCalendar(2021, Calendar.APRIL, 20, 2,5).getTime(),
                new Period("embankment", null, 750,
                        new GregorianCalendar(2021, Calendar.APRIL, 19, 1,10).getTime(),
                        new GregorianCalendar(2021, Calendar.APRIL, 20, 3,10).getTime()));

        guests.add(new Guest(6, 6, "Anton", "Sidorov", "Ivanovich",
                new GregorianCalendar(2001, Calendar.OCTOBER, 12).getTime(),
                "Saratov", 12322, new GregorianCalendar(2001, Calendar.OCTOBER, 12).getTime(),
                121232, p));

        p = new TreeMap<>();

        p.put( new GregorianCalendar(2020, Calendar.APRIL, 20, 1,5).getTime(),
                new Period("bar", null, 1350,
                        new GregorianCalendar(2020, Calendar.APRIL, 19, 1,10).getTime(),
                        new GregorianCalendar(2020, Calendar.APRIL, 20, 1,10).getTime()));

        p.put( new GregorianCalendar(2020, Calendar.APRIL, 20, 2,5).getTime(),
                new Period("market", null, 950,
                        new GregorianCalendar(2020, Calendar.APRIL, 19, 1,10).getTime(),
                        new GregorianCalendar(2020, Calendar.APRIL, 20, 3,10).getTime()));

        guests.add(new Guest(7, 7, "Ivan", "Vasiliev", "Ivanovich",
                new GregorianCalendar(2000, Calendar.OCTOBER, 11).getTime(),
                "Saratov", 2142, new GregorianCalendar(2000, Calendar.OCTOBER, 11).getTime(),
                2142, p));

        p = new TreeMap<>();

        p.put( new GregorianCalendar(2019, Calendar.APRIL, 20, 1,5).getTime(),
                new Period("shop", null, 2350,
                        new GregorianCalendar(2019, Calendar.APRIL, 19, 1,10).getTime(),
                        new GregorianCalendar(2019, Calendar.APRIL, 20, 1,10).getTime()));

        p.put( new GregorianCalendar(2019, Calendar.APRIL, 20, 2,5).getTime(),
                new Period("market", null, 2250,
                        new GregorianCalendar(2019, Calendar.APRIL, 19, 1,10).getTime(),
                        new GregorianCalendar(2019, Calendar.APRIL, 20, 3,10).getTime()));

        guests.add(new Guest(8, 8, "Ivan", "Sherov", "Antonovich",
                new GregorianCalendar(2003, Calendar.OCTOBER, 11).getTime(),
                "Saratov", 21432, new GregorianCalendar(2003, Calendar.OCTOBER, 11).getTime(),
                21422, p));

        p = new TreeMap<>();

        p.put( new GregorianCalendar(2022, Calendar.APRIL, 20, 1,5).getTime(),
                new Period("park", null, 550,
                        new GregorianCalendar(2022, Calendar.APRIL, 19, 1,10).getTime(),
                        new GregorianCalendar(2022, Calendar.APRIL, 20, 1,10).getTime()));

        p.put( new GregorianCalendar(2022, Calendar.APRIL, 20, 2,5).getTime(),
                new Period("cafe", null, 650,
                        new GregorianCalendar(2022, Calendar.APRIL, 19, 1,10).getTime(),
                        new GregorianCalendar(2022, Calendar.APRIL, 20, 3,10).getTime()));

        guests.add(new Guest(9, 9, "Egor", "Snegov", "Sergeevich",
                new GregorianCalendar(2002, Calendar.OCTOBER, 13).getTime(),
                "Saratov", 12121, new GregorianCalendar(2002, Calendar.OCTOBER, 13).getTime(),
                121131, p));

        p = new TreeMap<>();

        p.put( new GregorianCalendar(2021, Calendar.APRIL, 20, 1,5).getTime(),
                new Period("restaurant", null, 250,
                        new GregorianCalendar(2021, Calendar.APRIL, 19, 1,10).getTime(),
                        new GregorianCalendar(2021, Calendar.APRIL, 20, 1,10).getTime()));

        p.put( new GregorianCalendar(2021, Calendar.APRIL, 20, 2,5).getTime(),
                new Period("embankment", null, 750,
                        new GregorianCalendar(2021, Calendar.APRIL, 19, 1,10).getTime(),
                        new GregorianCalendar(2021, Calendar.APRIL, 20, 3,10).getTime()));

        guests.add(new Guest(10, 10, "Anton", "Radin", "Ivanovich",
                new GregorianCalendar(2001, Calendar.OCTOBER, 12).getTime(),
                "Saratov", 12321, new GregorianCalendar(2001, Calendar.OCTOBER, 12).getTime(),
                121231, p));

        p = new TreeMap<>();

        p.put( new GregorianCalendar(2020, Calendar.APRIL, 20, 1,5).getTime(),
                new Period("bar", null, 1350,
                        new GregorianCalendar(2020, Calendar.APRIL, 19, 1,10).getTime(),
                        new GregorianCalendar(2020, Calendar.APRIL, 20, 1,10).getTime()));

        p.put( new GregorianCalendar(2020, Calendar.APRIL, 20, 2,5).getTime(),
                new Period("market", null, 950,
                        new GregorianCalendar(2020, Calendar.APRIL, 19, 1,10).getTime(),
                        new GregorianCalendar(2020, Calendar.APRIL, 20, 3,10).getTime()));

        guests.add(new Guest(11, 11, "Ivan", "Andreev", "Ivanovich",
                new GregorianCalendar(2000, Calendar.OCTOBER, 11).getTime(),
                "Saratov", 2141, new GregorianCalendar(2000, Calendar.OCTOBER, 11).getTime(),
                2141, p));

        p = new TreeMap<>();

        p.put( new GregorianCalendar(2019, Calendar.APRIL, 20, 1,5).getTime(),
                new Period("shop", null, 2350,
                        new GregorianCalendar(2019, Calendar.APRIL, 19, 1,10).getTime(),
                        new GregorianCalendar(2019, Calendar.APRIL, 20, 1,10).getTime()));

        p.put( new GregorianCalendar(2019, Calendar.APRIL, 20, 2,5).getTime(),
                new Period("market", null, 2250,
                        new GregorianCalendar(2019, Calendar.APRIL, 19, 1,10).getTime(),
                        new GregorianCalendar(2019, Calendar.APRIL, 20, 3,10).getTime()));

        guests.add(new Guest(12, 12, "Ivan", "Sardinov", "Antonovich",
                new GregorianCalendar(2003, Calendar.OCTOBER, 11).getTime(),
                "Saratov", 21431, new GregorianCalendar(2003, Calendar.OCTOBER, 11).getTime(),
                21421, p));

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.writeValue(new File("guests.json"), guests);

        String result = objectMapper.writeValueAsString(guests);
        System.out.println(result);

        byte[] jsonData = Files.readAllBytes(Paths.get("guests.json"));
        ObjectMapper mapperBack = new ObjectMapper();
        Guest[] resultBack = mapperBack.readValue(jsonData, Guest[].class);
        for (Guest guest :resultBack)
            System.out.println(guest);

    }
}