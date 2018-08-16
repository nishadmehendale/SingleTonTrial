
public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final A a = A.getA();
		System.out.println(a.hashCode());
		System.out.println(a.getName());
		a.setName("Alvbs");
		System.out.println(a.getName());
		A b = A.getA();
		System.out.println(b.hashCode());
		b = A.getA();
		System.out.println(b.hashCode());
		b = A.getA();
		System.out.println(b.hashCode());
		System.out.println(a.hashCode());

	}

}
