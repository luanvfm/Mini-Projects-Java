//Projeto para Treinar Encapsulamento.
public class Carro {
//A classe carro é pública para que eu possa acessar ela de qualquer lugar.    
    private String cor;
    private String modelo;
//Os atributos do carro são private para que ninguem possa mudar eles diretamente.
public void SetCor(String cor) {
    this.cor = cor;
}

public void SetModelo(String modelo) {
    this.modelo = modelo;
}
//Metodos para inserir valores na variavel
public String GetCor() {
    return cor;
}

public String GetModelo() {
    return modelo;
}
//Métodos para realizar a leitura de variaveis


public static void main (String[] args) {
    
    Carro carro = new Carro();
    Carro carro2 = new Carro();
//Criação do objeto para poder manipular no main
    carro.SetCor("azul");
    carro.SetModelo("Porsche");
    
    carro2.SetCor("amarelo");
    carro2.SetModelo("Jeep");
    
    System.out.println("A cor do carro é: " + carro.GetCor());
    System.out.println("O modelo do carro é: " + carro.GetModelo() + "\n");
    
    System.out.println("A cor do carro 2 é " + carro2.GetCor() + " e seu modelo é " + carro2.GetModelo() );
  }
 }
