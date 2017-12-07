package Bank.State;

import java.util.Date;

public class Interest {

    private InterestState interestState;
    private Date startDate;
    private int duration;
    private double balance;
    private double balance2;

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
        interestState.calc();
    }

    public InterestState getInterestState() {
        return interestState;
    }

    public void setInterestState(InterestState interestState) {
        this.interestState = interestState;
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

    public double getBalance2() {
        return balance2;
    }

    public void setBalance2(double balance2) {
        this.balance2 = balance2;
    }
}
