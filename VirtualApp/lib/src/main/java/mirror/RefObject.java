package mirror;

import java.lang.reflect.Field;

@SuppressWarnings("unchecked")
public class RefObject<T> {

    /**
     * 原类字段的字段对象
     */
    private Field field;

    /**
     * 构造函数
     * @param cls 原类的类对象
     * @param field 映射类的字段名
     * @throws NoSuchFieldException 若未在原类中找到与映射类相同的字段名，那么将会抛出异常
     */
    public RefObject(Class<?> cls, Field field) throws NoSuchFieldException {
        this.field = cls.getDeclaredField(field.getName());
        this.field.setAccessible(true);
    }

    public T get(Object object) {
        try {
            return (T) this.field.get(object);
        } catch (Exception e) {
            return null;
        }
    }

    public void set(Object obj, T value) {
        try {
            this.field.set(obj, value);
        } catch (Exception e) {
            //Ignore
        }
    }
}