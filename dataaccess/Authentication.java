package dataaccess;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Amr on 7/28/2015.
 */

public class Authentication {

    /**
     * check authentication
     * @param username
     * @param password
     * @return
     */


    public User isAuth(String username,String password)
    {
        DataAccessFacade data = new DataAccessFacade();
        HashMap<String,User> users = data.readUserMap();

        Iterator it = users.entrySet().iterator();

        while(it.hasNext())
        {
            Map.Entry<String,User> entry = (Map.Entry) it.next();
            User u = entry.getValue();
            String usernameKey = entry.getKey();
            if(Objects.equals(username,usernameKey) && Objects.equals(password,u.getPassword()))
            {
                return u;
            }
        }

        return null;
    }
}
