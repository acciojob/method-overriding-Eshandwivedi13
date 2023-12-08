package com.driver;

public class Main {
  public static void main(String args[]){
      A obj = new B();
      System.out.println(obj.meth());


  }
}
class A{
    String meth(){
        return "";
    }
}
class B extends A{

    B(){
        super();
    }
    String meth(){
        return "Method is overridden in Extendend class B";
    }

}