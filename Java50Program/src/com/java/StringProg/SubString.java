package com.java.StringProg;

public class SubString {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("ABBBBAAAABAABAABBCCABCCCABBCCA");
		String sub= "ABB";
		String rep= "XYZ";
		int flag=0;
			for(int j=0; j<(s.length()-sub.length()); j++){
				flag=0;
					for(int i=0; i<sub.length(); i++){
						if(sub.charAt((i))==s.charAt(j+i)){
							flag=1;
						}
						else{
							flag=0;
							break;
						}
					}
					if(flag==1){
					for(int i=0; i<sub.length(); i++){
						s.setCharAt(j+i, rep.charAt(i));
					}
					j=j+((sub.length())-1);
					}
				}
			System.out.println("Modified string is: "+s);	
	}

}
