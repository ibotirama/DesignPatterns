package contabancaria;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public abstract class ConversorAbstrato {
	
	public Map<String, String> getAtributos(Requisicao req){
		Map<String, String> resultados = new HashMap<String, String>();
		Class<? extends Conta> classe = req.getConta().getClass();
		Field[] atributos = classe.getDeclaredFields();
		for (Field atrib : atributos){
			try {
				String primeiraLetra = atrib.getName().substring(0, 1).toUpperCase();
				String nomeMetodo = "get"+primeiraLetra+atrib.getName().substring(1, atrib.getName().length());
				Method m = classe.getMethod(nomeMetodo);
				resultados.put(atrib.getName(), m.invoke(req.getConta()).toString());
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		
		return resultados;  
	}
}
