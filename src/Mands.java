import java.util.Scanner;

/**
 * Created by MM on 9/28/2019.
 */
public class Mands {


    public int t;
    public int a;
    public int s;
    public int p;
    public int i;
    public int r;
    public int gh;
    public int e;
    public int a1;
    public int a2;
    public int a3;

    public void calculate(){

        System.out.println("choose num between 1-4");
        Scanner scanner = new Scanner(System.in);
        String str =scanner.nextLine();
        int i=Integer.parseInt(str);
               if(i==1) {
                    System.out.println("mostatil");

                    System.out.println("tool:");
                    t = scanner.nextInt();
                    System.out.println("arz:");
                    a = scanner.nextInt();
                    s= t*a;
                    p=(t+a)*2;
                   System.out.println("s="+s);
                   System.out.println("p="+p);
                }
                else if(i==2) {
                    System.out.println("moraba");

                    System.out.println("tool:");
                    t = scanner.nextInt();
                    s= t*t;
                    p=t*4;
                   System.out.println("s="+s);
                   System.out.println("p="+p);
                }

                else if(i==3) {
                    System.out.println("dayere");

                    System.out.println("shoa:");
                    r = scanner.nextInt();
                    s= (r*r)*3;
                    p=(r*2)*3;
                   System.out.println("s="+s);
                   System.out.println("p="+p);
                }
               else if(i==4) {
                    System.out.println("mosalas");

                    System.out.println("ghaede:");
                    gh = scanner.nextInt();
                    System.out.println("ertefa:");
                    e = scanner.nextInt();
                    System.out.println("zelee 1:");
                   a1 = scanner.nextInt();
                    System.out.println("zelee2:");
                    a2 = scanner.nextInt();
                    System.out.println("zelee3:");
                    a3 = scanner.nextInt();
                    s= (gh*e)/ 2 ;
                    p=a1+a2+a3;
                   System.out.println("s="+s);
                   System.out.println("p="+p);
                }


    }




}
