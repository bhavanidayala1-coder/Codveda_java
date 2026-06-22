
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame
{
public static void main(String[] args)
{

Random random = new Random();
Scanner sc = new Scanner(System.in);

int number = random.nextInt(100)+1;
int guess;

System.out.println("Guess a number between 1 and 100");
do
{
System.out.print("Enter your guess: "); 
guess = sc.nextInt();

if(guess > number)
{
System.out.println("Too high!");
}
else if(guess < number)import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame
{
public static void main(String[] args)
{

Random random = new Random();
Scanner sc = new Scanner(System.in);

int number = random.nextInt(100)+1;
int guess;

System.out.println("Guess a number between 1 and 100");
do
{
System.out.print("Enter your guess: "); 
guess = sc.nextInt();

if(guess > number)
{
System.out.println("Too high!");
}
else if(guess < number)
{
System.out.println("Too low!");
}
else
{
System.out.println("Congratulations! you guessed the number . ");
}
}
while(guess != number);
sc.close();
}
}


{
System.out.println("Too low!");
}
else
{
System.out.println("Congratulations! you guessed the number . ");
}
}
while(guess != number);
sc.close();
}
}

