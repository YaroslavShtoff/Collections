package transport.driver;

import transport.Car;

public class    DriverB extends Driver <Car>{
    public DriverB(String name, boolean hasDrivingLicense, int experience,String category) {
        super(name, hasDrivingLicense, experience, category);
    }

    @Override
    public String getCategory() {
        return super.getCategory();
    }

    @Override
    public void setCategory(String category) {
        if(category == "B"  )
            System.out.println("Категория прав  B");
        super.setCategory(category);
    }

    @Override
    public void startMove(Car transport) {
        transport.start();
    }

    @Override
    public void stopMove(Car transport) {
        transport.stop();
    }

    @Override
    public void refill(Car transport) {
        System.out.println("Водитель" +getName()+"запрвляет автомобиль " +transport.getBrand());
    }
}
