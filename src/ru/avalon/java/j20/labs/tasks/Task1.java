package ru.avalon.java.j20.labs.tasks;

import java.io.ByteArrayInputStream;
import ru.avalon.java.j20.labs.Task;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Задание №1
 *
 * <p>Тема: "Потоковый ввод-вывод. Чтение и запись данных
 * в двоичном режиме".
 */
public class Task1 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        System.out.println("Выполнение task1");
        Logger.getLogger(Task1.class.getName()).log(Level.SEVERE, "проверка");
        File input = new File("assets/countries.txt");
        File output = new File("countries_binary_mode_output.txt");
        String text = read(input);
        write(output, text);

        /*
         * TODO(Студент): Выполнить задание №1
         * 1. Реализовать метод read.
         *    При чтении файла следует пользоваться типами данных:
         *    InputStream и FileInputStream.
         *    Для сохранениня прочитанных данных следует пользоваться
         *    классом ByteArrayOutputStream.
         *
         * 2. Реализовать метод write.
         *    При реализации метода следует пользоваться типами данных:
         *    OutputStream и FileOutputStream.
         *
         * 3. С использованием отладчика проверить корректность работы программы.
         */
    }

    /**
     * Выполняет чтение указанного файла в двоичном режиме.
     *
     * <p>Весь текст файла возвращается в виде одного
     * экземпляра типа {@link String}.
     *
     * @param file файл
     * @return содержимое файла в виде текста.
     * @throws IOException в случае ошибок ввода-вывода.
     */
    private String read(File file) throws IOException {
        String result = null;
        byte[] buffer = new byte[256];
        try(InputStream fils = new FileInputStream(file);
            ByteArrayOutputStream  uno = new ByteArrayOutputStream(256)){
            int length = 0;
            while ((length = fils.read(buffer)) != -1){
                uno.write(buffer, 0, length);
            }
            result = uno.toString();   
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e){
            System.out.println("IOexception");
        }
        return result;
    }
    /**
     * Выполняет запись текстоых данных в файл в двоичном
     * режиме.
     * @param file файл
     * @param text текст
     * @throws IOException в случае ошибок ввода-вывода.
     */
    private void write(File file, String text) throws IOException {
        byte[] byt = text.getBytes();
        try(OutputStream fls = new FileOutputStream(file)){
            fls.write(byt);
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println("IOexception");
            e.printStackTrace();
        }
    }
}
