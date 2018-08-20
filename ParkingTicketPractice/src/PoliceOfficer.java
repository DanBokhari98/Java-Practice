
public class PoliceOfficer {
    private String name;
    private int number;
    
    public PoliceOfficer(String name, int number){
        this.name = name;
        this.number = number;
    }
    
    
    public boolean timeExp(ParkedCar c, ParkingMeter m){
        if ( (m.getMinutes() - c.getMinutes()) < 0)    
            return true;
        return false;
    }
    
    public void getTicket(ParkingTicket t)
    {
        System.out.println("TICKET\n" + t.getInfo() + "\n" + t.getFine() + "\n" +
                t.getOfficer() );
        
    }
    
    public String getName(){
        return name;
    }
    public int getNumber(){
        return number;
    }
    
}
