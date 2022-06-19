package com.solvd.computer;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.*;


public class WordsCalcUtils {
    private static final Logger LOGGER = LogManager.getLogger(WordsCalcUtils.class);

    public void utilsLesson() {

        try {
            String s = StringUtils.lowerCase(FileUtils.readFileToString(new File("src/main/resources/wordscalc.txt"))).replaceAll("[^\\da-zA-Zа-яёА-ЯЁ ]", "");
            String[] words = s.split(" ");
            Set<String> uniWords = new HashSet<>(List.of(words));
            List<String> count = new ArrayList<>();
            for (Object v : uniWords
            ) {
                count.add(v + ": " + StringUtils.countMatches(s, (CharSequence) v));
            }
            FileUtils.writeLines(new File("src/main/resources/count.txt"), count);
            LOGGER.info("Check count.txt, please!");
        } catch (IOException e) {
            LOGGER.debug(e);
        }
    }
}
