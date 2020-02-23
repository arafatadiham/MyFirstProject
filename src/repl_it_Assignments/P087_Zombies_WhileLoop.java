package repl_it_Assignments;

public class P087_Zombies_WhileLoop {
    public static void main(String[] args) {
int inhabitants=20;
        int i = 0;
        while (inhabitants != 0) {
            System.out.println("Day " + i + " " + "[" + (inhabitants) + "]");
            inhabitants = inhabitants / 2;
            ++i;
        }

        if (inhabitants == 0){
            System.out.println("---- EXTINCT ----");
        }
    }
}
