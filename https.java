import java.net.*;
import java.io.*;
class https{
	public static void main(String[] args) throws IOException
	{
		ServerSocket ss=new ServerSocket(3000);
		Socket s=ss.accept();
		DataInputStream din=new DataInputStream(System.in);
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		DataInputStream done=new DataInputStream(s.getInputStream());
		String m=done.readUTF();
		Process p=Runtime.getRuntime().exec("xdg-open https://"+m);
		BufferedReader in=new BufferedReader(new InputStreamReader(p.getInputStream()));
		String x;
		System.out.println("Verified GET request, now sending page to client");		
		while(true)
		{
			while((x=in.readLine())!=null)
			{
				dout.writeUTF(x);
			}
		}
	}
}

