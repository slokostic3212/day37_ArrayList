package day35_ArrayList;
/*
2. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)
            HINT: on ascii table, the characters between #48 ~ #57 are digits
 */

public class SunOfDigits {
    public static void main(String[] args) {
        String str = "a1b2c3d4e5f6";
        int sum = 0; //1+2+3 == 6
        // 49+50+51 == 150


        for(int i = 0; i <= str.length()-1; i++){

            char each = str.charAt(i); // a, 1, b,2,c,3
                     //0       ~    9
            if(each>= 48 && each <= 57){ // if the char is between 48~57 , then it's digit

                sum += Integer.parseInt(""+each); // convert the char to Integer then add it to the sum
              //  sum += each - 48; does the same thing
            }

        }

        System.out.println(sum);
    }
}
