import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {


//Both examples underneath are just different ways you can make an array

private String[] nouns = {"tiger","istanbul","wrench","carrot","beer","microphone","korea","aardvark","mario","sewer", "eel","Winona"};
private String[] adjectives;


private static String randomElement(String[] strings){
    Random wordRandom = new Random();

    int sng = wordRandom.nextInt(strings.length);
    return strings[sng];
}


    public ServerNameGenerator(){
        adjectives = new String[12];
        adjectives[0] = "big";
        adjectives[1] = "microscopic";
        adjectives[2] = "icy";
        adjectives[3] = "icky";
        adjectives[4] = "savvy";
        adjectives[5] = "superfluous";
        adjectives[6] = "immense";
        adjectives[7] = "dazzling";
        adjectives[8] = "victorious";
        adjectives[9] = "nervous";
        adjectives[10] = "unsightly";
        adjectives[11] = "massive";
    }

    public static void main(String[] args) {
        ServerNameGenerator sng = new ServerNameGenerator();
//        System.out.println(sng.nouns);
        System.out.println(Arrays.toString(sng.adjectives));
        System.out.println(Arrays.toString(sng.nouns));

        System.out.printf("%s-%s", randomElement(sng.adjectives), randomElement(sng.nouns));
    }
}

