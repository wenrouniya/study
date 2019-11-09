package com.study.JVM;

import org.junit.Test;

public class ReferenceGC {
    public  Object instance=null;
    @Test
    private static void testGC(){
        ReferenceGC objA=new ReferenceGC();
        ReferenceGC objB=new ReferenceGC();
        objA.instance=objB;
        objB.instance=objA;

        objA=null;
        objB=null;
        System.gc();
    }

}
