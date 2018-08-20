public class ParkingTicket {
    private String make;
    private String model;
    private String color;
    private int license;
    private int minparked;
    private int minmeter;
    private String name;
    private int number;
    
    public ParkingTicket(ParkedCar c, ParkingMeter m, PoliceOfficer p){
        this.make = c.getMake();
        this.model = c.getModel();
        this.color = c.getColor();
        this.license = c.getLicense();
        this.minparked = c.getMinutes();
        this.minmeter = m.getMinutes();
        this.name = p.getName();
        this.number = p.getNumber();
    }
    
    public String getInfo(){
        String info;
        info = "Make: " + make + 
               "\nModel: " + model + 
               "\nColor: " + color +
               "\nLicense Number: " + license;
        return info;
    }
    
    public String getFine(){
        double fine = 25;
        int minsover = minparked - minmeter;
        if(minsover > 60){
            double overhour = (double) (minsover - 60 )/ 60;
            while( overhour >= 0){
                fine += 10;
                overhour--;
            }
        }
        String info = "Fine: $" + fine;
        return info;
    }
    
    public String getOfficer(){
        String info = "Officer name: " + name +
                      "\nBadge Number: " + number;
        return info;
    }
    
    
    
    
    
    
    
    
    /* public static String getInfo(ParkedCar c)
    {
        String info;
        info = "Make: " + c.getMake() + 
               "\nModel: " + c.getModel() + 
               "\nColor: " + c.getColor() +
               "\nLicense Number: " + c.getLicense();
        return info;
    }
    public static String getFine(ParkedCar c, ParkingMeter meter)
    {
        double fine = 25;
        int minsover = c.getMinutes() - meter.getMinutes();
        if(minsover > 60)
        {
            double overhour = (double) minsover - 60 / 60;
            while( overhour >= 0)
            {
                fine += 10;
                overhour--;
            }
        }
        String info = "Fine: $" + fine;
        return info;
    }
    public static String getOfficer(PoliceOfficer p)
    {
        String info = "Officer name: " + p.getName() +
                      "\nBadge Number: " + p.getNumber();
        return info;
    }
*/
    
    
}
