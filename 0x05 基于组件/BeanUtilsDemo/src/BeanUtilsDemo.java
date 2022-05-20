import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;

public class BeanUtilsDemo {
    public static void main(String[] args) throws Exception {
        // 从文件中读取或从表单中获取到的数据都是字符串类型
        String id = "101";
        String name = "Alice";
        String salary = "1000.0";
        String birthday = "2000-12-07"; // 引用类型使用 BeanUtils 要注册类型转换器
        ConvertUtils.register(new Converter() {
            @Override
            public Object convert(Class type, Object value) {
                // type: type to which this value should be converted
                Date date = null;
                try {
                    SimpleDateFormat dateFormat =  new SimpleDateFormat("yyyy-MM-dd");
                    date = dateFormat.parse((String)value);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return date;
            }
        }, Date.class);
        Employee employee = new Employee();
        BeanUtils.setProperty(employee, "id", id);
        BeanUtils.setProperty(employee, "name", name);
        BeanUtils.setProperty(employee, "salary", salary);
        // BeanUtils 调用类型转换器将字符串型的 birthday，转换为 Date 型
        BeanUtils.setProperty(employee, "birthday", birthday);
        System.out.println(employee);
        System.out.println("Id\tName\tSalary\tBirthday");
        System.out.println(employee.getId() + '\t' + employee.getName() + '\t' + employee.getSalary() + '\t' + employee.getBirthday());
    }
}
