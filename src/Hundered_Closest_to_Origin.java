import java.util.HashMap;
import java.util.Map;

public class Hundered_Closest_to_Origin {
	public int x;
	public int y;
	public Hundered_Closest_to_Origin(int x,int y){
		this.x=x;
		this.y=y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Hundered_Closest_to_Origin,Integer>map=new HashMap<>();
		Hundered_Closest_to_Origin h1=new Hundered_Closest_to_Origin(1,3);
		Hundered_Closest_to_Origin h2=new Hundered_Closest_to_Origin(4,5);

		map.put(h1,(h1.x*h1.x)+(h1.y*h1.y));
		map.put(h2,(h2.x*h2.x)+(h2.y*h2.y));
		int min=Integer.MAX_VALUE;// Integer.MIN_VALUE to get minimum value
		Hundered_Closest_to_Origin ent=null;
		for(Hundered_Closest_to_Origin key:map.keySet()){
			if(map.get(key)<min){
				ent=key;
				min=map.get(key);
			}
		}
		System.out.println(ent.x+" "+ent.y);

	}
}
		


