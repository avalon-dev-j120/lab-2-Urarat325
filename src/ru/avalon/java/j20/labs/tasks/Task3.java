package ru.avalon.java.j20.labs.tasks;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import ru.avalon.java.j20.labs.Task;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;

/**
 * Задание №3
 *
 * <p>
 * Тема: "Потоковый ввод-вывод. Чтение и запись данных с использованием
 * буферизованных типов данных".
 */
public class Task3 implements Task {

    @Override
    public void run() throws IOException {
        File input = new File("assets/countries.txt");
        File output = new File("countries_buffered_mode_output.txt");
        Collection<String> lines = read(input);
        write(output, lines);
        /*
         * TODO(Студент): Выполнить задание №3
         *
         * 1. Реализовать метод read.
         *    При чтении файла следует пользоваться типами данных:
         *    FileReader и BufferedReader.
         *
         * 2. Реализовать метод write.
         *    При реализации метода следует пользоваться типами данных:
         *    PrintWriter.
         *
         * 3. С использованием отладчика проверить корректность работы программы.
         */
    }

    /**
     * Выполняет чтение указанного файла в коллекцию строк.
     *
     * <p>
     * Каждый элемент коллекции представляет собой отдельную строку файла.
     *
     * @param file файл
     * @return содержимое файла в виде текста.
     * @throws IOException в случае ошибок ввода-вывода.
     */
    private Collection<String> read(File file) throws IOException {

        try (BufferedReader buf = new BufferedReader(new FileReader(file), 256)) {
            ByteArrayOutputStream uno = new ByteArrayOutputStream(256) {
                int length = 0;
                while ((length = fils.read(buf)) != -1){
                    
                }
            }
        }
            /**
             * Выполняет запись коллекции строковых элементов в файл.
             *
             * <p>
             * Каждый элемент коллекции должен быть записан в файл отдельной
             * строкой.
             *
             * @param file файл
             * @param collection коллекция строк
             * @throws IOException в случае ошибок ввода-вывода.
             */
    

    private void write(File file, Collection<String> collection) throws IOException {
        throw new UnsupportedOperationException("Not implemented yet!");
    }
}
