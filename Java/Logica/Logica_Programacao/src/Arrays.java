public class Arrays {
    void declaracaoArray() {
        int[] a = new int[4];
        int[] b;
        b = new int[4];
        int[] c = new int[10], d = new int[11];

        int[] e = {1, 2, 3};

        int[] f;
        f = new int[3];
        f [0] = 1;
        f [1] = 14;
        f [2] = 13;

        System.out.println("Meu array f: ");
        for(int num : f){
            System.out.println(num);
        }

        System.out.println("Tamanho do array: " + f.length);
    }
}
