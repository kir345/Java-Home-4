import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.LinkedList;






public class program{

    public static void main(String[] args) throws IOException{
        
        ArrayList<String> famil = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> soname = new ArrayList<>();
        ArrayList<String> age = new ArrayList<>();
        ArrayList<String> sex = new ArrayList<>();
        LinkedList<Integer> index = new LinkedList<>();

        String text = " ";
        FileReader reader = new FileReader("spisok.txt");
        while (reader. ready()){
            text += (char) reader. read();
        }
        reader.close();
        String [] str = text.split("\r\n");
        for (int i = 1; i < str.length; i++){
            String [] sb = str[i].split(" ");

            famil.add(sb[0] + " ");
            name.add(sb[1].substring(0, 1) + ".");
            soname.add(sb[2].substring(0, 1) + "." + " ");
            age.add(sb[3] + " ");
            sex.add(sb[4]);
            index.add(i);
        }
        
    
        //Collections.sort(index, new Comparator<Integer>() {
            //@Override
            //public int compare(Integer o1, Integer o2){
                //return o1 - o2;
            //}
        //});
        

          
        for(int i = 0; i < index.size(); i++){
            System.out.printf(famil.get(i));
            System.out.printf(name.get(i));
            System.out.printf(soname.get(i));
            System.out.printf(age.get(i).toString());
            System.out.printf(sex.get(i));
            System.out.println();
        }      
    }
}