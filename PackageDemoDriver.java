package practice.java;

public class PackageDemo {
    public void display() {
        System.out.println("Apoorav 24csu327");
        System.out.println("PackageDemo executed");
    }
}



package practice.java;

public class PackageDemoDriver {
    public static void main(String[] args) {
        PackageDemo obj = new PackageDemo();
        obj.display();
    }
}