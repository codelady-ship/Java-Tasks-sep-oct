package tasklar.SentyabrTask.Lesson10task.CompressTask;

public class CompressionTask {
    public static String compress(String string) {
        if (string == null || string.isEmpty()) {
           return string;
        }
        StringBuilder builder = new StringBuilder();

        char prev = string.charAt(0);
        int count = 1;//StringIndexOutOfBoundsException atacaq
        for (int i = 1; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == prev) {
                count++;
            }else  {
                builder.append(prev);// əvvəlki hərfi və sayını əlavə et
                builder.append(count);
                prev = ch;// indi yeni hərfə keç
                count = 1;
            }
        }
        // prev hərfi count dəfə göründü
        builder.append(prev);
        builder.append(count);

        return builder.toString();
    }
}
