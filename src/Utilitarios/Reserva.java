package Utilitarios;

import Entidades.Recurso;
import Entidades.Usuario;

public class Reserva {
    private Recurso recurso;
    private Usuario usuario;
    private Date horarioInicio;
    private Date horarioFim;
    private String justificativa;

    public Reserva(Usuario usuario, Recurso quadraEsportes, Date horarioInicio,Date horarioFim) {
        this.usuario = usuario;
        this.recurso = quadraEsportes;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(Date horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Date getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(Date horarioFim) {
        this.horarioFim = horarioFim;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public void setCancelada(boolean b) {
    }

    public void setJustificativaCancelamento(String justificativa) {
    }

    public void setData(Date data) {
    }

    public void setConfirmada(boolean b) {
    }

    public void imprimirReserva() {
        System.out.println("Informações da Reserva:");
        System.out.println("Usuário: " + this.usuario.getNome());
        System.out.println("Recurso: " + this.recurso.getNome());
        System.out.println("Data Início: " + this.horarioInicio.getHora());
        System.out.println("Data Fim: " + this.horarioFim.getHora());
    }
}
