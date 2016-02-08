package com;

public class CustomException extends Exception {

public void printInfo(){
    System.out.println("Sorry, but login or password is not correct. ");
    System.out.println("Please try one more time.");
}

}
