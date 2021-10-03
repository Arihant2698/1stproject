import java.util.ArrayList;
//import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Agent> list =new ArrayList<Agent>();
		System.out.println("Enter no of Agents :");
		int n=sc.nextInt();
		System.out.println("Enter thier name and Funds details:");
		while(n>0) {
			String s=sc.next();
			long val=sc.nextLong();
		list.add(new Agent(s,val));
		n--;
		}
		Map<String,String> map=list
				.stream()
				.collect(Collectors.toMap(Agent::getName, 
			            agent -> giveStars(agent.getGeneratedFund())
//			            ,(rating1, rating2) -> rating1.length() > rating2.length() ? rating1 : rating2,
//			            LinkedHashMap::new // keep insertion order
			        ));
		for (Entry<String, String> entry : map.entrySet()) {
	        System.out.println(entry);
	    }
	 		sc.close();
	}

	private static String giveStars(Long generatedFund) {
		  if(generatedFund>=2000000)
	            return "*****";
	        else if(generatedFund>=1500000)
	            return "***";
	        else if(generatedFund>=1000000)
	            return "*";
	        return "";
	}
	

}
