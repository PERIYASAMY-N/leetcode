class Solution {
    public String toGoatLatin(String sentence) {

        String words[] = sentence.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            StringBuilder sb = new StringBuilder();

            char ch = Character.toLowerCase(word.charAt(0));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

                sb.append(word);

            } else {

                sb.append(word.substring(1));
                sb.append(word.charAt(0));
            }

            sb.append("ma");

            for (int j = 0; j <= i; j++) {
                sb.append('a');
            }

            ans.append(sb);

            if (i != words.length - 1)
                ans.append(" ");
        }

        return ans.toString();
    }
}