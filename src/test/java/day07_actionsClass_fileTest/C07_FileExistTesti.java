package day07_actionsClass_fileTest;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;

import java.nio.file.Paths;

public class C07_FileExistTesti {

    @Test
    public void test01(){
        // Calistigimiz package icerisinde
        // text.txt isimli bir file oldugunu test edin
        String dinamikDosyaYolu = System.getProperty("user.dir")+
                "/src/test/java/day07_actionsClass_fileTest/text.txt" ;
        Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));
    }
}