import java.lang.String;
import java.io.File;
import Random.util.java;
import java.io.*;

public class Ex2_1 {

    public static String[] createTextFiles(int n, int seed, int bound)
    {
        String fileNames[n];
        String fName = "file_";
        File newFile;
        FileWriter fWriter;
        for (int i = 0; i < n; i++)
        {
            newFile = new File(fName + i);
            fWriter = new FileWriter(newFile);
            for (int j = 0; j < Random(long seed); j++)// Random(long seed) is number of lines in file.
            {
                fWriter.write("Hello World\n");
            }
            newFile.close();
            fileName[i] = fName;
        }
        return fileNames;
    }

    public static int getNumOfLines(String[] fileNames)
    {
        int numOfLines = 0;
        FileInputStream inputStream;
        char c = '0';
        for (int i = 0; fileNames[i] != null; i++) // Is it legal?
        {
            try {
                inputStream = new FileInputStream(fileName[i]);
                c = inputStream.read();
                while(c != -1) ///////////////problem*************** c can't be -1 because it's char
                {
                    c = inputStream.read();
                    if (c == '\n'){
                        numOfLines++;
                    }
                }
            } catch (IOException e) { /// Right now xception happens every time because i dont stop reading
                e.printStackTrace();
            }
            inputStream.close();
        }
        return numOfLines++;
    }

    public int getNumOfLinesThreads(String[] fileNames)
    {
        return 0;
    }

    public int getNumOfLinesThreadPool(String[] fileNames)
    {
        return 0;
    }
}
