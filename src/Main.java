import transport.Bus;
import transport.Train;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Train lastochka = new Train(
                "Ласточка",
                "В-901",
                2011,
                "Россия",
                null,
                301,
                "ДИЗ.Т.(далее-дт)",
                50,
                3500,
                3,
                "Белорусский вокзал",
                "Минск-пассажирский",
                11
        );
        Train leningrad = new Train(
                "Ленинград",
                "D-125",
                2019,
                "Россия",
                null,
                270,
                "дт",
                45,
                1700,
                5,
                "Ленинградский вокзал",
                "Ленинград-пассажирский",
                8
        );
        System.out.println(lastochka);
        System.out.println(leningrad);
        for (int i = 0; i < 3; i++) {
            Bus bus= new Bus(
                    "Bus brand #"+i,
                    "Bus model #"+i,
                    LocalDate.now().minusYears(1).getYear(),
                    "Россия",
                    "Белый",
                    100*i,
                    "дт",
                    32


            );
            System.out.println(bus);

            Bus bus1=new Bus(
                    "MAZ",
                    "1034",
                    2015,
                    "Belarus Republic",
                    "White",
                    110,
                    "дт",
                    94
            );
            System.out.println(bus1);
            Bus bus2=new Bus(
                    "PAZ",
                    "Vector",
                    2013,
                    "Russia",
                    "Green",
                    100,
                    "дт,",
                    97


            );
            System.out.println(bus2);
            Bus bus3=new Bus(
                    "GAZ",
                    "Gazel next",
                    2022,
                    "Russia",
                    "Yellow",
                    140,
                    "бенз.АИ-95",
                    90

            );
            System.out.println(bus3);
        }
    }
}