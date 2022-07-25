package manage;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyDataProvider {

    @DataProvider
    public static Iterator <Object[]> boardData (){
        List<Object[]> list= new ArrayList<>();
        list.add(new Object[]{"test qa1"});
        list.add(new Object[]{"test qa2"});
        list.add(new Object[]{"test qa3"});

        return list.iterator();

    }
}
