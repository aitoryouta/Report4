public class Re4_step3 {
    public static void main(String[] args) {
        String str = "3．14";
        try {
            double value = Double.parseDouble(str);

        } catch (NumberFormatException e) {
            System.out.println("間違えています" + e);

        }
    }

}