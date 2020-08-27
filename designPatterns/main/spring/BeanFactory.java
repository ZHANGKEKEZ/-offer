package main.spring;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 工厂模式的应用：一个创建Bean对象的工厂
 *   1.通过一个配置文件来配置service的全限定类名
 *          配置的内容：key为唯一标识，value为全限定类名
 *   2.通过读取配置文件中配置的内容，反射创建对象
 */
public class BeanFactory {
    //定义properties对象
    private static Properties properties=null;
    //定义容器
    private static Map<String,Object> bean =null;
    //因为是模拟ApplicationContext,所以采用立即加载的方式。
    //在static代码块中加载properties文件中的bean对象。
    //单例模式的应用：static代码块只会执行一次，保证单例。
    static {
        try {
            properties = new Properties();
            //获取配置文件输入流
            InputStream is = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            properties.load(is);
            //实例化容器
            bean=new HashMap<String,Object>();
            //枚举配置文件中的key
            Enumeration<Object> keys = properties.keys();
            //遍历
            while (keys.hasMoreElements()){
                String key = keys.nextElement().toString();
                String beanPath = properties.getProperty(key);
                //通过反射创建对象，放入容器
                Object o = Class.forName(beanPath).newInstance();
                bean.put(key,o);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 根据bean的名称获取对象
     * @param beanId
     * @return
     */
    public static  Object getBean(String beanId){
        return bean.get(beanId);
    }


}
