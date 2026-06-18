
class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strs.size(); i++) {
            String s = strs.get(i);
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {

            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            int len = Integer.parseInt(str.substring(i, j));

            String s = str.substring(j + 1, j + 1 + len);

            ans.add(s);

            i = j + 1 + len;
        }

        return ans;
    }
}