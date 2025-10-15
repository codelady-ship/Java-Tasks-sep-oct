package tasklar.SentyabrTask.OOP.Formatter;

public class CamelCaseFormatter extends Formatter {

    private String capitalize(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        return Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
    }

    @Override
    public String format(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                sb.append(capitalize(word)).append(" ");
            }
        }

        return sb.toString();
    }
}
