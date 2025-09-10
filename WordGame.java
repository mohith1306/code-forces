import java.util.*;

public class WordGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int len = sc.nextInt();
            
            String[] a = new String[len];
            String[] b = new String[len];
            String[] c = new String[len];
            
            for (int i = 0; i < len; i++) a[i] = sc.next();
            for (int i = 0; i < len; i++) b[i] = sc.next();
            for (int i = 0; i < len; i++) c[i] = sc.next();
            
            Map<String, Integer> map1 = new HashMap<>();
            Map<String, Integer> map2 = new HashMap<>();
            Map<String, Integer> map3 = new HashMap<>();
            
            for (String s : a) map1.put(s, map1.getOrDefault(s, 0) + 1);
            for (String s : b) map2.put(s, map2.getOrDefault(s, 0) + 1);
            for (String s : c) map3.put(s, map3.getOrDefault(s, 0) + 1);
            
            int p1 = 0, p2 = 0, p3 = 0;
            
            for (String s : a) {
                if (map2.containsKey(s)) {
                    if (map3.containsKey(s)) {
                        p1 += 0;
                    } else {
                        p1 += 1;
                    }
                } else if (map3.containsKey(s)) {
                    p1 += 1;
                } else {
                    p1 += 3;
                }
            }
            
            for (String s : b) {
                if (map1.containsKey(s)) {
                    if (map3.containsKey(s)) {
                        p2 += 0;
                    } else {
                        p2 += 1;
                    }
                } else if (map3.containsKey(s)) {
                    p2 += 1;
                } else {
                    p2 += 3;
                }
            }
            
            for (String s : c) {
                if (map2.containsKey(s)) {
                    if (map1.containsKey(s)) {
                        p3 += 0;
                    } else {
                        p3 += 1;
                    }
                } else if (map1.containsKey(s)) {
                    p3 += 1;
                } else {
                    p3 += 3;
                }
            }
            
            System.out.println(p1 + " " + p2 + " " + p3);
        }
        sc.close();
    }
}
