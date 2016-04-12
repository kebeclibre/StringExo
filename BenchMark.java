import java.util.GregorianCalendar;

public class BenchMark {
	private long start;
	private long stop;
	private long elapsed;
	
	public void startMeUp(){
		//this.start = new GregorianCalendar().getTimeInMillis();
		this.start = System.nanoTime();
	}
	
	public void stopMe() {
		//this.stop=new GregorianCalendar().getTimeInMillis();
		this.stop = System.nanoTime();
	}
	
	public String showMe() {
		this.elapsed = this.stop-this.start;
		return this.elapsed+"";
	}
}
