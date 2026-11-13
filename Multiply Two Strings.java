class Solution {
    public String multiplyStrings(String s1, String s2) {

        s1 = s1.trim();
        s2 = s2.trim();

        boolean neg1 = s1.startsWith("-");
        boolean neg2 = s2.startsWith("-");

        if (neg1) s1 = s1.substring(1);
        if (neg2) s2 = s2.substring(1);

        s1 = s1.replaceFirst("^0+", "");
        s2 = s2.replaceFirst("^0+", "");

        if (s1.isEmpty() || s2.isEmpty()) {
            return "0";
        }

        int n = s1.length();
        int m = s2.length();
        int[] result = new int[n + m];

        for (int i = n - 1; i >= 0; i--) {
            int d1 = s1.charAt(i) - '0';

            for (int j = m - 1; j >= 0; j--) {
                int d2 = s2.charAt(j) - '0';

                int sum = d1 * d2 + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        StringBuilder ans = new StringBuilder();

        int i = 0;
        while (i < result.length && result[i] == 0) {
            i++;
        }

        while (i < result.length) {
            ans.append(result[i]);
            i++;
        }

        if (neg1 != neg2) {
            ans.insert(0, '-');
        }

        return ans.length() == 0 ? "0" : ans.toString();
    }
}
