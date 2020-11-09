
// How to run -> java MyMainClass

// Interface
interface DAO {
    public void inserir(); 
    public void excluir(); 
    public void localizar(); 
}

// Cliente "implementa" a interface DAO
class Cliente implements DAO {

    private int codigo;
    private String nome;

    public void inserir() {
        System.out.println("Objeto Cliente: Executando método inserir...");
    }

    public void excluir() {
        System.out.println("Objeto Cliente: Executando método excluir...");
    }

    public void localizar() {
        System.out.println("Objeto Cliente: Executando método localizar...");
    }
}

class Fornecedor implements DAO {

    private String cnpj;
    private String razaoSocial;

    public void inserir() {
        System.out.println("Objeto Fornecedor: Executando método inserir...");
    }

    public void excluir() {
        System.out.println("Objeto Fornecedor: Executando método excluir...");
    }

    public void localizar() {
        System.out.println("Objeto Fornecedor: Executando método localizar...");
    }
}

class Produto implements DAO {

    private int numero;
    private String descricao;

    public void inserir() {
        System.out.println("Objeto Produto: Executando método inserir...");
    }

    public void excluir() {
        System.out.println("Objeto Produto: Executando método excluir...");
    }

    public void localizar() {
        System.out.println("Objeto Produto: Executando método localizar...");
    }
}

class MyMainClass {
    public static void main(String[] args) {

        Cliente cliente01 = new Cliente();

        cliente01.inserir();
        cliente01.localizar();
        cliente01.excluir();

        Fornecedor fornecedor01 = new Fornecedor();

        fornecedor01.inserir();
        fornecedor01.localizar();
        fornecedor01.excluir();

        Produto produto01 = new Produto();

        produto01.inserir();
        produto01.localizar();
        produto01.excluir();
    }
}