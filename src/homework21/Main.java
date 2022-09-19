package homework21;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("alphabet.txt");
        int[] numArray =new int[27];
        int a = 0;
        for (int i = 0; i < 27; i++) {
            numArray[i]+=a;
            a++;
        }
        String[] alphabet = {"A a","B b","C c","D d","E e","F f","G g","H h","I i","J j","K k","L l","M m","N n","O o","P p","Q q","R r","S s","T t","U u","V v","W w","X x","Y y","Z z",};
        for (int i = 0; i < alphabet.length; i++) {
            fileWriter.write(alphabet[i] +"\n");
        }
        for (int i = 0; i < alphabet.length; i++) {
            fileWriter.write((numArray[i])+"\n");
        }
        fileWriter.close();
        FileReader fileReader = new FileReader("alphabet.txt");
        Scanner scanner = new Scanner(fileReader);
        int j = 1;
        while (scanner.hasNext()){
            System.out.println(j+":"+scanner.nextLine());
            j++;
            if(j==37){break;}
        }
        fileReader.close();
    }
}
