package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import lang.ast.ErrorMessage;
import lang.ast.Program;

/**
 * Tests name analysis
 */
@RunWith(Parameterized.class)
public class TestStaticAnalysis extends AbstractParameterizedTest {
	/**
	 * Directory where test files live
	 */
	private static final String TEST_DIR = "testfiles/staticanalysis";

	/**
	 * Construct a new JastAdd test
	 * @param filename filename of test input file
	 */
	public TestStaticAnalysis(String filename) {
		super(TEST_DIR, filename);
	}

	/**
	 * Run the JastAdd test
	 */
	@Test
	public void runTest() throws Exception {
	    PrintStream out = System.out;
	    try {
		Program program = (Program) parse(inFile);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		System.setOut(new PrintStream(baos));
		program.eval();
		compareOutput(baos.toString(), outFile, expectedFile);
            } finally {
		System.setOut(out);
	    }
	}

	@SuppressWarnings("javadoc")
	@Parameters(name = "{0}")
	public static Iterable<Object[]> getTests() {
		return getTestParameters(TEST_DIR);
	}
}
