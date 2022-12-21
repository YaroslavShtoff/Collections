package transport;

import transport.driver.Driver;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

import java.util.List;
import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int counter = 1;

        Mechanic<Car> jonson = new Mechanic<Car>(" Джонсон ", "Джонсонов", "Jonson & Jonson");
        Sponsor vodaphone = new Sponsor(" Мегафон", 200_000);
        Sponsor zavod = new Sponsor("Подшипниковый завод", 1_000_000);

        Car car1 = generateCar(counter++);
        car1.start();
        car1.stop();
        car1.pitStop();
        car1.printType();
        car1.addDrivers(new DriverB(" Алехин ", true, 10, "B"));
        car1.addMechanic(jonson);
        car1.addSponsor(vodaphone,zavod);
       /* Car car2 = generateCar(counter++);
        car2.start();
        car2.stop();
        car2.bestTimeLap();
        car2.printType();
        Car car3 = generateCar(counter++);
        car3.start();
        car3.stop();
        car3.maxSpeed();
        car3.printType();
        Car car4 = generateCar(counter++);
        car4.start();
        car4.stop();
        car4.printType();*/

        Mechanic<Bus> juri = new Mechanic<Bus>(" Юрий", "Бойко", "UFC");
        Sponsor mts = new Sponsor(" МТС ", 210_000);
        Sponsor gasProm = new Sponsor("Газпром ", 100_000_000);

        Bus bus1 = generateBus(counter++);
        bus1.start();
        bus1.stop();
        bus1.pitStop();
        bus1.printType();
        bus1.addDrivers(new DriverC(" Петров ", true, 22,"C"));
        bus1.addMechanic(juri);
        bus1.addSponsor(mts,gasProm);
        /*Bus bus2 = generateBus(counter++);
        bus2.start();
        bus2.stop();
        bus2.bestTimeLap();
        bus2.printType();
        Bus bus3 = generateBus(counter++);
        bus3.start();
        bus3.stop();
        bus3.maxSpeed();
        bus3.printType();
        Bus bus4 = generateBus(counter++);
        bus4.start();
        bus4.stop();
        bus4.printType();*/

        Mechanic<Track> sergey = new Mechanic<Track>(" Сергей ", "Лазарев", "Первый канал");
        Sponsor megaphone = new Sponsor(" Мегафон", 200_000);
        Sponsor pirojkovaya = new Sponsor("Пирожковая 1", 1_000_000_000);

        Track track1 = generateTrack(counter++);
        track1.start();
        track1.stop();
        track1.pitStop();
        track1.printType();
        track1.addDrivers(new DriverD(" Квят ", true, 14,"D"));
        track1.addMechanic(sergey);
        track1.addSponsor(megaphone,pirojkovaya);
        /*Track track2 = generateTrack(counter++);
        track2.start();
        track2.stop();
        track2.bestTimeLap();
        track2.printType();
        Track track3 = generateTrack(counter++);
        track3.start();
        track3.stop();
        track3.maxSpeed();
        track3.printType();
        Track track4 = generateTrack(counter++);
        track4.start();
        track4.stop();
        track4.printType();*/

       /* service(car1,
                 bus1,
                track1 );*/

        List<Transport> transports = List.of(
                car1,
                track1,
                bus1);

        for (Transport transport: transports){
            printInfo(transport);

        }




        /* alekhin.startMove(car1);
        alekhin.startMove(car1);
        alekhin.refill(car1);
        alekhin.printInfo(car1);

        petrov.startMove(track1);
        petrov.stopMove(track1);
        petrov.refill(track1);
        petrov.printInfo(track1);

        kvyat.startMove(bus1);
        kvyat.stopMove(bus1);
        kvyat.refill(bus1);
        kvyat.printInfo(bus1);*/

    }
    private static void printInfo(Transport transport) {
        System.out.println("Информация по автомобилю " + transport.getBrand()+ "  " + transport.getModel());
        System.out.println("Водители: "+ transport.getDrivers());
        System.out.println("Механик: " +transport.getMechanics());
        System.out.println("Спонсоры: " + transport.getSponsors());

        System.out.println();

    }



    private static Car generateCar(int number) {
        return new Car("марка #" + number, "бренд #" + number, 1.6, TypeOfBody.SEDAN);


    }

    private static Bus generateBus(int number) {
        return new Bus("марка #" + number, "бренд #" + number, 2.5, Capacity.LARGE);

    }

    private static Track generateTrack(int number) {
        return new Track("марка #" + number, "бренд #" + number, 3.6, Weight.N2);
    }


  /*  public static void service(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }

       private static void serviceTransport(Transport transport) {
            try {
                if (!transport.service())
                    throw new RuntimeException("Автомобиль " + transport.getBrand() + transport.getModel()
                            + " не прошел диагностику");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }*/




}




