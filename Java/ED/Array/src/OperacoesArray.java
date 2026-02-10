void main() {

    ArrayList<Integer> idades = new ArrayList<>();

    // Push (Add no final)
    idades.add(10);
    idades.add(20);
    idades.add(30);

    System.out.println(idades);

    // Pop (Remover último)
    idades.remove(idades.size() - 1);
    System.out.println(idades);

    // Shift (Remover primeiro)
    idades.remove(0);

    // Unshift (Add no inicio)
    idades.add(0, 32);

    idades.add(1);
    idades.add(3);
    idades.add(8);

    System.out.println(idades);

    // Set (Substituir)
    idades.set(2, 99);
    System.out.println(idades);

    // Slice (Copiar parte)
    // (Apenas mostra uma parte da lista original, sem alterar ou criar copia)
    List<Integer> parteIdades = idades.subList(1, 3);
    // (Cria um novo array)
    List<Integer> parte = new ArrayList<>(idades.subList(1, 3));

    System.out.println(parteIdades);
    System.out.println(parte);

    // Splice (Remover/inserir no meio)
    idades.remove(1);
    idades.add(1, 99);

    // Concat
    ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 2));
    ArrayList<Integer> b1 = new ArrayList<>(Arrays.asList(3, 4));

    ArrayList<Integer> c1 = new ArrayList<>();
    c1.addAll(a1);
    c1.addAll(b1);
    System.out.println("Concat ArrayList: " + c1);

    int [] a = {1,2 };
    int [] b = {11,12 };
    int[] c = new int[a.length + b.length];

    System.arraycopy(a, 0, c, 0, a.length);
    System.arraycopy(b, 0, c, a.length, b.length);
    for (int item : c){
        System.out.println(item);
    }

    // Map (Operação não altera o array)

    ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3));
   /* Dessa forma altera o array original

    arr1.stream()
            .map(x -> x * 2)
            .collect(Collectors.toList()); */

    int[] arr = {1, 2, 3};
    Arrays.stream(arr)
            .map(x -> x*2)
            .forEach(System.out::println);


    // Filter
    Arrays.stream(arr)
            .filter(x -> x >1)
            .forEach(System.out::println);
    List<Integer> filtrando =
            arr1.stream()
                    .filter(x -> x > 1)
                    .toList();


    // Reduce
    int soma = Arrays.stream(arr)
            .reduce(0, Integer::sum);
    System.out.println("Reduce: " + soma);


    // Find
    OptionalInt num =
            Arrays.stream(arr)
                    .filter(x -> x >2)
                    .findFirst();
    System.out.println("Find: " + num);
    num.ifPresent(System.out::println);


    // Some
    boolean existe = Arrays.stream(arr)
            .anyMatch(x -> x > 2);
    boolean todos = Arrays.stream(arr)
                    .allMatch(x -> x > 0);
    System.out.println("Some: " + existe);
    System.out.println("Every: " + todos);


}
