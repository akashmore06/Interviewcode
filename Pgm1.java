
public class ArrayPgm {

	String name;//
	int marks;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void setNameString(String name) {
		 this.name=name;
	}
		public ArrayPgm() {
		super();
	}
		public ArrayPgm(String name, int marks) {
			super();
			this.name = name;
			this.marks = marks;
		}
		@Override
		public String toString() {
			return "ArrayPgm [name=" + name + ", marks=" + marks + "]";
		}
		

}
