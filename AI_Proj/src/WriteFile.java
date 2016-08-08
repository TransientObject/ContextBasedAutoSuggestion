import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;



public class WriteFile {
	
	public void writeFile(ArrayList<FileBean> list){
		
		Collections.sort(list,new MyComp());
		
		StringBuilder sb=new StringBuilder();
		
		double prob=0;
		
		for(int i=0; i<list.size();i++){
			
			if(prob>0.6){
				break;
			}
			else{
				
				for(int j=0; j<list.get(i).getAl().size();j++){
				sb.append(list.get(i).getAl().get(j));
				sb.append(" ");
				}
			}
			
			prob+=list.get(i).getP();
			
		}
		
		try{
		FileWriter fout=new FileWriter("/home/littlecegian/AI/term_project/context_based_autosuggestion/public/dictionary.txt");
		
		fout.write(sb.toString());
		
		fout.close();
		
	
		System.out.print(sb.toString());
		}
		
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("IO Exception "+e.getMessage());
		}
	}
}
