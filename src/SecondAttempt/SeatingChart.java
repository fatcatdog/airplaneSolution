package SecondAttempt;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//this program would need to be run on each individual row of seats
public class SeatingChart {
    Seat[] seatChart;

    public SeatingChart() {
        seatChart = new Seat[10];
        seatChart[0] = new Seat("1A");
        seatChart[1] = new Seat("1B");
        seatChart[2] = new Seat("1C");

        seatChart[3] = new Seat("1D", false);
        seatChart[4] = new Seat("1E");
        seatChart[5] = new Seat("1F");
        seatChart[6] = new Seat("1G");

        seatChart[7] = new Seat("1H");
        seatChart[8] = new Seat("1I", false);
        seatChart[9] = new Seat("1J");
    }

    void howBigIsYourParty(int partySize) {
        if(partySize == 1){
            showSeatOptionsOne();
        } else if (partySize == 2) {
            showSeatOptionsTwo();
        }else if (partySize == 3) {
            showSeatOptionsThree();
        }else if (partySize == 4) {
            showSeatOptionsFour();
        } else {
            System.out.println("I'm sorry I only coded to a party size of 4!");
        }
    }

    void showSeatOptionsOne() {
        List<int[]> options = new ArrayList<int[]>();
        for(int i = 0; i < 10; i++) {

            if (seatChart[i].available) {
                int[] seatOption = {i};
                options.add(seatOption);
            }
        }
        System.out.println("Here are your possible seat combinations for a party of 1: ");
        for(int i=0;i<options.size();i++){
            for(int j=0; j < 1; j++) {
                System.out.println("[" + seatChart[(options.get(i)[j])].seatNumber + "]");
            }
        }

    }

    void showSeatOptionsTwo() {
        List<int[]> options = new ArrayList<int[]>();
        for(int i = 0; i < 10; i++) {

            if (i == seatChart.length - 1){
                break;
            }

            if ((seatChart[i].available) && (seatChart[i + 1].available)) {
                int[] seatOption = {i, (i + 1)};
//                System.out.println(i + " and " + (i + 1));
                options.add(seatOption);
            }
        }
        System.out.println("Here are your possible seat combinations for a party of 2: ");
        for(int i=0;i<options.size();i++){
            for(int j=0; j < 1; j++) {
                System.out.println("[" + seatChart[(options.get(i)[j])].seatNumber + ", " + seatChart[options.get(i)[j + 1]].seatNumber + "]");
            }
        }

        }

    void showSeatOptionsThree() {
        List<int[]> options = new ArrayList<int[]>();
        for(int i = 0; i < 10; i++) {

            if (i == seatChart.length - 2){
                break;
            }

            if ((seatChart[i].available) && (seatChart[i + 1].available) && (seatChart[i + 2].available)) {
                int[] seatOption = {i, (i + 1), (i + 2)};
//                System.out.println(i + " and " + (i + 1));
                options.add(seatOption);
            }
        }
        System.out.println("Here are your possible seat combinations for a party of 3: ");
        for(int i=0;i<options.size();i++){
            for(int j=0; j < 1; j++) {
                System.out.println("[" + seatChart[(options.get(i)[j])].seatNumber + ", " + seatChart[options.get(i)[j + 1]].seatNumber + ", " + seatChart[options.get(i)[j + 2]].seatNumber + "]");
            }
        }

    }

    void showSeatOptionsFour() {
        List<int[]> options = new ArrayList<int[]>();
        for(int i = 0; i < 10; i++) {

            if (i == seatChart.length - 3){
                break;
            }

            if ((seatChart[i].available) && (seatChart[i + 1].available) && (seatChart[i + 2].available) && (seatChart[i + 3].available)) {
                int[] seatOption = {i, (i + 1), (i + 2), (i + 3)};
//                System.out.println(i + " and " + (i + 1));
                options.add(seatOption);
            }
        }
        System.out.println("Here are your possible seat combinations for a party of 4: ");
        for(int i=0;i<options.size();i++){
            for(int j=0; j < 1; j++) {
                System.out.println("[" + seatChart[(options.get(i)[j])].seatNumber + ", " + seatChart[options.get(i)[j + 1]].seatNumber + ", " + seatChart[options.get(i)[j + 2]].seatNumber + ", " + seatChart[options.get(i)[j + 3]].seatNumber + "]");
            }
        }

    }


    public static void main(String[] args) {
        SeatingChart ourPlane = new SeatingChart();

        Scanner userInput = new Scanner(System.in);
        System.out.println("How big is your party you are flying with? (Please choose a number 1-4)");
        int partySize = userInput.nextInt();
        ourPlane.howBigIsYourParty(partySize);
    }

}

