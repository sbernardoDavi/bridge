public class Chinelo extends Calcado{

    public Chinelo(float valorPromocao){
        super(valorPromocao);
    }

    public float definirValorPromocao(){
        return this.valorPromocao - (1 * this.marca.definirAumento());
    }
}
