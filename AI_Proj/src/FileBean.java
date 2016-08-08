import java.util.ArrayList;



public class FileBean {

	double p;
	int topic;
	ArrayList<String> al=new ArrayList<String>();
	
	public FileBean(double p, ArrayList<String> al) {
		super();
		this.p = p;
		this.al = al;
	}

	
	public FileBean() {
		super();
	}

	

	public int getTopic() {
		return topic;
	}


	public void setTopic(int topic) {
		this.topic = topic;
	}


	public double getP() {
		return p;
	}

	public void setP(double p) {
		this.p = p;
	}

	public ArrayList<String> getAl() {
		return al;
	}

	public void setAl(ArrayList<String> al) {
		this.al = al;
	}




	
	


	
	

	
		
	
	
}
