package init.upinmcSE;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
/**
 * @author upinmcSE
 * @date 2025/9/14
 * */
public class BeanFactoryTest {
    @Test
    public void testGetBean() throws Exception {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("hiClass", new Hi());
        Hi bean = (Hi) beanFactory.getBean("hiClass");

        assertThat(bean).isNotNull();
        assertThat(bean.sayHi()).isEqualTo("Hi");
    }

    static class Hi{
        public String sayHi(){
            System.out.println("Hi");
            return "Hi";
        }
    }
}
