public class Main
{

    public static void main(String[] args)
    {

        Species panda = new Species();
        Species crow = new Species();
        panda.readinput();
        crow.readinput();
        double pandaPopulation = panda.getPopulation();
        double crowPopulaion = crow.getPopulation();
        int counter = 0;
        while (crowPopulaion <= pandaPopulation)
        {
            crowPopulaion = crowPopulaion +(crow.getGrowthRate()/100)*crowPopulaion;
            pandaPopulation = pandaPopulation +(panda.getGrowthRate()/100)*pandaPopulation;
            System.out.println("panda population: "+ (int)pandaPopulation);
            System.out.println("Crow population: "+ (int)crowPopulaion);
            counter++;
        }
        System.out.println("After: "+ counter +" years "+ "Crow population will surpass panda population");
        System.out.println("panda population: "+ (int)pandaPopulation);
        System.out.println("crow population: "+ (int)crowPopulaion);
    }
}
