public class Singer {
  private  String name;
   private  String gender;
   private  String nationality;
    private Date debutDate;    

public Singer(String name,String gender, String nationality , Date debutDate){
    this.name=name;
    this.gender=gender;
    this.nationality=nationality;
    this.debutDate=debutDate;
}
public void setName(String name){
    this.name=name;
}
public void setGender(String gender){
    this.gender=gender;
}
public void setNationality(String nationality){
    this.nationality=nationality;
}
public void setDebutDate(Date debuDate){
    this.debutDate=debuDate;
}
public String getName(){
    return name;
}
public String getGender(){
    return gender;
}
public String getNationality(){
    return nationality;
}
public Date getDebutDate(){
    return debutDate;
}
public String toString(){
    return String.format("%s%s%s%s",name,gender,nationality,debutDate);
}

}
