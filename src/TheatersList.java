public class TheatersList {
    int theaterNumber;
    String theaterName;
    String nowShowing;
    String available;
    String techScreen;
    String techSound;
    int seatCount;
    public TheatersList(int theaterNumber, String theaterName, String nowShowing, String available, String techScreen, String techSound, int seatCount) {
        this.theaterNumber = theaterNumber;
        this.theaterName = theaterName;
        this.nowShowing = nowShowing;
        this.available = available;
        this.techScreen = techScreen;
        this.techSound = techSound;
        this.seatCount = seatCount;
    }

    public int getTheaterNumber() {
        return theaterNumber;
    }

    public void setTheaterNumber(int theaterNumber) {
        this.theaterNumber = theaterNumber;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public String getNowShowing() {
        return nowShowing;
    }

    public void setNowShowing(String nowShowing) {
        this.nowShowing = nowShowing;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getTechScreen() {
        return techScreen;
    }

    public void setTechScreen(String techScreen) {
        this.techScreen = techScreen;
    }

    public String getTechSound() {
        return techSound;
    }

    public void setTechSound(String techSound) {
        this.techSound = techSound;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public void displyInfo(){
        System.out.println("___________________________________________________________");
        System.out.println("TheatersList ID: "+theaterNumber + " " + theaterName);
        System.out.println(" Now Showing " + nowShowing);
        System.out.println("Shows Time " + available);
        System.out.println(techScreen + " with " + techSound + "Available seat "+seatCount);
    }
}
