import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {

        System.out.println("You Entered In Percentage Calculation");
        System.out.println("Enter 1st Subject Marks Out-of 100 ");
        Scanner p11 = new Scanner(System.in);
        int p1=p11.nextInt();

        System.out.println("Enter 2nd Subject Marks Out-of 100 ");
        Scanner p21 = new Scanner(System.in);
        int p2 =p21.nextInt();

        System.out.println("Enter 3rd Subject Marks Out-of 100 ");
        Scanner p31 = new Scanner(System.in);
        int p3 =p31.nextInt();

        System.out.println("Enter 4th Subject Marks Out-of 100 ");
        Scanner p41 = new Scanner(System.in);
        int p4 =p41.nextInt();

        System.out.println("Enter 5th Subject Marks Out-of 100 ");
        Scanner p51 = new Scanner(System.in);
        int p5 =p51.nextInt();

        int per = p1+p2+p3+p4+p5;
        float totalPer = per/5;
        System.out.println("THE TOTAL PERCENTAGE YOU GET WAS " + totalPer);

        if (totalPer >= 35){
            System.out.println("Congrates Yor are Passes");

        }
        else {
            System.out.println("Sorry But Yor are Failed In The Exams");
        }


    }
}

