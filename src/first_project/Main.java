package first_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {


	public static void main(String[] args) {
        System.out.println("Valami");
		Consoleing c = new Consoleing();

        System.out.println("Application first_project");
        System.out.println("Type 'help' if you are stuck!");

        while(true) {

            System.out.println("Enter command here : ");
            System.out.println("kissa_test ");

            try {
                BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
                String input = bufferRead.readLine();

                c.processInput(input);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
	}

}
