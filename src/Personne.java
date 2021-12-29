public class Personne {
	private String name;
	private int age;
	public Personne(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void printPerson() {
		System.out.println("le nom de cette person est : "+this.name+" son age est : "+this.age);
	}
	public String getName() {
		return name;
	}
}