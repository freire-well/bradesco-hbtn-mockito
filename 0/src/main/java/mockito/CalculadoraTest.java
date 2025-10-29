import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class CalculadoraTest {

    @Mock
    ServicoMatematico servicoMatematico;

    @Test
    void test(){
        when(servicoMatematico.somar(any(),any())).thenReturn(5);
        assertEquals(5,servicoMatematico.somar(4,6));

    }
}
