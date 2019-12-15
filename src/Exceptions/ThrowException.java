package Exceptions;

import java.io.IOException;

public class ThrowException {

    public static void main(String[] args) throws Exception {

        try{
            System.err.println("I am abut to throw an Exception");
        throw new IOException();
        }catch (IOException e){
            e.printStackTrace();
            System.exit(0);
        }finally {
            System.out.println("I am finally here");
        }
        }
}
