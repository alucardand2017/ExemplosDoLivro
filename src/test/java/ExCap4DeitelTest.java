import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExCap4DeitelTest {
    @Test
    public void fatorialDeUmNumeroInte(){
        ExCap4Deitel exCap4Deitel = new ExCap4Deitel();
        Assertions.assertTrue(exCap4Deitel.fatorial(5) == 120);
        Assertions.assertTrue(exCap4Deitel.fatorial(0) == 1);
    }
@Test
    public void testandoValoresParafuncaoTermosDeEuler(){
        ExCap4Deitel exCap4Deitel = new ExCap4Deitel();
        Assertions.assertTrue(exCap4Deitel.termosDeEuler(1,1)== 2);
        Assertions.assertTrue(exCap4Deitel.termosDeEuler(0,10)==1);
    }
}
