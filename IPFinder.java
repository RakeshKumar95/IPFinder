import java.net.*;
import java.util.*;

class IPFinder
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter URL: ");
		String url = sc.nextLine();
		try
		{
		InetAddress ia = InetAddress.getByName(url);
		String ip = ia.getHostAddress();
		System.out.println("IP address of "+url+ " is "+ ip+".");
		}catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
	}
}