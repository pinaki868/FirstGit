package RetryFailedTest;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MyAnnotationTransformer implements IAnnotationTransformer {

    public void annotate(ITestAnnotation iTestAnnotation, Class testClass, Constructor testCons, Method testMethod){

        iTestAnnotation.setRetryAnalyzer(RetryAnalyzer.class);

    }

}
