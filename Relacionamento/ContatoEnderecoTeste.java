package Relacionamento;

import Projeto_Do_Banco_IFRN.Conta;

public class ContatoEnderecoTeste {
    public static void main(String[] args) {
        Contato c = new Contato();

        Endereco end = new Endereco();
        end.setNomeRua("Rua manuel vicente");
        end.setCidade("Rio de Janeiro");
        end.setCep("3456789");
        end.setComplemento("La aonde não é da sua conta");
        
    }
    
}
