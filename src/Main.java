import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static DataService service=new DataService();
    public static void main(String[] args) {


        service.addProduct(new Data("gokul",12,"tamilnadu",1));
        service.addProduct(new Data("ragul",2,"erode",2));
        service.addProduct(new Data("mad",3,"tamilnadu",3));
        service.addProduct(new Data("pavi",4,"erode",4));
        service.addProduct(new Data("tamil",5,"erode",5));
        service.addProduct(new Data("ash",6,"erode",6));
        System.out.println("student added");
        List<Data> arrr=service.getProduct();
        for(Data a:arrr){
            System.out.println(a);
        }
        while(true) {
            System.out.println("Enter the operation you need to perform :");
            System.out.println("1 : Get all the students");
            System.out.println("2 : Add new student");
            System.out.println("3 : Get the product by Id");
            System.out.println("4 : Get top three rank holders");
            System.out.println("5 : Get student by text");
            System.out.println("6 : Delete student by ID");
            System.out.println("7 : Update name in student data");
            System.out.println("8 : Update rank of student by ID");
            System.out.println("0 : Exit " );
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            switch (x) {
                case 1:
                    getallproduct();
                    break;
                case 2:
                    addproduct();
                    break;
                case 3:
                    getproductbyid();
                    break;
                case 4:
                    gettopthree();
                    break;
                case 5:
                    getproductbytext();
                    break;
                case 6:
                    deletebyid();
                    break;
                case 7:
                    updatename();
                    break;
                case 8:
                    updaterank();
                    break;
                case 0:
                    System.out.println("Do you wanna exit :-)  yes (or) no : ");
                    String y=sc.next();
                    System.out.println(y);
                    if(y.equals("yes")){
                        System.out.println("Good Bye :-(  ");
                        sc.close();
                        return;
                    }
                    else{
                        System.out.println("yeahhhh !!! Here we go :-)");
                        break;
                    }
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }
    public static void getallproduct(){

        System.out.println("Getting all persons for you !!");
        List<Data> arr=service.getProduct();
        for(Data a:arr){
            System.out.println(a);
        }
    }
    public static void getproductbyid(){

        System.out.println("Getting person by ID for you !!");
        System.out.println("Enter the ID: ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        Data p=service.getProductById(x);
        System.out.println(p);
    }
    public static void gettopthree(){

        System.out.println("Getting top three rank holders for you !!");
        List<Data> ar=service.getTopThree();
        for(Data b:ar){
            System.out.println(b);
        }
    }
    public static void getproductbytext(){

        System.out.println("Getting person by text for you !!");
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the text :");
        String x1=sc.nextLine();


        System.out.println("=====================================================================================================");
        System.out.println("Student details fetched successfully !");
        List<Data> search=service.getProductByText(x1);
        for(Data c:search){
            System.out.println(c);
        }
    }
    public static void addproduct(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Adding student as your wish !");
        System.out.println("Enter the student details ");
        System.out.println("Enter student name :");
        String x1=sc.nextLine();
        System.out.println("Enter student Id :");
        int x2=sc.nextInt();
        System.out.println("Enter student place :");
        sc.nextLine();
        String x3=sc.nextLine();
        System.out.println("Enter student rank :");
        int x4=sc.nextInt();
        service.addProduct(new Data(x1,x2,x3,x4));
        System.out.println("Student details added successfully !");


        System.out.println("=====================================================================================================");

    }
    public static void deletebyid(){

        System.out.println("Deleting student as your wish !");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student Id :");
        int x=sc.nextInt();
        service.deleteById(x);



        System.out.println("=====================================================================================================");
        System.out.println("Data after deleting that student ====>");

    }
    public static void updatename(){

        System.out.println("Updating student as your wish !");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name to be removed :");
        String x1=sc.nextLine();
        System.out.println("Enter name to be replaced :");
        String x2=sc.nextLine();
        service.updateName(x1,x2);
        System.out.println("Name replaced successfully !");



        System.out.println("=====================================================================================================");

    }
    public static void updaterank(){

        System.out.println("Updating student as your wish !");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id of student :");
        int x1=sc.nextInt();
        System.out.println("Enter new rank of student :");
        int x2=sc.nextInt();
        service.updateRank(x1,x2);
        System.out.println("Rank updated successfully !");
        System.out.println("=====================================================================================================");

    }
}