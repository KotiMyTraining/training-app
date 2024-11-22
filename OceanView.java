package com.internalEvolution;

import java.util.*;

public class OceanView {

    public static List<Integer> findOceanViewBuildings(int[] heights) {

        List<Integer> result = new ArrayList<>();

        int n = heights.length;

       
        int highestHeightBuilding = Integer.MIN_VALUE;

       
        for (int i = n - 1; i >= 0; i--) {

           
            if (heights[i] > highestHeightBuilding) {

                
                result.add(i);

                highestHeightBuilding = Math.max(highestHeightBuilding, heights[i]);
            }
        }

        Collections.reverse(result);

       
        return result;
    }

    public static void main(String[] args) {

        int[] heights = { 1, 2, 3, -1, 2 };

        List<Integer> result = findOceanViewBuildings(heights);

        System.out.println(result.toString());
        }
    }
