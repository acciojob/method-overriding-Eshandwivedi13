package com.driver;

public class Main {
  public static void main(String args[]){
      A obj = new B();
      obj.meth();
  }
   public static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A {
        // Class B is now a subclass of A
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }
}
