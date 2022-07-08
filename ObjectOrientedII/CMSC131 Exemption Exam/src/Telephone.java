public class Telephone {
    private String owner;
    private int numberOfCalls;
    static int nTelephones = 0;

    public Telephone(String owner, int numberOfCalls)
    {
        this.owner = owner;
        this.numberOfCalls = numberOfCalls;
        nTelephones++;
    }

    public Telephone(Telephone old)
    {
        this.owner = old.owner;
        this.numberOfCalls = old.numberOfCalls;
        nTelephones++;
    }

    // Aren't getter and setter methods usually an indicator of bad design? :P
    public String getName()
    {
        if(owner.equals("Washington"))
            return "President";
        else
            return owner;
    }

    public static int getTelephoneCount()
    {
        return nTelephones;
    }
}
