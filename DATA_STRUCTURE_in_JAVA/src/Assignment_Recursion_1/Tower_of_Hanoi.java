package Assignment_Recursion_1;
import java.util.Scanner;

public class Tower_of_Hanoi 
{
    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) 
    {
		if(disks == 0){
            return;
        }
        towerOfHanoi(disks-1, source, destination, auxiliary);
        System.out.println(source+ " "+ destination);
        towerOfHanoi(disks-1, auxiliary, source, destination); 
	}

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        towerOfHanoi(n, 'a', 'b', 'c');

        s.close();
    }
}
