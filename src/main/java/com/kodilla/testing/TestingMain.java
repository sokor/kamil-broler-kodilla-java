package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

 public class TestingMain {
        public static void main(String[] args){
            SimpleUser simpleUser = new SimpleUser("theForumUser");

            String result = simpleUser.getUsername();

            if (result.equals("theForumUser")){
                System.out.println("test OK");
            } else {
                System.out.println("Error!");
            }
            System.out.println("Test - pierwszy test jednostkowy:");

            Calculator calculator = new Calculator();
            int addResult = calculator.add(5,8);

            if (addResult>=5){
                System.out.println("addition test - OK");
            }
            else{
                System.out.println("addition test - Error!");
            }

            int subtructResult = calculator.subtruct(8,12);

            if (subtructResult<8){
                System.out.print("subtruct test - OK");
            }
            else{
                System.out.println("subtruct test - Error!");
            }


        }
 }