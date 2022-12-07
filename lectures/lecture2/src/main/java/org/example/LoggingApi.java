package org.example;

import java.io.IOException;
import java.util.logging.*;

public class LoggingApi {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Main.class.getName());

        // хэндлеры
        ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.xml");

        // логгер
        logger.addHandler(fh);

        // форматы логгеров
        XMLFormatter xml = new XMLFormatter();
        SimpleFormatter sFormat = new SimpleFormatter();

        ch.setFormatter(xml);
        logger.log(Level.WARNING, "Тестовое логирование");
        logger.info("Тестовое логирование");


    }
}
