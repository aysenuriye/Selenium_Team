package day07_actionsClass_fileTest;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class C05_DinamikDosyaYolu {
    @Test
    public void test1(){

        //Masaüstünde tdeDealta.doc. isimli bir dosya bulunduğunu test edin

        String dosyaYolu=System.getProperty("user.home")+ "\\OneDrive\\Masaüstü\\Thedelta.docx";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }
}
