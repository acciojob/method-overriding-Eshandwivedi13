package com.driver;

public class Main {
  public static void main(String args[]){
      A obj1 = new A();
      obj1.meth();

      B obj2 = new B();
      obj2.meth();

      A obj3 = new B();
      System.out.println(obj3.meth());


  }
}
class A{
    String meth(){
        return "returning a string";
    }
}
class B extends A{
    String meth(){
        return "Method is overridden in Extendend class B";
    }

}