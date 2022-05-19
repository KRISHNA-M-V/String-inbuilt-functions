package Program2;


public class Implement {

	public static void main(String[] args)  {
		
		System.out.println("Enter the String  :");
		
		StringTask method = new StringTask("Zoho Corp","Tenkasi");
		
		System.out.println(method.strLength());
		System.out.println(method.strConcat("Zoho Corp"));
		System.out.println(method.strUpperCase());
		System.out.println(method.strLowerCase());
		System.out.println(method.strCharArray());
		System.out.println(method.strCompareto("ABC", "ABC"));
		System.out.println(method.strSplit(" Zoho Corp Tenkasi", 'o'));
		System.out.println(method.strIsEmpty());
		System.out.println(method.strcontentEquals("Zoho","Corp")); 
		System.out.println(method.strcodePoint(2));
		System.out.println(method.strcodepointBefore(3));
		System.out.println(method.strcodepointCount(5, 4)); 
		System.out.println(method.strEquals("tenkasi", "Zoho"));
		System.out.println(method.strCharAt(2));
		System.out.println(method.strsubstring(0, 3));
		System.out.println(method.strreplace('o', 'v'));
		System.out.println(method.strTrim("   Tenkasi   "));
		System.out.println(method.strcontains("Zoho Corp", "Zorp"));
		System.out.println(method.strstartswith("Zoho", "Zo"));
		System.out.println(method.strendswith("Corp", "CoRp"));
		System.out.println(method.strreplaceall('h', 'O'));
	}	
}
