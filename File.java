import java.io.*;

public class File {
    public static String[][] books(String item){
        String book[][]={};
        BufferedReader reader = null;
        try {
            java.io.File file = new java.io.File(item+".txt");
            String line;
            reader = new BufferedReader(new FileReader(file));
            int n = 0;
            while (reader.readLine() != null) {
                n++;
            }
            reader = new BufferedReader(new FileReader(file));
            book = new String[n][4];
            int count = 0;
            while ((line = reader.readLine()) != null) {
                String[] info = line.split("&");
                book[count] = info;
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return book;
    }
    public static boolean AddBook(String title, String author, String isbn, String lang, String item){
        try
        {
            java.io.File file = new java.io.File(item+".txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(title + "&" + author + "&" + isbn + "&" + lang );
            writer.newLine();
            writer.close();
            return true;
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File Not Found");
            System.exit( 1 );
        }
        catch(IOException e)
        {
            System.out.println("Something messed up");
            System.exit( 1 );
        }
        return false;
    }
}
