package com.megamind.test;

import com.megamind.creational.SenderStaticFactory;
import com.megamind.creational.factory.abstracts.SenderMailFactory;
import com.megamind.creational.factory.simple.SenderFactory;
import com.megamind.interfaces.Provider;
import com.megamind.interfaces.Sender;
import org.junit.Test;

import java.io.*;
import java.util.Random;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

/**
 * Created by gaojj
 * on 2014/4/17.
 * on 13:35
 * Good Life One Day
 */
public class SenderFactoryTest {
    @Test
    public void mainTest() {

        SenderFactory senderFactory = new SenderFactory();
        SenderStaticFactory senderStaticFactory = new SenderStaticFactory();
        for (int i = 0; i < 20; i++) {
            System.out.print(i);
            Sender sender = null;
            Sender sender1 = null;
            Random random = new Random();
            int randomInt = random.nextInt();
            if (randomInt % 2 == 0) {
                sender = senderFactory.produce("mail");
                sender1 = senderStaticFactory.produceSms();
            } else {
                sender = senderFactory.produce("sms");
                sender1 = senderStaticFactory.produceMail();
            }
            sender.send();
            sender1.send();
        }
    }

    @Test
    public void testAbstractFactory() {
        Provider provider = new SenderMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }

    /**
     * gbk to utf-8
     */
    @Test
    public void testFileEncodingTransfer() throws Exception {

        new FileOption().listFile("E:\\WeChatP\\WeChatPlat");
        /*for (File file : files) {
            FileOption fileOption = new FileOption();
            fileOption.newFile(file);
        }*/
        /**
         *
         */
    }

    class FileOption {
        public String fileInput(File file) throws IOException {
            StringBuilder stringBuilder = new StringBuilder();
            InputStreamReader isr = new InputStreamReader(new FileInputStream(
                    file), "GBK");
            int ch = 0;
            while ((ch = isr.read()) != -1) {
                stringBuilder.append((char) ch);
            }
            return stringBuilder.toString();
        }

        public void fileOut(File file, String content) throws Exception {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
            osw.write(content, 0, content.length());
            osw.flush();
        }

        public void listFile(String file) throws Exception {
            File file_dir = new File(file);


            String filename[] = file_dir.list();


            for (int i = 0; i < filename.length; i++) {
                File ft = new File(file + "//" + filename[i]);

                if (filename[i].endsWith(".java") || filename[i].endsWith(".jsp") || filename[i].endsWith(".xml") || filename[i].endsWith(".txt") || filename[i].endsWith(".html") || filename[i].endsWith(".css") || filename[i].endsWith(".sql") || filename[i].endsWith(".properties")) {
                    fileOut(ft, fileInput(ft));
                }
                if (ft.isDirectory()) {


                    listFile(file + "//" + filename[i]);


                }
            }


        }
    }

    @Test
    public void testJarMaven() throws Exception {
        String path = "E:\\WeChatP\\WeChatPlat\\WEB-INF\\lib";
        File file = new File(path);
        String[] fileNames = file.list();
        StringBuffer stringBuffer = new StringBuffer();
        for (String one : fileNames) {
            JarFile jarFile = new JarFile(path + File.separator + one);
            Manifest manifest = jarFile.getManifest();
            //System.out.println("====="+ manifest.getMainAttributes().getValue("Manifest-Version"));
//            Enumeration  enumeration = jarFile.entries();
//            while (enumeration.hasMoreElements()) {
//                JarEntry entry = (JarEntry)enumeration.nextElement();
//                String name = entry.getName();
//                if(name.equals(JarFile.MANIFEST_NAME)){
//                    Attributes attributes = entry.getAttributes();
//                    System.out.println(entry.toString());
//                    System.out.println(attributes);
//                    //System.out.println(attributes.getValue("Manifest-Version"));
//                }
//            }
            jarFile.close();
            //String groupId =
            stringBuffer.append(" <dependency>\n" +
                    "            <groupId>" + one.replace(".jar", "") + "</groupId>\n" +
                    "            <artifactId>" + one.replace(".jar", "") + "</artifactId>\n" +
                    "            <version>1.0</version>\n" +
                    "            <scope>system</scope>\n" +
                    "            <systemPath>${project.basedir}/src/main/webapp/WEB-INF/lib/" + one + "</systemPath>\n" +
                    "        </dependency>\n");

        }
        System.out.println(stringBuffer.toString());
    }
}
