/*import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;*/

public class Diary {
    private StringBuffer entries;

    public Diary() {
        entries = new StringBuffer();
    }

    public Diary(Diary diary) {
        entries = new StringBuffer(diary.entries);
    }

    public void addEntry(String entry) {
        entries.append(entry);
    }

    public StringBuffer getEntries()
    {
        return entries;
    }

    //@Override
    public boolean equals(Diary other)
    {
        if(this.entries.equals(other.getEntries()))
            return true;
        else
            return false;
    }

    public static void testJUnit()
    {
        Diary d = new Diary();
        d.addEntry("test entry");
        //assertEquals(d.getEntries(), new StringBuffer("test entry"));
    }

    //
}

