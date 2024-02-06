package Delivery;

public class plane {
    private String Sign;
    private String dep;
    private String arr;
    private String rwy;
    
    public plane(){

    }
    public plane(String Sign,String dep,String arr,String rwy){
        this.Sign=Sign;
        this.arr=arr;
        this.dep=dep;
        this.rwy=rwy;
    }
    public String getSign() {
        return Sign;
    }
    public String getRwy() {
        return rwy;
    }
    public void setRwy(String rwy) {
        this.rwy = rwy;
    }
    public void setSign(String sign) {
        Sign = sign;
    }
    public String getDep() {
        return dep;
    }
    public void setDep(String dep) {
        this.dep = dep;
    }
    public String getArr() {
        return arr;
    }
    public void setArr(String arr) {
        this.arr = arr;
    }
    
    
}
