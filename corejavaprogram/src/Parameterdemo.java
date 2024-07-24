import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Parameterdemo {
@ParameterizedTest
//to give values we use value sources
@ValueSource(strings = {"call","ball","suri"})
void endswithI(String str)
{
	assertTrue(str.endsWith("i"));
}
}