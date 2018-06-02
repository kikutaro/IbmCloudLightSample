package tech.kikutaro.ibmcloudlightsample;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

/**
 * JSF Managed Bean.
 * 
 * @author kikuta
 */
//@Named(value = "indexBean")
@ManagedBean
@RequestScoped
public class IndexBean {
    
    private String name;
    
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public void hello() {
        this.message = name + "さん、こんにちは";
    }
}
