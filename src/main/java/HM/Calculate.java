package HM;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.HashSet;
import java.util.Set;
@MyAnnotation
public class Calculate {

    public static void main(String[] args) {
        Set<Method> annotatedMethods = new HashSet<>();
        //Перебирає класи в ієрархії
        Set<Parameter> annotatedParameters = new HashSet<>();
        for (Class<?> clazz = MethodAnnotation.class;clazz !=null; clazz.getSuperclass()){
           // Перебір методів у кожному класі для
            for (Method method:clazz.getDeclaredMethods()) {
             //   Перевіряє , чи метод анотовано @MyAnnotation
                if (method.isAnnotationPresent(MyAnnotation.class)){
                    //Перебирає параметри у методі
                    annotatedMethods.add(method);

                }
                for (Parameter parameter: method.getParameters()){
                    // Перевіряє, чи параметр анотовано за допомогою @MyAnnotation
                    if (parameter.isAnnotationPresent(MyAnnotation.class)){
                        annotatedParameters.add(parameter);

                        }
                    }
                }
            System.out.println("Annotated Parameters : " + annotatedParameters.size());
            System.out.println("Annotated Methods : " + annotatedMethods.size());

break;
            }


        }
    }

