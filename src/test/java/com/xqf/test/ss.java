package com.xqf.test;

import java.io.BufferedInputStream;
import java.util.*;

/**
 * @author xuqifeng
 * @create 2022/6/16 8:31
 **/

public class ss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        System.out.println("            欢迎使用本程序！            ");
        System.out.println("ps:本程序采用编程思维->0为首位");

        //获取住户数量
        System.out.print("请输入住户数量:");
        int n = Integer.parseInt(sc.nextLine());

        int[][] allDis = new int[n][n];

        //初始化list
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> tempList = new ArrayList<>();
            System.out.print("请依次输入住户x、住户y、住户x到住户y的距离(以空格隔开,回车结束):");
            String tempS = sc.nextLine();
            String[] tempSArr = tempS.split(" ");
            allDis[Integer.parseInt(tempSArr[0])][Integer.parseInt(tempSArr[1])] = Integer.parseInt(tempSArr[2]);
            for (int j = 0; j < tempSArr.length; j++) {
                tempList.add(Integer.valueOf(tempSArr[j]));
            }
            list.add(tempList);
        }

        //初始化自救时间数组
        int[] zj = new int[n];
        System.out.print("请依次输入各住户的自救时间(以空格隔开,回车结束):");
        String tempS = sc.nextLine();
        String[] tempSArr = tempS.split(" ");
        for (int i = 0; i < zj.length; i++) {
            zj[i] = Integer.parseInt(tempSArr[i]);
        }

        //初始化速度变量判断能否急救
        System.out.print("请输入急救速度(以回车结束):");
        int v = Integer.parseInt(sc.nextLine());

        //储存邻接
        Map<Integer , List<Integer>> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i).get(0);
            int y = list.get(i).get(1);
            if(map.get(x) == null || map.get(x).size() == 0){
                map.put(x , new ArrayList<>());
            }
            map.get(x).add(y);
        }
//        System.out.println(map.toString());

        //vis数组控制是否访问
        boolean[] vis = new boolean[n];

        System.out.print("请输入出发点和目的地(以空格隔开,回车结束):");
        String se = sc.nextLine();
        String[] seArr = se.split(" ");
        int start = Integer.parseInt(seArr[0]);
        int end = Integer.parseInt(seArr[1]);
        List<List<Integer>> ret = new ArrayList<>();
        help(map , end , ret , new ArrayList<>() , start , vis);

        //两点直接无方法到达
        if (ret.size() == 0) {
            System.out.println("没有此路径");
            return;
        }

        //找出最短路径路程
        int minIndex = -1;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < ret.size(); i++) {
            int sum = 0;
            for (int j = 1; j < ret.get(i).size(); j++) {
                sum += allDis[ret.get(i).get(j-1)][ret.get(i).get(j)];
            }
            if(sum < minSum){
                minIndex = i;
                minSum = sum;
            }
        }

        //时间不够
        if(minSum / v < zj[start]){
            System.out.println("相隔太远最快速度仍然无法早些抵达 GG");
            return;
        }

        //可顺利到达输出结果
        System.out.print("最短路径为:");
        for (int i = 0; i < ret.get(minIndex).size() - 1; i++) {
            System.out.print(ret.get(minIndex).get(i) + "->");
        }
        System.out.println(ret.get(minIndex).get(ret.get(minIndex).size()-1));
        System.out.print("最短路程为:" + minSum);
    }

    //backtrack函数（递归）
    private static void help(Map<Integer , List<Integer>> map , int targrt , List<List<Integer>> ret , List<Integer> temp , int index , boolean[] vis){
        //找到了目的地
        if(index == targrt){
            temp.add(index);
            ret.add(temp);
            return;
        }
        temp.add(index);
        vis[index] = true;
        for (int i = 0; i < map.get(index).size(); i++) {
            if(vis[map.get(index).get(i)]){
                continue;
            }
            temp.add(map.get(index).get(i));
            vis[map.get(index).get(i)] = true;
            help(map, targrt, ret, temp, map.get(index).get(i), vis);
            temp.remove(temp.size()-1);
            vis[map.get(index).get(i)] = false;
        }
        temp.remove((Object)index);
        vis[index] = false;
    }
}

