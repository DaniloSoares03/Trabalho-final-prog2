package Entidades;

import Utilitarios.Date;
import Utilitarios.Reserva;

public class Administrador extends Usuario {
    private String cargo;

    public Administrador(String nome, String email, String senha, boolean ativo, boolean administrador) {
        super(nome, email, senha, ativo, administrador);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void bloquearUsuario(Usuario usuario, String justificativa) {
        usuario.setBloqueado(true);
        usuario.setJustificativaBloqueio(justificativa);
    }

    public void excluirUsuario(Usuario usuario, String justificativa) {
        usuario.setExcluido(true);
        usuario.setJustificativaExclusao(justificativa);
    }

    public void cancelarReserva(Reserva reserva, String justificativa) {
        reserva.setCancelada(true);
        reserva.setJustificativaCancelamento(justificativa);
    }

    public void reservarRecurso(Usuario usuario, Recurso recurso, Date data) {
        Date horarioFim = new Date(data.getHora() + 1,data.getDia(), data.getMes(),data.getAno());
        Reserva reserva = new Reserva(usuario,recurso,data,horarioFim);
        reserva.setUsuario(usuario);
        reserva.setRecurso(recurso);
        reserva.setHorarioInicio(data);
        reserva.setHorarioFim(horarioFim);
        reserva.setConfirmada(true);
    }
}
