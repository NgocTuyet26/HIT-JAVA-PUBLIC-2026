package bai3;

public class VipAccount extends Account {
    private int points;

    public VipAccount(String username, String email, Address address, int points) {
        super(username, email, address);
        this.points = points;
    }

    @Override
    public double getDiscount() {
        if (points >= 1000) {
            return 0.15;
        } else {
            return 0.10;
        }
    }

    public void addPoints(int point) {
        if (point > 0) {
            int oldPoints = points;
            points += point;

            System.out.println("Points: " + oldPoints + " -> " + points);

            if (oldPoints < 1000 && points >= 1000) {
                System.out.println("Tai khoan da duoc nang hang VIP!");
            }
        }
    }

    @Override
    public String toString() {
        return "=== VIP ACCOUNT ===\n" +
                super.toString() +
                "\nPoints: " + points;
    }
}
