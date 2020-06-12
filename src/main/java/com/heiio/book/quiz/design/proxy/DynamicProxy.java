package com.heiio.book.quiz.design.proxy;




import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class DynamicProxy<T>  implements InvocationHandler {

    private T target;
    public DynamicProxy(T t) {
        target = t;
    }


    public Object bind(Class clz) {


       return Proxy.newProxyInstance(clz.getClassLoader(), clz.getInterfaces(), this);
    }


    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        Object obj = method.invoke(target, objects);
        return obj;
    }
}
