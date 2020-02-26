package ac.za.cput;

import org.junit.*;

import static junit.framework.TestCase.fail;

public class AnimalMainTest
{
    AnimalMain a1 = new AnimalMain("Carl", "Dog");
    AnimalMain a2 = new AnimalMain("Buddy", "Dog");
    AnimalMain a3 = a1;

    @Before
    public void setUp() throws Exception
    {

    }

    @After
    public void tearDown() throws Exception
    {

    }
    //1.1 - TESTING FIXTURE FOR OBJECT EQUALITY
    @Test
    public void testObjectEquality() throws Exception
    {
        //equals
        Assert.assertEquals(a2.getType(), a1.getType());
        Assert.assertEquals(a2.getType(), a3.getType());
        Assert.assertEquals(a1.getType(), a3.getType());
        Assert.assertEquals(a1.getName(), a3.getName());
        //notEquals
        Assert.assertNotEquals(a1.getName(), a2.getName());
        Assert.assertNotEquals(a2.getName(), a3.getName());
    }

    //1.2 - TESTING FIXTURE FOR OBJECT IDENTITY
    @Test
    public void testObjectIdentity() throws Exception
    {
        //same
        Assert.assertSame(a1, a3);
        //notSame
        Assert.assertNotSame(a1, a2);
        Assert.assertNotSame(a2, a3);
    }

    //1.3 - TESTING FIXTURE FOR DELIBERATELY FAILING A TEST
    @Test
    public void testDeliberatelyFailingATest() throws Exception
    {
        fail("This test was made to fail" + a2.getType() + " " + a2.getName());
    }

    //1.4 - TESTING FIXTURE FOR TIMEOUTS
    @Test(timeout = 100)
    public void testWithTimeout() throws Exception
    {
        System.out.println("Object1 - Name: " + a1.getName() + " Type: " + a1.getType());
        System.out.println("Object2 - Name: " + a2.getName() + " Type: " + a2.getType());
        System.out.println("Object3 - Name: " + a3.getName() + " Type: " + a3.getType());
        System.out.println("Test was not longer than 100 milliseconds");
    }

    //1.5 - TESTING FIXTURE FOR DISABLING A TEST
    @Ignore ("Test is being ignored, because expected and actual arguments are not appropriate for testing")
    @Test
    public void testDisablingATest() throws Exception
    {
        Assert.assertEquals(a1.getType(), a3.getName());
    }
}
