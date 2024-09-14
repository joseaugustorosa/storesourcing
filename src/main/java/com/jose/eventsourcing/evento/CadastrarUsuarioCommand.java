package com.jose.eventsourcing.evento;

public class CadastrarUsuarioCommand extends BaseCommand<String> {
    public final String nome;
    public final String email;

    public CadastrarUsuarioCommand (String id , String nome, String email){
        super(id);
        this.nome = nome;
        this.email = email;

    }
}
