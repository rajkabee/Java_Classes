package basics.oopConcepts.polymorphism;

public class PloymorphismExample {
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.sim.call();
		mobile.sim.data();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static class Mobile{
		Sim sim = new SmartCell();
	}
	public interface Sim{
		public void call();
		public void data();
	}
	public static class Ntc implements Sim{
		public void call() {
			System.out.println("Calling using Ntc...");
		}
		public void data() {
			System.out.println("Surfing internet using Ntc...");
		}	
	}
	public static class SmartCell implements Sim{
		public void call() {
			System.out.println("Calling using SmartCell...");
		}
		public void data() {
			System.out.println("Surfing internet using SmartCell...");
		}
		
	}
}
