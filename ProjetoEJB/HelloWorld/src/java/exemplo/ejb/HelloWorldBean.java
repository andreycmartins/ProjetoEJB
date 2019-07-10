package exemplo.ejb;

import javax.ejb.Stateless;

@Stateless
public class HelloWorldBean implements HelloWorldRemote {

    @Override
    public String olaMundo() {
        return "Olá mundo com EJB!";
    }
    
}