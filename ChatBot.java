import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Main {
    File a = new File("C://Users/A.AJAY/Desktop/Vy Intern/ChatBot.txt");

    public void writer(String t) {
        try {
            FileWriter w = new FileWriter(a);
            w.write(t);
            w.close();
            System.out.println("Message Stored Successfully");
        } catch (IOException e) {
            System.out.println("An error occurred while writing.");
            e.printStackTrace();
        }

    }

    public void reader() {
        if (a.canRead()) {
            try {
                Scanner r = new Scanner(a);
                while (r.hasNextLine()) {
                    System.out.println("Message: " + r.nextLine());
                }
                r.close();
            } catch (IOException e) {
                System.out.println("An error occurred while reading.");
                e.printStackTrace();
            }
        } else {
            System.out.println("File cannot be read.");
        }
    }

    public void delete() {
        if (a.exists()) {
            if (a.delete()) {
                System.out.println("The deleted file is: " + a.getName());
            } else {
                System.out.println("Failed in deleting the file.");
            }
        } else {
            System.out.println("File doesn't exist.");
        }
    }
    

    public static void main(String[] args) {
        Main d = new Main();
        Scanner c = new Scanner(System.in);
        System.out.println("Welcome To Bot");
        System.out.println("Choose the option: 1.Writer 2.Reader 3.Delete");
        int choice = c.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the message:");
                c.nextLine();
                String b = c.nextLine();
                d.writer(b);
                break;
            case 2:
                d.reader();
                break;
            case 3:
                d.delete();
                break;
            default:
                System.out.println("Invalid choice.");
        }
        c.close();
    }
}
