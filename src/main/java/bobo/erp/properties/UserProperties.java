package bobo.erp.properties;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by 59814 on 2017/7/18.
 */
@Component
@ConfigurationProperties(prefix = "user")
public class UserProperties {
    private Integer userLevel;
    private String username;
    private String password;
    private String userOperator;

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserOperator() {
        return userOperator;
    }

    public void setUserOperator(String userOperator) {
        this.userOperator = userOperator;
    }
}
