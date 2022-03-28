package com.company;

import java.util.*;

public class Main {

    public static int Hello() {
        System.out.println("""
                Отсортировать по:
                1)По возрастанияю базовой частоты процессора.
                2)По наименованию процессора.
                3)По объёму оперативной памяти.
                4)По модели видеокарты""");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        return a;
    }



    public static void main(String[] args) {
	int a = Hello();
    //int a = 1;
    ArrayList<Computer> computers = new ArrayList<Computer>();
    LinkedList<Computer> comps = new LinkedList<Computer>();
    int b = (int) Math.random();
    for (int i = 0; i < 800000; i++){
        computers.add(new Computer(new Processor("Roma J7", (int) Math.random()), new VideoCard("Kekick", "1", 1000), new Memory("DDR1", 666), new PowerSupply("KCAS", 600)));
        comps.add(new Computer(new Processor("Roma J7", (int) Math.random()), new VideoCard("Kekick", "1", 1000), new Memory("DDR1", 666), new PowerSupply("KCAS", 600)));
    }

    Comparator<Computer> compareByProcessorBaseFrequency = new Comparator<Computer>() {
        @Override
        public int compare(Computer o1, Computer o2) {
            return o1.getProcessor().getBaseFrequency() - o2.getProcessor().getBaseFrequency();
        }
    };
    Comparator<Computer> compareByProcessorName = new Comparator<Computer>() {
        @Override
        public int compare(Computer o1, Computer o2) {
            return o1.getProcessor().getName().compareTo(o2.getProcessor().getName());
        }
    };
        Comparator<Computer> compareByMemoryVolume = new Comparator<Computer>() {
            @Override
            public int compare(Computer o1, Computer o2) {
                return o1.getMemory().getVolume() - o2.getMemory().getVolume();
            }
        };
        Comparator<Computer> compareByVideoCard = new Comparator<Computer>() {
            @Override
            public int compare(Computer o1, Computer o2) {
                return o1.getVideoCard().getModel().compareTo(o2.getVideoCard().getModel());
            }
        };
        switch (a) {
            case 1:
                long start = System.currentTimeMillis();
                Collections.sort(computers, compareByProcessorBaseFrequency);
                System.out.println(System.currentTimeMillis() - start);
                long start1 = System.currentTimeMillis();
                Collections.sort(comps, compareByProcessorBaseFrequency);
                System.out.println(System.currentTimeMillis() - start1);
                break;
            case 2:
                long start2 = System.currentTimeMillis();
                Collections.sort(computers, compareByProcessorName);
                System.out.println(System.currentTimeMillis() - start2);
                long start3 = System.currentTimeMillis();
                Collections.sort(comps, compareByProcessorName);
                System.out.println(System.currentTimeMillis() - start3);
                break;
            case 3:
                long start4 = System.currentTimeMillis();
                Collections.sort(computers, compareByMemoryVolume);
                System.out.println(System.currentTimeMillis() - start4);
                long start5 = System.currentTimeMillis();
                Collections.sort(comps, compareByMemoryVolume);
                System.out.println(System.currentTimeMillis() - start5);
                break;
            case 4:
                long start6 = System.currentTimeMillis();
                Collections.sort(computers, compareByVideoCard);
                System.out.println(System.currentTimeMillis() - start6);
                long start7 = System.currentTimeMillis();
                Collections.sort(comps, compareByVideoCard);
                System.out.println(System.currentTimeMillis() - start7);
                break;
        }
/*        for (int i = 0; i < computers.size(); i++){
            computers.get(i);
        }
        for (int i = 0; i < comps.size(); i++){
            comps.get(i);
        }*/

    }
}
