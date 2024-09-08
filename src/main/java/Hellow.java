import java.time.DayOfWeek;

class Hello {

    public static void hello() {

        // 정수형
        byte a = 0; // 1 byte ( -128 ~ 127 )
        int b = 10; // 2 byte ( -32768 ~ 32767 )
        short c = 10; // 4 byte ( -(2^31) ~ (2^31)-1 )
        long d  = 10; //  8 byte  ( -(2^63) ~ (2^63)-1 )

        // 실수형
        float e = 0.1f; // 4 byte ( -3.4E38 ~ 3.4E38 )
        double f = 0.1; //  8 byte ( -1.7E308 ~ 1.7E308 )


        // 문자형
        String g = "Hello, World!";
        char k = 'a'; //  2 byte ( unicode )

        // boolean
        boolean h = true; // 1 byte ( true / false )

        // null
        Integer j = null;






        // array
        int[] l = {1, 2, 3, 4, 5};
        String[] m = {"apple", "banana", "cherry"};


        // enum
        DayOfWeek weekday = DayOfWeek.SUNDAY;



        // switch
        switch(weekday){
            case SUNDAY:
                System.out.println("Today is Sunday");
                break;
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            //...
            default:
                System.out.println("Unknown day");
                break;
        }




        for(int z = 0; z < 10; z++){

            System.out.println("This is loop iteration ");
        }
    }
}