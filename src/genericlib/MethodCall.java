package genericlib;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodCall 
{
	
	public static void execution(String classname,String methodname) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		Class aclass=Class.forName(classname);
		Method m=aclass.getDeclaredMethod(methodname,null);
		m.invoke(aclass, null);
		
		
	}



}
