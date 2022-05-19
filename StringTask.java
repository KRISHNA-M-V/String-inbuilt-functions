package Program2;
import java.util.ArrayList; 
import java.util.List; 

public class StringTask<ch> {
	
	String str1;
	String str2;

	
	StringTask(String str1, String str2) {
		
		this.str1 = str1;
		this.str2 = str2;
		
	}
		
	public int strLength() {
			
		int i = 0;
	    
		for (char c : str1.toCharArray())
	    	
	    {
	    	i++;
	    }
	    
	    return i; //length()
	}
	
	public String strConcat(String str1) {
		
		return str1 + str2; //concat()
		
	}
	
	public char[] strUpperCase() {
		int k;
				
		char[] arr = str1.toCharArray();
		
		char[] arr1 = new char[arr.length];
	     
	     for (k=0; k<str1.length(); k++) {
	     	
	     	if (arr[k]>=97 && arr[k]<=122) {
	     		
	     		arr[k] = (char)(arr[k]-32);
	     	}
	     } 
	     return arr; //UpperCase()
	}
	
	public char[] strLowerCase() {
		
		int k;
		
		char[] arr1 = str1.toCharArray();
		
		char[] arr2 = new char[arr1.length];
        
        for (k=0; k<str1.length(); k++) {
        	
        	if (arr1[k]>=65 && arr1[k]<=90) {
        		
        		arr1[k] = (char) (arr1[k]+32);
        	}
        	
        	arr2[k] = arr1[k];
        }
        	return arr2; //LowerCase()
	}

	
	public char[] strCharArray() {
		
		char[] charArray = new char[str1.length()];
		
		for(int k = 0; k < str1.length(); k++) {
			charArray[k] = str1.charAt(k);
		}
		return charArray; //toCharArray()
	}
	
	public int strCompareto(String str1, String str2) {
		
		if(str1 == str2) {
	    	return 0;
		}
	    else if(str2==str1) {
	    	return 1;
	    }
		return -1; //CompareTo()		
	}
	
	public List<String> strSplit(String str1, char ch) {

		List<String> a = new ArrayList<String>();
		
		char[] charArray = str1.toCharArray();
		
		String strTemp = "";
		
		for(int i = 0; i<charArray.length; i++) {
			if (charArray[i] != ch) {
				strTemp = strTemp + charArray[i];
			}
			else {
				a.add(strTemp);
				strTemp = "";
			}
		}
		a.add(strTemp);
		return a;	
	}
	public boolean strIsEmpty() {
	
		if(str1.length()==0) {
			return true; 
		}	  	      
		else {
			return false; //isEmpty()
			}
		}

	public  boolean strcontentEquals(String str1, String str2) {
	
		 for (int i = 0; i <str1.length() ; i++) {
		 if(str1.charAt(i)!=str2.charAt(i))
		 return false;
		 }
		 return true;
	 }


	public int strcodePoint(int ab) {
			
		char[] arr = str1.toCharArray();
		
		int i;
		
		i = arr[ab];
		
		return i;  //CodePoint
		}
	
	public int strcodepointBefore(int ab) {	
		
		char[] arr = str1.toCharArray();
		
			int i;
		
		i = arr[ab -1];
		
			return i;  //CodePointBefore
		}
	
	public int strcodepointCount(int ab, int cd) {
		int total = ab - cd;
		return total;
	}
	
	public boolean strEquals(String str1, String str2) { 
		
		 for (int i = 0; i <str1.length() ; i++) {
		 if(str1.charAt(i)!=str2.charAt(i))
		 return false;
		 }
		 return true;
	 }



	public char strCharAt(int a) {
		 
		 char[] CharArray = str1.toCharArray();
		 
		 return CharArray[a];  	       
	 }
	public char[] strsubstring(int a, int b)  {
		 
		 char[] ch = str1.toCharArray();
		 
		 String	Strnew = "";
		 
		 int j = 0;
		 
	        for (int i = a; i<b; i++) {
	           
	        	Strnew += ch[i];
	        	
	        }
	        char[] ch1 = Strnew.toCharArray();
			return ch1;      
	 }
	public char[] strreplace(char ch1, char ch2) {
		 
		 char[] arr = str1.toCharArray();
		 
		 for(int i=0; i<str1.length(); i++) {
			 
			 if(arr[i]==ch1) {
				 
				 arr[i] = ch2; 
			 }
			
		 }
		return arr;
	 }
	public String strTrim(String str1) {
		 
		 StringBuilder str = new StringBuilder();
		    
		    int i = 0;

		    while (str1.charAt(i) == ' ') {
		        i++;
		    }

		    for (; i < str1.length(); i++) {
		        str.append(str1.charAt(i));
		    }

		    String aux = str.toString();
		    int j = aux.length() - 1;

		    while (aux.charAt(j) == ' ') {
		        j--;
		    }

		    String result = aux.substring(0, j + 1);

		    return result;
		}
	public boolean strcontains(String str1, String str2) {
		
		 char[] ch1 = str1.toCharArray();
		 char[] ch2 = str2.toCharArray();
		
		 int count = 0;
		
		int i;
		
		if(ch1.length > ch2.length) {
			for(i=0; i<ch1.length; i++) {
				if(ch1[i] == ch2[0]) {
					for(int j = 0; j < ch2.length; j++) {
						if(ch1[i] == ch2[j]) {
							i++;
							count++;		
						}
					if(count==ch2.length) {
						return true;
						}
					}
				}
			}
		}
		return false;
		
	}
	public boolean strstartswith(String str1, String str2) {
		 int count = 0;
		 
		 char[] ch1 = str1.toCharArray();
		 char[] ch2 = str2.toCharArray();
		 
		 int a = 0;
		 
		 {
		 for(int i=a; i<ch2.length; i++) {
			 for(int j=0; j<ch1.length; j++) {
			 if(ch1[i] == ch2[j]) {
				 count++;
				 break;
				 }
			 }
		 }
		 if(str2.length()==count) {
			 return true;
		 }
		}
		 return false;
	 }	
	public boolean strendswith(String str1, String str2) {
		 int count = 0;
		 
		 char[] ch1 = str1.toCharArray();
		 char[] ch2 = str2.toCharArray();
		 
		 int a = 0;
		 {
		 for(int i=a; i<ch1.length; i++) {
			 for(int j=0; j<ch2.length; j++) {
			 if(ch1[i] == ch2[j]) {
				 count++;
				 break;
				 }
			 }
		 }
		 if(str2.length()==count) {
			 return true;
		 }
		}
		 return false;
	 }	 
	public char[] strreplaceall(char ch1, char ch2) {
		 
		 char[] arr = str1.toCharArray();
		 
		 for(int i=0; i<str1.length(); i++) {
			 
			 if(arr[i]==ch1) {
				 
				 arr[i] = ch2; 
			 }
			
		 }
		return arr;
	 }
}








