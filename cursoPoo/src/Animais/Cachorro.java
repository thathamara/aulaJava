package Animais;

public class Cachorro extends Animal {
    static int numeroDeCachorros;

    private int tamanhoDoRabo;


    //Construtores adcionados

    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo) {
        super(nome, cor, peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        numeroDeCachorros++;
    }


    //metodos
    public String pegar(){
        return "Bolinha";
    }

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    private String estadoDeEspirito;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public String interagir(String acao)
    {
        switch(acao){
            case"carinho":this.estadoDeEspirito="feliz"; break;
            case"vai dormir":this.estadoDeEspirito="bravo"; break;
            case"pisar na patinha":this.estadoDeEspirito="triste"; break;
            default:this.estadoDeEspirito="Neutro";break;
        }
        return estadoDeEspirito;
    }

    @Override
    public void soar() {
        System.out.println("au au");
    }
}