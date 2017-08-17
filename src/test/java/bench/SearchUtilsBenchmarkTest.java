package bench;

import mainmain.SearchUtils;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;
/**
 * Created by vadim_vil on 16.08.2017.
 */
public class SearchUtilsBenchmarkTest {

    @Benchmark
    @BenchmarkMode(Mode.SingleShotTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void MySearch() throws InterruptedException {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        final int elt = 4;
        SearchUtils.Search(arr, elt);

    }


    @Benchmark
    @BenchmarkMode(Mode.SingleShotTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void JavasSearch() throws InterruptedException {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        final int elt = 4;

        java.util.Arrays.binarySearch(arr,elt);
    }



    public static void main(String[] args) throws RunnerException {
        org.openjdk.jmh.runner.options.Options opt = new OptionsBuilder()
                .include(SearchUtilsBenchmarkTest.class.getSimpleName())
                .warmupIterations(5)
                .measurementIterations(5)
                .threads(4)
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}