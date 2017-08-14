package main.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vadim_vil on 06.08.2017.
 */
class SearchUtilsTest {
        @Test
    public void SumTest (){
            int [] arr = {1,2,3,4,5};
            assertEquals(3, SearchUtils.Search(arr,4 ));
            assertEquals(0,SearchUtils.Search(arr,-6));
            assertEquals(0,SearchUtils.Search(arr,20));
        }
}