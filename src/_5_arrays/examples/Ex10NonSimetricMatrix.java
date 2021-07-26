package _5_arrays.examples;

public class Ex10NonSimetricMatrix {
    public static void main(String[] args) {
        String[][] kidsByFamily = new String[3][];
        kidsByFamily[0] = new String[]{"John", "Latisha"};
        kidsByFamily[1] = new String[]{"Jack"};
        kidsByFamily[2] = new String[]{"Ron", "Mark", "Linda"};

        for (int i = 0; i < kidsByFamily.length; i++) {
            System.out.println("Family number " + i + " has " + kidsByFamily[i].length + " kids.");
            System.out.print("There names are: ");
            for (String name : kidsByFamily[i]) {
                System.out.print(name + " ");
            }
            System.out.println("\n");
        }
    }
}
