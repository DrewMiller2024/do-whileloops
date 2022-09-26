
public class dowhileloops
{
    int c = 1;
    int d = -8;

    public void run() {
        int i = 0;
        do {
            System.out.println("i is " + i + " but is less than 15");
            i++;
        } while (i < 15);

        int k = 10;
        do {
            System.out.println("k is " + k + " but is greater than 5");
            k--;
        } while (k > 5);

        int a = 5;
        int b = 12;
        do {
            System.out.println("a is " + a + " but is less than 10," + "b is " + b + " but is less than or equal to 20");
            b++;
            a++;
        } while (a < 10 & b <= 20);
    }

    public static void main(String[] args)
    {        
        dowhileloops hw = new dowhileloops();
        hw.run();
    }
}
