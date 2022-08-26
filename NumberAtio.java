public class NumberAtio {
    static int atoi(String str)
	{
	    int num = 0;
		try
		{
			num =Integer.parseInt(str);
		}
		catch(NumberFormatException e)
		{
			return -1;
		}
		return num;
	}
    public static void main(String[] args) {
        String str = "565a87";
        System.out.println(atoi(str));
    }
    
}
