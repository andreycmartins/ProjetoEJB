package exemplo.ejb;

import javax.ejb.Remote;

@Remote
public interface HelloWorldRemote {
    public String olaMundo();
}
