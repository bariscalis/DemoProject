package database;

import org.junit.Assert;
import org.junit.Test;
import utilities.DatabaseUtility;

import java.util.*;

public class DbTest {

    @Test
    public void test01(){
        DatabaseUtility.createConnection();
        List<List<Object>> test = DatabaseUtility.getQueryResultList("Select first_name, last_name, email from public.tp_customer where first_name like 'Re%'");
//        test.stream().forEach(i->System.out.println(i.stream().map(k-> k.toString()).collect(Collectors.joining(", "))));

        Assert.assertTrue(test.contains(Arrays.asList("Reanna", "Grady", "com.github.javafaker.Name@5d08976a@gmail.com")));
        DatabaseUtility.closeConnection();
    }

}
