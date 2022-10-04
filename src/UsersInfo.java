import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class UsersInfo {
    int theaterId;
    String email;
    String mobileNo;
    String showTime;
    Date date;

    public void start() throws ParseException {
        Scanner in = new Scanner(System.in);
        System.out.println("Select the Theater ID");
        theaterId = in.nextInt();
        System.out.println("Enter you're E-mail");
        email = in.next();
        //E-mail
        String regex = "^(.+)@(.+)$";
        while (!email.matches(regex)) {
            System.out.println("Please enter the valid e-mail address");
            this.email = in.next();
        }
        System.out.println("Enter the mobile number");
        mobileNo = in.next();
        String num = "^\\d{10}$";
        while (!mobileNo.matches(num)) {
            System.out.println("Please enter the valid Mobile Number");
            this.mobileNo = in.next();
        }
        System.out.println("Enter the show time");
        showTime = in.next();
        System.out.println("Enter the date format in dd-mm-yyyy");
        String dateformat = in.next();
        SimpleDateFormat newDate = new SimpleDateFormat("dd-MM-yyyy");
        date = newDate.parse(dateformat);
    }

    public boolean isAvailable(ArrayList<TheatersList> movie, ArrayList<UsersInfo> book) {
        int capacity = 0;
        int count = 0;
        for (TheatersList ticket : movie) {
            if (ticket.getTheaterNumber() == this.theaterId) {
                capacity = ticket.getSeatCount();
            }
            for (UsersInfo use : book) {
                if (use.theaterId == this.theaterId && date.equals(date)) {
                    ++count;
                    ticket.seatCount-=count;

                }
            }
        }
        if (count > capacity) {
            return false;
        } else {
            return true;
        }
    }
}

