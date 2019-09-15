package partitionaddress;
import java.io.*;
import java.util.*;
import org.json.JSONArray;
public class HelloAddress {
	public static void main(String[] args) {
		String Ogdata = readFile();
		String[] ogdata = Ogdata.split("\\.");
		int h=ogdata.length;
		System.out.println(ogdata);
		partition1[] person = new partition1[h];
		for(int j = 0;j<h;j++) {
		 person[j]= new partition1();
		 int ch = ogdata[j].indexOf(",");
		 person[j].name = person[j].getName(ch,ogdata[j]); 
		 ogdata[j] = ogdata[j].substring(ch+1); //trimname
		 int num = 0;
		 int i;
		 for(i = 0;i<ogdata[j].length();i++)
		 {
			 if(num==11)
			 {
				break;
			 }
			 if(ogdata[j].charAt(i)<=57 && ogdata[j].charAt(i)>=48)
			 {
				 num++;
			 }
			 else if (num!=0)
			 {
				 num=0;
			 }
			 else continue;
		 }
		 person[j].telephone = person[j].getTelephone(i,ogdata[j]);
		 ogdata[j] = ogdata[j].replaceAll(person[j].telephone,""); //trimtelephone
		 person[j].addressResolution1(ogdata[j]);
		}
		List<Map<String,Object>> table=new ArrayList<Map<String,Object>>();
		for(int j = 0;j<h;j++)
		{
			table.add(person[j].show());
		}
		 JSONArray json = new JSONArray(table);
	     writeFile(json.toString());
	}
	
	 public static String readFile() {
	        StringBuffer str=new StringBuffer("");

	        File file=new File("C:\\Users\\91675\\eclipse-workspace\\addresspartition\\lib\\input.txt");

	        try {

	            FileInputStream is=new FileInputStream(file);

	            InputStreamReader isr= new InputStreamReader(is);

	            BufferedReader in= new BufferedReader(isr);

	            String line=null;

	            while( (line=in.readLine())!=null )

	            {

	                    str.append(line);

	            }

	            in.close();

	            is.close();

	        } catch (IOException e) {

	            e.printStackTrace();

	        }

	        return str.toString();

	    }
	 public static void writeFile(String Json) {
	        try {
	            File writeName = new File("C:\\Users\\91675\\eclipse-workspace\\addresspartition\\lib\\output.txt"); 
	            writeName.createNewFile();
	            try (FileWriter writer = new FileWriter(writeName);
	                 BufferedWriter out = new BufferedWriter(writer)
	            ) {
	                out.write(Json);
	                out.flush(); // 把缓存区内容压入文件
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
