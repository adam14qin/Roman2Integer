
public class Roman2Integer {
    public static void main(String []args){

        int result=0;
        String s="IV";
        for (int i=0;i<s.length();i++){
        	char c=s.charAt(i);
		    switch (c){

		        case 'C': if ((i!=s.length()-1)&&((s.charAt(i+1)=='D')||(s.charAt(i+1)=='M'))){result-=100;}
		                  else{result+=100;}continue;
		        
		        case 'X': if ((i!=s.length()-1)&&((s.charAt(i+1)=='L')||(s.charAt(i+1)=='C'))){result-=10;}else{result+=10;}continue;
		        
		        case 'I': if ((i!=s.length()-1)&&((s.charAt(i+1)=='V')||(s.charAt(i+1)=='X'))){result-=1;}else{result+=1;}continue;
		        case 'M': result+=1000;continue;
		        case 'D': result+=500;continue;
		        case 'L': result+=50;continue;
		        case 'V': result+=5;continue;
		    	}
		    
        }
        System.out.println(result);
    }
}
