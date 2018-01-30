package com;

class Bird
{
  public void eat()			// I
  {
    System.out.println("All birds eat");
  }
}
class Peacock extends Bird
{
  public void eat()			// II
  {
    System.out.println("Peacock eats grains");
  }
}
class Vulture extends Bird
{
  public void eat()			// III
  {
    System.out.println("Vulture eats flesh");
  }
}
class Crane extends Bird
{
  public void eat()			// IV
  {
    System.out.println("Crane eats fish");
  }
}
public class DynamicPolyDemo
{
  public static void main(String args[])
  {
    Bird b1 = new Bird();       b1.eat();     // calls I
    Bird p1 = new Peacock();   	p1.eat();     // calls II
    Bird v1 = new Vulture();   	v1.eat();     // calls III
    Bird c1 = new Crane();     	c1.eat();     // calls IV
 }
}
