package array;

public class SortNameArray {

	public static void main(String[] args) {
		String[] names= {"Bnd","Drt","ABC","Cds"};
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
			if(names[i].charAt(0)>names[j].charAt(0)) {
				String temp=names[i];
				names[i]=names[j];
				names[j]=temp;
				
				
			}
				
			}
		}
		for(String name:names) {
			System.out.print(name+" ");
		}
	}

}
