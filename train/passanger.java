package train;
public class passanger {
    private String name;
    private String ID;
    private String train_id;
    private int brought;

    passanger(){

    }
    
    public passanger(String name, String iD, String train_id) {
        this.name = name;
        this.ID = iD;
        this.train_id = train_id;
        this.brought=0;
    }

    public passanger(String name,String ID){
        this.name=name;
        this.ID=ID;
        this.train_id=null;
        this.brought=0;
    }
    public int getBrought(){
        return brought;
    }

    public void setBrought(int num){
        brought=num;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getID() {
        return ID;
    }
    public void setID(String iD) {
        ID = iD;
    }
    public String getTrain_id() {
        return train_id;
    }
    public void setTrain_id(String train_id) {
        this.train_id = train_id;
    }

    
    
}
