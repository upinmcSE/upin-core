package init.upinmcSE;

import java.util.HashMap;
import java.util.Map;

/**
 * @author upinmcSE
 * @date 2025/9/14
 * */
public class BeanFactory {
    private final Map<String, Object> beanMap = new HashMap<>();

    public void registerBean(String name, Object bean){
        beanMap.put(name, bean);
    }

    public Object getBean(String name){
        return beanMap.get(name);
    }
}
