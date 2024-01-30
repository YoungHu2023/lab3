import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace2() {
    int[] input = {1,2,3};
    int[] expected = {3,2,1};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(expected, input);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input = {10,9,8,7,6,5,4,3,2,1};
    assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10}, ArrayExamples.reversed(input));
  }
  @Test
  public void testReversed3() {
    int[] input = {3,2,1};
    ArrayExamples.reversed(input);
    assertArrayEquals(new int[]{3,2,1}, input);
  }

  public void testaverageWithoutLowest() {
    double[] input = { };
    double real = ArrayExamples.averageWithoutLowest(input);
    assertEquals(0.0, real, 0.0001);
  }
}

