package annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // meta annotation , where we put our annotation :
							// methode, paramater, package
@Retention(RetentionPolicy.RUNTIME) // how long annotation is to be retained
@interface Vehicule {
	int wheel() default 4; // annotation value

	int year() default 2000;

}

@Vehicule(wheel = 4, year = 1990)
class Automobile {
	String brand;

	public Automobile() {
		super();
	}

	public Automobile(String brand) {
		super();
		this.brand = brand;
	}

}

class AnnotationDemo {
	public static void main(String[] args) {
		Automobile auto = new Automobile("BMW");

		// get annotation value
		Class c = auto.getClass();
		Annotation an = c.getAnnotation(Vehicule.class);
		Vehicule v = (Vehicule) an;

		System.out.println(v.year());
	}
}
