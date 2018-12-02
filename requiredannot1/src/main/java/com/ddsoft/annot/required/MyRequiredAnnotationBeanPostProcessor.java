package com.ddsoft.annot.required;

import java.beans.PropertyDescriptor;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.config.TypedStringValue;

public class MyRequiredAnnotationBeanPostProcessor extends RequiredAnnotationBeanPostProcessor {

	public MyRequiredAnnotationBeanPostProcessor()
	{

	}

	private String getValue( PropertyValues pvs , String typeName )
	{
		String value = null;
		PropertyValue[] pv = pvs.getPropertyValues();
		for( PropertyValue ppv : pv )
		{
			TypedStringValue tsv = (TypedStringValue)ppv.getValue();
			if( typeName.equals(ppv.getName() )) 
			{
				value = tsv.getValue();
				break;
			}
		}
		return value;
	}

	@Override
	public PropertyValues postProcessPropertyValues(PropertyValues pvs,
			PropertyDescriptor[] pds, Object arg2, String arg3)
					throws BeansException {

		for( PropertyDescriptor pd : pds )
		{
			System.out.println(pd.getName()+"----"+pd.getReadMethod()+"----"+pd.getWriteMethod());

			Method setMethod = pd.getWriteMethod();
			if( setMethod != null )
			{
				Annotation[] annots = setMethod.getDeclaredAnnotations();
				for( Annotation annot : annots )
				{
					if( annot instanceof Mandatory )
					{
						Mandatory mand = (Mandatory) annot;
						String val1 = mand.myValue();
						System.out.println("Now val1--------->"+val1);
						String compVal = getValue(pvs, pd.getName());
						System.out.println("Now comp val ---->"+compVal);

						if( !compVal.equals(val1))
							throw new RuntimeException("Invalid values ...");
					}
				}
			}
		}

		return super.postProcessPropertyValues(pvs, pds, arg2, arg3);
	}

	static void readAnnotation(AnnotatedElement element)
	{
		try
		{
			System.out.println("\nFinding annotations on " + element.getClass().getName());
			Annotation[] classAnnotations = element.getAnnotations();

			for(Annotation annotation : classAnnotations)
			{
				System.out.println("........"+annotation.annotationType().getName());
				if (annotation instanceof Mandatory)
				{
					Mandatory author = (Mandatory)annotation;
					System.out.println("Author name:" + author.myValue());
				}
			}
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
		}
	}





}
