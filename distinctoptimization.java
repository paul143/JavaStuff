List<Integer> integerList_1= Arrays.asList(2,1,1,2,3,9,9,8,7,6,6);
        List<Integer>first= integerList_1
                .stream().filter(i -> Collections.frequency(integerList_1, i) == 1)
                .toList();
        System.out.printf("final O/P"+first);
