package Collections;

import com.google.common.collect.*;
import sun.security.krb5.internal.Ticket;

import java.util.*;

/**
 * @author zhangke
 * @version 1.0
 * @className GuavaTest
 * @description TODO
 * @date 2019/5/27 11:16 AM
 **/
public class GuavaTest {
    public static  void main(String [] args){
        Set<String> set = new HashSet<String>(Arrays.asList(new String[]{"RED", "GREEN"}));
        //1、Immutable Collections: 真正的不可修改的集合
        ImmutableSet<String> immutableSet1 = ImmutableSet.of("RED", "GREEN");
        //从构造的方式来说，ImmutableSet 集合还提供了 Builder 模式来构造一个集合 :

        ImmutableSet.Builder<String> builder = ImmutableSet.builder();
        ImmutableSet<String> immutableSet2 = builder.add("RED").addAll(set).build();

        //在这个例子里面 Builder 不但能加入单个元素还能加入既有的集合。

       // 除此之外，Guava Collections 还提供了各种 Immutable 集合的实现：ImmutableList，ImmutableMap，ImmutableSortedSet，ImmutableSortedMap。


        //2、Multiset: 把重复的元素放入集合
        //譬如一个 List 里面有各种字符串，然后你要统计每个字符串在 List 里面出现的次数 :
        List<String> wordList =new ArrayList<String>();
        wordList.add("zhangke");
        wordList.add("niulong");
        wordList.add("chengju");
        wordList.add("niulong");
        wordList.add("chengju");
        wordList.add("zhangke");
        wordList.add("zhangke");

        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String word : wordList){
            Integer count = map.get(word);
            map.put(word, (count == null) ? 1 : count + 1);
        }
        //count word “the”
        Integer count1 = map.get("zhangke");
        System.out.println(count1.intValue());
        //如果用 Multiset 就可以这样 :
        HashMultiset<String> multiSet = HashMultiset.create();
        multiSet.addAll(wordList);
        //count word “the”
        Integer count2 = multiSet.count("zhangke");
        System.out.println(count2.intValue());

        //3、在 Map 的 value 里面放多个元素，Map 看上去是 : {k1=v1, k2=v2,...}，而 Muitimap 是 :{k1=[v1, v2, v3], k2=[v7, v8],....}。
        //Question:举个记名投票的例子。所有选票都放在一个 List<Ticket> 里面，List 的每个元素包括投票人和选举人的名字。我们可以这样写 :
        //Key is candidate name, its value is his voters
        List<ticket> ticketlist =new ArrayList<ticket>();
        ticketlist.add(new ticket("zk","zhangke"));
        ticketlist.add(new ticket("zk","zhangke"));
        ticketlist.add(new ticket("zkq","niulong"));
        ticketlist.add(new ticket("zkw","zhangke"));
        ticketlist.add(new ticket("zkq","zhangke"));
        ticketlist.add(new ticket("zqk","niulong"));
        ticketlist.add(new ticket("zqk","chengju"));
        ticketlist.add(new ticket("zkq","chengju"));
        ticketlist.add(new ticket("zqk","chengju"));
        HashMap<String, HashSet<String>> hMap = new HashMap<String, HashSet<String>>();
        for(ticket ticket: ticketlist){
            HashSet<String> set1 = hMap.get(ticket.getCandidate());
            if(set1== null){
                set1= new HashSet<String>();
                hMap.put(ticket.getCandidate(), set1);
            }
            set1.add(ticket.getVoter());
        }
        HashMultimap<String, String> map1 = HashMultimap.create();
        for(ticket ticket: ticketlist){
            map1.put(ticket.getCandidate(), ticket.getVoter());
        }
        //BiMap: 双向 Map,BiMap 实现了 java.util.Map 接口。它的特点是它的 value 和它 key 一样也是不可重复的，
        // 换句话说它的 key 和 value 是等价的。如果你往 BiMap 的 value 里面放了重复的元素，就会得到 IllegalArgumentException。
        //举个例子，你可能经常会碰到在 Map 里面根据 value 值来反推它的 key 值的逻辑：
//        for(Map.Entry<User, Address> entry : map.entreSet()){
//            if(entry.getValue().equals(anAddess)){
//                return entry.getKey();
//            }
//        }
//        return null;
        //return biMap.inverse().get(anAddess);

        //过滤器

    }
}