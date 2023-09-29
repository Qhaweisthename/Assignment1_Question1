package assignment_question1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Assignment_Question1Test {
    
    public Assignment_Question1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    

    @Test
    public void testSaveStudent() {
        Assignment_Question1.SaveStudent();
        Object[] cap = null;
        
        assertNull(cap[1]);
        Object[] capNum = null;
        
         assertNull(capNum[0]);
          assertNull(cap[3]);
           assertNull(cap[4]);
           
        fail("The test case is a prototype.");
    }

    @Test
    public void testSearchStudent() {
        Assignment_Question1.SearchStudent();
        Object searchID = null;
        assertNull(searchID);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDeleteStudent() {
        Assignment_Question1.DeleteStudent();
        Object deleteID = null;
        assertNull(deleteID);
        fail("The test case is a prototype.");
    }

    @Test
    public void testStudentReport() {
        Assignment_Question1.StudentReport();
        Object menuChoice = null;
        assertNull(menuChoice);
        fail("The test case is a prototype.");
    }

    @Test
    public void testExitStudentApplication() {
        Assignment_Question1.ExitStudentApplication();
        String sumthing = "Closing Program";
        assertEquals(sumthing,"Closing Program");
        fail("The test case is a prototype.");
    }
}