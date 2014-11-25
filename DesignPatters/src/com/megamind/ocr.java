package com.megamind;

//import net.sourceforge.tess4j.Tesseract;
import org.junit.Test;

import java.io.File;

/**
 * Created by gump
 * on 2014/4/24.
 * on 18:32
 * Professional people to do professional things
 */
public class ocr {
    @Test
    public void userOcr(){
        File imageFile = new File("C:\\Users\\Administrator\\Desktop\\信贷系统录入界面\\个人业务\\一、新增申请\\7.bmp");
        //Tesseract instance = Tesseract.getInstance();  // JNA Interface Mapping
        // Tesseract1 instance = new Tesseract1(); // JNA Direct Mapping

        try {
            String result = "";//instance.doOCR(imageFile);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
