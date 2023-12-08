package com.driver;

public class Main {
  public static void main(String args[]){
      A obj1 = new A();
      obj1.meth();
      System.out.println(obj1.meth());

      B obj2 = new B();
      obj2.meth();
      System.out.println(obj2.meth());

      A obj3 = new B();
      System.out.println(obj3.meth());


  }
}
class A{
    String meth(){
        return "Invoking method from class A";
    }
}
class B extends A {
    // Class B is now a subclass of A
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}