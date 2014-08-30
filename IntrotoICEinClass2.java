package introtoice;
public class IntrotoICEHW2 {
	public static void main (String [] args){
	System.out.println("Hi, my name is Pac");
	String ajpac = "Hi, my name, is Pac";
	int leng = ajpac.length();
	String [] temp = new String [leng];
	for (int i=0;i<leng;i++){
		temp[i] = ajpac.substring(i,i+1);	
	}
	for (int i=0;i<leng-1;i++){
		if(temp[i].equals("a")||temp[i].equals("a")){
			temp[i]="#";
		}
		if(temp[i].equals(" ")){
			temp[i+1]=temp[i+1].toUpperCase();
		}
		if(temp[i].equals(",")){
			temp[i]="#";
		}
	}

	for (int i=0;i<leng;i++){
		if(temp[i].equals("#")){
		}
		else { System.out.print(temp[i]);
		}
		}
	}
}

