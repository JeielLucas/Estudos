void main(){
    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(129, 22, 3, 46, 5, 6, 7));

    System.out.println(arr);

    // Sort (Ordenação)
    Collections.sort(arr);
    System.out.println(arr);

    Collections.sort(arr, Collections.reverseOrder());
    System.out.println(arr);


    ArrayList<Pessoa> pessoas = new ArrayList<>();
    pessoas.add(new Pessoa("Lara", 53));
    pessoas.add(new Pessoa("Ana", 20));
    pessoas.add(new Pessoa("João", 30));

    pessoas.sort((a, b) -> a.idade - b.idade);

    for(Pessoa p : pessoas){
        System.out.println(p.nome + " " + p.idade);
    }
}

class Pessoa{
    String nome;
    int idade;

    Pessoa(String n, int i){
        nome = n;
        idade = i;
    }
}