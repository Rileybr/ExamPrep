package com.company;

import java.util.ArrayList;

public class RepairSchedule
{
    /** Each element represents a repair by an individual mechanic
     in a bay. */
    private ArrayList<CarRepair> schedule;

    /** Number of mechanics available in this schedule. */
    private int numberOfMechanics;


/** Constructs a RepairSchedule object.
 *  Precondition: n >= 0
 */
    public RepairSchedule(int n) {
        schedule = new ArrayList<CarRepair>();
        numberOfMechanics = n;
    }


/** Attempts to schedule a repair by a given mechanic in a
  * given bay as described in part (a).
  * Precondition: 0 <= m < numberOfMechanics and b >= 0
  */
    public boolean addRepair(int m, int b) {
        /* to be implemented in part (a) */
        if (schedule.size() == 0){
            schedule.add(new CarRepair(m,b));
            return true;
        }
        else {
            for (int i = 0; i < schedule.size(); i++) {
                if (schedule.get(i).getMechanicNum() == m || schedule.get(i).getBayNum() == b) {
                    return false;
                }
            }
        }
        schedule.add(new CarRepair(m, b));
        return true;
    }


 /** Returns an ArrayList containing the mechanic identifiers of
  * all available mechanics,
  * as described in part (b).
  */
 public ArrayList<Integer> availableMechanics() {
   /* to be implemented in part (b) */
     ArrayList<Integer> available = new ArrayList<>(numberOfMechanics);
     for (int i = 0; i < numberOfMechanics; i++){
         available.add(i);
     }


     for (int i = 0; i < schedule.size(); i++){
         for (int ii = 0; ii < available.size(); ii++){
             if (schedule.get(i).getMechanicNum() == available.get(ii)){
                 available.remove(ii);
                 ii--;
             }
         }
     }
     return available;
 }


 /** Removes an element from schedule when a repair is complete
  * Only to be used by the driver
  */
    public void carOut(int b) {
        for (int i=schedule.size()-1; i>=0; i--) {
            if (schedule.get(i).getBayNum() == b) {
                schedule.remove(i);
            }
        }
    }
}

