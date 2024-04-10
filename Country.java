package HashmapCountriesandCapitals;
import java.util.*;

public class Country {
			
			private Map<String,String> countryMap=new HashMap<String,String>();

			public Map<String, String> getCountryMap() {
				return countryMap;
			}

			public void setCountryMap(Map<String, String> countryMap) {
				this.countryMap = countryMap;
			}
			
			public void add(String cName, String capName)
			{
				boolean flag=false;
				
			for(Map.Entry<String,String>map:getCountryMap().entrySet())
			{
				if(map.getKey().equalsIgnoreCase(cName))
				{
					flag=true;
					
				}
			}
			if(flag==false)
			{
				countryMap.put(cName, capName);
			}
			}
			public String search(String cName)
			{
				String ans=null;
				for(Map.Entry<String,String>map:getCountryMap().entrySet())
				{
					if(map.getKey().equalsIgnoreCase(cName))
					{
						System.out.println(map.getValue());
						ans=map.getValue();
						break;
					}
				}
			
				return ans;
			}
				 
}
