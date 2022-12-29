package com.peterjxl.reflect;

public class Person {
  
  public String pubName;
  protected String proName;
  String defName;
  private String priName;

  public Person(){}

  public Person(String pubName){
      this.pubName = pubName;
  }

  public void eat(){
      System.out.println("Person eating.....");
  }

  public void eat(String args){
    System.out.println("Person eating....." + args);
}

  @Override
  public String toString(){
      return "pubName: " + this.pubName;
  }

  public void setPriName(String priName) {
      this.priName = priName;
  }
}
