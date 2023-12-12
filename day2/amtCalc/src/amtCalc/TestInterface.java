package amtCalc;
interface Drawable{  
void draw();  
default void msg(){System.out.println("default method");}  
}

interface Drawable2{  
void draw();  
default void msg(){System.out.println("default method 2");}  
}


class Rectangle implements Drawable,Drawable2{  
public void draw(){
	System.out.println("drawing rectangle");
	}

public void msg() {
	// TODO Auto-generated method stub
	Drawable.super.msg();
}
 
}  
class TestInterface{  
public static void main(String args[]){  
Drawable d=new Rectangle();  
d.draw();  
d.msg();  
}}  
