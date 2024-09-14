package com.jose.eventsourcing.evento;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class Usuario {

    @AggregateIdentifier
    private String id;
    private String nome;
    private String email;
    private String estado;

    public Usuario(){

    }
    @CommandHandler
    public Usuario(CadastrarUsuarioCommand comando){
        AggregateLifecycle.apply(new CadastrarUsuarioCommand(comando.id, comando.nome, comando.email));
    }
    @EventSourcingHandler
    protected void en(usuarioCadastrado evento){
        this.id = evento.id;
        this.nome= evento.nome;
        this.email = evento.email;
        this.estado = "Criada!";

    }
}
