package partitionaddress;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class partition1 extends partitionI {
	String province;
	String city;
	String county;
	String town;
	String detail;
	String detailstreet;
	String detailnum;
	public void addressResolution1(String ogdata){
        String regex="(?<province>[^ʡ]+������|.*?ʡ|.*?������|.*?��)(?<city>[^��]+������|.*?����|.*?������λ|.+��|��Ͻ��|.*?��|.*?��)(?<county>[^��]+��|.+��|.+��|.+��|.+����|.+��)?(?<town>[^��]+��|.+��)?(?<detail>.*)";
        Matcher m=Pattern.compile(regex).matcher(ogdata);
        while(m.find()) { 
        	province = m.group("province");
        	address.add((province==null?"":province.trim()));
        	city = m.group("city");
        	address.add((city==null?"":city.trim()));
        	county = m.group("county");
        	address.add((county==null?"":county.trim()));
        	town = m.group("town");
        	address.add((town==null?"":town.trim()));
        	detail = m.group("detail");
        	address.add((detail==null?"":detail.trim()));
        }
	}
	
	public void addressResolution2(String ogdata){
        String regex="(?<province>[^ʡ]+������|.*?ʡ|.*?������|.*?��)(?<city>[^��]+������|.*?����|.*?������λ|.+��|��Ͻ��|.*?��|.*?��)(?<county>[^��]+��|.+��|.+��|.+��|.+����|.+��)?(?<town>[^��]+��|.+��)?(?<detailstreet>.[^·]+·|.+��|.+��|.+��|.+��ͬ|.+��Ū)?(?<detailnum>.[^��]+��)?(?<detail>.*)";
        Matcher m=Pattern.compile(regex).matcher(ogdata);
        while(m.find()) { 
        	province = m.group("province");
        	address.add((province==null?"":province.trim()));
        	city = m.group("city");
        	address.add((city==null?"":city.trim()));
        	county = m.group("county");
        	address.add((county==null?"":county.trim()));
        	town = m.group("town");
        	address.add((town==null?"":town.trim()));
        	detailstreet = m.group("detailstreet");
        	address.add((detailstreet==null?"":detailstreet.trim()));
        	detailnum = m.group("detailnum");
        	address.add((detailnum==null?"":detailnum.trim()));
        	detail = m.group("detail");
        	address.add((detail==null?"":detail.trim()));
        }
	}
	
	public Map<String,Object> show(){
		Map<String,Object> row=null;
		row=new LinkedHashMap<String,Object>();
		row.put("����",name);
		row.put("�ֻ�",telephone);
		row.put("��ַ",address);
		return row;
	}
}
