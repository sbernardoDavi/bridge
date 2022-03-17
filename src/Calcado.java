public abstract class Calcado {

    protected Marca marca;

    protected float valorPromocao;

    public Calcado(float valorPromocao) {
        this.valorPromocao = valorPromocao;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setValorPromocao(float valorPromocao){
        this.valorPromocao = valorPromocao;
    }

    public abstract float definirValorPromocao();
}
