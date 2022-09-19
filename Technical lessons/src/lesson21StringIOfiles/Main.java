package lesson21StringIOfiles;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
Song song = new Song("Nothing else matter", "Metallica", "So close, no matter how far\n" +
        "Couldn't be much more from the heart\n" +
        "Forever trusting who we are\n" +
        "And nothing else matters\n" +
        "Never opened myself this way\n" +
        "Life is ours, we live it our way\n" +
        "All these words I don't just say\n" +
        "And nothing else matters");
FileWriter fileWriter = new FileWriter("song.txt");
fileWriter.write(song.getTitle()+"\n");
fileWriter.write(song.getAuthor()+"\n");
fileWriter.write(song.getText()+"\n");
fileWriter.close();
        System.out.println(song);
    }
}
