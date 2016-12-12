//package anagram.solver;
//
//import static org.hamcrest.Matchers.is;
//import static org.junit.Assert.assertThat;
//
//import org.junit.Before;
//import org.junit.Test;
//
//public class AnagramSolverImplTest {
//
//	AnagramSolver as = null;
//	
//	@Before
//	public void init() throws Exception {
//		as = new AnagramSolverImpl();
//	}
//
//	@Test
//	public void should_return_false_if_two_null() {
//		boolean anagram = as.isAnagram(null, null);
//		assertThat(anagram, is(false));		
//	}
//	@Test
//	public void should_return_false_if_one_null() {
//		boolean anagram = as.isAnagram(null, "tst");
//		assertThat(anagram, is(false));
//
//		
//	}
//	@Test
//	public void should_return_false_if_length_differ() {
//		boolean anagram = as.isAnagram("test", "test2");
//		assertThat(anagram, is(false));		
//	}
//	@Test
//	public void should_return_true_if_is_anagram() {
//		boolean anagram = as.isAnagram("could", "cloud");
//		assertThat(anagram, is(true));		
//	}
//	@Test
//	public void should_handle_duplicate() {
//		boolean anagram = as.isAnagram("tool", "toll");
//		assertThat(anagram, is(false));		
//	}
//
//	@Test
//	public void should_treat_upcase_as_ignore() {
//		boolean anagram = as.isAnagram("could", "Cloud");
//		assertThat(anagram, is(true));		
//	}
//
//}
