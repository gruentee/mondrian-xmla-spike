package org.mondrian;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class XmlaServer
{
    public static void main(String[] args) throws Exception
    {
        Server server = new Server(8888);

        String rootPath = "/home/vagrant/mondrian-xmla-spike/";
        WebAppContext webapp = new WebAppContext(rootPath + "src/main/webapp", "");
        server.setHandler(webapp);

        server.start();
        server.dump(System.err);
        server.join();
    }
}
