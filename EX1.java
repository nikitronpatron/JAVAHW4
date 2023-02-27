import java.util.LinkedList;
import java.util.Scanner;
import java.util.LinkedList;
public class EX1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите строку или print: ");
        String data = input.next();
        String[] dat = data.split("~");
        LinkedList<String> list = new LinkedList<>();
        String str1 = new String("Nikitron");
        String str2 = new String("Timur");
        String str3 = new String("Egor");
        String str4 = new String("Artyom");
        list.add(str1);
        list.add(str2);
        list.add(str3);
        list.add(str4);
        System.out.println(dat[0]);
        if(dat[0] != "print")
        {
            int tmp = Integer.parseInt(dat[1]);
            list.add(tmp - 1, dat[0]);
            System.out.println(list);
        }
        else
        {
            System.out.printf("Полный список:\n%s\nВыбранный элемент:", list);
            int tmp = Integer.parseInt(dat[1]);
            list.get(tmp - 1);
        }
        
        
        //System.out.print("~");
        //String num = input.next();
        //String[] dat = data.split("~");
        //LinkedList<String> list = new LinkedList<>();
        // for(String word : dat)
        // {
        //     if(isDigit(word))
        //     {
        //         if(word == "print")
        //         {
                
        //             System.out.println();
        //         }
        //     }
                
            
        // }
    }
}