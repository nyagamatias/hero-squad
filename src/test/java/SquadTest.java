import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {

    @Test
    public void squad_instantiatesCorrectly_true() {
        Squad testSquad = new Squad("Avengers",7,"protect the earth");
        assertEquals(true, testSquad instanceof Squad);
    }

    @Test
    public void getName_squadInstantiatesWithName_String() {
        Squad testSquad = new Squad("Avengers",7,"protect the earth");
        assertEquals("Avengers", testSquad.getName());
    }

    @Test
    public void getSize_squadInstantiatesWithSize_int() {
        Squad testSquad = new Squad("Avengers",7,"protect the earth");
        assertEquals(7, testSquad.getSize());
    }

    @Test
    public void getCause_squadInstantiatesWithCause_String() {
        Squad testSquad = new Squad("Avengers",7,"protect the earth");
        assertEquals("protect the earth", testSquad.getCause());
    }

    @Test
    public void all_returnsAllInstancesOfSquad_true() {
        Squad firstSquad = new Squad("Avengers",7,"protect the earth");
        Squad secondSquad = new Squad("Powerpuff Girls",3,"protect the magic world");
        assertEquals(true, Squad.all().contains(firstSquad));
        assertEquals(true, Squad.all().contains(secondSquad));
    }

    @Test
    public void clear_emptiesAllSquadsFromList_0() {
        Squad testSquad = new Squad("Avengers",7,"protect the earth");
        Squad.clear();
        assertEquals(Squad.all().size(), 0);
    }

    @Test
    public void getId_squadsInstantiateWithAnId_1() {
        Squad firstSquad = new Squad("Avengers",7,"protect the earth");
        Squad secondSquad = new Squad("Powerpuff Girls",3,"protect the magic world");
        assertEquals(Squad.find(secondSquad.getId()), secondSquad);
    }
    @Test
    public void getHeroes_initiallyReturnsEmptyList_ArrayList() {
        Squad.clear();
        Squad testSquad = new Squad("Avengers",7,"protect the earth");
        assertEquals(0, testSquad.getHeroes().size());
    }

    @Test
    public void addHero_addsHeroToList_true() {
        Squad testSquad = new Squad("Avengers",7,"protect the earth");
        Hero testHero = new Hero("Superman",20,"Fly","Kryptonite");
        testSquad.addHero(testHero);
        assertTrue(testSquad.getHeroes().contains(testHero));
    }
}
