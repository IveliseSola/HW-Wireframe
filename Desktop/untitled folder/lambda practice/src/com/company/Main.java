package com.company;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {


        /* Optional practice */
//
//        Optional<String> empty = Optional.empty();
//
//        empty.isEmpty(); // prints true
//
//        empty.isPresent(); // prints False
//
//        String name = null;
//        Optional.ofNullable(name);// prints Empty optional
//
//        // if you try to use the name variable without the Optional.ofNullable
//        // then you will get "java.lang.NullPointerException"
//        // instead of a empty Optional which is not an Exception
//
//        // Using ifPresent()
//        Optional<String> opt = Optional.of("Ivelise");
//
//        opt.ifPresent(aux -> System.out.println(aux.length()));
//
//        // Using ifPresentOrElse()
//        Optional<String> value = Optional.of("properValue");
//        AtomicInteger successCounter = new AtomicInteger(0);
//        AtomicInteger onEmptyOptionalCounter = new AtomicInteger(0);
//
//        value.ifPresentOrElse(
//                v -> successCounter.incrementAndGet(),
//                onEmptyOptionalCounter::incrementAndGet);
//
//        // Note that the callback passed as the second argument ws not executed.
//        // In the case of an empty Optional, the second callback gets executed
//
//
////        "Using orElseGet:"
//        String text = null;
//        String defaultText = Optional.ofNullable(text).orElseGet((() -> "Chichi")); // prints out Chichi
////
////       "Using orElse:"
//        String defaultText2 = Optional.ofNullable(text).orElse("Chichi"); // Prints out Chichi
//
////        "Using orElseTrow"
//        String secondText = Optional.ofNullable(text).orElseThrow(IllegalArgumentException::new);
//
////        "Using .get() and .or()"
//        Optional<String> example = Optional.ofNullable(null);
//        String s = example.get(); //Blows up when getting a null value, so it needs to be handle with or() before to try to get a value
//
//        String defaultString = "default";
//        Optional<String> value = Optional.empty();
//        Optional<String> defaultValue = Optional.of(defaultString);
//
//        Optional<String> result = value.or(() -> defaultValue);
//
//        System.out.println(result.get() + "heyyyy"); //here is works perfectly
//
////        "Using Filter"
//        Integer year = 2016;
//        Optional<Integer> optionalYear = Optional.of(year);
//        Boolean year2016 = optionalYear.filter((y -> y == 2016)).isPresent();
//        System.out.println(year2016);
//
//
//        String password = " password ";
//        Optional<String> passOpt = Optional.of(password);
//        boolean correctPassword = passOpt.filter(
//                pass -> pass.equals("password")).isPresent();
//        System.out.println(correctPassword); // print out false cause dont remove white spaces
//
//        correctPassword = passOpt
//                .map(String::trim)
//                .filter(pass -> pass.equals("password"))
//                .isPresent();
//        System.out.println(correctPassword); //print out true cause trim spaces using map
//


        //    String exampleVar = "hello my dear";

        //      System.out.println(exampleVar.toUpperCase());

//Test test = new Test();
// test.foo.add("world");
//        System.out.println(test.foo);

        //Exercise 1

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                String myString = "Let's split this up into an array";
//                String[] parts = myString.split("");
//                for (String part : parts) {
//                    System.out.println(part);
//                }
//
//            }
//
//        };
//
//        runnable.run();

        // Exercise 1 Answer
//        Runnable runnable = () ->  {
//            String myString = "Let's split this up into an array";
//            String[] parts = myString.split("");
//            for (String part : parts) System.out.println(part);
//        };
//        runnable.run();
//
//      System.out.println("===================");
//
//
////       evrerySecondChar("Some String");
//
//
//        // exercise 2 Answer (lambda apply to a functional interface)
//
//        Function <String, String> lambda2 = s -> {
//            StringBuilder returnVal = new StringBuilder();
//            for (int i = 0; i < s.length(); i++){
//                if(i % 2 ==1){
//                    returnVal.append(s.charAt(i));
//                }
//            }
//            System.out.println(returnVal);
//            return returnVal.toString();
//        };
//
//        //Executing the function Exercise 3
//        lambda2.apply("123456789");
//
//
//        BiFunction<String, Function<String, String>, String> everySecondCharacter = (s,f) -> f.apply(s).toUpperCase();
//
//
//        String sourceTxt = "abcdef";
//        System.out.println(everySecondCharacter.apply(sourceTxt,lambda2));
//
//
//
//        Stream<String> stream1 =  Stream.of("i", "L", "o", "v","e", "J", "a", "v", "a");
////        Stream< String> stream2 = Stream.of("e", "J", "a", "v", "a");
//
////        List<String> l1 = Arrays.asList("i", "l", "o", "v");
////        List<String> l2 = Arrays.asList("e", "J", "a", "v", "a");
//
//        Function <Stream, Stream > algoLocoAhi = s -> {
//
//            System.out.println(s.collect(Collectors.joining()));
//
//            return s;
//        };
//
//       algoLocoAhi.apply(stream1);
//
//
//       // Exercise 6
//        Supplier<String> iLoveJava = () -> "I love java";
//
//        String supplierResult = iLoveJava.get();
//
//        System.out.println("============================");
//        System.out.println(supplierResult);
//
//
//        //Exercise 9
//
//        List<String> names = Arrays.asList(
//                "orlando",
//                "amelia",
//                "Camila",
//                "ernesto",
//                "Debora",
//                "Zamira",
//                "beba"
//        );
//
////
//        System.out.println(names
//                                .stream()
//                                .map(n -> n.substring(0, 1).toUpperCase() + n.substring(1).toLowerCase())
//                                .filter(n -> n.startsWith("A"))
//                                .count());
//
//
//        System.out.println("============================");
//        names
//                .stream()
//                .map(n -> n.substring(0, 1).toUpperCase() + n.substring(1).toLowerCase())
//                .sorted()
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
//    }
//
//    // Exercise 2
//
////    public static String evrerySecondChar(String source){
////        StringBuilder returnVal = new StringBuilder();
////        for (int i = 0; i < source.length(); i++){
////            if(i % 2 ==1){
////                returnVal.append(source.charAt(i));
////            }
////        }
////        System.out.println(returnVal);
////        return returnVal.toString();
    }

}
