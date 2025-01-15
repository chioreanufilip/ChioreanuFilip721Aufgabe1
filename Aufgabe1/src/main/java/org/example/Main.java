package org.example;
import java.util.*;
import java.io.*;

public class Main {
//    public enum haus{caisa,shaorma,unu}
    Main(){}
    public static void main(String[] args) {
    Main main = new Main();
//    List<Mitglied> mitglieds=main.readFile();
//    for(Mitglied mitglied:mitglieds){
//        System.out.println(mitglied.name);
//    }
//        main.showWithLetter();
//        main.writeToFile();
        main.showafterDate();

    }
    public List<Mitglied> readFile(){
        List<Mitglied> students = new ArrayList<Mitglied>();
        String line;
//        haus ka = haus.caisa;
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\chior\\IdeaProjects\\ChioreanuFilip721Aufgabe1\\Aufgabe1\\src\\main\\java\\org\\example\\evenimente.tsv"))){
            br.readLine();
            while ((line = br.readLine()) != null ) {
//                System.out.println(line);
                String[] tokens = line.split("\t");
                students.add(new Mitglied(Integer.valueOf(tokens[0]),tokens[1],Haus.valueOf(tokens[2]),tokens[3],String.valueOf(tokens[4])));

//                }
            }
            return students;

        }
        catch(IOException e){ return students;}
    }
    public void showWithLetter(){
        List<Mitglied> students = readFile();
        System.out.println("Tell me the letter the name should begin with: ");
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.next();
        letter = letter.toUpperCase();
//        List<Mitglied> mit = new ArrayList<>();
        for (Mitglied mitglied : students) {
            if(mitglied.getName().substring(0,1).equals(letter)){
//                if(!mit.contains(mitglied)){
//                    mit.add(mitglied);
//                }
                System.out.println(mitglied.getName());
            }
        }
//        for(Mitglied mitglied : mit){
//            System.out.println(mitglied.getName());
//        }
    }

    public void showafterDate(){
        List<Mitglied> students = readFile();
        Mitglied[] stu = students.toArray(new Mitglied[students.size()]);
//        List<Student> students1 = students.sort(Collections.)
        Arrays.sort(stu,Comparator.comparing(Mitglied::getDate));
        students.sort(Comparator.comparing(Mitglied::getName));
        for(Mitglied student : stu){
            System.out.println(student.getDate()+": "+student.getName()+"-"+student.getEreignis());
        }
    }

public void writeToFile(){
List<Mitglied> students = readFile();
int stark=0;
int lan=0;
int targaryen=0;
int baratheon=0;
int greyjoy=0;
int martell=0;
int tyrell=0;
List<String> lista=new ArrayList<>();
for(Mitglied mitglied : students){
    if(mitglied.getHaus().equals(Haus.Stark)&&!lista.contains(mitglied.getEreignis())){
        lista.add(mitglied.getEreignis());
        stark+=1;
    }
    if(mitglied.getHaus().equals(Haus.Targaryen)&&!lista.contains(mitglied.getEreignis())){
        lista.add(mitglied.getEreignis());
        targaryen+=1;
    }
    if(mitglied.getHaus().equals(Haus.Baratheon)&&!lista.contains(mitglied.getEreignis())){
        lista.add(mitglied.getEreignis());
        baratheon+=1;
    }
    if(mitglied.getHaus().equals(Haus.Lannister)&&!lista.contains(mitglied.getEreignis())){
        lista.add(mitglied.getEreignis());
        lan+=1;
    }
    if(mitglied.getHaus().equals(Haus.Greyjoy)&&!lista.contains(mitglied.getEreignis())){
        lista.add(mitglied.getEreignis());
        greyjoy+=1;
    }
    if(mitglied.getHaus().equals(Haus.Martell)&&!lista.contains(mitglied.getEreignis())){
        lista.add(mitglied.getEreignis());
        martell+=1;
    }
    if(mitglied.getHaus().equals(Haus.Tyrell)&&!lista.contains(mitglied.getEreignis())){
        lista.add(mitglied.getEreignis());
        tyrell+=1;
    }
    Integer[] haus={stark,lan,targaryen,baratheon,greyjoy,martell,tyrell};
    Arrays.sort(haus,Collections.reverseOrder());

    try(FileWriter writer = new FileWriter("C:\\Users\\chior\\IdeaProjects\\ChioreanuFilip721Aufgabe1\\Aufgabe1\\src\\main\\java\\org\\example\\ereigniss.txt")){
        for(Integer i : haus){
            if(i==stark){
                writer.append("Stark#"+i+"\n");
            }
            else if(i==lan){
                writer.append("Lannister#"+i+"\n");
            }
            else if(i==targaryen){
                writer.append("Targaryen#"+i+"\n");
            }
            else if(i==baratheon){
                writer.append("Baratheon#"+i+"\n");
            }
            else if(i==greyjoy){
                writer.append("Greyjoy#"+i+"\n");
            }
            else if(i==martell){
                writer.append("Martell#"+i+"\n");
            }
            else if(i==tyrell){
                writer.append("Tyrell#"+i+"\n");
            }
        }
    }
    catch (IOException e){
        e.printStackTrace();
    }
}
}
}