import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();
    private Object bean;
    public CglibProxy(Object bean) {
        this.bean = bean;
    }
    public Object getProxy() {
        // 设置需要创建子类的类
        enhancer.setSuperclass(bean.getClass());
        enhancer.setCallback(this);
        // 通过字节码技术动态创建子类实例
        return enhancer.create();
    }
    // 实现 MethodInterceptor 接口方法
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        String methodName = method.getName();
        if (methodName.equals("wakeup")) {
            System.out.println("早安~!");
        } else if (methodName.equals("sleep")) {
            System.out.println("晚安~!");
        }
        // 调用原 bean 的方法
        return method.invoke(bean, args);
    }
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy(new Student("小红"));
        Student student = (Student)cglibProxy.getProxy();
        student.wakeup();
        student.sleep();
    }
}
