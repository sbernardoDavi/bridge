import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TenisTest {

    @Test
    public void deveRetornarPromocaoTenisNike(){
        Marca marca = new Nike();
        Tenis tenis = new Tenis(20.99f);
        tenis.setMarca(marca);

        assertEquals(20.99f, tenis.definirValorPromocao());

    }

    @Test
    public void deveRetornarPromocaoTenisAdidas(){
        Marca marca = new Adidas();
        Tenis tenis = new Tenis(20.99f);
        tenis.setMarca(marca);

        assertEquals(20.99f, tenis.definirValorPromocao());

    }

}