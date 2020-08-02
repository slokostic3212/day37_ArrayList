package day25_Practices;
/*
5. Write a program that will take five Strings and save them into an array called arr. and  Use for loop to print out the first three letter of each element of arr, one per line.

            You can assume that every element of arr is at least 3 letters long.
                Example: arr -> ["apple", "banana"]
                        prints:  appban
 */
public class FirstThreeChars {
    public static void main(String[] args) {
        String[] words = {"Apple", "Banana", "Strawberry", "Java", "Python"};

      //  System.out.println( words[0].substring(0, 3));
      //  System.out.println( words[1].substring(0, 3));//apply loop

        for (int i = 0; i <= words.length-1; i++){
            System.out.println( words[i].substring(0, 3));// App 5x's want 0 to chg to 1 2 3 4 so chg to i
        }
        System.out.println();
        System.out.println("=======================================");

        for (String each : words) {//i = index num of array
            // each reps eac of the elements in array
            System.out.print( each.substring(0,3));
        }
    }
}
