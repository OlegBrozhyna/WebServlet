package annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

@SecondAnnotade
@FirstAnnotation(a = 10, b = 20)
public class ClassAnnotade extends SuperClass {

    private int a = 1;

    @SecondAnnotade
    public ClassAnnotade() {
    }

    public void add() {
    }

    @FirstAnnotation(a = 10, b = 20)
    public void amnotade(long a, long b) {
        System.out.println(a + b);
    }

    public int getA() {
        return a;
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchFieldException, InstantiationException {
        ClassAnnotade object = new ClassAnnotade();
        Class<?> clazz = object.getClass();
        Field field = clazz.getDeclaredField("a");
        //field.setAccessible(true); для старіших версій потрібно прописувати
       field.set(object,20);
//        System.out.println(object.getA());
//        System.out.println(clazz.getSuperclass());
//        Class<?>superClass = clazz.getSuperclass();
//        for (Method declaredMethod:superClass.getDeclaredMethods()) {
//            System.out.println(declaredMethod.getName());
//            System.out.println(declaredMethod.getModifiers());
//            if (declaredMethod.getModifiers() == 1){
//                System.out.println(Arrays.toString(declaredMethod.getParameters()));
        Constructor<?>constructor = clazz.getConstructors()[0];
        Object newOnject = ((ClassAnnotade)constructor.newInstance(null));
        System.out.println(((ClassAnnotade) newOnject).getA());


            }

        }


//        for (Method method:clazz.getMethods()) {
//            boolean isPresеnt=
//                    method.isAnnotationPresent(FirstAnnotation.class);
//            if (isPresеnt){
//                FirstAnnotation annotation = method.getAnnotation(FirstAnnotation.class);
//                long a= annotation.a();
//                long b = annotation.b();
//                method.invoke(object,a,b);
//                break;
//            }


//    }
//
//    {
//
//    }

//        //reflection
//        Class<?> clazz = ClassAnnotade.class;
//        if(clazz.getAnnotation(FirstAnnotation.class)==null){
//            throw new RuntimeException(clazz.getName() + "is not annotaded");
//
//        }
//        System.out.println(clazz.getAnnotation(Override.class));
//        System.out.println(clazz.getAnnotation(SecondAnnotade.class));
//        System.out.println(clazz.getAnnotation(FirstAnnotation.class));
//        System.out.println(clazz.getName());


//}

