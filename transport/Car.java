package transport;


public class Car extends Transport implements Competing {
    private TypeOfBody typeOfBody;
    public Car(String brand, String model, double engineVolume, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
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
        if (typeOfBody == null) {
            System.out.println("Данных по авто не достатаочно");
        } else {
            System.out.println("Тип кузовва " + typeOfBody);
        }
    }

    @Override
    public boolean service() {
        return Math.random()>0.3;
    }


    @Override
    public void pitStop() {
        System.out.println(" Автомобиль прошел пит-стоп");
    }

    @Override
    public int bestTimeLap() {
        return (int) (Math.random() * 4);

    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 300);

    }

}
