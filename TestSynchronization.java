package synchronization;
class TableNew{  
	  
	 synchronized static void printTable(int n){  
	   for(int i=1;i<=10;i++){  
	     System.out.println(n*i);  
	     try{  
	       Thread.sleep(400);  
	     }catch(Exception e){}  
	   }  
	 }  
}  
	  
class A extends Thread{  
	public void run(){  
		TableNew.printTable(1);  
	}  
}  
	  
class B extends Thread{  
	public void run(){  
		TableNew.printTable(10);  
	}  
}  
	  
class C extends Thread{  
	public void run(){  
		TableNew.printTable(100);  
	}  
}  

class D extends Thread{  
	public void run(){  
		TableNew.printTable(1000);  
	}  
}  
	  
public class TestSynchronization{  
	public static void main(String t[]){  
		A t1=new A();  
		B t2=new B();  
		C t3=new C();  
		D t4=new D();  
		t1.start();  
		t2.start();  
		t3.start();  
		t4.start();  
	}  
} 
