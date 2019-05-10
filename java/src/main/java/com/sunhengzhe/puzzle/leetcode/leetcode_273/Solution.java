package com.sunhengzhe.puzzle.leetcode.leetcode_273;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Map<String, String> map = new HashMap<>();

    private void initialize() {
        map.put("0", "Zero");
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");
        map.put("4", "Four");
        map.put("5", "Five");
        map.put("6", "Six");
        map.put("7", "Seven");
        map.put("8", "Eight");
        map.put("9", "Nine");
        map.put("10", "Ten");
        map.put("11", "Eleven");
        map.put("12", "Twelve");
        map.put("13", "Thirteen");
        map.put("14", "Fourteen");
        map.put("15", "Fifteen");
        map.put("16", "Sixteen");
        map.put("17", "Seventeen");
        map.put("18", "Eighteen");
        map.put("19", "Nineteen");
        map.put("20", "Twenty");
        map.put("30", "Thirty");
        map.put("40", "Forty");
        map.put("50", "Fifty");
        map.put("60", "Sixty");
        map.put("70", "Seventy");
        map.put("80", "Eighty");
        map.put("90", "Ninety");
    }

    private String[] units = {"", "Thousand", "Million", "Billion"};

    private String getByOneDigit(String number) {
        return map.get(number);
    }

    private String getByTwoDigits(String number) {
        char firstNumber = number.charAt(0);
        char secondNumber = number.charAt(1);

        if (firstNumber == '1') {
            return getByOneDigit(number);
        }

        if (firstNumber == '0') {
            if (secondNumber == '0') {
                return "";
            } else {
                return getByOneDigit(String.valueOf(secondNumber));
            }
        }

        String result = map.get(firstNumber + "0");

        if (secondNumber != '0') {
            result += " " + map.get(String.valueOf(secondNumber));
        }

        return result;
    }

    private String getByThreeDigits(String group) {
        if (group.length() == 1) {
            return getByOneDigit(group);
        }

        if (group.length() == 2) {
            return getByTwoDigits(group);
        }

        char firstNumber = group.charAt(0);

        if (firstNumber == '0') {
            return getByTwoDigits(group.substring(1));
        }

        String partOne = getByOneDigit(String.valueOf(firstNumber)) + " Hundred";
        String partTwo = getByTwoDigits(group.substring(1));

        if (!partTwo.isEmpty()) {
            partOne = partOne + " " + partTwo;
        }

        return partOne;
    }

    public String numberToWords(int num) {
        initialize();

        String numToStr = num + "";
        String result = "";

        for (int i = numToStr.length() - 1, unitIndex = 0; i >= 0; i -= 3) {
            String group;

            if (i < 3) {
                group = numToStr.substring(0, i + 1);
            } else {
                group = numToStr.substring(i - 2, i + 1);
            }

            String englishGroup = getByThreeDigits(group);

            if (unitIndex == 0) {
                result = englishGroup;
            } else if (!englishGroup.isEmpty()) {
                result = englishGroup + " " + units[unitIndex] + (result.isEmpty() ? "" : " " + result);
            }

            unitIndex++;
        }

        return result;
    }
}
