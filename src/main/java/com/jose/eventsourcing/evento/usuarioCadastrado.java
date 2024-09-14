package com.jose.eventsourcing.evento;

public class usuarioCadastrado  extends BaseEvent<String>{

    public final String nome;
    public final String email;

    public usuarioCadastrado (String id , String nome, String email){
        super(id);
        this.nome = nome;
        this.email = email;

 }


}
