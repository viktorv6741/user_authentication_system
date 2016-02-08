package com;

public enum Role {
    USER(){
        @Override
        public void getInfo() {
            System.out.println("Hello I'm User");
            System.out.println("I Don't like Admin because, he(she) can ban me ");

        }
    },
    ADMIN(){
        @Override
        public void getInfo() {
            System.out.println("Hello I'm Admin");
            System.out.println("And I like to ban Users" );

        }
    };

    public void getInfo(){

    }
}
