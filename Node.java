package org;

import java.util.*;
////import java.util.*;
//
//public  class Node implements Comparable<Node>{
//
//    private char data;
//    private int weigth;
//    private Node left;
//    private Node right;
//
//
//    public Node(char data,int weigth){
//        this.data=data;
//        this.weigth=weigth;
//    }
//
//    public Node() {
//
//    }
//    public char getData()
//    {
//        return data;
//    }
//    public void setData(char data)
//    {
//        this.data = data;
//    }
//    public int getWeigth()
//    {
//        return weigth;
//    }
//    public void setWeigth(int weigth)
//    {
//        this.weigth = weigth;
//    }
//    public Node getLeft()
//    {
//        return left;
//    }
//    public void setLeft(Node left)
//    {
//        this.left = left;
//    }
//    public Node getRight()
//    {
//        return right;
//    }
//    public void setRight(Node right)
//    {
//        this.right = right;
//    }
//
////    @Override          //调试过程
////    public String toString() {
////        return "Node{" +
////                "data=" + data +
////                ", left=" + left +
////                ", right=" + right +
////                '}';
////    }
//
//    public int compareTo(Node node)  {
//        if(node.getWeigth()>this.getWeigth())
//        return 1;
//        if(node.getWeigth()<this.getWeigth())
//        return -1;
//        return 0;
//    }
//}
//class HuffmanTree {
//    //private static String t="";
//    private static Node createTree(List<Node> list) {
//        PriorityQueue<Node> q = new PriorityQueue<Node>(list.size(), new Comparator<Node>() {
//            @Override
//            public int compare(Node o1, Node o2)
//            {
//                return o1.getWeigth()-o2.getWeigth();
//            }
//        });
//
//        for (int i = 0; i < list.size(); i++){
//                q.add(list.get(i));
//        }
////
//        while (q.size() > 1) {
//           //Collections.sort(list);
//            Node left = q.poll();
//            Node right = q.poll();
//            char c = '0';
//            Node parent = new Node(c, left.getWeigth() + right.getWeigth());
//            parent.setLeft(left);
//            parent.setRight(right);
////            list.remove(left);
////            list.remove(right);
////            list.add(parent);
//            q.add(parent);
//
//        }
//        return q.poll();
//    }
//
//    public static void huffman(Node root, String code, Map map1) {
//
//        if (root.getLeft() != null) {
//            huffman(root.getLeft(), code + "0", map1);
//        }
//        if (root.getRight() != null) {
//            huffman(root.getRight(), code + "1", map1);
//        }
//        if (root.getLeft() == null && root.getRight() == null) {
//            map1.put(root.getData(), code);
//        }
//    }
//
//    public static void tras(Node root){
//        if (root.getLeft()!=null&&root.getRight()!=null)  {
//            System.out.println(root.getData()+"               "+root.getRight().getData() + "              "+root.getLeft().getData());
//            tras(root.getLeft());
//            tras(root.getRight());
//        }
//    }
//
////    private static String toBit(char[] ch){
////        String tt="";
////
////        for (int i = 0; i < ch.length; i++){
////            String bit = "";
////            String zero="0";
////            int j = (int) ch[i];
////            bit = Integer.toBinaryString(j);
////
////            while (bit.length()!=8){
////                bit=zero+bit;
////            }
////            tt+=bit;
////        }
////        //assert
////
////        return tt;
////    }
//
//    public static void main(String[] args) {
//        Map<Character, Integer> map = new HashMap<Character, Integer>();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入");
//        String s = sc.nextLine();
//        char[] c = s.toCharArray();                   //tocahrarry将字符串对象中的字符转换为字符数组
//       // t = HuffmanTree.toBit(c);
//        Node node1 = new Node();
//        List<Node> list = new ArrayList<Node>();
//        //int weight[] = new int[256];
//        for (int i = 0; i < c.length; i++) {
//            int times = 0;
//            for (int j = 0; j < c.length; j++) {
//                if (c[j] == c[i]) {
//                    times++;
//                   // weight[(int) c[j]]++;
//                }
//                map.put(c[i], times);
//            }
//            //System.out.println(map1);
//        }
//
//        Set<Character> keys = map.keySet();
//        Collection<Integer> values = map.values();
//        //System.out.println(values);
//        Iterator<Character> iterator = keys.iterator();
//
//        System.out.println("========================================================================================================================================================================");
//
//
//        int t = 0;
//        int values1 = 0;
//        char key2 = 0;
//        while (iterator.hasNext()) {           //是否还有元素，循环
//            //list.add(map.get(key));
//            key2 = iterator.next();
//            values1 = map.get(key2);
//            t++;
//            System.out.println("字符为 " + key2 + "  权值为 " + values1);
//        }
//
//
//
//        int i = 0;
//        Node[] nodes = new Node[map.size()];
//        for (Character key : keys) {
//            nodes[i] = new Node();
//            nodes[i].setData(key);
//            nodes[i].setWeigth(map.get(key));
//            list.add(nodes[i]);
//            i++;
//        }
//
//
//        Node no = HuffmanTree.createTree(list);
//
//        String code = "";
//        HuffmanTree.huffman(no, code, map);
//        System.out.println("========================================================================================================================================================================");
//        System.out.println("构造的哈弗曼树为：");
//        //System.out.println(no);
//        System.out.println("父亲节点         左孩子        右孩子");
//        HuffmanTree.tras(no);
//
//        System.out.println("============================================================================================================================================================");
//
//
//
//        Iterator<Character> ite = map.keySet().iterator();
//        while (ite.hasNext()) {
//            char key1 = ite.next();
//            System.out.println(key1 + "的编码：" + map.get(key1));
//        }
//        System.out.println("============================================================================================================================================================");
//    }
//}
//
//


public class Node implements Comparable<Node> {
    public char data;
    public int weight;
    public Node left;
    public Node right;

    public Node(char data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node(char data, int weight) {
        this.data = data;
        this.weight = weight;
    }

    public Node() {

    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public int compareTo(Node o) {
        if (o.getWeight() > this.getWeight()) {
            return -1;
        }
        if (o.getWeight() < this.getWeight()) {
            return 1;
        }
        return 0;
    }
}

class HafumanTree {
    public  Node creatTree(PriorityQueue<Node> queue) {
        if (queue.size() >= 1) {
            Node left = queue.poll();
            Node right = queue.poll();
            char c = 0;
            Node parent = new Node(c, left.weight + right.weight);
            parent.setLeft(left);
            parent.setRight(right);
            queue.add(parent);
        }
        return queue.poll();
    }

    public static void biaoji(Node root, String m, Map map1) {
        if (root.getLeft() != null) {
            biaoji(root.getLeft(), m + "0", map1);
        }
        if (root.getRight() != null) {
            biaoji(root.getRight(), m + "1", map1);
        }
        if (root.getRight() == null && root.getLeft() == null) {
            map1.put(root.getData(), m);
        }

    }

    public static void main(String []args) {
        System.out.println("请输入");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        int i = 0;
        int j = 0;
        for (i = 0; i < c.length; i++) {
            int time = 0;
            for (j = 0; j < c.length; j++) {
                if (c[j] == c[i]) {
                    time++;
                }
                map.put(c[i], time);
            }

        }

        // System.out.println("字符为"+map.keySet()+"频率为"+map.values());  出现的效果不理想
        Set<Character> set = map.keySet();
        Collection<Integer> co = map.values();
        Iterator<Character> it = set.iterator();
        List<Node> list = new LinkedList<Node>();
        PriorityQueue<Node> queue = new PriorityQueue<Node>();
        int a = 0;
        char b = 0;
        while (it.hasNext()) {
            b = it.next();
            a = map.get(b);
            System.out.println("字符为" + b + "权值为" + a);
        }
        Node[] node = new Node[map.size()];
        int in = 0;
        int d = 0;
        for (Character sets : set) {
            node[d] = new Node();
            node[d].setData(sets);
            node[d].setWeight(map.get(sets));
            list.add(node[d]);
            queue.offer(node[d]);
        }
        // HafumanTree ha=new HafumanTree();
//            for (int g = 0; g < list.size(); g++) {
//                System.out.println(queue.poll().getWeight());
//            }
//            Collections.sort(list, new Comparator<Node>() {
//                @Override
//                public int compare(Node o1, Node o2) {
//                    return o1.getWeight() - o2.getWeight();
//                }
//            });
//            for (int f = 0; f < list.size(); f++) {
//                System.out.println(list.get(f).getData());
//            }
        HafumanTree h = new HafumanTree();
        Node root = h.creatTree(queue);
        String m = "";
        Map map1 = new HashMap();
        HafumanTree.biaoji(root, m, map1);
        System.out.println(map1);
    }
}


