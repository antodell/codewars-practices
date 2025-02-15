class Kata {
    public static String multiTable(int num) {

        StringBuilder table = new StringBuilder(); // Created to build multiplication table

        for (int n = 1; n <= 10; n++) { // Looping through each number. Always 1 to 10 int
            table.append(n).append(" * ").append(num).append(" = ").append(n*num); // Appending to get right format and multiply the given num

            if ( n < 10) {
                table.append("\n"); // avoid adding a new line at the end.
            }
        }
        return table.toString(); // Convert builder to string
    }
}