import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONObject;
public  class httpQuery{

public static void main(String[] args) {
	BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));
	int n =Integer.parseInt(br.ReadLine());

	String key ="833921b016964f95905442e0fab0c229";
	JSONObject ezm;

	while (n-- > 0) {
	 String image =br.readLine();
	 ezm = new JSONObject();
	 ezm.put("url", image);

	 try{
	 
	 	URL url =
	 	new URL("https://westus.api.cognitive.microsoft.com/emotion/v1.0/recognize");
	 
	 	HttpURLConnection con =(HttpURLConnection) url.openConnection();
       
       con.setRequestMethod("POST");
       con.setRequestMethod("Ocp-Apim-Subscription-Key",key);
       con.setRequestMethod("Content-Type","application/json");
       con.setRequestMethod("Accept","application/json");
       con.setFixedLengthStreamingMode(83);
       
       HttpURLConnection.setFollowRedirects(true);

       con.setInstanceFollowRedirects(false);

       con.setDoOutput(true);
      
      OutputStream out = con.getOutputStream();

      out.write(ezm.toString().getByte());

      InputStream ip = con.getInputStream();

      BufferedReader br1 = new BufferedReader(new InputStreamReader(ip));
      
      System.out.println("Response Code :"+ con.getResponseCode());

      System.out.println("Response Message:"+ con.getResponseMessage());

      System.out.println("InstanceFollowRedirects:"+ con.getResponseMessage());

      System.out.println("Header field 1 :" + con.getHeaderField(1));
      
      System.out.println("Using proxy:" + con.usingProxy());

      StringBuilder Response = new StringBuilder();

      String responseSingle = null;

      while((responseSingle = br1.readLine()) != null){

      	 response.append(responseSingle);
      }

      }catch(Exception e){
      	System.out.println(e.getMessage());
      }      
      
      String xx = response.toString();
      System.out.println(xx);	
	}

}

}