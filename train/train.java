package train;

import java.time.LocalDate;

public class train {
    private String ID;
    private String start;
    private String end;
    private LocalDate time;
    private int limit_passanger;
    private int passanger;
    private double price;

    public train(){
        
    }
    public train(String iD, String start, String end, LocalDate time, int limit_passanger, int passanger,
            double price) {
        ID = iD;
        this.start = start;
        this.end = end;
        this.time = time;
        this.limit_passanger = limit_passanger;
        this.passanger = passanger;
        this.price = price;
    }
    public String getID() {
        return ID;
    }
    public void setID(String iD) {
        ID = iD;
    }
    public String getStart() {
        return start;
    }
    public void setStart(String start) {
        this.start = start;
    }
    public String getEnd() {
        return end;
    }
    public void setEnd(String end) {
        this.end = end;
    }
    public LocalDate getTime() {
        return time;
    }
    public void setTime(LocalDate time) {
        this.time = time;
    }
    public int getLimit_passanger() {
        return limit_passanger;
    }
    public void setLimit_passanger(int limit_passanger) {
        this.limit_passanger = limit_passanger;
    }
    public int getPassanger() {
        return passanger;
    }
    public void setPassanger(int passanger) {
        this.passanger = passanger;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    
}
