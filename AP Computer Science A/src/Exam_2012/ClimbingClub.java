package Exam_2012;
import java.util.ArrayList;
import java.util.List;
public class ClimbingClub
{
 /** The list of climbs completed by members of the club.
 * Guaranteed not to be null. Contains only non-null references.
 */
 private List<ClimbInfo> climbList;
 /** Creates a new ClimbingClub object. */
 public ClimbingClub()
 { climbList = new ArrayList<ClimbInfo>(); }
 /** Adds a new climb with name peakName and time climbTime to the list of climbs.
 * @param peakName the name of the mountain peak climbed
 * @param climbTime the number of minutes taken to complete the climb
 */
 public void addClimb(String peakName, int climbTime)
 { /* to be implemented in part (a) with ClimbInfo objects in the order they were added */
    climbList.add(new ClimbInfo(peakName, climbTime));
 /* to be implemented in part (b) with ClimbInfo objects in alphabetical order by name */
 for (int i = 0;i<climbList.size();i++){
    for (int j = i+1;i<climbList.size();j++)){
        if(climbList.get(i).getName().compareTo(climbList.get(j).getName())>0){
            ClimbInfo temp=climbList.get(i);
            climbList.set(i, climbList.remove(j));
            climbList.add(j, temp);
        }
     }
    climbList.add(j,climbList.remove(i));
}
 }
 /** @return the number of distinct names in the list of climbs */
 public int distinctPeakNames()
 { /* implementation shown in part (c) */ }
 // There may be instance variables, constructors, and methods that are not shown.
} 