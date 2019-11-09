import com.plough.random.RandomChoiceMachine;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by plough on 2019/11/9.
 */
public class RandomChoiceMachineTest {
    @Test
    public void testNext() {
        RandomChoiceMachine machine = new RandomChoiceMachine(Arrays.asList("a", "b", "c", "d", "e", "f"), 2);
        System.out.println(machine.next());
        System.out.println(machine.next());
    }
}
