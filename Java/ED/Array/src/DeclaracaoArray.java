void main() {

    // Declaração e inicialização direta do array
    int[] arr0 = {1, 2, 3};

    //Inicialização e declaração com new
    int[] arr1 = new int[]{4, 5, 6};

    //Array com tamanho 4
    int[] arr2 = new int[4];

    // Declarando primeiro, inicializar depois
    int[] arr3;
    arr3 = new int[3];

    // Declarando primeiro, inicializando com valores depois
    int[] arr4;
    arr4 = new int[]{7, 8, 9};

    // For normal para acessar valores dos objetos
    for(int i = 0; i < arr0.length; i++){
        System.out.println(arr0[i]);
    };
    System.out.println("-------------------------------------");

    // For each
    for(int item : arr1){
        System.out.println(item);
    };
    System.out.println("-------------------------------------");

    for(int item : arr2){
        System.out.println(item);
    };
    System.out.println("-------------------------------------");

    for(int item : arr3){
        System.out.println(item);
    };
    System.out.println("-------------------------------------");

    for(int item : arr4){
        System.out.println(item);
    };
    System.out.println("-------------------------------------");

    // Print de array em forma de lista [5, 6, 7]
    System.out.println(Arrays.toString(arr4));

    // ARRAY LIST
    ArrayList<Integer> idades = new ArrayList<>();
    idades.add(36);
    idades.add(37);
    System.out.println(idades);


    // ARRAYS 2 DIMENSÕES (MATRIZ)

    int[][] matriz;

    int[][] matriz1 = new int[2][3];

    int[][] matriz2 = {
            {1, 2, 3},
            {4, 5, 6}
    };

    int[][] matriz3;
    matriz3 = new int[][]{
        {1, 2, 3, 4},
        {11, 12, 13, 14},
        {21, 22, 23, 24},
        {31, 32, 33, 34}
    };


    for(int i = 0; i < matriz2.length; i++){

        for(int j = 0; j<matriz2[i].length; j++){
            System.out.println(matriz2[i][j] + " ");
        }

        System.out.println();
    }

    for(int[] linha: matriz3){
        for(int valor : linha){
            System.out.println(valor);
        }
    }



};
