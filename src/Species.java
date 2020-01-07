import java.util.Scanner;

public class Species
{
    private String name;
    private int population;
    private double growthRate;
    Scanner keyboard = new Scanner(System.in);

    public void readinput()
    {
        System.out.println("Enter name of the species: ");
        this.name = keyboard.nextLine();
        System.out.println("Enter population of the species: ");
        this.population = keyboard.nextInt();
        System.out.println("Enter growth Rate of the species: ");
        this.growthRate = keyboard.nextDouble();
    }
    public int getPopulation()
    {
        return  population;
    }
    public double getGrowthRate()
    {
        return growthRate;
    }
}
