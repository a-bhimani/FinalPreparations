package finalprep.challenges.pramp;

/**
 *
 * @author adb
 */
public class DroneFlightPlanner{

  static int calcDroneMinEnergy(int[][] route){
    int reqd = 0;
    int reqdMin = 0;

    if(route.length == 0){
      return 0;
    }

    for(int ix = 0, jy = 1; jy < route.length; ix++, jy++){
      reqd += route[ix][2] - route[jy][2];
      reqdMin = Math.min(reqd, reqdMin);
    }

    return Math.abs(reqdMin);
  }
}
