package lesson14;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckingArrTest {

    @Test
    public void lastfour(){
        CheckingArr checkingArr = new CheckingArr();
        //int newArr =checkingArr.lastfour(new int[]{1, 2, 3, 4, 5, 6, 7});
        Assertions.assertEquals(new int []{5,6,7}, checkingArr.lastfour(new int[]{1, 2, 3, 4, 5, 6, 7}));
    }

    @Test
    public void chechfour(){
        CheckingArr checkingArr = new CheckingArr();
        Assertions.assertEquals(true, checkingArr.chechfour(new int[]{1,1,1,4,4,1,4,4}));
        Assertions.assertEquals(false, checkingArr.chechfour(new int[]{1,1,1,1,1,1}));
        Assertions.assertEquals(false, checkingArr.chechfour(new int[]{4,4,4,4}));
        Assertions.assertEquals(true, checkingArr.chechfour(new int[]{1,4,4,1,1,4,3}));

    }
}
