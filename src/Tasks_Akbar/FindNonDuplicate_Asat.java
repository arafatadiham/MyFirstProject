package Tasks_Akbar;

public class FindNonDuplicate_Asat {

    public static void main(String[] args) {

        //   find out unique character .   interview question !

        String st ="Love is Love  ";

        for (int i = 0; i < st.length(); i++) {
            int counter = 0;
            for (int j = 0; j < st.length(); j++) {
             if(st.charAt(j)==st.charAt(i)){
                 counter++;
                }
            }
            if(counter == 1){
                System.out.println(st.charAt(i));
            }

        }

    }
}


