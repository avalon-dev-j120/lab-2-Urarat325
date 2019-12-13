package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Задание №2
 *
 * <p>Тема: "Потоковый ввод-вывод. Чтение и запись данных
 * в текстовом режиме".
 */
public class Task2 implements Task {

    @Override
    public void run() throws IOException {
        File input = new File("assets/countries.txt");
        File output = new File("countries_text_mode_output.txt");
        String text = read(input);
        write(output, text);
        /*
         * TODO(Студент): Выполнить задание №2
         *
         * 1. Реализовать метод read.
         *    При чтении файла следует пользоваться типами данных:
         *    Reader, FileReader.
         *    Для сохранения прочитанных данных следует пользоваться
         *    классом StringBuilder.
         *
         * 2. Реализовать метод write.
         *    При реализации метода следует пользоваться типами данных:
         *    Writer и FileWriter.
         *
         * 3. С использованием отладчика проверить корректность работы программы.
         */
    }
    private String read(File file) throws IOException {
        StringBuilder buf = new StringBuilder();
        try(Reader fils = new FileReader(file)){
            int length = 0;
            while((length =fils.read()) != -1){
                buf.append(length);
            }
        }
            catch (FileNotFoundException e){
            System.out.println("File not found");
            }
            catch (IOException e){
            System.out.println("IOexception");
            }
        return buf.toString();
    }
    /**
     * Выполняет запись текстоых данных в файл в текстовом
     * режиме.
     *
     * @param file файл
     * @param text текст
     * @throws IOException в случае ошибок ввода-вывода.
     */
    private void write(File file, String text)  {
       
        try(Writer fils = new FileWriter(file)) {
             fils.write(text);
        } 
        catch (IOException ex) {
            System.out.println("IOexception");
            Logger.getLogger(Task2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}