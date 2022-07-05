class Rational
{
    private int numer;
    private int denom;

    public void setNumer(int _numer)
    {
        numer = _numer;
    }
    public void setDenom(int _denom)
    {
        denom = _denom;
    }

    public int getNumer()
    {
        return numer;
    }
    public int getDenom()
    {
        return denom;
    }

    public Rational(int _numer, int _denom)
    {
        numer = _numer;
        denom = _denom;
    }
    public Rational(Rational old)
    {
        numer = old.getNumer();
        denom = old.getDenom();
    }

    public static Rational reciprocal(Rational old)
    {
        return new Rational(old.denom, old.numer);
    }

    public static Rational multiply(Rational a, Rational b)
    {
        return new Rational(a.numer * b.numer, b.denom * b.denom);
    }
}

class Cat
{
    private String name;
    private int lives;
    private static int nCats = 0;

    public Cat(String _name)
    {
        name = _name;
        lives = 9;
        nCats++;
    }

    public int getLives()
    {
        return lives;
    }

    public boolean useLife()
    {
        if(lives > 0)
        {
            lives--;
            return true;
        }
        else
            return false;
    }

    public static int getCatsEver()
    {
        return nCats;
    }

    public String toString()
    {
        if(lives > 0)
            return new String("Cat " + name + " has " + lives + " lives left");
        else
            return new String("Cat " + name + " has passed away");
    }
}

public class OopConceptPractice {
    public void problem1()
    {
        Rational a = new Rational(1, 2);
        Rational b = new Rational(5, 18);
        Rational ab = Rational.multiply(a, b);
        System.out.println(ab.getNumer() + " / " + ab.getDenom());
    }

    public void problem2()
    {
        Cat whiskers = new Cat("Whiskers");
        do {
            System.out.println(whiskers.toString() + " " + whiskers.useLife());
        } while(whiskers.getLives() != 0);
    }

    public OopConceptPractice()
    {
        //problem1();
        problem2();
    }
}
