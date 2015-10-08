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
import lang.ast.FunctionDec;
import java.util.HashSet;

/**
 * Tests name analysis
 */
@RunWith(Parameterized.class)
public class TestReachable extends AbstractParameterizedTest {
	/**
	 * Directory where test files live
	 */
	private static final String TEST_DIR = "testfiles/reachable";
        private static String filename;
    
	/**
	 * Construct a new JastAdd test
	 * @param filename filename of test input file
	 */
	public TestReachable(String filename) {
		super(TEST_DIR, filename);
		this.filename = filename;
	}

	/**
	 * Run the JastAdd test
	 */
	@Test
	public void runTest() throws Exception {
	    PrintStream out = System.out;
	    try {
		Program program = (Program) parse(inFile);
		//ByteArrayOutputStream baos = new ByteArrayOutputStream();
		//System.setOut(new PrintStream(baos));
		System.out.println("Reachables: ");
		for(FunctionDec funcDec : program.getFunctionDecList()) {
		    HashSet<FunctionDec> reachables = funcDec.reachable();
		    StringBuilder sb = new StringBuilder();
		    for(FunctionDec calledFunc : reachables) {
			sb.append(calledFunc.getIdDecl().getID()).append(" ");
		    }
		    System.out.println(funcDec.getIdDecl().getID() + ":   " + sb.toString());
		}		    
		  //  compareOutput(baos.toString(), outFile, expectedFile);
            } finally {
		 //   System.setOut(out);
	    }
	}

	@SuppressWarnings("javadoc")
	@Parameters(name = "{0}")
	public static Iterable<Object[]> getTests() {
		return getTestParameters(TEST_DIR);
	}
}
