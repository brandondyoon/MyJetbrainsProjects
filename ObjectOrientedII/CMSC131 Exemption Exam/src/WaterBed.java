interface Bed {
    public String name = "poopy";
    public boolean bouncy = true;
}

public class WaterBed implements Bed {
    public WaterBed()
    {}
    public static void test()
    {
        Bed a = new WaterBed();
        //Bed b = new Bed();
        //WaterBed c = new Bed();
        Bed[] d = new Bed[100];
        d[15] = new WaterBed();
    }
}
