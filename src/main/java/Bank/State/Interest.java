package Bank.State;

import java.util.Date;

public class Interest {

    private InterestState interestState;
    private Date startDate;
    private int duration;
    private double balance;

    public Interest(double balance, int duration) {
        this.setInterest(balance);
        this.startDate = new Date();
        this.duration = duration;
    }

    public void setInterest(double balance) {
        this.balance = balance;

        if(balance < 1000){
            interestState = new FiveInterestState();
        }else{
            interestState = new TenInterestState();
        }
    }

    public void calculateInterest() {
        interestState.calculate();
    }

    public InterestState getInterestState() {
        return interestState;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getBalance() {
        return balance;
    }

}
