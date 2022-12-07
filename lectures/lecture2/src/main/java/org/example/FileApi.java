package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
/*
isHidden(): возвращает истину, если каталог или файл является скрытым
length(): возвращает размер файла в байтах
lastModified(): возвращает время последнего изменения файла или каталога
list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
listFiles(): возвращает массив файлов и подкаталогов, которые находятся
в определенном каталоге
mkdir(): создает новый каталог
renameTo(File dest): переименовывает файл или каталог
length(): возвращает размер файла в байтах
lastModified(): возвращает время последнего изменения
файла или каталога
list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
listFiles(): возвращает массив файлов и подкаталогов, которые
находятся в определенном каталоге
mkdir(): создает новый каталог
renameTo(File dest): переименовывает файл или каталог
 */

public class FileApi {
    public static void main(String[] args) {
        String line = "empty";
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File file = new File(pathFile);
            if (file.createNewFile()) {
                System.out.println("file created");

            } else {
                BufferedReader bufReader = new BufferedReader(new FileReader(file));
                System.out.println("file exists");
                line = bufReader.readLine();
                bufReader.close();
            }
            System.out.println("Try block");
            System.out.println(file.getAbsolutePath());

        } catch (Exception e) {
            System.out.println("Caught Exception");
        } finally {
            System.out.println(line);
        }


    }
}
