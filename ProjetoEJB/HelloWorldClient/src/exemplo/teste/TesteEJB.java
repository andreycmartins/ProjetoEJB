package exemplo.teste;

import exemplo.ejb.HelloWorldRemote;
import javax.naming.InitialContext;

public class TesteEJB {
    public static void main (String[] args) throws Exception {
        InitialContext ctx = new InitialContext();
        HelloWorldRemote ejb = (HelloWorldRemote) ctx.lookup("exemplo.ejb.HelloWorldRemote");
        System.out.println(ejb.olaMundo());
    }
}