import java.util.Random;

public class Heap {
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

    public static void heapSort(int lista[]) {
        Heap heap1 = new Heap();
        int tamanho = heap1.tamanhoLista(lista);

        for (int i = tamanho / 2 - 1; i >= 0; i--) {
            aplicandoHeap(lista, tamanho, i);
            interacao++;
        }

        for (int i = tamanho - 1; i > 0; i--) {
            int temp = lista[0];
            lista[0] = lista[i];
            lista[i] = temp;
            trocas++;
            interacao++;

            aplicandoHeap(lista, i, 0);
        }
    }

    public static void aplicandoHeap(int lista[], int tamanho, int i) {
        int raiz = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;
        interacao++;

        if (esquerda < tamanho && lista[esquerda] > lista[raiz]) {
            raiz = esquerda;
        }
        if (direita < tamanho && lista[direita] > lista[raiz]) {
            raiz = direita;
        }

        if (raiz != i) {
            int temp = lista[i];
            lista[i] = lista[raiz];
            lista[raiz] = temp;
            trocas++;

            aplicandoHeap(lista, tamanho, raiz);
        }
    }

    public static void main(String args[]) {
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
        heapSort(lista50);
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
        heapSort(lista50);
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
        heapSort(lista50);
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
        heapSort(lista50);
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
        heapSort(lista50);
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
        heapSort(lista500);
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
        heapSort(lista500);
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
        heapSort(lista500);
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
        heapSort(lista500);
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
        heapSort(lista500);
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
        heapSort(lista1000);
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
        heapSort(lista1000);
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
        heapSort(lista1000);
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
        heapSort(lista1000);
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
        heapSort(lista1000);
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
        heapSort(lista5000);
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
        heapSort(lista5000);
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
        heapSort(lista5000);
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
        heapSort(lista5000);
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
        heapSort(lista5000);
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
        heapSort(lista10000);
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
        heapSort(lista10000);
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
        heapSort(lista10000);
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
        heapSort(lista10000);
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
        heapSort(lista10000);
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
