package fe;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {

    String URL = readConfig().getString("url");
    String CUSTOMEREMAIL = readConfig().getString("customerEmail");
    String CUSTOMERPASSWORD = readConfig().getString("customerPassword");

    //метод, который будет обращаться к файлу conf и читать его содержимое
    static Config readConfig() {
        return ConfigFactory.load("application.conf");
    }

}
