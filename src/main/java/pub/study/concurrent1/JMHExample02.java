package pub.study.concurrent1;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
public class JMHExample02 {

    /**
     * normal instance method
     *
     */
    public void normalMethod(){

    }

    public static void main(String[] ages) throws RunnerException {

        final Options opts = new OptionsBuilder()
                .include(JMHExample02.class.getSimpleName())
                .forks(1)
                .measurementIterations(10)
                .warmupIterations(10)
                .build();

        new Runner(opts).run();
    }
}
