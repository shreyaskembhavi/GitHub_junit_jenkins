package com.bnmit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GreatestNumberTest {

 @Test
 void testCase1(){
  GreatestNumber gn=new GreatestNumber();
  assertEquals(25,gn.findGreatest(10,25,15));
 }

 @Test
 void testCase2(){
  GreatestNumber gn=new GreatestNumber();
  assertEquals(30,gn.findGreatest(30,20,10));
 }

 @Test
 void testCase3(){
  GreatestNumber gn=new GreatestNumber();
  assertEquals(50,gn.findGreatest(40,50,45));
 }

 @Test
 void testCase4(){
  GreatestNumber gn=new GreatestNumber();
  assertEquals(-5,gn.findGreatest(-10,-5,-20));
 }
}
