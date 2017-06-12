
public class Encap {

	public static void main(String[] args) {
		EncapTest1 encap = new EncapTest1();
	     
		encap.getName();
		
		
		encap.setName("James");
	      encap.setAge(20);
	      encap.setIdNum("12343ms");

	      System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
	    }

	}


class EncapTest1{

	   private String name;
	   private String idNum;
	   private int age;

	   public int getAge(){
	      return age;
	   }

	   public String getName(){
	      return name;
	   }

	   public String getIdNum(){
	      return idNum;
	   }

	   public void setAge( int newAge){
	      age = newAge;
	   }

	   public void setName(String newName){
	      name = newName;
	   }

	   public void setIdNum( String newId){
	      idNum = newId;
	   }
	}


