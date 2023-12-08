package com.driver;

//public class Main {
//  public static void main(String args[]){
//      A obj = new B();
//      obj.meth();
//  }
//   public static class A{
//        public String meth(){
//            return "Invoking method from class A";
//        }
//    }
//    public static class B extends A {
//        // Class B is now a subclass of A
//        @Override
//        public String meth() {
//            return "Method is overridden in Extended class B";
//        }
//    }
//}

public class Main {
    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }
    public static class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String[] args) {
        B b = new B();//only overRiding(cuz implictly create ho jata na parent object), not runTime polymorphism or dynamic method
        b.meth();
    }
}