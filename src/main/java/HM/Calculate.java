package HM;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.HashSet;
import java.util.Set;
@MyAnnotation
public class Calculate {

    public static void main(String[] args) {
        Set<Method> annotatedMethods = new HashSet<>();
        Set<Parameter> annotatedParameters = new HashSet<>();
    
        for (Class<?> clazz = MethodAnnotation.class;clazz !=null; clazz.getSuperclass()){
           for (Method method:clazz.getDeclaredMethods()) {
            
             
                if (method.isAnnotationPresent(MyAnnotation.class)){
                     annotatedMethods.add(method);
                  

                }
                for (Parameter parameter: method.getParameters()){
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

