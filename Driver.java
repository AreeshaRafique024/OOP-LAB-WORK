public class Driver {
    public static void main(String a[]){
      Music m1 = new Music("hi", "3hours", "fg", new Date(2, 4, 2000), new Singer(null, null, null, null));
        Music m2=new Music("hell", "2Hurs", "pop", new Date(02, 04, 2000), new Singer("yuyh", "female", "ches'on", new Date(2, 04, 1990)));
      //Music m1=new Music("gehheheeh", "egeegeg", "ndhbdsd", new Date(2, 07, 2000), new Singer("yuyh"," male", "uk", "hhw"));
      System.out.println(m2); 
      System.out.println(m1);

      if(m1.equals(m2)){
        System.out.println("true");
      }
      else
      System.out.println("false");
    }
}

