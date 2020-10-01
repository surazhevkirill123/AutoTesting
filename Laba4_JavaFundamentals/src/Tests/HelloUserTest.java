package Tests;

import org.junit.Assert;
import org.junit.Test;

import static com.company.HelloUser.printName;
import static org.junit.Assert.*;

public class HelloUserTest {

    @Test
    public void testPrintName() {
        Assert.assertEquals("kirill",printName("kirill"));
    }
}