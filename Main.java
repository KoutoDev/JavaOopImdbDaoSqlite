import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

    FilmeDAO filmeDAO = new FilmeDAO();

    // Quero consultar o banco trazendo todos os filmes..
    ArrayList<Filme> filmeLista = filmeDAO.getAll();
    for (Filme filme : filmeLista) {
      System.out.println(filme);
    }

    // Como fica para inserir filme agora..
    // Filme novoFilme = new Filme(0, "A Fuga das Galinhas", (short) 2000);
    // filmeDAO.add(novoFilme);

    // Quero consultar o banco trazendo todos os filmes..
    filmeLista = filmeDAO.getAll();
    for (Filme filme : filmeLista) {
      System.out.println(filme);
    }

    // Podemos consultar pontualmente qualquer filme..
    // Trazer Braddock..
    System.out.println("Trazer o filme Braddock...............");

    Filme braddock = filmeDAO.getById(11);
    System.out.println(braddock);

    System.out.println("Trazer o filme 'Fuga' que está repetido para alteração...............");

    Filme repetido = filmeDAO.getById(10);
    System.out.println(repetido);

    System.out.println("Trocando o filme 14 para Fuga2....");
    
    repetido.setTitulo("A Fuga das Galinhas 2: A Missão");
    repetido.setAno((short) 2024);
    filmeDAO.update(repetido);

    System.out.println("Vamos ver se alterou?");

    filmeLista = filmeDAO.getAll();
    for (Filme filme : filmeLista) {
      System.out.println(filme);
    }
    System.out.println("Removendo...");
    Filme flash11 = filmeDAO.getById(9);
    filmeDAO.delete(flash11);
    
    filmeLista = filmeDAO.getAll();
    for (Filme filme : filmeLista) {
      System.out.println(filme);
    }
  }
}