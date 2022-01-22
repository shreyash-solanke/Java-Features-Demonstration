package com.demo.GreatestCommonDivisor;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This class contains methods which helps setting up the data required to demonstrate Multi-threading.
 * @version 1.0.0
 * @author Shreyash Solunke
 */
public class GCDProcessor {

    List<IntegerPair> pairList;

    public GCDProcessor() {
        pairList = new ArrayList<>();
    }

    /**
     * This class opens file from resources folder and parses the comma separated integers
     * For full list of numbers, see <a href="../../../../src/main/resources/InputFile.txt">InputFile.txt </a> file.
     */
    public void getInputDatafromFile() {

        try (InputStream inputStream = getClass().getResourceAsStream("/InputFile.txt");
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            reader.lines().forEach(line -> {
                String data = line;
                String[] numbers = data.split(",");
                pairList.add(new IntegerPair(Integer.valueOf(numbers[0]), Integer.valueOf(numbers[1])));
            });
        }
        catch (Exception e) {
            System.out.println("Error reading data from the file. Please check file exists on given path!");
            e.printStackTrace();
        }

    }

    /**
     * This method finds the size of integer pairs which can be passed to individual threads
     * Based on the size, the integer list is divided in equal parts and processed individually
     * As each thread processes different elements of the array, and list is not modified,
     * there is no need to synchronize this list for concurrent access.
     * It waits till all threads finish their processing and then returns.
     * @param threadNum - Total number of threads launched
     * @see CalcThread
     * @see IntegerPair
     */
    public void handleList(int threadNum) {
        List<IntegerPair> data = this.pairList;
        int length = data.size();
        int tl = length % threadNum == 0 ? length / threadNum : (length
                / threadNum + 1);

        Thread[] threadArr = new Thread[threadNum];

        for (int i = 0; i < threadNum; i++) {
            int end = (i + 1) * tl;
            CalcThread thread = new CalcThread("thread[" + (i + 1) + "] ", data, i * tl, end > length ? length : end);
            thread.start();
            threadArr[i] = thread;
        }

        //Wait for all threads to finish
        for (Thread thread: threadArr) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
