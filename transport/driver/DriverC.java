package transport.driver;

import transport.Track;

public class DriverC extends Driver <Track> {
    public DriverC(String name, boolean hasDrivingLicense, int experience,String category) {
        super(name, hasDrivingLicense, experience,category);
    }

    @Override
    public String getCategory() {
        return super.getCategory();
    }

    @Override
    public void setCategory(String category) {
        if(category == "C"  )
            System.out.println("Категория прав  C");
        super.setCategory(category);
    }

    @Override
    public int getExperience() {
        return super.getExperience();
    }

    @Override
    public void startMove(Track transport) {
        transport.start();
    }

    @Override
    public void stopMove(Track transport) {
        transport.stop();
    }

    @Override
    public void refill(Track transport) {
        System.out.println("Водитель" +getName()+"запрвляет грузовик " +transport.getBrand());
    }

}
