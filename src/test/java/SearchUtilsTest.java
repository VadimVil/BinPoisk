

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import mainmain.SearchUtils;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Created by vadim_vil on 06.08.2017.
 */
class SearchUtilsTest {
    @Test
    public void sumTest() {
        int[] arr = {1, 2, 3, 4, 5};
        Assertions.assertEquals(3, SearchUtils.Search(arr, 4));
        assertEquals(-1, SearchUtils.Search(arr, -6));
        assertEquals(-1, SearchUtils.Search(arr, 20));
    }

   /* public class SearchBench {
        private static final int [] arr = {1,2,3,4,5,6,7,8,9};
        private static final int elt = 4;

        @GenerateMicroBenchmark
        public void timeTestSearch() {
            StringUtils.SearchUtils(arr, elt);
        }
*/

}
