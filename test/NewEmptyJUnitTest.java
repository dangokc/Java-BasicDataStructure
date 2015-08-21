/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Huy
 */
public class NewEmptyJUnitTest {
    Swimmer s;
    String name = "jill";
    int racerID = 319515;
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        s = new Swimmer();
    }
    
    @After
    public void tearDown() {
        s = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testConstructors() {
        //guarantee object is not null
        assertNotNull("Could not create basic Swimmer", s);
        Swimmer s2 = new Swimmer(racerID, name);
        assertNotNull("Could not create complex Swimmer", s2);
        assertEquals("Name not set as expected on complex constructor"
                , name
                , s2.getName());
        assertEquals("ID not set as expected on complex constructor"
                , racerID
                , s2.getRaceID());
    }
    
    @Test
    public void testGetSetName() {
        s.setName(name);
        assertEquals("Name not set as expected"
                , name
                , s.getName());
    }
    
    @Test
    public void testGetSetRaceID() {
        s.setRaceID(racerID);
        assertEquals("ID not set as expected"
                , racerID
                , s.getRaceID());
    }
    
    @Test
    public void testToString() {
        s.setName(name);
        s.setRaceID(racerID);
        String outputString = s.toString();
        assertTrue("ToString does not contain name"
                    , outputString.contains(name));
        assertTrue("ToString does not contain id"
                    , outputString.contains(String.format("%d", racerID)));
    }
}
