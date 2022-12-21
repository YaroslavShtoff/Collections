package transport.driver;

import transport.Bus;

public class DriverD extends Driver <Bus> {
    public DriverD(String name, boolean hasDrivingLicense, int experience,String category) {
        super(name, hasDrivingLicense, experience,category);
    }

    @Override
    public String getCategory() {
        return super.getCategory();
    }

    @Override
    public void setCategory(String category) {
        if(category == "D"  )
            System.out.println("Категория прав  D");
        super.setCategory(category);
    }

    @Override
    public void startMove(Bus transport) {
        transport.start();

    }

    @Override
    public void stopMove(Bus transport) {
        transport.stop();

    }

    @Override
    public void refill(Bus transport) {
        System.out.println("Водитель" +getName()+"запрвляет автобус " +transport.getBrand());


    }
}
