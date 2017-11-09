import junit.framework.*;
import org.junit.Test;

public class CompressionTest extends TestCase {

	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void test1() throws Exception {
		assertEquals("7a4bii", Compression.compress("aaaaaaabbbbii"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals("u3thhj7k3lm", Compression.compress("uttthhjkkkkkkklllm"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals("u", Compression.compress("u"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals("uu", Compression.compress("uu"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals("3u", Compression.compress("uuu"));
	}
}
