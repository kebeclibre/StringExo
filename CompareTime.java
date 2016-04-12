
public class CompareTime {
	
	private int borneSup=10000;
	private String string = "www.reflets.info";
	private byte mode;
	private BenchMark bench;
	private String result;
	StringBuilder build = new StringBuilder(string);
	StringBuffer buff = new StringBuffer(string);
	
	public CompareTime (byte mode) {
		this.mode = mode;
		exec();
	}
	
	public void doLoop() {
		for (int i=0;i<borneSup;i++) {
			if (mode == 0) {
				result += string;
			}else if (mode == 1){
				build = build.append(string);
			}else if (mode == 2) {
				buff = buff.append(string);
			}
		}
		//return result;
	}

	public void initBench() {
		bench = new BenchMark();
	}

	public void exec() {
		initBench();
		bench.startMeUp();
		doLoop();
		bench.stopMe();
		System.out.println(bench.showMe());
	}
	
	public void updateString(Object obj){
		result = obj.toString();
	}
	
	public String getResult(){
		if (mode == 0) {
			return string;
		}else if (mode == 1){
			return build.toString();
		}else if (mode == 2) {
			return buff.toString();
		}
		return false+"";
	}
}
	
