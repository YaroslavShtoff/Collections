package transport;

public class Bus extends Transport implements Competing {
    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume,Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void start() {
        System.out.println("Автобус \"" +getBrand() +"\" (\""+ getModel() +"\") начал движение");

    }

    @Override
    public void stop() {
        System.out.println("Автобус \"" + getBrand() +"\" (\"" + getModel() + "\") окончил движение");

    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по авто не достатаочно");
        } else {
            System.out.println(" Вместимость автобуса :  от " + capacity.getFrom() + " до " + capacity.getTo());
        }
    }

    @Override
    public boolean service() {
        System.out.println("Автобус"+getBrand() + " "+getModel() +"в диагностике не требуется");
        return true;
    }


    @Override
    public void pitStop() {
        System.out.println("Автобус прошел пит-стоп");
    }
    @Override
    public void repair() {
        System.out.println("Автобус" + getBrand() +getModel() + " починен ");
    }

    @Override
    public int bestTimeLap() {
        return (int) (Math.random() * 10);

    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 160);

    }
}
