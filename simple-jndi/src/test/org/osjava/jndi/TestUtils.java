package org.osjava.jndi;

import java.util.Properties;
import java.util.Hashtable;

public class TestUtils {

    DataSource createFakeDS(String url, String driver, String user, String passwd, String name) {
        Properties props = new Properties();
        // even though delimiter is a /, we use . here for the 
        // test. This is because the dot needs to be in the file
        props.setProperty(name+"/url", url);
        props.setProperty(name+"/driver", driver);
        props.setProperty(name+"/user", user);
        props.setProperty(name+"/password", passwd);
        PropertiesDataSource fake = new PropertiesDataSource(props, new Hashtable(), this.delimiter);
        fake.setName(name);
        return fake;
    }

}