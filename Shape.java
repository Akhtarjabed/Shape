package assignment3;

class Shape {
	double pi=3.14;
	
	public void carea(double r) {
		double area=pi*r*r;
		System.out.println("Area of Cicle="+area);
	}
	void cperiphery(double r) {
		double peri=2*pi*r;
		System.out.println("Periphery of Circle="+peri);
	}
	
	void rarea(int l,int b) {
		System.out.println("Area of Rectangle= "+l*b);
	}
	void rperiphery(int l,int b) {
		System.out.println("Periphery of Rectangle= "+2*(l*b));
	}
}

class circle extends Shape{
	
}

class rectangle extends Shape{
	
}

class square extends rectangle{
	void area(int s) {
		System.out.println("Area of Square= "+s*s);
	}
	void periphery(int s) {
		System.out.println("Periphery of Square= "+4*s);
	}
}