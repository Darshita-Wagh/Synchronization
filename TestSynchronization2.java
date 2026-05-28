package synchronization;
class Tables{  
	 synchronized void printTable(int n){//synchronized method  
	   for(int i=1;i<=5;i++){  
	     System.out.println(n*i);  
	     try{  
	      Thread.sleep(400);  
	     }catch(Exception e){System.out.println(e);}  
	   }  
	  
	 }  
}  
	  
class MyThreads1 extends Thread{  
	Tables t;  
	MyThreads1(Tables t){  
		this.t=t;   
	}  
	public void run(){  
		t.printTable(5);  
	}  
	  
}

class MyThreads2 extends Thread{  
	Tables t;  
	MyThreads2(Tables t){  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(100);  
	}  
}  
	  
public class TestSynchronization2{  
	public static void main(String args[]){  
		Tables obj = new Tables();//only one object  
		MyThreads1 t1=new MyThreads1(obj);  
		MyThreads2 t2=new MyThreads2(obj);  
		t1.start();  
		t2.start();  
	}  
}  
