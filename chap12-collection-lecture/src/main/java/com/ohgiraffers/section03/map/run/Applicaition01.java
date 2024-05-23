package main.java.com.ohgiraffers.section03.map.run;

import java.util.*;

public class Applicaition01 {
    public static void main(String[] args) {

        /*
        * Map 인터페이스의 특징
        *  Collection 인터페이스와는 다른 저장 방식을 가진다.
        *  키 와 값을 하나의 쌍으로 저장하는 방식을 사용한다.
        *
        * 키(Key)란?
        * 값(value)을 찾기 위한 이름 역할을 하는 객체를 의미한다.
        * 1. 요소의 저장 순서를 유지하지 않는다.
        * 2. 키는 중복을 허용하지 않지만, 키가 다르면 중복되는 값을 저장 가능하다.
        *
        * HasgMap, HashTable TreeMap 등의 대표적인 클래스가 있다.
        * HashMap 이 가장 많이 사용되며, HahsTable은 jdk1.0 부터 제공되며
        * HashMap 과 동일하게 작동된다. 하위 호환을 위해 남겨 놓았기 때문에
        * 가급적이면 HashMap을 사용하는 것이 좋다.
        * */

        /*
        *  HashMap
        *  jdk 1.2 부터 제공되는 클래스로 해쉬 알고리즘을 사용하여 검색 속도가 매우 빠르다
        * */

        HashMap hmap = new HashMap(); // 마음대로 자료형을 넣을 수 있다
//        Map hmap2 = new HashMap();

        hmap.put("one",new Date());
        hmap.put(12,"red apple");
        hmap.put(33,123);

        System.out.println(hmap); // 키 벨류 형식으로 나음 = 형식

        hmap.put(12,"yellow"); // 같은 키는 중복이 안된다
        System.out.println(hmap);

        hmap.put(11,"yellow banana"); // 값은 중복이어도 됨
        hmap.put(9,"yellow banana");
        System.out.println(hmap);

        System.out.println(hmap.get(9)); // 값을 가지고 온다.

        hmap.remove(9);
        System.out.println(hmap); // 해당되는 값이 제거됨

        System.out.println(hmap.size());

        HashMap<String,String> hmap2 = new HashMap();

        hmap2.put("one","java 8");
        hmap2.put("two","oracle");
        hmap2.put("three","jdbc");
        hmap2.put("four","html");
        hmap2.put("five","css3");

        // iterator
        Iterator<String> keyIter= hmap2.keySet().iterator();

        //set이나 map 자체적으로 while 문을 쓸 수 없어서 iterator을 써줌

        while (keyIter.hasNext()) {
            String key = keyIter.next();
            String value = hmap2.get(key);
            System.out.println(key+ " = "+ value);

        }

        // value객체들만 values() 메소드로 Collection 으로 만듦
        Collection<String> valuse = hmap2.values();

        // Iterator()
       Iterator<String> valueIter = valuse.iterator();
       while (valueIter.hasNext()){
           System.out.println(valueIter.next());

       }

        // 배열로 처리
        Object[] valueArr = valuse.toArray();
       for (int i = 0; i < valueArr.length; i++) {
           System.out.println(i + " = " + valueArr[i]);
       }

       // Map의 내부클래스인 EntrySet 이용
        Set<Map.Entry<String,String>> Set = hmap2.entrySet();
       // Entry : 키 객체와 값 객체를 쌍으로 묶은 것
       Iterator<Map.Entry<String,String>> entryIterator = Set.iterator();
       while (entryIterator.hasNext()) {
           Map.Entry<String,String> entry = entryIterator.next();
           System.out.println(entry.getKey() + " = " + entry.getValue());
       }

    }
}
