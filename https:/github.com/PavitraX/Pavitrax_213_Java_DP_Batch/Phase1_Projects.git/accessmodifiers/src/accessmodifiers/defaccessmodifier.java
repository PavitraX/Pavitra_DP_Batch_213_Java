package accessmodifiers;
 
	//1. Class is having Default access modifier 
	class accessSpecifiers1
	{ 
	  void display() 
	     { 
	         System.out.println("You are using defalut access specifier"); 
	     } 
	} 

	public class defaccessmodifier {

		public static void main(String[] args) {
			//default
			System.out.println("Dafault Access Specifier");
			accessSpecifiers1 obj = new accessSpecifiers1(); 		  
	        obj.display(); 

		}
	}



