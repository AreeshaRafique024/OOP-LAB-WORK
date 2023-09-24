public class Child extends Parent {
    private double basicSal;
    
Child (int id,String name,double salary, double commission,double basicSal){
    super(id,
     name, commission, salary);
    this.basicSal=basicSal;
}
public void setBasicSal(double basicSal){
    this.basicSal=basicSal;
}
public double getBasicSal(){
    return basicSal;
}
public double getEarn(){
 return getBasicSal()+super.getEarn();
}

public static void main(String[] args) {
    Child c1 = new Child(7, "salamn", 20000, 2000, 1000);
    System.out.println(c1.getEarn());
}
}
