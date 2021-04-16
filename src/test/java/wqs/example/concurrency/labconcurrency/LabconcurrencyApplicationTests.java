package wqs.example.concurrency.labconcurrency;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.AllArgsConstructor;
import lombok.Getter;

@SpringBootTest
class LabconcurrencyApplicationTests {

	@Test
	void contextLoads() {
		
//		XSync<UUID> xsync = new XSync<>();
//		   String id = UUID.randomUUID().toString();
//		   nonatomicint var = new nonatomicint(0);
//
//		   // there is a magic here: 
//		   // we created a parallel stream and try to increment 
//		   // the same nonatomic integer variable in each stream
//		   intstream.range(0, thread_cnt)
//		            .boxed()
//		            .parallel()
//		            .foreach(j -> xsync.execute(uuid.fromstring(id), var::increment));  
//
//		   // asserts
//		   await().atmost(5, timeunit.seconds)
//		          .until(var::getvalue, equalto(thread_cnt));
//
//		   assertions.assertthat(var.getvalue()).isequalto(thread_cnt);
	}

}

@Getter
@AllArgsConstructor
class NonAtomicInt {  
    private int value;

    public int increment() {
        return value++;
    }
}