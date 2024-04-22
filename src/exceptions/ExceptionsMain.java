package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsMain {

    public static void main(String[] args) {
        System.out.println(dice());
    }

    public static int dice(){
        try {
            System.out.println("Try called");
            return 1;
        } finally {
            System.out.println("Finally called");
            return 2;
        }
    }
}
