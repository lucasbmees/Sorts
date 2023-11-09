import java.util.Random;

public class Insertion {
    static int trocas = 0;
    static long interacao = 0;

    public static int getTrocas() {
        return trocas;
    }

    public static long getInteracao() {
        return interacao;
    }

    public int tamanhoLista(int[] lista) {
        interacao++;
        int tamanho = 0;
        for (int itens : lista) {
            tamanho++;
            interacao++;
        }
        return tamanho;
    }

    public static void InsertionSort(int[] lista){
        Insertion insertion1 = new Insertion();
        int auxiliar;
        int j;

        for(int i = 1; i < insertion1.tamanhoLista(lista); i++){
            auxiliar = lista[i];
            j = i-1;
            interacao++;
            while(j >= 0 && lista[j]> auxiliar){
                lista[j + 1] = lista[j];
                j--;
                trocas++;
                interacao++;
            }
            lista[j + 1] = auxiliar;
            trocas++;
        }
    }

    public static void main(String[] args) {
        long tempoInicial;
        long tempoFinal;

        long semente1 = 999;
        long semente2 = 998;
        long semente3 = 997;
        long semente4 = 996;
        long semente5 = 995;

        Random random1 = new Random(semente1);
        Random random2 = new Random(semente2);
        Random random3 = new Random(semente3);
        Random random4 = new Random(semente4);
        Random random5 = new Random(semente5);

        int[] lista50 = new int[50];
        int[] lista500 = new int[500];
        int[] lista1000 = new int[1000];
        int[] lista5000 = new int[5000];
        int[] lista10000 = new int[10000];

        //Lista aleatória com 50
        trocas = 0;
        interacao = 0;
        for (int i = 0; i < 50; i++) {
            lista50[i] = random1.nextInt(1000);
        }

        System.out.println("Lista de tamanho " + 50 + " antes da ordenação:");
        for (int item : lista50) {
            System.out.print(item + " ");
        }

        System.out.println();

        tempoInicial = System.currentTimeMillis();
        InsertionSort(lista50);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Lista de tamanho " + 50 + " ordenado:");
        for (int item : lista50) {
            System.out.print(item + " ");
        }
        System.out.println("\nNúmero de trocas: " + getTrocas());
        System.out.println("Número de interações: " + getInteracao());
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + "ms");
        System.out.println();
        System.out.println();


        //Lista aleatória com 50
        trocas = 0;
        interacao = 0;
        for (int i = 0; i < 50; i++) {
            lista50[i] = random2.nextInt(1000);
        }

        System.out.println("Lista de tamanho " + 50 + " antes da ordenação:");
        for (int item : lista50) {
            System.out.print(item + " ");
        }

        System.out.println();

        tempoInicial = System.currentTimeMillis();
        InsertionSort(lista50);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Lista de tamanho " + 50 + " ordenado:");
        for (int item : lista50) {
            System.out.print(item + " ");
        }
        System.out.println("\nNúmero de trocas: " + getTrocas());
        System.out.println("Número de interações: " + getInteracao());
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + "ms");
        System.out.println();
        System.out.println();


        //Lista aleatória com 50
        trocas = 0;
        interacao = 0;
        for (int i = 0; i < 50; i++) {
            lista50[i] = random3.nextInt(1000);
        }

        System.out.println("Lista de tamanho " + 50 + " antes da ordenação:");
        for (int item : lista50) {
            System.out.print(item + " ");
        }

        System.out.println();

        tempoInicial = System.currentTimeMillis();
        InsertionSort(lista50);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Lista de tamanho " + 50 + " ordenado:");
        for (int item : lista50) {
            System.out.print(item + " ");
        }
        System.out.println("\nNúmero de trocas: " + getTrocas());
        System.out.println("Número de interações: " + getInteracao());
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + "ms");
        System.out.println();
        System.out.println();


        //Lista aleatória com 50
        trocas = 0;
        interacao = 0;
        for (int i = 0; i < 50; i++) {
            lista50[i] = random4.nextInt(1000);
        }

        System.out.println("Lista de tamanho " + 50 + " antes da ordenação:");
        for (int item : lista50) {
            System.out.print(item + " ");
        }

        System.out.println();

        tempoInicial = System.currentTimeMillis();
        InsertionSort(lista50);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Lista de tamanho " + 50 + " ordenado:");
        for (int item : lista50) {
            System.out.print(item + " ");
        }
        System.out.println("\nNúmero de trocas: " + getTrocas());
        System.out.println("Número de interações: " + getInteracao());
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + "ms");
        System.out.println();
        System.out.println();


        //Lista aleatória com 50
        trocas = 0;
        interacao = 0;
        for (int i = 0; i < 50; i++) {
            lista50[i] = random5.nextInt(1000);
        }

        System.out.println("Lista de tamanho " + 50 + " antes da ordenação:");
        for (int item : lista50) {
            System.out.print(item + " ");
        }

        System.out.println();

        tempoInicial = System.currentTimeMillis();
        InsertionSort(lista50);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Lista de tamanho " + 50 + " ordenado:");
        for (int item : lista50) {
            System.out.print(item + " ");
        }
        System.out.println("\nNúmero de trocas: " + getTrocas());
        System.out.println("Número de interações: " + getInteracao());
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + "ms");
        System.out.println();
        System.out.println();





        //Lista aleatória com 500
        trocas = 0;
        interacao = 0;
        for (int i = 0; i < 500; i++) {
            lista500[i] = random1.nextInt(1000);
        }

        System.out.println("Lista de tamanho " + 500 + " antes da ordenação:");
        for (int item : lista500) {
            System.out.print(item + " ");
        }

        System.out.println();

        tempoInicial = System.currentTimeMillis();
        InsertionSort(lista500);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Lista de tamanho " + 500 + " ordenado:");
        for (int item : lista500) {
            System.out.print(item + " ");
        }
        System.out.println("\nNúmero de trocas: " + getTrocas());
        System.out.println("Número de interações: " + getInteracao());
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + "ms");
        System.out.println();
        System.out.println();


        //Lista aleatória com 500
        trocas = 0;
        interacao = 0;
        for (int i = 0; i < 500; i++) {
            lista500[i] = random2.nextInt(1000);
        }

        System.out.println("Lista de tamanho " + 500 + " antes da ordenação:");
        for (int item : lista500) {
            System.out.print(item + " ");
        }

        System.out.println();

        tempoInicial = System.currentTimeMillis();
        InsertionSort(lista500);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Lista de tamanho " + 500 + " ordenado:");
        for (int item : lista500) {
            System.out.print(item + " ");
        }
        System.out.println("\nNúmero de trocas: " + getTrocas());
        System.out.println("Número de interações: " + getInteracao());
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + "ms");
        System.out.println();
        System.out.println();


        //Lista aleatória com 500
        trocas = 0;
        interacao = 0;
        for (int i = 0; i < 500; i++) {
            lista500[i] = random3.nextInt(1000);
        }

        System.out.println("Lista de tamanho " + 500 + " antes da ordenação:");
        for (int item : lista500) {
            System.out.print(item + " ");
        }

        System.out.println();

        tempoInicial = System.currentTimeMillis();
        InsertionSort(lista500);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Lista de tamanho " + 500 + " ordenado:");
        for (int item : lista500) {
            System.out.print(item + " ");
        }
        System.out.println("\nNúmero de trocas: " + getTrocas());
        System.out.println("Número de interações: " + getInteracao());
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + "ms");
        System.out.println();
        System.out.println();


        //Lista aleatória com 500
        trocas = 0;
        interacao = 0;
        for (int i = 0; i < 500; i++) {
            lista500[i] = random4.nextInt(1000);
        }

        System.out.println("Lista de tamanho " + 500 + " antes da ordenação:");
        for (int item : lista500) {
            System.out.print(item + " ");
        }

        System.out.println();

        tempoInicial = System.currentTimeMillis();
        InsertionSort(lista500);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Lista de tamanho " + 500 + " ordenado:");
        for (int item : lista500) {
            System.out.print(item + " ");
        }
        System.out.println("\nNúmero de trocas: " + getTrocas());
        System.out.println("Número de interações: " + getInteracao());
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + "ms");
        System.out.println();
        System.out.println();


        //Lista aleatória com 500
        trocas = 0;
        interacao = 0;
        for (int i = 0; i < 500; i++) {
            lista500[i] = random5.nextInt(1000);
        }

        System.out.println("Lista de tamanho " + 500 + " antes da ordenação:");
        for (int item : lista500) {
            System.out.print(item + " ");
        }

        System.out.println();

        tempoInicial = System.currentTimeMillis();
        InsertionSort(lista500);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Lista de tamanho " + 500 + " ordenado:");
        for (int item : lista500) {
            System.out.print(item + " ");
        }
        System.out.println("\nNúmero de trocas: " + getTrocas());
        System.out.println("Número de interações: " + getInteracao());
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + "ms");
        System.out.println();
        System.out.println();





        //Lista aleatória com 1000
        trocas = 0;
        interacao = 0;
        for (int i = 0; i < 1000; i++) {
            lista1000[i] = random1.nextInt(1000);
        }

        System.out.println("Lista de tamanho " + 1000 + " antes da ordenação:");
        for (int item : lista1000) {
            System.out.print(item + " ");
        }

        System.out.println();

        tempoInicial = System.currentTimeMillis();
        InsertionSort(lista1000);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Lista de tamanho " + 1000 + " ordenado:");
        for (int item : lista1000) {
            System.out.print(item + " ");
        }
        System.out.println("\nNúmero de trocas: " + getTrocas());
        System.out.println("Número de interações: " + getInteracao());
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + "ms");
        System.out.println();
        System.out.println();


        //Lista aleatória com 1000
        trocas = 0;
        interacao = 0;
        for (int i = 0; i < 1000; i++) {
            lista1000[i] = random2.nextInt(1000);
        }

        System.out.println("Lista de tamanho " + 1000 + " antes da ordenação:");
        for (int item : lista1000) {
            System.out.print(item + " ");
        }

        System.out.println();

        tempoInicial = System.currentTimeMillis();
        InsertionSort(lista1000);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Lista de tamanho " + 1000 + " ordenado:");
        for (int item : lista1000) {
            System.out.print(item + " ");
        }
        System.out.println("\nNúmero de trocas: " + getTrocas());
        System.out.println("Número de interações: " + getInteracao());
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + "ms");
        System.out.println();
        System.out.println();


        //Lista aleatória com 1000
        trocas = 0;
        interacao = 0;
        for (int i = 0; i < 1000; i++) {
            lista1000[i] = random3.nextInt(1000);
        }

        System.out.println("Lista de tamanho " + 1000 + " antes da ordenação:");
        for (int item : lista1000) {
            System.out.print(item + " ");
        }

        System.out.println();

        tempoInicial = System.currentTimeMillis();
        InsertionSort(lista1000);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Lista de tamanho " + 1000 + " ordenado:");
        for (int item : lista1000) {
            System.out.print(item + " ");
        }
        System.out.println("\nNúmero de trocas: " + getTrocas());
        System.out.println("Número de interações: " + getInteracao());
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + "ms");
        System.out.println();
        System.out.println();


        //Lista aleatória com 1000
        trocas = 0;
        interacao = 0;
        for (int i = 0; i < 1000; i++) {
            lista1000[i] = random4.nextInt(1000);
        }

        System.out.println("Lista de tamanho " + 1000 + " antes da ordenação:");
        for (int item : lista1000) {
            System.out.print(item + " ");
        }

        System.out.println();

        tempoInicial = System.currentTimeMillis();
        InsertionSort(lista1000);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Lista de tamanho " + 1000 + " ordenado:");
        for (int item : lista1000) {
            System.out.print(item + " ");
        }
        System.out.println("\nNúmero de trocas: " + getTrocas());
        System.out.println("Número de interações: " + getInteracao());
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + "ms");
        System.out.println();
        System.out.println();


        //Lista aleatória com 1000
        trocas = 0;
        interacao = 0;
        for (int i = 0; i < 1000; i++) {
            lista1000[i] = random5.nextInt(1000);
        }

        System.out.println("Lista de tamanho " + 1000 + " antes da ordenação:");
        for (int item : lista1000) {
            System.out.print(item + " ");
        }

        System.out.println();

        tempoInicial = System.currentTimeMillis();
        InsertionSort(lista1000);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Lista de tamanho " + 1000 + " ordenado:");
        for (int item : lista1000) {
            System.out.print(item + " ");
        }
        System.out.println("\nNúmero de trocas: " + getTrocas());
        System.out.println("Número de interações: " + getInteracao());
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + "ms");
        System.out.println();
        System.out.println();





        //Lista aleatória com 5000
        trocas = 0;
        interacao = 0;
        for (int i = 0; i < 5000; i++) {
            lista5000[i] = random1.nextInt(1000);
        }

        System.out.println("Lista de tamanho " + 5000 + " antes da ordenação:");
        for (int item : lista5000) {
            System.out.print(item + " ");
        }

        System.out.println();

        tempoInicial = System.currentTimeMillis();
        InsertionSort(lista5000);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Lista de tamanho " + 5000 + " ordenado:");
        for (int item : lista5000) {
            System.out.print(item + " ");
        }
        System.out.println("\nNúmero de trocas: " + getTrocas());
        System.out.println("Número de interações: " + getInteracao());
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + "ms");
        System.out.println();
        System.out.println();


        //Lista aleatória com 5000
        trocas = 0;
        interacao = 0;
        for (int i = 0; i < 5000; i++) {
            lista5000[i] = random2.nextInt(1000);
        }

        System.out.println("Lista de tamanho " + 5000 + " antes da ordenação:");
        for (int item : lista5000) {
            System.out.print(item + " ");
        }

        System.out.println();

        tempoInicial = System.currentTimeMillis();
        InsertionSort(lista5000);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Lista de tamanho " + 5000 + " ordenado:");
        for (int item : lista5000) {
            System.out.print(item + " ");
        }
        System.out.println("\nNúmero de trocas: " + getTrocas());
        System.out.println("Número de interações: " + getInteracao());
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + "ms");
        System.out.println();
        System.out.println();


        //Lista aleatória com 5000
        trocas = 0;
        interacao = 0;
        for (int i = 0; i < 5000; i++) {
            lista5000[i] = random3.nextInt(1000);
        }

        System.out.println("Lista de tamanho " + 5000 + " antes da ordenação:");
        for (int item : lista5000) {
            System.out.print(item + " ");
        }

        System.out.println();

        tempoInicial = System.currentTimeMillis();
        InsertionSort(lista5000);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Lista de tamanho " + 5000 + " ordenado:");
        for (int item : lista5000) {
            System.out.print(item + " ");
        }
        System.out.println("\nNúmero de trocas: " + getTrocas());
        System.out.println("Número de interações: " + getInteracao());
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + "ms");
        System.out.println();
        System.out.println();


        //Lista aleatória com 5000
        trocas = 0;
        interacao = 0;
        for (int i = 0; i < 5000; i++) {
            lista5000[i] = random4.nextInt(1000);
        }

        System.out.println("Lista de tamanho " + 5000 + " antes da ordenação:");
        for (int item : lista5000) {
            System.out.print(item + " ");
        }

        System.out.println();

        tempoInicial = System.currentTimeMillis();
        InsertionSort(lista5000);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Lista de tamanho " + 5000 + " ordenado:");
        for (int item : lista5000) {
            System.out.print(item + " ");
        }
        System.out.println("\nNúmero de trocas: " + getTrocas());
        System.out.println("Número de interações: " + getInteracao());
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + "ms");
        System.out.println();
        System.out.println();


        //Lista aleatória com 5000
        trocas = 0;
        interacao = 0;
        for (int i = 0; i < 5000; i++) {
            lista5000[i] = random5.nextInt(1000);
        }

        System.out.println("Lista de tamanho " + 5000 + " antes da ordenação:");
        for (int item : lista5000) {
            System.out.print(item + " ");
        }

        System.out.println();

        tempoInicial = System.currentTimeMillis();
        InsertionSort(lista5000);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Lista de tamanho " + 5000 + " ordenado:");
        for (int item : lista5000) {
            System.out.print(item + " ");
        }
        System.out.println("\nNúmero de trocas: " + getTrocas());
        System.out.println("Número de interações: " + getInteracao());
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + "ms");
        System.out.println();
        System.out.println();





        //Lista aleatória com 10000
        trocas = 0;
        interacao = 0;
        for (int i = 0; i < 10000; i++) {
            lista10000[i] = random1.nextInt(1000);
        }

        System.out.println("Lista de tamanho " + 10000 + " antes da ordenação:");
        for (int item : lista10000) {
            System.out.print(item + " ");
        }

        System.out.println();

        tempoInicial = System.currentTimeMillis();
        InsertionSort(lista10000);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Lista de tamanho " + 10000 + " ordenado:");
        for (int item : lista10000) {
            System.out.print(item + " ");
        }
        System.out.println("\nNúmero de trocas: " + getTrocas());
        System.out.println("Número de interações: " + getInteracao());
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + "ms");
        System.out.println();
        System.out.println();


        //Lista aleatória com 10000
        trocas = 0;
        interacao = 0;
        for (int i = 0; i < 10000; i++) {
            lista10000[i] = random2.nextInt(1000);
        }

        System.out.println("Lista de tamanho " + 10000 + " antes da ordenação:");
        for (int item : lista10000) {
            System.out.print(item + " ");
        }

        System.out.println();

        tempoInicial = System.currentTimeMillis();
        InsertionSort(lista10000);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Lista de tamanho " + 10000 + " ordenado:");
        for (int item : lista10000) {
            System.out.print(item + " ");
        }
        System.out.println("\nNúmero de trocas: " + getTrocas());
        System.out.println("Número de interações: " + getInteracao());
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + "ms");
        System.out.println();
        System.out.println();


        //Lista aleatória com 10000
        trocas = 0;
        interacao = 0;
        for (int i = 0; i < 10000; i++) {
            lista10000[i] = random3.nextInt(1000);
        }

        System.out.println("Lista de tamanho " + 10000 + " antes da ordenação:");
        for (int item : lista10000) {
            System.out.print(item + " ");
        }

        System.out.println();

        tempoInicial = System.currentTimeMillis();
        InsertionSort(lista10000);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Lista de tamanho " + 10000 + " ordenado:");
        for (int item : lista10000) {
            System.out.print(item + " ");
        }
        System.out.println("\nNúmero de trocas: " + getTrocas());
        System.out.println("Número de interações: " + getInteracao());
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + "ms");
        System.out.println();
        System.out.println();


        //Lista aleatória com 10000
        trocas = 0;
        interacao = 0;
        for (int i = 0; i < 10000; i++) {
            lista10000[i] = random4.nextInt(1000);
        }

        System.out.println("Lista de tamanho " + 10000 + " antes da ordenação:");
        for (int item : lista10000) {
            System.out.print(item + " ");
        }

        System.out.println();

        tempoInicial = System.currentTimeMillis();
        InsertionSort(lista10000);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Lista de tamanho " + 10000 + " ordenado:");
        for (int item : lista10000) {
            System.out.print(item + " ");
        }
        System.out.println("\nNúmero de trocas: " + getTrocas());
        System.out.println("Número de interações: " + getInteracao());
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + "ms");
        System.out.println();
        System.out.println();


        //Lista aleatória com 10000
        trocas = 0;
        interacao = 0;
        for (int i = 0; i < 10000; i++) {
            lista10000[i] = random5.nextInt(1000);
        }

        System.out.println("Lista de tamanho " + 10000 + " antes da ordenação:");
        for (int item : lista10000) {
            System.out.print(item + " ");
        }

        System.out.println();

        tempoInicial = System.currentTimeMillis();
        InsertionSort(lista10000);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Lista de tamanho " + 10000 + " ordenado:");
        for (int item : lista10000) {
            System.out.print(item + " ");
        }
        System.out.println("\nNúmero de trocas: " + getTrocas());
        System.out.println("Número de interações: " + getInteracao());
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + "ms");
        System.out.println();
        System.out.println();
    }
}