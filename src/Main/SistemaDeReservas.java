package Main;
import Entidades.Recurso;
import Entidades.Usuario;
import Utilitarios.Date;
import Utilitarios.Reserva;

public class SistemaDeReservas {
    public static void main(String[] args) {
        // Criando um usuário
        Usuario usuario = new Usuario("João da Silva", "joao@email.com", "123456789", true, false);

        // Criando um recurso
        Recurso quadraEsportes = new Recurso();
        quadraEsportes.setNome("Quadra de Esportes 1");

        // Criando uma reserva para o usuário
        Reserva reserva = new Reserva(usuario, quadraEsportes, new Date(8,9,2,2023), new Date(9,9,2,2023));
        // Imprimindo a reserva criada
        System.out.println("Reserva criada: ");
        reserva.imprimirReserva();
    }
}
