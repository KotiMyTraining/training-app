package com.coderpadtest;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurrenceIPAddress {

    public static String findMaxOccurrenceIP(String[] logEntries) {
        HashMap<String, Integer> ipCountMap = new HashMap<>();

        for (String entry : logEntries) {
            String[] parts = entry.split(" ");
            for (String part : parts) {
                if (isValidIPAddress(part)) {
                    ipCountMap.put(part, ipCountMap.getOrDefault(part, 0) + 1);
                }
            }
        }

        // Find the IP address with the maximum occurrences
        String maxIp = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : ipCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxIp = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return maxIp; // Return the IP address with the highest count
    }

    // Function to validate if a string is a valid IP address
    private static boolean isValidIPAddress(String ip) {
        String[] octets = ip.split("\\.");
        if (octets.length != 4) {
            return false;
        }

        for (String octet : octets) {
            try {
                int value = Integer.parseInt(octet);
                if (value < 0 || value > 255) {
                    return false; // Each part must be between 0 and 255
                }
            } catch (NumberFormatException e) {
                return false; // If not a valid integer, it's not a valid IP
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] str = {
                "10.0.0.1 bytes=32 time=50ms TTL=63",
                "10.0.0.2 bytes=32 time=50ms TTL=73",
                "10.0.0.4 bytes=32 time=50ms TTL=83",
                "10.0.0.2 bytes=32 time=50ms TTL=93"
        };

        System.out.println("Most frequent IP address: " + findMaxOccurrenceIP(str));
    }
}
