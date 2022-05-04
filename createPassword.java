import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class createPassword
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
		System.out.print("Enter y to ceate a password >");
		
		while (scanner.nextLine().equals("y"))
        {
            
            String alpha[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","w","x","y","z"};
            String chars[] = {"!","@","#","$","%","^","&","*","(",")"};
            String nums[] = {"1","2","3","4","5","6","7","8","9","0"};
            Random rand = new Random();

            Scanner password_length = new Scanner(System.in);
            System.out.print("How long would you like the password to be? ");
            int passlength = password_length.nextInt();

            String password = "";
            while (password.length()<passlength)
            {
                String let = alpha[rand.nextInt(alpha.length)];
                String ch = chars[rand.nextInt(chars.length)];
                String n = nums[rand.nextInt(nums.length)];
                password += let.toUpperCase() + ch + alpha[rand.nextInt(alpha.length)] + n;
            }
            System.out.println(password);

            Scanner save = new Scanner(System.in);
            System.out.print("Would you like to save the password: ");

            
            Map<String, String> dictionary = new HashMap<String, String>();



            /*if (save.nextLine().equals("Yes"))
            {
                Scanner website = new Scanner(System.in);
                System.out.print("Website: ");
                dictionary.put(website.nextLine()+ " ", " "+password);
                System.out.println("Your password is saved.");
            }
            else
            {
                System.out.println("Your password has not been saved.");
            }*/

        }

        

    }
}