package dwrPractice;

import java.io.IOException;
import javax.servlet.ServletException;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;

public class ex02_IncludePage
{
    public String getInclude() throws ServletException, IOException {
        return WebContextFactory.get().forwardToString("/includingExample/jQueryaddClassStyle.html");
//        return "123";
    }
}
