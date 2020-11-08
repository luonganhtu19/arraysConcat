import java.util.Scanner;

public class ConcatArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array1,array2,array3;
        String mess="";

        System.out.println("Enter size of array 1: ");
        mess=" size of arrays1";
        int size1=checkNumber(mess);
        array1=new String[size1];
        createArrays(array1);

        System.out.println("Enter size of array 2: ");
        mess=" size of arrays2";
        int size2=checkNumber(mess);
        array2=new String[size2];
        createArrays(array2);

        do {
            System.out.println("\n");
            System.out.println("Menu");
            System.out.println("1. Display Arrays");
            System.out.println("2. Concat arrays1+array2");
            System.out.println("0.Exit");
            System.out.println("Enter choice of menu");
            mess= " choice value of menu";
            int choice=checkNumber(mess);
            switch (choice){
                case 0:
                    System.out.println("Bye ^^");
                    return;
                case 2:
                    array3=new String[(size1+size2)];
                    arrayConcat(array3,array1,array2);
                    display(array3);
                    break;
                case 1:
                    System.out.println("Arrays 1:");
                    display(array1);
                    System.out.println("Arrays 2:");
                    display(array2);
                    break;
                default:
                    System.out.println("Please choice again ");
            }
        }while (true);

    }

    public static int checkNumber(String mess){
        int number=0;
        boolean check=true;
//        Scanner input  =new Scanner(System.in);
        Scanner inputNumber=new Scanner(System.in);
        while (check){
            try {
                number= Integer.parseInt(inputNumber.nextLine());
                check=false;
            }catch (Exception ignore){
                System.out.println("Please try again "+ mess);
            }
        }
        return number;
    }
    public static void createArrays(String[] arrays){
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Enter element: ");
            arrays[i]=input.nextLine();
        }
    }
    public static void arrayConcat(String[] arraysNew,String[] array1,String[] array2){
        for (int i = 0; i < arraysNew.length; i++) {
            if (i<array1.length){
                arraysNew[i]=array1[i];
            }else {
                arraysNew[i]=array2[i-array1.length];
            }
        }
    }
    public static void display(String[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");
        }
        System.out.println("\n");
    }
}
