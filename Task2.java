package HW2;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Task2 {
    public static void main(String[] args) throws IOException {
        String s = "TEST";
        int n = 100;
        StringBuilder sb = joinString(s, n);
        writeFile(sb);

    }
    static StringBuilder joinString(String s, int n){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb;
    }
    static void writeFile(StringBuilder sb) throws IOException {
        try(PrintWriter pw = new PrintWriter("file.txt")) {
            pw.print(sb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
