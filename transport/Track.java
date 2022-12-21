package transport;

public class Track extends Transport implements Competing {
    private Weight weight;


    public Track(String brand, String model, double engineVolume, Weight weight) {
        super(brand, model, engineVolume);
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    @Override
    public void start() {
        System.out.println("Автомобиль \"" +getBrand() +"\" (\""+ getModel() +"\") начал движение");

    }

    @Override
    public void stop() {
        System.out.println("Автомобиль \"" + getBrand() +"\" (\"" + getModel() + "\") окончил движение");

    }

    @Override
    public void printType() {
        if (weight == null) {
            System.out.println("Данных по авто не достатаочно");
        } else {
            String from = weight.getFrom() == null ? " " : " от "+ weight.getFrom() + " ";
            String to = weight.getTo() == null ? " " : " до "+ weight.getTo();
            System.out.println("Грузоподъемность авто " + from + to);
        }
    }

    @Override
    public boolean service() {
         return Math.random()>0.75;
    }


    @Override
    public void pitStop() {
        System.out.println("Грузовик прошел пит-стоп");
    }

    @Override
    public int bestTimeLap() {
        System.out.println();
        return (int) (Math.random() * 8);

    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 200);

    }


}

