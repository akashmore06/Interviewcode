import java.util.ArrayList;
import java.util.List;

public class ArrayPgmMain {

	public static void check(List<ArrayPgm> arr) {

		for(int i=0;i<arr.size();i++) {
			
			int mark=arr.get(i).getMarks();
			
			if(mark<=30) {
				System.out.println("\n"+arr.get(i).getName()+" Failed "+"You got only "+arr.get(i).getMarks()+" Marks");
			}else {
				System.out.println("\nCongratulation "+arr.get(i).getName()+" You Passed with "+arr.get(i).getMarks()+" Marks");
			}
		}
	}
	
	public static void main(String[] args) {
		
		//here data insert into list
		List<ArrayPgm> list= new ArrayList<>();
		list.add(new ArrayPgm("Akash",88));
		list.add(new ArrayPgm("More",23));
		list.add(new ArrayPgm("Sagar",48));
		list.add(new ArrayPgm("Ravi",4));
		//call static method which check pass or failed
		check(list);



	}

}
