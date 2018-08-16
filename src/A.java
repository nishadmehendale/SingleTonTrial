
public class A {
private static A a;
private static int count = 3;
private String name = "Capgemini";
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public static A getA() {
	if(count >= 1) {
	a = new A();
	count = count - 1;
	}
	return a;
	
}
}
