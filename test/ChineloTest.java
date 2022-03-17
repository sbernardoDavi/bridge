import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChineloTest {

    @Test
    public void deveRetornarPromocaoChineloAdidas(){
        Marca marca = new Adidas();
        Chinelo chinelo = new Chinelo(20.0f);
        chinelo.setMarca(marca);

        assertEquals(14.0f, chinelo.definirValorPromocao());
    }

    @Test
    public void deveRetornarPromocaoChineloNike(){
        Marca marca = new Nike();
        Chinelo chinelo = new Chinelo(20.0f);
        chinelo.setMarca(marca);

        assertEquals(13.0f, chinelo.definirValorPromocao());
    }


}