void main(){
    int alvo = 30;
    int indice = -1;

    // Busca Linear ArrayList
    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
    for(int i = 0; i< arr.size(); i++){
        if(arr.get(i) == alvo){
            indice = i;
            break;
        }
    }
    System.out.println("I: " + indice);

    System.out.println(arr.contains(30));
    System.out.println(arr.indexOf(30));

    // Busca Linear
    int[] arr1 = {10, 20, 30, 40, 50};
    int indice1 = -1;
    for(int i = 0; i< arr1.length; i++){
        if(arr1[i] == alvo){
            indice1 = i;
            break;
        }
    }
    System.out.println("Indice: " + indice1);


    // Busca Binária
    int[] arr2 = {10, 20, 30, 40, 50};
    int alvo2 = 40;

    int inicio = 0;
    int fim = arr2.length - 1;
    int indice2 = -1;

    while (inicio <= fim){
        int meio = (inicio + fim) / 2;
        if(arr.get(meio) == alvo2){
            indice2 = meio;
            break;
        }else if(arr.get(meio) < alvo2){
            inicio = meio + 1;
        }else{
            fim = meio + 1;
        }
    }

    System.out.println("Indice: " + indice2);
}