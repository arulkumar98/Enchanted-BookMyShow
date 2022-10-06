import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
public class Booking {
    public void booking() throws ParseException {
        ArrayList<TheatersList> movie = new ArrayList<>();

        movie.add(new TheatersList(1, "PSS MULTIPLEX - Tenkasi", "Ponniyin Selvan (U/A) - Part One - Tamil",
                "11A.M  2P.M  6P.M 10P.M", "4K HDR", "Dolby Atoms", 150));

        movie.add(new TheatersList(2,"SRI PADMAM CINEMAS Tenkasi", "Naane Varuvean (U/A)",
                "11A.M  2P.M","4K","DOLBY 7.1",100));
        ArrayList<UsersInfo> book = new ArrayList<>();
        for (TheatersList t : movie) {
            t.displyInfo();
        }

        int userInput = 1;
        Scanner in = new Scanner(System.in);
        while (userInput == 1) {
            System.out.println("Enter 1 to booking or 0 to exit");
            userInput = in.nextInt();
            if (userInput == 1) {
                //lop
                UsersInfo allow = new UsersInfo();
                if (allow.isAvailable(movie, book)) {
                    allow.start();
                    System.out.println("Enjoy the powerful Dolby Atoms");
                } else{
                    System.out.println("Sorry the Show is Houseful");
                }
            }
        }
    }
}

