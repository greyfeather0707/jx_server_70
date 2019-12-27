package com.zeroten.javales001.classobject.sub;

//import com.zeroten.javales001.classobject.ClassStaticImport;
import org.testng.annotations.Test;
import static com.zeroten.javales001.classobject.ClassStaticImport.name;
import static com.zeroten.javales001.classobject.ClassStaticImport.println;
import com.zeroten.javales001.classobject.ClassStaticImport;
public class ClassStaticImportTest {
//    @Test
//    public void testUser1(){
//        System.out.println(ClassStaticImport.name);
//
//        ClassStaticImport.println();
//    }

    @Test
    public void testUser2(){
        System.out.println(name);

        println();
    }
}
