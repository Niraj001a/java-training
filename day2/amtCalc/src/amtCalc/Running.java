package amtCalc;

abstract class Bike{
	   Bike(){System.out.println("bike is created");}
	   abstract void run();
	   void changeGear(){System.out.println("gear changed");}
	 }

	 class Honda extends Bike{
	 void run(){System.out.println("running safely..");}
	 }
	 public class Running{
	 public static void main(String args[]){
	  Honda obj = new Honda();
	  
	  obj.changeGear();
	  obj.run();
	 }
	}

