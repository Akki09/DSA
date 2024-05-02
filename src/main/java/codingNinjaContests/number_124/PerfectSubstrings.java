package codingNinjaContests.number_124;

public class PerfectSubstrings {

    public static void main(String[] args) {
        //int[] output = perfectSubstrings(13, "eabcdef", 1, new int[][]{{5, 6}});
        //int[] output = perfectSubstrings(68, "abanwgkkkabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzkkkabcd", 398, new int[][]{{9, 34}, {64, 67}, {31, 45}, {35, 48}, {35, 60}, {6, 8}, {61, 63}, {35, 60}, {6, 8}, {20, 51}, {35, 60}, {6, 8}, {35, 60}, {61, 63}, {55, 56}, {10, 38}, {24, 31}, {25, 31}, {35, 60}, {35, 60}, {50, 60}, {43, 47}, {3, 34}, {0, 2}, {0, 2}, {10, 51}, {5, 30}, {35, 60}, {35, 60}, {0, 2}, {61, 63}, {60, 62}, {35, 60}, {51, 67}, {7, 25}, {61, 63}, {39, 41}, {16, 50}, {52, 66}, {9, 34}, {0, 2}, {64, 67}, {22, 31}, {39, 62}, {9, 34}, {12, 46}, {35, 60}, {35, 60}, {27, 64}, {35, 60}, {15, 46}, {9, 34}, {19, 41}, {10, 10}, {35, 60}, {64, 67}, {0, 2}, {35, 60}, {6, 8}, {35, 60}, {9, 57}, {35, 60}, {6, 8}, {36, 48}, {46, 63}, {1, 52}, {64, 67}, {12, 53}, {64, 67}, {42, 44}, {6, 8}, {61, 63}, {50, 67}, {65, 66}, {6, 8}, {35, 60}, {41, 66}, {38, 58}, {6, 8}, {23, 59}, {41, 60}, {9, 34}, {32, 55}, {61, 63}, {64, 67}, {61, 63}, {35, 60}, {57, 62}, {47, 57}, {6, 8}, {58, 59}, {58, 63}, {56, 65}, {61, 63}, {21, 48}, {35, 60}, {9, 34}, {9, 34}, {56, 61}, {64, 67}, {0, 2}, {30, 33}, {9, 34}, {22, 28}, {61, 63}, {0, 2}, {6, 8}, {20, 40}, {67, 67}, {61, 63}, {9, 34}, {6, 8}, {6, 8}, {35, 60}, {9, 34}, {35, 60}, {8, 25}, {6, 8}, {61, 63}, {10, 59}, {28, 29}, {61, 63}, {51, 60}, {49, 67}, {6, 8}, {57, 64}, {0, 2}, {46, 51}, {7, 46}, {9, 34}, {64, 67}, {42, 42}, {6, 8}, {28, 61}, {64, 67}, {35, 60}, {20, 46}, {6, 8}, {9, 35}, {51, 63}, {9, 34}, {61, 63}, {61, 63}, {54, 63}, {66, 67}, {6, 8}, {36, 58}, {9, 34}, {0, 2}, {33, 65}, {35, 37}, {31, 54}, {44, 65}, {0, 2}, {9, 34}, {21, 23}, {45, 55}, {16, 62}, {64, 67}, {0, 2}, {2, 60}, {52, 65}, {6, 8}, {7, 37}, {5, 58}, {39, 56}, {0, 2}, {59, 66}, {9, 34}, {7, 22}, {10, 43}, {25, 50}, {41, 59}, {20, 22}, {34, 41}, {23, 32}, {9, 34}, {6, 8}, {65, 66}, {0, 2}, {61, 63}, {49, 56}, {33, 65}, {20, 47}, {20, 47}, {64, 67}, {33, 46}, {33, 52}, {64, 67}, {35, 60}, {6, 8}, {61, 63}, {64, 67}, {9, 34}, {29, 41}, {3, 20}, {8, 55}, {60, 63}, {9, 34}, {9, 34}, {35, 60}, {29, 46}, {61, 63}, {61, 63}, {27, 51}, {9, 34}, {16, 38}, {9, 34}, {64, 67}, {9, 34}, {62, 65}, {8, 25}, {0, 2}, {0, 2}, {33, 61}, {64, 67}, {64, 67}, {61, 63}, {35, 60}, {64, 67}, {61, 63}, {12, 49}, {61, 63}, {5, 42}, {10, 14}, {35, 60}, {61, 63}, {34, 51}, {7, 20}, {35, 60}, {25, 30}, {61, 63}, {9, 34}, {35, 60}, {35, 60}, {6, 8}, {0, 2}, {42, 64}, {19, 36}, {66, 66}, {47, 66}, {1, 62}, {0, 2}, {64, 67}, {9, 34}, {34, 58}, {2, 10}, {6, 8}, {17, 61}, {54, 61}, {61, 63}, {54, 55}, {39, 56}, {36, 62}, {10, 25}, {3, 31}, {32, 64}, {35, 60}, {59, 63}, {9, 34}, {0, 2}, {0, 2}, {20, 22}, {35, 58}, {61, 63}, {64, 67}, {35, 60}, {61, 63}, {32, 32}, {55, 55}, {67, 67}, {9, 34}, {64, 67}, {20, 57}, {36, 41}, {67, 67}, {2, 34}, {9, 34}, {9, 34}, {26, 61}, {0, 2}, {49, 51}, {35, 60}, {50, 58}, {41, 56}, {9, 34}, {57, 57}, {26, 41}, {64, 67}, {40, 41}, {66, 66}, {38, 58}, {35, 60}, {53, 64}, {9, 34}, {61, 63}, {6, 8}, {46, 55}, {35, 60}, {64, 67}, {64, 67}, {40, 64}, {61, 63}, {0, 2}, {59, 65}, {64, 67}, {26, 31}, {65, 67}, {9, 34}, {35, 60}, {35, 60}, {6, 8}, {10, 43}, {35, 63}, {35, 60}, {15, 51}, {9, 34}, {55, 66}, {61, 63}, {9, 34}, {61, 63}, {19, 28}, {66, 67}, {35, 60}, {64, 67}, {35, 60}, {4, 65}, {65, 65}, {7, 34}, {38, 52}, {12, 19}, {58, 63}, {35, 60}, {64, 65}, {61, 63}, {61, 64}, {6, 8}, {25, 60}, {58, 58}, {50, 57}, {24, 51}, {35, 60}, {46, 47}, {64, 67}, {10, 29}, {48, 58}, {9, 34}, {16, 27}, {61, 63}, {6, 8}, {50, 52}, {35, 60}, {61, 63}, {64, 67}, {0, 2}, {40, 53}, {6, 8}, {49, 66}, {20, 55}, {40, 43}, {64, 67}, {32, 50}, {61, 63}, {9, 34}, {0, 2}, {18, 20}, {9, 34}, {9, 16}, {0, 2}, {1, 67}, {12, 52}, {9, 34}, {35, 66}, {67, 67}, {17, 57}, {51, 66}, {42, 46}, {6, 8}, {9, 34}, {20, 53}, {9, 34}, {35, 60}, {64, 67}, {49, 54}, {31, 34}, {47, 58}, {6, 62}, {9, 34}, {0, 18}, {22, 50}, {9, 34}, {2, 5}, {61, 63}, {46, 64}, {45, 45}, {41, 55}, {30, 63}, {58, 63}});
        int[] output = perfectSubstrings(13, "abaabacefffcd", 2, new int[][]{{0, 4}, {8, 10}});
        for (int i : output) {
            System.out.print(i + " ");
        }
    }

    public static int[] perfectSubstrings(int n, String s, int q, int[][] queries) {
        // Write your code here.
        int[] ans = new int[q];

        for (int i = 0; i < q; i++) {
            int startIndex = queries[i][0];
            int endIndex = queries[i][1];
            int midIndex = (startIndex + endIndex) / 2;

            int leftPointer = startIndex;
            int rightPointer = endIndex;

            System.out.println(s.substring(startIndex, endIndex + 1));

            while ((rightPointer >= midIndex + 1) && s.charAt(rightPointer) != s.charAt(leftPointer)) {
                rightPointer--;
            }
            if (!(rightPointer >= midIndex + 1)) {
                ans[i] = 0;
                continue;
            }

            while (leftPointer <= midIndex && rightPointer <= endIndex) {
                if (s.charAt(leftPointer) == s.charAt(rightPointer)) {
                    if (rightPointer == endIndex) {
                        ans[i] = 1;
                        break;
                    }
                    leftPointer++;
                    rightPointer++;
                } else {
                    ans[i] = 0;
                    break;
                }
            }
        }
        return ans;
    }
}
